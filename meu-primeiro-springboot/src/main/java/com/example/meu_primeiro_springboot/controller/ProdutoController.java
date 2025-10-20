package com.example.meu_primeiro_springboot.controller;


import com.example.meu_primeiro_springboot.Service.ProdutoService;
import com.example.meu_primeiro_springboot.model.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> listarProdutos(){
        return produtoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listarProdutosPorID(@PathVariable Long id){
        Produto produto = produtoService.findById(id);
        return ResponseEntity.ok(produto);
    }

    @PostMapping()
    public Produto salvarProduto(@RequestBody Produto produto){
        return  produtoService.saveProduto(produto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id){
        produtoService.deleteProduto(id);
        return ResponseEntity.noContent().build();
    }
}
