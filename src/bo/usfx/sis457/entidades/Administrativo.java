/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * @author Marcelo
 */
public class Administrativo extends Persona {
   protected String Cargo;
   protected String LugarTrabajo;
   protected Calendar FechaIngreso;
   
   public Administrativo (String cargo,String lugarTrabajo,Calendar fechaIngreso,String carnetIdentidad, String nombre, Calendar fechaNacimiento){
       super(carnetIdentidad,nombre,fechaNacimiento);
       this.Cargo =cargo;
       this.LugarTrabajo =lugarTrabajo;
       this.FechaIngreso =fechaIngreso;
   }

    public Administrativo(String cargo, String lugarTrabajo, Calendar fechaIngreso) {
        super();
        this.Cargo = cargo;
        this.LugarTrabajo = lugarTrabajo;
        this.FechaIngreso = fechaIngreso;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }

    public String getLugarTrabajo() {
        return LugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.LugarTrabajo = lugarTrabajo;
    }

    public Calendar getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Calendar fechaIngreso) {
        this.FechaIngreso = fechaIngreso;
    }
    @Override
    public String toString() {
        return "Administrativo{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Cargo=" + this.Cargo 
                + ", Lugar de a Trabajo=" + this.LugarTrabajo
                + ", Fecha de Ingreso=" + this.FechaIngreso + '}';
    }
   
}
