package pawville.union.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pawville.union.model.Union_v1;
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
    public Union_v1 create(@RequestBody Union_v1 unionV1) {
        return unionService.create(unionV1);
    }

    @GetMapping
    public List<Union_v1> obtenerUnions() {
        return unionService.obtenerUnions();
    }

    @GetMapping("/{id}")
    public Union_v1 obtenerUnion(@PathVariable Long id) {
        return unionService.obtenerUnion(id);
    }

    @GetMapping("/rutina/{id}")
    public List<Union_v1> obtenerUnionByRutinaId(@PathVariable Long rutinaid) {
        return unionService.obtenerUnionByRutinaId(rutinaid);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Union_v1> eliminar(@PathVariable Long id) {
        unionService.eliminarPorId(id);
        return ResponseEntity.ok().build();
    }

}
