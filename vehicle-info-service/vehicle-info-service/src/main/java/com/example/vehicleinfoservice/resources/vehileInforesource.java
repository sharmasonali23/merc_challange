package com.example.vehicleinfoservice.resources;


import com.example.vehicleinfoservice.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.*;

@RestController
//@RequestMapping("/catalouge")
@RequestMapping("/vehicleInfo")
public class vehileInforesource {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;


    @RequestMapping("/{vin}/{source}/{des}")
    public VehicleInfo getVehicleInfo(@PathVariable("vin") String vin, @PathVariable("source") String source, @PathVariable("des") String des) {

        Vehicle vehicle = restTemplate.getForObject("http://charge-info-service/vehicle/" + vin, Vehicle.class);
        DistanceInfo distanceInfo = restTemplate.getForObject("http://distance-info-service/distanceInfo/" + source + "/" + des, DistanceInfo.class);
        if (vehicle.getChargeLevel() >= distanceInfo.getDistance()) {
            return new VehicleInfo
                    (vin, source, des, distanceInfo.getDistance(), vehicle.getChargeLevel(), false, null, null);
        }

        int finalChargingLevel = vehicle.getChargeLevel();
        List<ChargingStation> chargingStationsRequired = new ArrayList<>();
        for (ChargingStation chargingStation : distanceInfo.getChargingStationList()) {
            if (finalChargingLevel >= chargingStation.getChargingLevel()) {
                finalChargingLevel = finalChargingLevel - chargingStation.getDistance();
                if (finalChargingLevel <= 0) {
                    chargingStationsRequired.add(chargingStation);
                    return new VehicleInfo(vin, source, des, distanceInfo.getDistance(), vehicle.getChargeLevel(), true, chargingStationsRequired, null);
                }
                chargingStationsRequired.add(chargingStation);

            }
        }
        return new VehicleInfo(vin, source, des, distanceInfo.getDistance(), finalChargingLevel, true, chargingStationsRequired, new Errors(8888, "Unable to reach the destination with the current fuel level"));
    }


}
