package com.challenge.quotation.service;

import com.challenge.quotation.DTO.UserRegistroDTO;
import com.challenge.quotation.model.Rol;
import com.challenge.quotation.model.Usuario;
import com.challenge.quotation.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepositorio userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    @Override
    public Usuario saveUser(UserRegistroDTO registroDTO) {
        Usuario usuario  = new Usuario(registroDTO.getNome(), registroDTO.getEmail(),
                passwordEncoder.encode(registroDTO.getPassword()), Arrays.asList(new Rol("ROLE_USER")));
        return userRepository.save(usuario);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user = userRepository.findByEmail(username);
        if(user == null){
            throw new UsernameNotFoundException("Usuario ou senha invalidos!");
        }
        return new User(user.getEmail(), user.getPassword(), mapearAutoridades(user.getRoles()));
    }
    
    private Collection<? extends GrantedAuthority> mapearAutoridades(Collection<Rol> roles){
    	return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNome())).collect(Collectors.toList());
    }
}
