package com.retail.sales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.retail.sales.service.RetailsService;

@SpringBootTest
class RetailSalesApiApplicationTests {
	RetailsService service = new RetailsService();

	@Test
	void contextLoads() {
	}

	@Test
	void getNetPayable() {
		double pay = service.getNetPayableAmount("employee", 3500, "non_grocery");
		assertEquals(1000, pay);

	}

}
