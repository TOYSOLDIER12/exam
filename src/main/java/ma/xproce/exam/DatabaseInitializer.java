package ma.xproce.exam;

import ma.xproce.exam.Service.SongService;
import ma.xproce.exam.dao.entities.Song;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Configuration
public class DatabaseInitializer {

    @Bean
    @Transactional
    CommandLineRunner start(SongService songRepository) {
        return args -> {
            // Add songs
            List<Song> songs = List.of(
                    Song.builder()
                            .title("Bohemian Rhapsody")
                            .artist("Queen")
                            .album("A Night at the Opera")
                            .duration("5:55")
                            .url("https://example.com/bohemian-rhapsody")
                            .build(),
                    Song.builder()
                            .title("Stairway to Heaven")
                            .artist("Led Zeppelin")
                            .album("Untitled")
                            .duration("8:02")
                            .url("https://example.com/stairway-to-heaven")
                            .build(),
                    Song.builder()
                            .title("Hotel California")
                            .artist("Eagles")
                            .album("Hotel California")
                            .duration("6:30")
                            .url("https://example.com/hotel-california")
                            .build()
            );

            // Save songs to the repository
            songs.forEach(songRepository::saveSong);
        };
    }
}

