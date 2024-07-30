/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configuracion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Asus
 */
public class rutaCsv {
    
    public static Map<String, String> getAllrutaCsv() {
        HashMap<String, String> rutas = new HashMap<>();
        rutas.put("factura", "C:/general.csv");
        rutas.put("empleado", "C:/employee.csv");
        rutas.put("cliente", "C:/customer.csv");
        return rutas;
    }
}
    

