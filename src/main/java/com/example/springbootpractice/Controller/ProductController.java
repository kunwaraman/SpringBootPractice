package com.example.springbootpractice.Controller;


import com.example.springbootpractice.Service.ProductService;
import com.example.springbootpractice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // display  all products
    @GetMapping
    public String getAllProducts(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products",products);
        return "index.html";
    }
    //display form to add new product
    @GetMapping("/new")
    public String showProductForm(Model model){
        model.addAttribute("product",new Product());
        return "product-form.html";
    }

    //save new product
    @PostMapping
    public String saveProduct(@ModelAttribute Product product){
        productService.saveProduct(product);
        return "redirect:/products";
    }

    // display form to edit product
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id,Model model){
        Product product = productService.getProductById(id).orElseThrow(()->
                new RuntimeException("Product not found"));
        model.addAttribute("product",product);
        return "product-form";
    }

    // update a product
    @PostMapping("/edit/{id}")
    public String updateProduct(@PathVariable Long id,@ModelAttribute Product product){
        product.setId(id);
        productService.saveProduct(product);
        return "redirect:/products";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return "redirect:/products";
    }




}
