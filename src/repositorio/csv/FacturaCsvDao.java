/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio.csv;

/**
 *
 * @author Asus
 */

import java.util.LinkedList;
import java.util.List;
import modelo.Factura;

public class FacturaCsvDao extends AbstractCsvDao<Factura, Long> {

    private String rutaArchivoCsv;

    

    public FacturaCsvDao() {}

    public FacturaCsvDao(String rutaArchivoCsv) {
        this.rutaArchivoCsv = rutaArchivoCsv;
    }

    @Override
    public List<Factura> getAll() {
        List<Factura> facturas = new LinkedList<>();
        
        
        // TODO: Implementar la lectura del archivo CSV y extraer los datos
        return facturas;
    }

    @Override
    public void insert(Factura element) {
        // TODO: Implementar la inserción de datos en el archivo CSV
    }

    @Override
    public Factura getByKey(Long id) {
        
        Factura factura = new Factura();
//
        // TODO: Implementar la búsqueda del elemento por su ID
        return factura;
    }
}
