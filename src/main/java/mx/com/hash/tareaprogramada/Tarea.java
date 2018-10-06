/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.hash.tareaprogramada;

import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Tarea extends TimerTask {
    static private final Logger LOGGER = Logger.getLogger("mx.com.hash.tareaprogramada.Tarea");
    private Integer contador;    
    
    public Tarea() {
        contador = 0;
    }

    @Override
    public void run() {
        LOGGER.log(Level.INFO, "Numero de ejecución {0}", contador);
        contador++;
        
        try {
            // Con esto hacemos que la funcion tarde *mas* en ejecutarse que
            // el periodo especificado
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            LOGGER.log(Level.SEVERE, "Error de interrupcion");
        }
    }
    
}
