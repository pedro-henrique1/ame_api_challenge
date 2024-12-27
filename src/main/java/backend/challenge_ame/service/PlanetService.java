package backend.challenge_ame.service;

import backend.challenge_ame.dto.PlanetDto;
import backend.challenge_ame.model.Planet;
import backend.challenge_ame.repository.PlanetRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PlanetService {

    private final PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }


    public ResponseEntity<?> CreatePlanet(PlanetDto planetDto) {
        if (planetDto != null) {
            Planet planet = planetDto.toPlanet();
            planetRepository.save(planet);
            return new ResponseEntity<>(planet, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
