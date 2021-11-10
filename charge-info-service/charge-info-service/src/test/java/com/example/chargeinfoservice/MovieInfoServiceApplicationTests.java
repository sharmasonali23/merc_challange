package com.example.chargeinfoservice;

import com.example.chargeinfoservice.resources.chargeInfo;
import com.google.gson.Gson;
import com.google.inject.Inject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovieInfoServiceApplicationTests {
    @Inject
	chargeInfo movieInfo;
	@Test
	void contextLoads() {
	}


	@Test
	public void testVehicleChargingInfo(){
		   Vehicle vehicle=movieInfo.getVehicleChargingInfo("W1K2062161F0046");
		System.out.println(new Gson().toJson(vehicle));
	}
}
