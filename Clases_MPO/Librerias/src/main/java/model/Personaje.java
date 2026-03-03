package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType
public class Personaje extends Libro {
    private String nombre;
    @XmlAttribute
    private String tipo;
}
