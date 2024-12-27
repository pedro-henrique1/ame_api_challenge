package backend.challenge_ame.repository;

import backend.challenge_ame.model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet, Integer> {
    public Planet findByName(String name);
    public Planet findPlanetByName(String planetName);

}
