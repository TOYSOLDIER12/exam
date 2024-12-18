package ma.xproce.exam.Web;

import ma.xproce.exam.Service.SongManager;
import ma.xproce.exam.Service.SongService;
import ma.xproce.exam.dao.entities.Song;
import ma.xproce.exam.dto.SongDto;
import ma.xproce.exam.mappers.SongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SongGraphlQLController {
    @Autowired
    SongService songService;
    @Autowired
    SongMapper songMapper;
    @QueryMapping
    public Song getSongByTitle(@Argument String title) {
        return songService.getSongByTitle(title);
    }
    @MutationMapping
    public Song saveCreator(@Argument("SongRequest") SongDto songDto){
        if (songDto == null) {
            throw new IllegalArgumentException("songDto cannot be null");
        }
        Song song = songMapper.songDtoTosong(songDto);
        return songService.saveSong(song);
    }


}
