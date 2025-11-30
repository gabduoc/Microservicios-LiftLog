package pawville.rutina.service;

import org.springframework.stereotype.Service;
import pawville.rutina.model.Rutina;
import pawville.rutina.repository.RutinaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RutinaService {

    private final RutinaRepository rutinaRepository;

    public RutinaService(RutinaRepository rutinaRepository) {
        this.rutinaRepository = rutinaRepository;
    }

    public Rutina crearRutina(Rutina rutina) {
        return rutinaRepository.save(rutina);
    }

    public List<Rutina> obtenerRutinasPorUsuario(String usuarioId) {
        return rutinaRepository.findByUsuarioId(usuarioId);
    }

    public List<Rutina> obtenerRutinas() {
        return rutinaRepository.findAll();
    }

    public Optional<Rutina> obtenerRutina(Long id) {
        return rutinaRepository.findById(id);
    }

    public void eliminarRutina(Long id) {
        rutinaRepository.deleteById(id);
    }
}
