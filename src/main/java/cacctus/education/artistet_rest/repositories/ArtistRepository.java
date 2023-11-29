package cacctus.education.artistet_rest.repositories;

import cacctus.education.artistet_rest.models.entities.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<ArtistEntity, Long> {

}
