package com.sigma.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;



@RestController()
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class LoginController {

    static class loginRequest{
        public String login;
        public  String password;
    }
    @PostMapping("/login")
    public ResponseEntity<Map<String,String>> login(@RequestBody loginRequest dados ){
        if("admin".equals(dados.login) && "admin".equals(dados.password)){
            return ResponseEntity.ok(Map.of("status","sucesso","perfil","ADMIN"));
        }
        if ("user".equals(dados.login) && "123".equals(dados.password)){
            return ResponseEntity.ok(Map.of("status","sucesso","perfil","USUARIO"));
        }
        return ResponseEntity.status(401).body(Map.of("status","erro","mensagem","usuario incorreto"));




    }


}
