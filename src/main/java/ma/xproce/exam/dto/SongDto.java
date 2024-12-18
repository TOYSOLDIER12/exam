package ma.xproce.exam.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SongDto {
    private String title;
    private String artist;
    private String album;
    private String duration;
    private String url;

}
