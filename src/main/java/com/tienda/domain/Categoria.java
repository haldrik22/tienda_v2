package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
import org.hibernate.annotations.GeneratorType;


@Data
@Entity
@Table (name = "categoria")
public class Categoria implements Serializable{
    
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;
    
    private String descripcion;
    private String rutaImagen;
    private Boolean activo;
    
    @OneToMany
    @JoinColumn(name="id_categoria", updatable = false)
    private List<Producto> productos;
}