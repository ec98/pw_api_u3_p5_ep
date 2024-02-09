package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.to.EstudianteTO;

/*
 * LOGICA DE NEGOCIO
 */
public interface IEstudianteService {
	
	public void guardar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void actualizarParcial(String apellido, String nombre, Integer id);
	public Estudiante buscar(Integer id);
	public void borrar(Integer id);
	
	public List<Estudiante> consultAll(String genero);
	
	public List<EstudianteTO> consultAllTo();
	
}
