package com.example.distanceinforservice.resources;


import com.example.distanceinforservice.ChargingStation;
import com.example.distanceinforservice.DistanceInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/distanceInfo")
public class distanceInfo {
    @RequestMapping("/{source}/{des}")
    public DistanceInfo getdistanceInfo(@PathVariable("source") String source, @PathVariable("des") String des) {
        if (source.equalsIgnoreCase("home") && des.equalsIgnoreCase("lake")) {
            List<ChargingStation> chargingStationList = Arrays.asList(
                    new ChargingStation("s1", 10, 100)
            );
            return new DistanceInfo(source, des, 20, chargingStationList);
        } else if (source.equalsIgnoreCase("home") && des.equalsIgnoreCase("Power Plant")) {
            List<ChargingStation> chargingStationList = new ArrayList<>();
            return new DistanceInfo(source, des, 30, chargingStationList);
        } else if (source.equalsIgnoreCase("home") && des.equalsIgnoreCase("National Library")) {
            List<ChargingStation> chargingStationList = Arrays.asList(
                    new ChargingStation("s1", 10, 30),
                    new ChargingStation("s2", 30, 50),
                    new ChargingStation("s3", 70, 20)
            );
            return new DistanceInfo(source, des, 80, chargingStationList);
        } else if (source.equalsIgnoreCase("home") && des.equalsIgnoreCase("Zoo")) {
            List<ChargingStation> chargingStationList = Arrays.asList(
                    new ChargingStation("s1", 30, 100),
                    new ChargingStation("s2", 70, 10),
                    new ChargingStation("s3", 90, 90),
                    new ChargingStation("s4", 130, 30)
            );
            return new DistanceInfo(source, des, 140, chargingStationList);
        } else if (source.equalsIgnoreCase("home") && des.equalsIgnoreCase("Central Park")) {
            List<ChargingStation> chargingStationList = Arrays.asList(
                    new ChargingStation("s1", 10, 60),
                    new ChargingStation("s2", 20, 30),
                    new ChargingStation("s3", 30, 30),
                    new ChargingStation("s4", 40, 60)
            );
            return new DistanceInfo(source, des, 100, chargingStationList);
        } else if (source.equalsIgnoreCase("home") && des.equalsIgnoreCase("Movie Theatre")) {
            List<ChargingStation> chargingStationList = Arrays.asList(
                    new ChargingStation("s1", 10, 20),
                    new ChargingStation("s2", 25, 15),
                    new ChargingStation("s3", 33, 10),
                    new ChargingStation("s4", 40, 10)
            );
            return new DistanceInfo(source, des, 50, chargingStationList);
        }
        return null;
    }
}
