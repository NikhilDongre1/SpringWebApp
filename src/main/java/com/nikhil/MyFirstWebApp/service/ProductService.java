package com.nikhil.MyFirstWebApp.service;

import com.nikhil.MyFirstWebApp.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {

    List<Product> products =new ArrayList<>( Arrays.asList(new Product(101,"headphone",2000),new Product(102,"laptop",70000),new Product(103,"smartwatch",8000)));


    public Product getProductById(int ProdId){
        return products.stream()
                .filter((product -> product.getProductId() == ProdId))
                .findFirst()
                .orElse(new Product(100,"No product found",0));
    }

    public void addProduct(Product product){
         products.add(product);
    }
}
