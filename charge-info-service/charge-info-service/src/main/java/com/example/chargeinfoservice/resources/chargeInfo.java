package com.example.chargeinfoservice.resources;

import com.example.chargeinfoservice.Vehicle;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/movies")
@EnableAutoConfiguration(exclude= DataSourceAutoConfiguration.class)
@RequestMapping("/vehicle")
public class chargeInfo {

    /*@RequestMapping(method= RequestMethod.POST , value="/insert/")
    public void postVehicleInfo(@RequestBody Vehicle vehicle){
           movieInfoService.addVehicleInfo(vehicle);
    }*/
     @RequestMapping("/{vin}")
     public Vehicle getVehicleChargingInfo(@PathVariable ("vin")String vin){
            if(vin.equals("W1K2062161F0046")){
                return new Vehicle("1","W1K2062161F0046",17);
            }else if(vin.equals("W1K2062161F0080")){
                return  new Vehicle("2","W1K2062161F0080",2);
            }else if(vin.equals("W1K2062161F0033")){
                 return  new Vehicle("3","W1K2062161F0033",93);
            }
            return  null;
     }

}
