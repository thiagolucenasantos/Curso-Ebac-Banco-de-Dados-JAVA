package domain;

import javax.persistence.*;
import java.util.List;

@Table(name = "tb_marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marca_seq")
    @SequenceGenerator(name = "marca_seq", sequenceName = "sq_marca", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column(name = "Codigo", length = 10, nullable = false, unique = true)
    private String codigo;
    @Column(name = "Marca", length = 10, nullable = false, unique = true)
    private String marca;

    private List<Acessorios> acessorios;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
