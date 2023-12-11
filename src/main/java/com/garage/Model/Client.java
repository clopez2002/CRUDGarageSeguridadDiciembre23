package com.garage.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "bbddgarage")
@Getter
@Setter
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String apellido;

    private String email;

    private String calle;

    private int numero;

    private int piso;

    private String departamento;

    private String marca_auto;

    private String modelo;

    private int anio;

    private String patente;
}