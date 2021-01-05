package com.tpRest.productREST.Service;

import com.tpRest.productREST.Entity.Product;
import com.tpRest.productREST.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> listAll(){
        return repo.findAll();
    }

    public Product get(Integer id){
        return repo.findById(id).get();
    }

}
