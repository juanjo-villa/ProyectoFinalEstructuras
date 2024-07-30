/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author Asus
 */
public class Factura {
    
    private Long id;
    private String date;
    private int total;
    private Ciudad ciudad;
    private Empleado vendedor;
    private Cliente cliente;
    private List<Detalle> detalle;

    // Constructores, getters y setters

    public Factura(Long id, String date, int total, Ciudad ciudad, Empleado vendedor, Cliente cliente, List<Detalle> detalle) {
        this.id = id;
        this.date = date;
        this.total = total;
        this.ciudad = ciudad;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.detalle = detalle;
    }

    public Factura() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Detalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<Detalle> detalle) {
        this.detalle = detalle;
    }
    
    
}
    

