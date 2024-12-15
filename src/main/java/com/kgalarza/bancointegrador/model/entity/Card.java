package com.kgalarza.bancointegrador.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tarjetas")
public class Card {

    @Id
    private String id;
    private String numeroTarjeta;
    private String tipo;
    private Account cuenta;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Account getCuenta() {
        return cuenta;
    }

    public void setCuenta(Account cuenta) {
        this.cuenta = cuenta;
    }
}