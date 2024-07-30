/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio.cache;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelo.Factura;

public class FacturaCacheDao extends AbstractCacheDao<Factura, Long> {

    public FacturaCacheDao() {
        this.cache = new HashMap<>();
    }

    @Override
    public List<Factura> getAll() {
        return new ArrayList<>(this.cache.values());
    }

    @Override
    public void insert(Factura element) {
        this.cache.put(element.getId(), element);
    }

    @Override
    public Factura getByKey(Long id) {
        return this.cache.get(id);
    }
}