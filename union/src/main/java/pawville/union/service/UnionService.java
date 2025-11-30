package pawville.union.service;

import org.springframework.stereotype.Service;
import pawville.union.model.Union;
import pawville.union.repository.UnionRepository;

import java.util.List;

@Service
public class UnionService {

    private UnionRepository unionRepository;

    public UnionService(UnionRepository unionRepository) {
        this.unionRepository = unionRepository;
    }

    public Union create(Union union) {
        return unionRepository.save(union);
    }

    public List<Union> obtenerUnions() {
        return unionRepository.findAll();
    }

    public Union obtenerUnion(Long id) {
        return unionRepository.findById(id).orElse(null);
    }

    public List<Union> obtenerUnionByRutinaId(Long rutinaId) {
        return unionRepository.findByRutinaId(rutinaId);
    }

    public void eliminarPorId(Long id) {
        unionRepository.deleteById(id);
    }
}
