package com.example.myparcial;

public class Producto {

    private String nombre;
    private String desc;
    private String precio;

    public Producto(String nombre, String desc, String precio) {
        this.nombre = nombre;
        this.desc = desc;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
