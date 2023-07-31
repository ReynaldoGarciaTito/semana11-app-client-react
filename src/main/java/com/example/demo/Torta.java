package com.example.demo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Torta {

	private @Id @GeneratedValue Long id; 
	private String nombre;
	private String categoria;
	private String ingredientes;

	private Torta() {}

	public Torta(String nombre, String categoria, String ingredientes) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.ingredientes = ingredientes;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Torta torta = (Torta) o;
		return Objects.equals(id, torta.id) &&
			Objects.equals(nombre, torta.nombre) &&
			Objects.equals(categoria, torta.categoria) &&
			Objects.equals(ingredientes, torta.ingredientes);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, nombre, categoria, ingredientes);
	}

	@Override
	public String toString() {
		return "Tortas{" +
			"id=" + id +
			", nombre='" + nombre + '\'' +
			", categoria='" + categoria + '\'' +
			", ingredientes='" + ingredientes + '\'' +
			'}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
}