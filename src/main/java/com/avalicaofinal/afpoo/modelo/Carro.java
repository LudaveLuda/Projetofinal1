package com.avalicaofinal.afpoo.modelo;

public class Carro {
    private int codigo;
    private String modelo;
    private float valordiaria;
    public Cliente cliente;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getValordiaria() {
        return valordiaria;
    }

    public void setValordiaria(float valordiaria) {
        this.valordiaria = valordiaria;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

        
    }

