/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package participantes;

import java.time.LocalDate;

/**
 *
 * @author Wesley Ruiz
 */
public class Participante {
    private String nombre;
    private String id;
    private int telefono;
    private LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Participante(String nombre, String id, int telefono, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Participante" + "\nombre=" + nombre + "\nid=" + id + "\ntelefono=" + telefono + "\nfechaNacimiento=" + fechaNacimiento;
    }
    
    
    
    
}
