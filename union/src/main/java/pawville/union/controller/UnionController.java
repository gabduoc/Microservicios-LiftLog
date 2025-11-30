package pawville.union.controller;


import org.springframework.web.bind.annotation.*;
import pawville.union.model.Union;
import pawville.union.service.UnionService;

import java.util.List;


@RestController
@RequestMapping("/api/union")
public class UnionController {

    private UnionService unionService;

    public UnionController(UnionService unionService) {
        this.unionService = unionService;
    }

    @PostMapping
    public Union create(@RequestBody Union union) {
        return unionService.create(union);
    }

    @GetMapping
    public List<Union> obtenerUnions() {
        return unionService.obtenerUnions();
    }

    @GetMapping("/{id}")
    public Union obtenerUnion(@PathVariable Long id) {
        return unionService.obtenerUnion(id);
    }

    @GetMapping("/rutina/{id}")
    public List<Union> obtenerUnionByRutinaId(@PathVariable Long rutinaid) {
        return unionService.obtenerUnionByRutinaId(rutinaid);
    }

    @DeleteMapping
    public void eliminarPorId(@RequestBody Union union) {}

}
