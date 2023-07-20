package com.example.springdtosample.controller;
import java.util.List;

import com.example.springdtosample.dto.LocationDTO;
import com.example.springdtosample.dto.UserLocationDTO;
import com.example.springdtosample.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/map")
public class MapController {
    @Autowired
    private MapService mapService;

    @GetMapping
    @ResponseBody
    public List<UserLocationDTO> getAllUsersLocation() {
        List <UserLocationDTO> usersLocation = mapService.getAllUsersLocation();
        return usersLocation;
    }


    @GetMapping("/v2")
    @ResponseBody
    public List<UserLocationDTO> getAllUsersLocation_Mapper() {
        List <UserLocationDTO> usersLocation = mapService.getAllUsersLocation_V2();
        return usersLocation;
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public UserLocationDTO getUserLocation(@PathVariable("id") Long id) {
        return mapService.getUserLocation(id);
    }

    @PostMapping(value = "/addLocation")
    @ResponseStatus(HttpStatus.OK)
    public void addLocation(@RequestBody LocationDTO locationDTO) {
        mapService.addLocation(locationDTO);
    }

    @GetMapping(value = "/allLocations")
    @ResponseBody
    public List<LocationDTO> getAllLocations() {
        List <LocationDTO> locations = mapService.getAllLocations();
        return locations;
    }

}