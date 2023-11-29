package cacctus.education.artistet_rest.services.impls;

import cacctus.education.artistet_rest.mappers.ArtistMapper;
import cacctus.education.artistet_rest.models.dtos.ArtistDto;
import cacctus.education.artistet_rest.models.entities.ArtistEntity;
import cacctus.education.artistet_rest.repositories.ArtistRepository;
import cacctus.education.artistet_rest.services.ArtistService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {
    private final ArtistRepository repository;
    private final ArtistMapper mapper;

    public ArtistServiceImpl(ArtistRepository repository, ArtistMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void add(ArtistDto artist) {
        var entity = mapper.toEntity(artist);
        repository.save(entity);

    }

    @Override
    public List<ArtistDto> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public ArtistDto getById(long id) {
        var optionalEntity = repository.findById(id);
        if (optionalEntity.isEmpty()) {
            throw new EntityNotFoundException("Artist with id:" + id + " is not found!");
        }
        var entity = optionalEntity.get();
        return mapper.toDto(entity);
    }

    @Override
    public void update(long id, ArtistDto artist) {
        var optionalEntity = repository.findById(id);
        if (optionalEntity.isEmpty()) {
            throw new EntityNotFoundException("Artist with id:" + id + " is not found!");
        }
        var entity = optionalEntity.get();
        BeanUtils.copyProperties(entity, artist);
        repository.save(entity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
