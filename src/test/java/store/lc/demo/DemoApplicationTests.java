package store.lc.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import store.lc.demo.entities.Product;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import org.springframework.test.web.servlet.result.ModelResultMatchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class DemoApplicationTests {

/*	Product product;

	@Autowired
	private MockMvc mockMvc;

	@BeforeEach
	void contextLoads() {
		this.product = new Product();
		product.setDescription("XY");
		product.setName("test");
		product.setPrice(10.00);
		product.setQuantity(1);
		product.setId(12L);
	}

	//Getters
	@Test
	void getNameShouldReturnName() {
		assertEquals("test", this.product.getName());
	}

	@Test
	void getDescriptionShouldReturnDescription() {
		assertEquals("XY", this.product.getDescription());
	}

	@Test
	void getPriceShouldReturnPrice() {
		assertEquals(10.00, this.product.getPrice());
	}

	@Test
	void getQuantityShouldReturnQuantity() {
		assertEquals(1, this.product.getQuantity());
	}

	@Test
	void getIdShouldReturnId() {
		assertEquals(12L, this.product.getId());
	}


	//Setters
	@Test
	void setNameShouldChangeName() {
		this.product.setName("underTest");
		assertEquals("underTest", this.product.getName());
	}

	@Test
	void setDescriptionShouldChangeDescription() {
		this.product.setDescription("YY");
		assertEquals("YY", this.product.getDescription());

	}

	@Test
	void setPriceShouldChangePrice() {
		this.product.setPrice(9.99);
		assertEquals(9.99, this.product.getPrice());
	}

	@Test
	void setQuantityShouldChangeQuantity() {
		this.product.setQuantity(2);
		assertEquals(2, this.product.getQuantity());
	}

	@Test
	void setIdShouldChangeId() {
		this.product.setId(10L);
		assertEquals(10L, this.product.getId());
	}

	//Controller
	@Test
	void testGetProductList()throws Exception{
		mockMvc.perform(get("/"))
				.andExpect(status().isOk());
	}
	@Test
	void testGetProductEdit()throws Exception{
		mockMvc.perform(get("/edit/{id}",1))
				.andExpect(status().isOk());
	}

	@Test
	void testGetProductAdd()throws Exception{
		mockMvc.perform(get("/add",1))
				.andExpect(status().isOk());
	}

	@Test
	public void testCreateProduct() throws Exception{
		mockMvc.perform(post("/add")
						.param("name", "New Product")
						.param("description", "Description")
						.param("price", "25.0")
						.param("quantity", "50"))
				.andExpect(status().is3xxRedirection()) // Expect a redirect (HTTP status 3xx)
				.andExpect(redirectedUrl("/"));
	}


	@Test
	public void testPostEditProduct() throws Exception{
		mockMvc.perform(post("/edit/{id}",1)
						.param("name", "New Product")
						.param("description", "Description")
						.param("price", "25.0")
						.param("quantity", "50"))
				.andExpect(status().is3xxRedirection()) // Expect a redirect (HTTP status 3xx)
				.andExpect(redirectedUrl("/"));
	}
*/
}
