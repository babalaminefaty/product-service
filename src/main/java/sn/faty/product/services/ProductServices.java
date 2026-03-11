package sn.faty.product.services;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.faty.product.dto.ProductRequest;
import sn.faty.product.dto.ProductResponse;
import sn.faty.product.models.Product;
import sn.faty.product.repository.ProductRepository;

import java.util.List;

@Service
public class ProductServices {

    private  final ProductRepository productRepository;

    private final Logger logger = LoggerFactory.getLogger(ProductServices.class);

    @Autowired
    public ProductServices(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public  void saveProduct(ProductRequest productRequest) {

//        Product product= Product.builder()
//                        .name(productRequest.getName())
//                     .description(productRequest.getDescription())
//                      .price(productRequest.getPrice())
//                .build();

        Product product= new Product() ;

          product.setName(productRequest.getName());
          product.setDescription(productRequest.getDescription());
          product.setPrice(productRequest.getPrice());

          logger.debug("product saved ***** {}", product);

          productRepository.save(product);




    }


    public List<ProductResponse> getAllProducts() {

        List<Product> products = productRepository.findAll();

         return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {

        ProductResponse productResponse = new ProductResponse() ;

          productResponse.setName(product.getName());
          productResponse.setDescription(product.getName());
          productResponse.setPrice(product.getPrice());

          return productResponse;
    }



}
