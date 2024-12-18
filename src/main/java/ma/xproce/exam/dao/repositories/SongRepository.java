package ma.xproce.exam.dao.repositories;

import ma.xproce.exam.dao.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Integer> {
    public Song findByTitle(String title);
}
