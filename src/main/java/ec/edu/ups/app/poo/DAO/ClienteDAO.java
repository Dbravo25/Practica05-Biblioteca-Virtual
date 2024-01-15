/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.DAO;

import ec.edu.ups.app.poo.IDAO.ClienteIDAO;
import ec.edu.ups.app.poo.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */ 
public class ClienteDAO implements ClienteIDAO{
    List<Cliente> clientes;

    public ClienteDAO() {
        clientes = new ArrayList<>();
        
    }
    

    @Override
    public void create(Cliente cliente) {
        clientes.add(cliente);
       }

    @Override
    public Cliente read(String identificacion) {
        for(Cliente cliente : clientes){
            if(cliente.getIdentificacion().equalsIgnoreCase(identificacion)){
                return cliente;
            }
        }
        return null;
     }

    @Override
    public void update(String identificacion, Cliente cliente) {
        for(int i = 0; i<clientes.size(); i++){
            Cliente clienteUno = clientes.get(i);
            if (clienteUno.getIdentificacion().equalsIgnoreCase(identificacion)){
                clientes.set(i, cliente);
                
            }
        }
       
    }
    

    @Override
    public void delete(String identificacion) {
         for(int i = 0; i<clientes.size(); i++){
            Cliente clienteUno = clientes.get(i);
            if (clienteUno.getIdentificacion().equalsIgnoreCase(identificacion)){
                clientes.remove(i);
               
            }
        }
    }

    @Override
    public List<Cliente> list() {
        return clientes;
    }
    
}
