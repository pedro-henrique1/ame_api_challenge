package backend.challenge_ame.controller;


import backend.challenge_ame.dto.PlanetDto;
import backend.challenge_ame.model.Planet;
import backend.challenge_ame.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanetController {

    private final PlanetService planetService;

    public PlanetController(PlanetService planetService) {
        this.planetService = planetService;
    }


    @PostMapping
    public void createPlanet(@RequestBody PlanetDto planetRequest) {
        planetService.CreatePlanet(planetRequest);
    }

}
