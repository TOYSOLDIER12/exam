package ma.xproce.exam.Service;

import ma.xproce.exam.dao.entities.Song;

public interface SongService {
    public Song getSongByTitle(String title);
    public Song saveSong(Song song);
}
