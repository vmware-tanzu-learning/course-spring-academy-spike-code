package academy.spring.sample.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SampleApplicationTests {
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
		// Verify that the application context loads
	}

	@Test
	void testHello() {
		// Verify that the application returns "Hello World!" when the /hello endpoint is called
		// setup

		// exercise
		String response = restTemplate.getForObject("/hello", String.class);

		// verify
		assertEquals("Hello World!", response);
	}

}
