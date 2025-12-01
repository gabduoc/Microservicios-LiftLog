package pawville.union.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pawville.union.model.Union_v1;

import java.util.List;

@Repository
public interface UnionRepository extends JpaRepository<Union_v1, Long> {
    List<Union_v1> findByRutinaId(Long rutinaId);
}
