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
 * @author Marcelo
 */
public class Docente extends Persona {
    protected int AnosExperiencia;
    protected String Titulo;
    protected String[]Asignaturas=new String[6];
 
    public Docente(int anosExperiencia, String titulo,String[] asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.AnosExperiencia = anosExperiencia;
        this.Titulo = titulo;
        this.Asignaturas = asignaturas;
    }

    public Docente(int anosExperiencia, String titulo,String[] asignaturas) {
        super();
        this.AnosExperiencia = anosExperiencia;
        this.Titulo = titulo;
        this.Asignaturas =asignaturas;
    }

    public Docente() {
        
    }

    public int getAnosExperiencia() {
        return AnosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.AnosExperiencia= anosExperiencia ;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String[] getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.Asignaturas = asignaturas;
    }
    

    @Override
    public String toString() {
        return "Docente{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Anos de Experiencia" + this.AnosExperiencia
                + ", Titulo=" + this.Titulo
                +", Asignaturas=" + Arrays.toString(this.Asignaturas)  +'}';
    }
    
}
