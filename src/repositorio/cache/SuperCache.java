/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio.cache;

import modelo.Cliente;

/**
 *
 * @author Asus
 */
public class SuperCache {
    private FacturaCacheDao facturaCacheDao;
    private ClienteCacheDao cliCacheDao;

    public SuperCache() {
        this.facturaCacheDao = new FacturaCacheDao();
        this.cliCacheDao = new ClienteCacheDao();
    }
    
    public void insertCustomer(Cliente cli) {
        cliCacheDao.insert(cli);
    }

    public FacturaCacheDao getBillCacheDao() {
        return facturaCacheDao;
    }

    public ClienteCacheDao getCustCacheDao() {
        return cliCacheDao;
    }
    
    
    
}
