package cacctus.education.artistet_rest.models.dtos;
import cacctus.education.artistet_rest.models.enums.Album;
import cacctus.education.artistet_rest.models.enums.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtistDto {
    private Long id;
    private String name;
    private String surname;
    private String nickname;
    private LocalDate birthdate;
    private Gender gender;
    private List<Album> albums;
}
