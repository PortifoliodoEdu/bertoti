package org.example;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cupcakes")
@CrossOrigin(origins = "*")
public class PrincipalControlller {
    private List<Cupcake> cupcakes = new ArrayList<>();

    public PrincipalControlller() {
        cupcakes.addAll(List.of(
                new Cupcake(1L, "Morango  $3"),
                new Cupcake(2L, "Chocolate  $3"),
                new Cupcake(3L, "Baunilha  $2"),
                new Cupcake(4L, "Limão  $5")
        ));
    }

    @GetMapping(produces = "application/json")
    public List<Cupcake> getCupcakes() {
        return cupcakes;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Cupcake postCupcake(@RequestBody Cupcake newCupcake) {
        if (newCupcake.getId() == null) {
            newCupcake.setId((long) (cupcakes.size() + 1));
        }
        cupcakes.add(newCupcake);
        return newCupcake;
    }

    @PutMapping("/{id}")
    public Cupcake putCupcake(@PathVariable Long id, @RequestBody Cupcake updatedCupcake) {
        cupcakes.stream()
                .filter(cupcake -> cupcake.getId().equals(id))
                .findFirst()
                .ifPresent(cupcake -> cupcake.setNome(updatedCupcake.getNome()));
        return updatedCupcake;
    }

    @DeleteMapping("/{id}")
    public void deleteCupcake(@PathVariable Long id) {
        cupcakes.removeIf(cupcake -> cupcake.getId().equals(id));
    }
}
