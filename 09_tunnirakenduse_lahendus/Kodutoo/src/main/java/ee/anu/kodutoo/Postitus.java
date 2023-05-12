package ee.anu.kodutoo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Postitus {
    private int id;
    private String pealkiri;
    private String sisu;
    private LocalDateTime kell;
}
