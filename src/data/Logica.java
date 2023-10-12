/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Random;
import javax.swing.JOptionPane;

public class Logica {
    public static void main(String[] args) {
        Random random = new Random();
        
        int numeroAdivinar = random.nextInt(500) + 1;
        int intentos = 0;
        
        JOptionPane.showMessageDialog(null, "Bienvenido al juego de adivinar el número entre 1 y 500.");
        
        while (true) {
            try {
                int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
                
                if (n < 0 || n > 500) {
                    JOptionPane.showMessageDialog(null, "Fuera de rango (0 - 500)");
                    continue;
                }
                
                intentos++;
                
                if (n == numeroAdivinar) {
                    JOptionPane.showMessageDialog(null, "¡Felicidades! Adivinaste el número " + numeroAdivinar + " en " + intentos + " intentos.");
                    break;
                } else if (n < numeroAdivinar) {
                    JOptionPane.showMessageDialog(null, "El número a adivinar es mayor. Intento #" + intentos);
                } else {
                    JOptionPane.showMessageDialog(null, "El número a adivinar es menor. Intento #" + intentos);
                }
            } catch (NumberFormatException e) {
                intentos++;
                JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Intento #" + intentos);
            }
        }
    }
}
