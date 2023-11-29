package cacctus.education.artistet_rest.services;

import cacctus.education.artistet_rest.models.dtos.ArtistDto;
import cacctus.education.artistet_rest.models.entities.ArtistEntity;

import java.util.List;

public interface ArtistService {
    void add(ArtistDto artist);

    List<ArtistDto> getAll();

    ArtistDto getById(long id);

    void update(long id, ArtistDto artist);

    void deleteById(long id);
}
