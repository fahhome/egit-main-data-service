package fahmid.islam.egitasignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fahmid.islam.egitasignment.entity.*;
import fahmid.islam.egitasignment.service.*;

@RestController
@CrossOrigin
public class AirportController {
    @Autowired
    private AirportService airportService;

    @PostMapping("/addAirport")
    public Airport addAirport(@RequestBody Airport airport) {
        return airportService.createAirport(airport);
    }

    @PostMapping("/addAirports")
    public List<Airport> addAirports(@RequestBody List<Airport> airports) {
        return airportService.createAirports(airports);
    }

    @GetMapping("/airport/{id}")
    public Airport getAirportById(@PathVariable int id) {
        return airportService.getAirportById(id);
    }

    @GetMapping("/airports")
    public List<Airport> getAllAirports() {
        return airportService.getAirports();
    }

    @PutMapping("/updateairport")
    public Airport updateAirport(@RequestBody Airport airport) {
        return airportService.updateAirport(airport);
    }

    @DeleteMapping("/airport/{id}")
    public String deleteAirport(@PathVariable int id) {
        return airportService.deleteAirportById(id);
    }
}