package com.example.meu_primeiro_springboot.Service;

import com.example.meu_primeiro_springboot.exceptions.RecursoNaoEncontradoException;
import com.example.meu_primeiro_springboot.model.Produto;
import com.example.meu_primeiro_springboot.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto findById(Long id){
        return produtoRepository.findById(id)
                .orElseThrow(()-> new RecursoNaoEncontradoException("Prouto com ID: "+id+" Não encontrado"));
    }

    public Produto saveProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deleteProduto(Long id){

        if(!produtoRepository.existsById(id)){
            throw new RecursoNaoEncontradoException("Produto com ID: "+id+" Não encontrado");
        }
        produtoRepository.deleteById(id);
    }
}
