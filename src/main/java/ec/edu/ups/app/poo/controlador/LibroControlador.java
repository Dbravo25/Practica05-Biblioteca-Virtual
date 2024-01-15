/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.controlador;

import ec.edu.ups.app.poo.IDAO.LibroIDAO;
import ec.edu.ups.app.poo.modelo.Libro;
import java.util.List;

/**
 *
 * @author dell
 */
public class LibroControlador {
    private LibroIDAO libroDAO;
    private Libro libro;
    
    public LibroControlador(LibroIDAO libroDAO){
        this.libroDAO = libroDAO;
    }
    
    public void create(String titulo, String autor, int año,String genero, String disponible){
        libro = new Libro(titulo, autor, año, genero, disponible);
        libroDAO.create(libro);
    }
    public Libro read(String titulo){
        libro = libroDAO.read(titulo);
        return libro;
        
    }
    public void update(String titulo, String autor, int año,String genero, String disponible){
        libro = new Libro(titulo, autor, año, genero, disponible);
        libroDAO.update(titulo, libro);
          
        
    }
    public void delete(String titulo){
        libroDAO.delete(titulo);
            
        
    }
    public List<Libro> list(){
        return libroDAO.list();
        
    }
}
