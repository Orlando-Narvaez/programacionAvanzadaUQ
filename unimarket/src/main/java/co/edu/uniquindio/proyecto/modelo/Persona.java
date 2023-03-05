package co.edu.uniquindio.proyecto.modelo;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Persona implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String cedula;
    private String nombre;
    private String email;
    @ElementCollection
    private Map<String, String> telefono;
}
