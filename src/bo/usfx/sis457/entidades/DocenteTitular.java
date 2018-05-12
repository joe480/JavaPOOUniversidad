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
public class DocenteTitular extends Docente {
  protected String ExamenCompetencia;

    public DocenteTitular(String examenCompetencia, int anosExperiencia, String titulo, String[] asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(anosExperiencia, titulo, asignaturas, carnetIdentidad, nombre, fechaNacimiento);
        this.ExamenCompetencia = examenCompetencia;
    }

    public DocenteTitular(String examenCompetencia) {
        super();
        this.ExamenCompetencia = examenCompetencia;
    }

    public String getExamenCompetencia() {
        return ExamenCompetencia;
    }

    public void setExamenCompetencia(String examenCompetencia) {
        this.ExamenCompetencia = examenCompetencia;
    }

    @Override
    public String toString() {
        return "Docente Titular{"
               + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Anos de Experiencia" + this.AnosExperiencia
                + ", Titulo=" + this.Titulo
                + ", Asignaturas=" + Arrays.toString(this.Asignaturas)
                + ", ExamenCompetencia=" + ExamenCompetencia + '}';
    }


}
