/*
* Este programa muestra cantidades totales dependiendo de condiciones
* dadas para las calificaciones de los estudiantes
*/

import javax.swing.JOptionPane;
/**
*
* @authors Juan Roa, Fabian Santacruz, Victor Uzurriaga
* @version 0.1
* @since 2015-10-01
*/
public class Students{
  /**
  * @a, b, c, d -> son los acumumladores de cantidades
  * @calc es la variable que recibe los 10 valores
  */

  int a=0, b=0, c=0, d=0;
  double calc=0;

  /**
  * Éste método hace las operaciones y recibe los datos de la variable calc
  */
  public void calc(){

    /**
    * Éste ciclo repite desde 1 hasta 10 el proceso de pedir la variable calc
    */
    for(int j = 1; j<=10; j++){
      calc = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la calificación del estudiante "+(j)));
      if((calc >= 1)&&(calc <= 100)){

        if(calc < 50){
          a++;
        }else if(calc >= 50 && calc < 80){
          b++;
        }else if(calc >= 70 && calc < 80){
          c++	;
        }else if(calc >= 80){
          d++;
        }
        }else{
          JOptionPane.showMessageDialog(null, "¡Debe ingresar valores entre 1 y 100!");
          break;
      }
    }
    JOptionPane.showMessageDialog(null, "La cantidad de estudiantes que obtuvieron calificación < 50: "+ a + "\n" +
    "La cantidad de estudiantes que obtuvieron calificación < 50: " + b + "\n" + "La cantidad de estudiantes que obtuvieron calificación >= 50 y < 80: " + b +
    "\n"+"La cantidad de estudiantes que obtuvieron calificación >= 70 y < 80: " + c + "\n" + "La cantidad de estudiantes que obtuvieron calificación >= 80: " + d +
    "\n");

  }
  public static void main(String[] args){
    Students app = new Students();
    app.calc();
  }
}
