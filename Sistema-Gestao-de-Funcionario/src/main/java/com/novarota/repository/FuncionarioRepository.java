package com.novarota.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.novarota.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
