/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio.cache;

import java.util.Map;
import repositorio.IDao;

/**
 *
 * @author Asus
 */
public abstract class AbstractCacheDao<Tipo, IdTipo> implements IDao<Tipo, IdTipo> {
    protected Map<IdTipo, Tipo> cache;
    
    
     public AbstractCacheDao() {}

    public AbstractCacheDao(Map<IdTipo, Tipo> cache) {
        this.cache = cache;
    }
}
    

