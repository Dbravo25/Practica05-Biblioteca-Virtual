/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.DAO;

import ec.edu.ups.app.poo.IDAO.LibroIDAO;
import ec.edu.ups.app.poo.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class LibroDAO implements LibroIDAO{
    
    private List<Libro> libros;
    
    public LibroDAO(){
        libros = new ArrayList<>();
    }

    @Override
    public void create(Libro libro) {
       libros.add(libro);
    }

    @Override
    public Libro read(String titulo) {
       for(Libro libro : libros){
           if(libro.getTitulo().equalsIgnoreCase(titulo)){
               return libro;
           }
       }
       return null;
      }

    @Override
    public void update(String titulo, Libro libro) {
        for(int i = 0; i<libros.size(); i++){
           Libro libroUno = libros.get(i);
           if (libroUno.getTitulo().equalsIgnoreCase(titulo)){
               libros.set(i, libro);
               
           }
        }
       
    }

    @Override
    public void delete(String titulo) {
          for(int i = 0; i<libros.size(); i++){
           Libro libroUno = libros.get(i);
           if (libroUno.getTitulo().equalsIgnoreCase(titulo)){
               libros.remove(i);
           
           }
        }
   
    }

    @Override
    public List<Libro> list() {
        return libros;
    }
    
}
