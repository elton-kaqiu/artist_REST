package cacctus.education.artistet_rest.mappers;

import cacctus.education.artistet_rest.models.dtos.ArtistDto;
import cacctus.education.artistet_rest.models.entities.ArtistEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ArtistMapper {
    public ArtistEntity toEntity(ArtistDto from) {
        var to = new ArtistEntity();
        BeanUtils.copyProperties(from, to);
        return to;
    }

    public ArtistDto toDto(ArtistEntity from) {
        var to = new ArtistDto();
        BeanUtils.copyProperties(from, to);
        return to;
    }
}
