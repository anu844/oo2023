package ee.anu.kodunetoo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Blogi {
    private int id;
    private List<Postitus> blogipostitus;
    private List<Kommentaar> blogikommentaar;
}
