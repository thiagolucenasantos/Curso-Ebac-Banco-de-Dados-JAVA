package domain;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "tb_acessorios")
public class Acessorios {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorios_seq")
    @SequenceGenerator(name = "acessorios_seq", sequenceName = "sq_acessorios", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;
    @Column(name = "NOME", length = 15, nullable = false, unique = true)
    private String nome;

    @ManyToMany(mappedBy = "acessorios")
    private List<Carro> acessorios;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Carro> acessorios) {
        this.acessorios = acessorios;
    }
}
