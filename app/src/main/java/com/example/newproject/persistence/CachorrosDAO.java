package com.example.newproject.DAO;

import com.example.newproject.model.Cachorro;

import java.util.List;

public interface CachorrosDAO {
    public void salvar(Cachorro c);
    public void editar(Cachorro c);
    public void remove(Cachorro c);
    public List listagem();
}
