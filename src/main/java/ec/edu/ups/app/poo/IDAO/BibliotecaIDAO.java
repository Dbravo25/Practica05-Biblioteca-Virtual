/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.app.poo.IDAO;

import ec.edu.ups.app.poo.modelo.Biblioteca;
import java.util.List;

/**
 *
 * @author dell
 */
public interface BibliotecaIDAO {
    void create(Biblioteca biblioteca);
    Biblioteca read(int codigo);
    Biblioteca read(String nombre);
    void update(int codigo, Biblioteca biblioteca);
    void delete(int codigo);
    List<Biblioteca> list();
}
