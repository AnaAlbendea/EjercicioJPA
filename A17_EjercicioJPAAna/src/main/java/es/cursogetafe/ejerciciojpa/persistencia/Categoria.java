package es.cursogetafe.ejerciciojpa.persistencia;

import java.util.List;

public interface Categoria {
  
	
	  public void agregarCategoria(Categoria categoria);
	  
	  public void actualizarCategoria(Categoria categoria);
	  
	  public boolean eliminarCategoria(int idCategoria);
	  
	  public boolean eliminarCategoria(Categoria categoria);
	  
	  public Categoria obtenerCategoria(int id);
	  
	  public  List<Categoria> obtenerTodasCategorias();
	
	  //public  salarioConvenio obtenerSalarioCOnvenio();
	
}
