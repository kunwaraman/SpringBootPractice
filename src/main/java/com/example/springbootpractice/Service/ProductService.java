package com.example.springbootpractice.Service;


import com.example.springbootpractice.entity.Product;
import com.example.springbootpractice.repository.ProductRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    // get all products
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    // get product by id
    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }

    // update a product
    public Product updateProduct(Long id,Product product){
        product.setId(id);
        return productRepository.save(product);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
