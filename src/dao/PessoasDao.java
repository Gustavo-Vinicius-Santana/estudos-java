package dao;

import models.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoasDao {
    private List<Pessoa> pessoas;

    public PessoasDao() {
        this.pessoas = new ArrayList<>();
    }

    public void salvar(Pessoa novaPessoa){
        pessoas.add(novaPessoa);
    }

    public List<Pessoa> listarPessoas(){
        return pessoas;
    }
}
