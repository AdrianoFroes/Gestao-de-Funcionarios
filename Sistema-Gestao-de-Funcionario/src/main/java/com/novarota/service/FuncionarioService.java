package com.novarota.service;

import java.util.List;

import com.novarota.dto.FuncionarioDTO;
import com.novarota.exeption.RecursoNaoEncontradoException;
import com.novarota.model.Funcionario;
import com.novarota.repository.FuncionarioRepository;


public class FuncionarioService {
	
	 private final FuncionarioRepository repository;

	    public FuncionarioService(FuncionarioRepository repository) {
	        this.repository = repository;
	    }

	    public Funcionario cadastrar(FuncionarioDTO dto) {
	        Funcionario funcionario = new Funcionario();
	        funcionario.setNome(dto.getNome());
	        funcionario.setCpf(dto.getCpf());
	        funcionario.setCargo(dto.getCargo());
	        funcionario.setSalario(dto.getSalario());

	        return repository.save(funcionario);
	    }

	    public List<Funcionario> listar() {
	        return repository.findAll();
	    }

	    public Funcionario buscarPorId(Long id) {
	        return repository.findById(id)
	                .orElseThrow(() -> new RecursoNaoEncontradoException("Funcionário não encontrado"));
	    }

	    public Funcionario atualizar(Long id, FuncionarioDTO dto) {
	        Funcionario funcionario = buscarPorId(id);
	        funcionario.setNome(dto.getNome());
	        funcionario.setCargo(dto.getCargo());
	        funcionario.setSalario(dto.getSalario());

	        return repository.save(funcionario);
	    }

	    public void excluir(Long id) {
	        Funcionario funcionario = buscarPorId(id);
	        repository.delete(funcionario);
	    }

}
