package cacctus.education.artistet_rest.controllers;

import cacctus.education.artistet_rest.models.dtos.ArtistDto;
import cacctus.education.artistet_rest.services.ArtistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/artists")
public class ArtistController {
    public final ArtistService service;


    public ArtistController(ArtistService service) {
        this.service = service;
    }

    @GetMapping
    public List<ArtistDto> getAllArtists() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ArtistDto getArtistById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public void addArtist(@RequestBody ArtistDto artist) {
        service.add(artist);
    }

    @PutMapping("/{id}")
    public void updateArtistById(@PathVariable Long id, @RequestBody ArtistDto artist) {
        service.update(id, artist);
    }

    @DeleteMapping("/{id}")
    public void deleteArtistById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
