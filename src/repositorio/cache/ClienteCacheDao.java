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
import modelo.Cliente;

public class ClienteCacheDao extends AbstractCacheDao<Cliente, Long> {

    public ClienteCacheDao() {
        this.cache = new HashMap<>();
    }

    @Override
    public List<Cliente> getAll() {
        return new ArrayList<>(this.cache.values());
    }

    @Override
    public void insert(Cliente element) {
        this.cache.put(element.getId(), element);
    }

    @Override
    public Cliente getByKey(Long id) {
        return this.cache.get(id);
    }
}