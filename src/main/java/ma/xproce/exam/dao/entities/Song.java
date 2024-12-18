package ma.xproce.exam.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.net.ProtocolFamily;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Song {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_song;
    private String title;
    private String artist;
    private String album;
    private String duration;
    private String url;
}
