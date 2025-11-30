package pawville.union.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pawville.union.model.Union;

import java.util.List;

@Repository
public interface UnionRepository extends JpaRepository<Union, Long> {
    List<Union> findByRutinaId(Long rutinaId);
}
