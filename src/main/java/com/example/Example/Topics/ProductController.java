package com.example.Example.Topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    public ProductEntity getList(@RequestBody ProductService productService) {
        return getList(productService);
    }

    public ProductEntity insertProduct(@PathVariable ProductEntity productEntity) {
        return productService.insertProduct(productEntity);

    }
}
