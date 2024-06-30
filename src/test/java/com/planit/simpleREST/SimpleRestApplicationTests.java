package com.planit.simpleREST;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.planit.simpleREST.controllers.RESTResponse;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
@SuppressWarnings("unchecked")
class SimpleRestApplicationTests {

	/**
	 * This test has issues that make it brittle.
	 * How can the test be improved?
	 * What is the purpose of the test?
	 * 
	 * @param webTestClient
	 */
	
	@Test
	void contextLoads(@Autowired WebTestClient webTestClient) {
		RESTResponse<Double> body = webTestClient.get().uri("/loan/igvy9y/interest")
				     .exchange()
					 .expectStatus().isOk()
					 .expectBody(RESTResponse.class)
					 .returnResult()
					 .getResponseBody();
		assertEquals("success", body.message());
		assertEquals(50, body.data());
	}

}
