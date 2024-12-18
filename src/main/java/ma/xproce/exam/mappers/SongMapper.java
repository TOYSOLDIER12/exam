package ma.xproce.exam.mappers;

import ma.xproce.exam.dao.entities.Song;
import ma.xproce.exam.dto.SongDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SongMapper {


    ModelMapper songMapper = new ModelMapper();
    public SongDto songTosongDto(Song song) {
        return songMapper.map(song, SongDto.class);
    }
    public Song songDtoTosong(SongDto songRequest) {
        return songMapper.map(songRequest, Song.class);
    }
}