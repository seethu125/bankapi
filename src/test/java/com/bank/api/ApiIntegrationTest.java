package com.bank.api;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(
        classes = ApiApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ApiIntegrationTest {
	protected RestTemplate restTemplate = new RestTemplate();
	 
    protected final String DEFAULT_URL = "http://localhost:8082/";
}
