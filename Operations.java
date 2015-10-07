/*
* Este programa realiza la operación y = x^2 - 2x e imprime una serie de resultados.
*/
import javax.swing.JOptionPane;
/**
*
* @authors Juan Roa, Fabian Santacruz, Victor Uzurriaga
* @version 0.1
* @since 2015-10-01
*/
public class Operations{
  /**
  * @a, y, z, w son variables que almacenan acumulaciones reales.
  * @valY3, valY5 almacenan acumuladores de cadenas
  */
  double a, y, z, w = 0;
  int x = 0;
  String valY3 = "";
  String valY5 = "";
  /**
  * Éste método hace las operaciones mientras x<=10 iniciando en 0
  */
    public void calc(){
      /**
      * Ciclo while donde se realizan operaciones y condicionales con acumuladores
      */
      while(x <= 10){
        y = (Math.pow(x,2) - (2*x));
        z = z + y;

        if (y % 3 == 0){
          valY3 += y + " \n ";
          w = y + w;
        }
        if (y % 10 == 5){
          valY5 += y + " \n ";
          a = y + a;
        }
        x++;

      }
      /**
      * Impresión de resultados en JOptionPane
      */
      JOptionPane.showMessageDialog(null, "Suma de todos los Y: " + z + "\n" + "Suma de los valores de Y múltiplos de 3: " + w +
      "\n "+"Valores de Y múltiplos de 3 " +"\n"+ valY3 + "\n" + "Valores de Y cuyo último dígito sea 5: " +"\n"+ valY5 + "\n" +
      "Suma de los valores de Y cuyo último dígito sea 5: " + a);
  }

  public static void main(String[] args) {
    /**
    * Se crea un objeto llamado app y se llama el método calc()
    */
    Operations app = new Operations();
    app.calc();
  }
}
