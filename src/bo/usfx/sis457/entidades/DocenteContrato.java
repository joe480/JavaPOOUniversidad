/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author 2017
 */
public class DocenteContrato extends Docente{
    protected String NumeroContrato;

    public DocenteContrato(String numeroContrato, int anosExperiencia, String titulo, String[] asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(anosExperiencia, titulo, asignaturas, carnetIdentidad, nombre, fechaNacimiento);
        this.NumeroContrato = numeroContrato;
    }

    public DocenteContrato(String numeroContrato) {
        super();
        this.NumeroContrato = numeroContrato;
    }

    public String getNumeroContrato() {
        return NumeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.NumeroContrato = numeroContrato;
    }

    @Override
    public String toString() {
        return "Docente a Contrato{"
               + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Anos de Experiencia" + this.AnosExperiencia
                + ", Titulo=" + this.Titulo
                + ", Asignaturas=" + Arrays.toString(this.Asignaturas)
                + ", NumeroContrato=" + NumeroContrato 
               + '}';
    }
    
    
}
