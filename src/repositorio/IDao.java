/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.util.List;

/**
 *
 * @author Asus
 */
public interface IDao<Tipo, IdTipo>{
    
    List<Tipo> getAll();
    
    void insert(Tipo element);
    
    Tipo getByKey(IdTipo id);
    
}
