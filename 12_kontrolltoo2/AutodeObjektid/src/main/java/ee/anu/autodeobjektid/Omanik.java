package ee.anu.autodeobjektid;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Omanik {
    @Id
    private String nimi;

    @ManyToMany
    private List<Auto> auto;

}
