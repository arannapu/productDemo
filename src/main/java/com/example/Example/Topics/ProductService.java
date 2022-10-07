package com.example.Example.Topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
@RequestMapping
public class ProductService {
    @Autowired
ProductRepository productRepository;
@GetMapping("/productlist")
    public List<ProductEntity>getList() {

        List<ProductEntity> list = new ArrayList<ProductEntity>();
               list = (List<ProductEntity>) list.stream()
                       .sorted(Comparator.comparing(ProductEntity::getLocalDateString));
               productRepository.findAll();
          return list;
    }
    @PostMapping("/sortProducts")
    public ProductEntity insertProduct(@PathVariable ProductEntity productEntity){
    return productRepository.save(productEntity);
    }

}
