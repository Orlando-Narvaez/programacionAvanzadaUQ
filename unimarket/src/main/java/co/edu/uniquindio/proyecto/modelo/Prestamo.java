package co.edu.uniquindio.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Prestamo implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    private String cedulaPersona;

    private String fechaPrestamo;

    private String fechaDevolucion;
}
