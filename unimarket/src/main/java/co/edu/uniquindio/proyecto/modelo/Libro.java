package co.edu.uniquindio.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Libro implements Serializable {
    @Id
    private String isbn;

    private String nombre;

    private String codigoGenero;

    @Enumerated(value = EnumType.STRING)
    private int unidades;

    private String anio;
}
