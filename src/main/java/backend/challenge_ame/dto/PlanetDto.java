package backend.challenge_ame.dto;


import backend.challenge_ame.model.Planet;
import lombok.*;

@Data
public class PlanetDto {
    @NonNull
    private String name;

    @NonNull
    private String climate;

    @NonNull
    private String terrain;

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public void setClimate(@NonNull String climate) {
        this.climate = climate;
    }

    public void setTerrain(@NonNull String terrain) {
        this.terrain = terrain;
    }

    public Planet toPlanet() {
        Planet planet = new Planet();
        planet.setName(this.name);
        planet.setClimate(this.climate);
        planet.setTerrain(this.terrain);
        return planet;
    }
}

