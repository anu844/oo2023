package ee.anu.autodeobjektid;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface OmanikRepository extends JpaRepository<Omanik, String>{
    Omanik findByNimi(String nimi);
}
