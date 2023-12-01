package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_carro")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column(name = "Codigo", length = 10, nullable = false, unique = true)
    private String codigo;
    @Column(name = "Carro", length = 10, nullable = false, unique = true)
    private String carro;

    @OneToOne(mappedBy = "carro")
    private Marca marca;

    @ManyToMany
    @JoinTable(name = "tb_acessorios",
            joinColumns = {@JoinColumn(name = "id_carro_fk")},
            inverseJoinColumns = {@JoinColumn(name = "id_acessorios_fk")})

    private List<Acessorios> acessorios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

//@OneToMany(mappedBy = "carro")
    public List<Acessorios> getAcessorios() {
        return acessorios;
    }

      public void setAcessorios(List<Acessorios> acessorios) {
        this.acessorios = acessorios;
    }
}
