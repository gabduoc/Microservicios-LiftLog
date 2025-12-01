package pawville.union.service;

import org.springframework.stereotype.Service;
import pawville.union.model.Union_v1;
import pawville.union.repository.UnionRepository;

import java.util.List;

@Service
public class UnionService {

    private UnionRepository unionRepository;

    public UnionService(UnionRepository unionRepository) {
        this.unionRepository = unionRepository;
    }

    public Union_v1 create(Union_v1 unionV1) {
        return unionRepository.save(unionV1);
    }

    public List<Union_v1> obtenerUnions() {
        return unionRepository.findAll();
    }

    public Union_v1 obtenerUnion(Long id) {
        return unionRepository.findById(id).orElse(null);
    }

    public List<Union_v1> obtenerUnionByRutinaId(Long rutinaId) {
        return unionRepository.findByRutinaId(rutinaId);
    }

    public void eliminarPorId(Long id) {
        unionRepository.deleteById(id);
    }
}
