/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio.csv;

import repositorio.IDao;

/**
 *
 * @author Asus
 */
public abstract class AbstractCsvDao<Tipo, IdTipo> implements IDao<Tipo, IdTipo>{
    
    private String rutaArchivoCvs;
    
    public AbstractCsvDao() {}

    public AbstractCsvDao(String rutaArchivoCvs) {
        this.rutaArchivoCvs = rutaArchivoCvs;
    }
    
    
    
    
    
}
