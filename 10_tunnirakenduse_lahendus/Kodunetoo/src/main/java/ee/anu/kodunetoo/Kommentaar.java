package ee.anu.kodunetoo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Kommentaar {
    private int id;
    private String sisu;
    private LocalDateTime kell;

}
