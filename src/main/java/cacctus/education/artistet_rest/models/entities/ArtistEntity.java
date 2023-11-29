package cacctus.education.artistet_rest.models.entities;

import cacctus.education.artistet_rest.models.enums.Album;
import cacctus.education.artistet_rest.models.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "artists_entity")
public class ArtistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String nickname;
    private LocalDate birthdate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private List<Album> albums;
}
