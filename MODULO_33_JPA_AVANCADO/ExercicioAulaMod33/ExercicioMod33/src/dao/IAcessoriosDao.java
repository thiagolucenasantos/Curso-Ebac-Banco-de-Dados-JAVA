package dao;

import domain.Acessorios;

public interface IAcessoriosDao {
    public Acessorios cadastrar(Acessorios acessorios);

    Acessorios buscarAccCarro(Long id);
}
