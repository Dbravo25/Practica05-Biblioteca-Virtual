/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.DAO;

import ec.edu.ups.app.poo.IDAO.PrestamoIDAO;
import ec.edu.ups.app.poo.modelo.Prestamo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class PrestamoDAO implements PrestamoIDAO {
    List<Prestamo> prestamos;

    public PrestamoDAO() {
        prestamos = new ArrayList<>();
    }
    

    @Override
    public void create(Prestamo prestamo) {
        prestamos.add(prestamo);
       }

    @Override
    public Prestamo read(int numPrestamo) {
        for(Prestamo prestamo: prestamos){
            if(prestamo.getNumeroPrestamo() == numPrestamo){
                return prestamo;
            }
        }
        return null;
     }

    @Override
    public void update(int numPrestamo, Prestamo prestamo) {
        for(int i =0; i<prestamos.size(); i++){
            Prestamo prestamoUno = prestamos.get(i);
            if(prestamoUno.getNumeroPrestamo() == numPrestamo){
                prestamoUno.setFechaDevolucion(prestamo.getFechaDevolucion());
                prestamos.set(i, prestamoUno);
            }
            
        }
       }

    @Override
    public void delete(int numPrestamo) {
        for(int i =0; i<prestamos.size(); i++){
            Prestamo prestamoUno = prestamos.get(i);
            if(prestamoUno.getNumeroPrestamo() == numPrestamo){
                prestamos.remove(i);
            }
            
        }
    }

    @Override
    public List<Prestamo> list() {
      return prestamos;
    }
  
    
}
