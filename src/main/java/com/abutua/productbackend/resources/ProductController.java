package com.abutua.productbackend.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.abutua.productbackend.models.Product;
import com.abutua.productbackend.repositories.ProductRepository;

@RestController
@CrossOrigin
public class ProductController {

    // private List<Product> products = new ArrayList<>();

    @Autowired
    private ProductRepository productRepository;

    // @PostMapping("products")
    // public ResponseEntity<Product> save(@RequestBody Product product) {
    //     product.setId(products.size() + 1);
    //     products.add(product);

    //     URI location = ServletUriComponentsBuilder
    //             .fromCurrentRequest()
    //             .path("/{id}")
    //             .buildAndExpand(product.getId())
    //             .toUri();

    //     return ResponseEntity.created(location).body(product);
    // }

    // @GetMapping("products/{id}")
    // public ResponseEntity<Product> getProdut(@PathVariable int id) {
    //     Product prod = products.stream()
    //             .filter(p -> p.getId() == id)
    //             .findFirst()
    //             .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));

    //     return ResponseEntity.ok(prod);
    // }

    @GetMapping("products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

}
