package ma.xproce.exam.Service;

import ma.xproce.exam.dao.entities.Song;
import ma.xproce.exam.dao.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongManager implements SongService{
    @Autowired
    private SongRepository songRepository;
    @Override
    public Song getSongByTitle(String title) {
        return songRepository.findByTitle(title);
    }

    @Override
    public Song saveSong(Song song) {
        return songRepository.save(song);
    }
}
