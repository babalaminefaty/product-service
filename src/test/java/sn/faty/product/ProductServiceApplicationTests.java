package sn.faty.product;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import sn.faty.product.dto.ProductRequest;
import sn.faty.product.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class ProductServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper ;

	@Autowired
	private ProductRepository productRepository;


//	@Container
//	static PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>("postgres:15")
//
//					.withDatabaseName("product-service")
//
//					.withUsername("postgres")
//
//					.withPassword("Passer@1949") ;
//
//   @DynamicPropertySource
//   static  void setProperties(DynamicPropertyRegistry registry) {
//
//	   registry.add("spring.datasource.url", postgreSQLContainer::getJdbcUrl);
//
//	   registry.add("spring.datasource.username", postgreSQLContainer::getUsername);
//
//	   registry.add("spring.datasource.password", postgreSQLContainer::getPassword);
//
//   }


//	@Test
//	void shouldCreateProduct() throws Exception {
//
//	 ProductRequest productRequest= getProducts();
//
//	String value= objectMapper.writeValueAsString(productRequest);
//
//	   mockMvc.perform(MockMvcRequestBuilders.post("/product-services/add").contentType(MediaType.APPLICATION_JSON)
//			   .content(value))
//			   .andExpect(status().isCreated()) ;
//
//	   assertEquals(2,productRepository.findAll().size(), () -> "Produit non trouvé");
//
//
//   }
//
//	private ProductRequest getProducts() {
//
//	    ProductRequest productRequest = new ProductRequest();
//
//	    productRequest.setName("iphone 13");
//
//	    productRequest.setDescription("batterie puissante");
//
//	    productRequest.setPrice(15000);
//
//		 return productRequest;
//	}

}
