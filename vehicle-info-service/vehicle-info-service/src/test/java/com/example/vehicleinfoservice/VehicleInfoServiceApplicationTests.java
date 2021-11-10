package com.example.vehicleinfoservice;

import com.example.vehicleinfoservice.resources.vehileInforesource;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VehicleInfoServiceApplicationTests {

	@Inject
	vehileInforesource moviecatalogueresource;

	@Mock
	ChargingStation chargingStation;
	@Test
	void contextLoads() {
	}

    @Test
	public  void testVehicleInfo(){
		    String vin="123";
		    String source ="home";
		    String des = "lake";
		    Vehicle vehicle = new Vehicle().setVin("W1K2062161F0033").setChargeLevel(93);
		    List<ChargingStation> chargingStationList = Arrays.asList(new ChargingStation("s1",10,100),
					new ChargingStation("s2",20,60));
		    DistanceInfo distanceInfo = new DistanceInfo().setDistance(60)
					.setDestination("lake")
					.setSource("home")
					.setChargingStationList(chargingStationList);
		//distanceInfo.put()

		VehicleInfo vehicleInfo= moviecatalogueresource.getVehicleInfo(vehicle.getVin() ,source,des);
        assertFalse(vehicleInfo.isChargingRequired());
		System.out.println("vehicleInfo"+" "+new Gson().toJson(vehicleInfo));
	}

	@Test
	public  void testVehicleInfo2(){
		String vin="123";
		String source ="home";
		String des = "lake";
		Vehicle vehicle = new Vehicle().setVin("W1K2062161F0033").setChargeLevel(3);
		List<ChargingStation> chargingStationList = Arrays.asList(new ChargingStation("s1",10,100),
				new ChargingStation("s2",20,60));
		DistanceInfo distanceInfo = new DistanceInfo().setDistance(60)
				.setDestination("lake")
				.setSource("home")
				.setChargingStationList(chargingStationList);
		//distanceInfo.put()

		VehicleInfo vehicleInfo= moviecatalogueresource.getVehicleInfo(vehicle.getVin() ,source,des);
		assertFalse(vehicleInfo.isChargingRequired());
	}
}
