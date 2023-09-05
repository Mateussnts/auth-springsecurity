package com.challenge.quotation.service;

import com.challenge.quotation.DTO.UserRegistroDTO;
import com.challenge.quotation.model.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsuarioService extends UserDetailsService {

    public Usuario saveUser(UserRegistroDTO registroDTO);

}
