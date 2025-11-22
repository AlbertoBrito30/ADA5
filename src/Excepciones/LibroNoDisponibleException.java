/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author betit
 */
public class LibroNoDisponibleException extends Exception {

    public LibroNoDisponibleException(String message) {
        super(message);
    }

    public LibroNoDisponibleException(String message, Throwable cause) {
        super(message, cause);
    }

    public LibroNoDisponibleException(Throwable cause) {
        super(cause);
    }
    
}
