/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.enrico.airports.repositories.AirportService;

import java.util.List;
import local.enrico.airports.entities.Airport;
import local.enrico.airports.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ppjata
 */
@Service
public class AirportService {
    
    
    @Autowired
    private AirportRepository airportRepository;
    
        public List<Airport> findAll(){
        
            List<Airport> result = airportRepository.findAll();
            return result;
            
        }


}
