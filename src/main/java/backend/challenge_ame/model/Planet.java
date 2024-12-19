package backend.challenge_ame.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "planets")
@Getter
@Setter

public class Planet {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String climate;

    @Column(nullable = false)
    private String terrain;

    @Column(nullable = false)
    private Integer film_appearance;
}
