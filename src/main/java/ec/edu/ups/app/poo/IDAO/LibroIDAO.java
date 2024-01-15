/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.app.poo.IDAO;

import ec.edu.ups.app.poo.modelo.Libro;
import java.util.List;

/**
 *
 * @author dell
 */
public interface LibroIDAO {
     void create(Libro libro);
    Libro read(String titulo);
    void update(String titulo, Libro libro);
    void delete(String titulo);
    List<Libro> list();
    
    
}
