package ma.xproce.exam.mappers;

import ma.xproce.exam.dao.entities.Song;
import ma.xproce.exam.dto.SongDto;
import org.modelmapper.ModelMapper;


public class SongMapper {


    ModelMapper songMapper = new ModelMapper();
    public SongDto songTosongRequest(Song song) {
        return songMapper.map(song, SongDto.class);
    }
    public Song songRequestTosong(SongDto songRequest) {
        return songMapper.map(songRequest, Song.class);
    }
}