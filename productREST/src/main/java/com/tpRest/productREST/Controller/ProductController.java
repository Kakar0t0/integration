package com.tpRest.productREST.Controller;

import com.tpRest.productREST.Entity.Product;
import com.tpRest.productREST.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> list(){
        return service.listAll();
    }

}
