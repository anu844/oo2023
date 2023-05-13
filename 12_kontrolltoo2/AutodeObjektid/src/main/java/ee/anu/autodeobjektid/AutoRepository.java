package ee.anu.autodeobjektid;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutoRepository extends JpaRepository<Auto, Long> {
    List<Auto> findByPikkusIsBetween(double alg, double lopp);
    List<Auto> findByMassIsBetween(double alg, double lopp);
    List<Auto> findAllByMark(String mark);
}
