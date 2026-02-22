package com.sebastian.forohub.controller;

import com.sebastian.forohub.domain.topico.Topico;
import com.sebastian.forohub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    // POST - Crear tópico
    @PostMapping
    public ResponseEntity<Topico> crearTopico(@RequestBody Topico datos) {

        if(repository.existsByTituloAndMensaje(datos.getTitulo(), datos.getMensaje())) {
            throw new RuntimeException("Ya existe un tópico con el mismo título y mensaje");
        }

        Topico topicoGuardado = repository.save(datos);

        return ResponseEntity
                .created(URI.create("/topicos/" + topicoGuardado.getId()))
                .body(topicoGuardado);
    }

    // GET - Listar todos
    @GetMapping
    public List<Topico> listarTopicos() {
        return repository.findAll();
    }


    // DELETE - Eliminar tópico
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTopico(@PathVariable Long id) {

        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build(); // 404 si no existe
        }

        repository.deleteById(id);

        return ResponseEntity.noContent().build(); // 204 correcto
    }

    // PUT - Actualizar tópico
    @PutMapping("/{id}")
    public ResponseEntity<Topico> actualizarTopico(
            @PathVariable Long id,
            @RequestBody Topico datosActualizados) {

        return repository.findById(id)
                .map(topico -> {
                    topico.setTitulo(datosActualizados.getTitulo());
                    topico.setMensaje(datosActualizados.getMensaje());
                    topico.setStatus(datosActualizados.getStatus());
                    topico.setAutor(datosActualizados.getAutor());
                    topico.setCurso(datosActualizados.getCurso());

                    Topico topicoActualizado = repository.save(topico);

                    return ResponseEntity.ok(topicoActualizado); // 200 OK
                })
                .orElse(ResponseEntity.notFound().build()); // 404 si no existe
    }


}