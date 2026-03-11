package sn.faty.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sn.faty.product.dto.ProductRequest;
import sn.faty.product.dto.ProductResponse;
import sn.faty.product.services.ProductServices;

import java.util.List;

@RequestMapping("/product-services")
@RestController
public class ProductController {
    
    private final ProductServices productServices;

    @Autowired
    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public  void addProduct(@RequestBody ProductRequest productRequest) {

          productServices.saveProduct(productRequest);
    }

    @GetMapping("/getAll")
    public List<ProductResponse> getAllProduct() {
      return   productServices.getAllProducts();
    }
}
