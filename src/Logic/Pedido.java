package Logic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jab29
 */
public class Pedido {
    String nombremedicamento;
    String tipo;
    int cantidad;
    String distribuidor;
    boolean sucursalprincipal;

    public Pedido() {
    }

    public Pedido(String nombremedicamento, String tipo, int cantidad, String distribuidor, boolean sucursalprincipal) {
        this.nombremedicamento = nombremedicamento;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.distribuidor = distribuidor;
        this.sucursalprincipal = sucursalprincipal;
    }

    public String getNombremedicamento() {
        return nombremedicamento;
    }

    public void setNombremedicamento(String nombremedicamento) {
        this.nombremedicamento = nombremedicamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public boolean isSucursalprincipal() {
        return sucursalprincipal;
    }

    public void setSucursalprincipal(boolean sucursalprincipal) {
        this.sucursalprincipal = sucursalprincipal;
    }
    
}
