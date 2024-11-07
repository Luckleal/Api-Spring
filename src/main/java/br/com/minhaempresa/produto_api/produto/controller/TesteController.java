package br.com.minhaempresa.produto_api.produto.controller;

import br.com.minhaempresa.produto_api.produto.entity.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/teste-controller")
public class TesteController {

  @GetMapping
  public String getMensagemTeste() {
    return "Servidor funcionando";
  }

}
