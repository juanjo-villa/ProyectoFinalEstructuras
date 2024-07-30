/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

/**
 *
 * @author Asus
 */

import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import Configuracion.rutaCsv;
import modelo.Factura;
import modelo.Turno;
import repositorio.cache.SuperCache;
import repositorio.csv.FacturaCsvDao;

public class ProcesosInternos {

    public ProcesosInternos() {}

    public PriorityQueue<Turno> enqueueAwards() {
        Map<String, String> rutas = rutaCsv.getAllrutaCsv();
        SuperCache superCache = cargarCache(rutas.get("Factura"));

        // TODO: Implementar el código para generar los turnos y retornarlos
        List<Factura> facturas = superCache.getBillCacheDao().getAll();

        for (Factura factura : facturas) {
            if (factura.getTotal() > 1000000) {
                // Generar premios para los clientes con compras superiores a 1.000.000 COP
            }
        }
        return null;
    }

    public SuperCache cargarCache(String facturaRutaCsv) {
        FacturaCsvDao facturaCsvDao = new FacturaCsvDao(facturaRutaCsv);
        List<Factura> facturas = facturaCsvDao.getAll();
        SuperCache superCache = new SuperCache();

        for (Factura factura : facturas) {
            superCache.insertCustomer(factura.getCliente());
            // TODO: Extraer los demás datos para guardarlos en caché
        }

        return superCache;
    }

    public void saveInCsv(SuperCache superCache) {
        // TODO: Implementar el método para guardar los datos en archivos CSV individuales
    }

    public void transformDato() {
        Map<String, String> rutas = rutaCsv.getAllrutaCsv();
        SuperCache superCache = cargarCache(rutas.get("factura"));
        saveInCsv(superCache);
    }
}