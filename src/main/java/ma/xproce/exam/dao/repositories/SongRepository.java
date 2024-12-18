package ma.xproce.exam.dao.repositories;

import ma.xproce.exam.dao.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SongRepository extends JpaRepository<Song, Integer> {
    public Optional<Song> findByTitle(String title);
}
