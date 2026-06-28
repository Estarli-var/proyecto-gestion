/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;
import java.time.LocalDate;
import personas.Persona;
/**
 *
 * @author emalv
 */
public class Disciplina extends Persona{
    
    private TipoDisciplina tipo;
    private String entrenador;
   

    public Disciplina(int identificacion, String nombreCompleto, LocalDate fechaNacimiento, int telefonoContacto) {
        super(identificacion, nombreCompleto, fechaNacimiento, telefonoContacto);
        
    }

    public TipoDisciplina getTipo() {
        return tipo;
    }

    public String getEntrenador() {
        return entrenador;
    }

  

    public void setTipo(TipoDisciplina tipo) {
        this.tipo = tipo;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

  

    public Disciplina(TipoDisciplina tipo, String entrenador, int identificacion, String nombreCompleto, LocalDate fechaNacimiento, int telefonoContacto) {
        super(identificacion, nombreCompleto, fechaNacimiento, telefonoContacto);
        this.tipo = TipoDisciplina.Futbol;
        this.entrenador = entrenador;
    }

    @Override
    public String toString() {
        return "Disciplina: " +  tipo + "\nEntrenador:" + entrenador;
    }