package com.nikhil.MyFirstWebApp.service;

import com.nikhil.MyFirstWebApp.model.Product;
import com.nikhil.MyFirstWebApp.repository.ProductRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Getter
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId){
        return repo.findById(prodId).orElse(new Product(0,"no product found",0));
    }

    public void addProduct(Product product){
        repo.save(product);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {

        repo.deleteById(prodId);

    }
}
