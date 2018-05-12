/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Marcelo
 */
public class Alumno extends Persona {
    protected String[]Asignaturas =new String[6];
    protected String CarnetUniversitario;
    protected int Semestre;
    
    public Alumno(String[] asignaturas,String carnetUniversitario, int semestre, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Asignaturas = asignaturas;
        this.CarnetUniversitario = carnetUniversitario;
        this.Semestre = semestre;
        //System.out.println("Se crea un Alumno");
    }
    
    public Alumno(String[]asignaturas,String carnetUniversitario, int semestre) {
        super();
        this.Asignaturas = asignaturas;
        this.CarnetUniversitario = carnetUniversitario;
        this.Semestre = semestre;
        //System.out.println("Se crea un Alumno");
    }

    public String[] getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.Asignaturas = asignaturas;
    }
    
    public String getCarnetUniversitario() {
        return CarnetUniversitario;
    }

    public void setCarnetUniversitario(String carnetUniversitario) {
        this.CarnetUniversitario = carnetUniversitario;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int semestre) {
        this.Semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", CarnetUniversitario=" + this.CarnetUniversitario 
                + ", Semestre=" + this.Semestre 
                + ", Asignaturas="+ Arrays.toString(this.Asignaturas) +'}';
    }
}
