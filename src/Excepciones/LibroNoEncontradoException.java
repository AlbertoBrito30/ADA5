/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author betit
 */
public class LibroNoEncontradoException extends Exception {

    public LibroNoEncontradoException(String message) {
        super(message);
    }

    public LibroNoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }

    public LibroNoEncontradoException(Throwable cause) {
        super(cause);
    }
    
    
}
