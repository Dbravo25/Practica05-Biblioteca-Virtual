/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.DAO;

import ec.edu.ups.app.poo.IDAO.BibliotecaIDAO;
import ec.edu.ups.app.poo.modelo.Biblioteca;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author dell
 */
public class BibliotecaDAO implements BibliotecaIDAO{
    

    private List<Biblioteca> bibliotecas;

    public BibliotecaDAO() {
    	bibliotecas = new ArrayList<>();
    }

    @Override
    public void create(Biblioteca biblioteca) {
        bibliotecas.add(biblioteca);
    }

    @Override
    public Biblioteca read(int codigo) {
     for (Biblioteca biblioteca : bibliotecas){
         if(biblioteca.getCodigo()== codigo){
             return biblioteca;
         }
     }
     return null;
    }

    @Override
    public void update(int codigo, Biblioteca biblioteca) {
        for(int i = 0; i<bibliotecas.size();i++){
            Biblioteca bibliotecauno = bibliotecas.get(i);
            if(bibliotecauno.getCodigo() == codigo){
               bibliotecas.set(i, biblioteca);
               
            }
            
        }
        
    }

    @Override
    public void delete(int codigo) {
            for(int i = 0; i<bibliotecas.size();i++){
            Biblioteca bibliotecauno = bibliotecas.get(i);
            if(bibliotecauno.getCodigo() == codigo){
               bibliotecas.remove(i);
               
            }
            
        }  
        
    }

    @Override
    public List<Biblioteca> list() {
        return bibliotecas;
    }

    @Override
    public Biblioteca read(String nombre) {
        for(Biblioteca biblioteca : bibliotecas){
            if(biblioteca.getNombre().equalsIgnoreCase(nombre)){
                return biblioteca;
            }
        }
        return null;
    }
    
    
    
    
    
    
}
