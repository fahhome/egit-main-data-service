package fahmid.islam.egitasignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fahmid.islam.egitasignment.dao.*;
import fahmid.islam.egitasignment.entity.*;


//Lombok Boilerplate code is injected at compile time hance mvn clean install is success 

@Service
public class AirportService {
    @Autowired
    private AirportRepository airportRepository;

    public Airport createAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    public List<Airport> createAirports(List<Airport> airports) {
        return airportRepository.saveAll(airports);
    }

    public Airport getAirportById(int id) {
        return airportRepository.findById(id).orElse(null);
    }

    public List<Airport> getAirports() {
        return airportRepository.findAll();
    }

    public Airport updateAirport(Airport airport) {
        Airport oldAirport = null;
        Optional<Airport> optionalairport = airportRepository.findById(airport.getId());
        if (optionalairport.isPresent()) {
            oldAirport = optionalairport.get();
            oldAirport.setName(airport.getName());
            airportRepository.save(oldAirport);
        } else {
            return new Airport();
        }
        return oldAirport;
    }

    public String deleteAirportById(int id) {
        airportRepository.deleteById(id);
        return "Airport got deleted";
    }

}