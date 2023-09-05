package com.challenge.quotation.controller;

import com.challenge.quotation.DTO.UserRegistroDTO;
import com.challenge.quotation.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    private UsuarioService userService;

    @ModelAttribute("usuario")
    public UserRegistroDTO retornaNovoRegistro(){
        return new UserRegistroDTO();
    }

    @GetMapping()
    public String mostrarFormulario(){
        return "registro";
    }

    @PostMapping
    public String registrarConta(@ModelAttribute("usuario") UserRegistroDTO registroDTO){
        userService.saveUser(registroDTO);
        return "redirect:/registro?sucess";
    }

}
