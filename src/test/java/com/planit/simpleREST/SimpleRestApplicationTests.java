package com.planit.simpleREST;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class SimpleRestApplicationTests {

	@Test
	void testHttpResponseCode200(@Autowired WebTestClient webTestClient) {
		webTestClient.get().uri("/loan/MYID/interest")
				     .exchange()
					 .expectStatus().isOk();
	}

}
