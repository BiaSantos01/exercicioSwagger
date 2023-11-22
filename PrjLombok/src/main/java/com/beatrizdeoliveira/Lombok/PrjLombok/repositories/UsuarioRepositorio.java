package com.beatrizdeoliveira.Lombok.PrjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beatrizdeoliveira.Lombok.PrjLombok.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository < Usuario, Long >{
}
