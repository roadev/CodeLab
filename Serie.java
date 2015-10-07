/*
* Éste programa muestra una serie sencilla
*/

import javax.swing.JOptionPane;
/**
*
* @authors Juan Roa, Fabian Santacruz, Victor Uzurriaga
* @version 0.1
* @since 2015-10-01
*/
public class Serie{
  /**
  * @a -> Cadena vacía, acumulará los datos a mostrar
  * @y -> acumulador de la serie
  */
  int y = 0;
  String a = "";

  /**
  * Método que calcula e imprime la serie
  */
  public void calc(){
    /**
    * Ciclo desde 1 hasta 20 que acumulará la variable y
    */
    for (int x = 1; x <= 20; x++){
      a += "\n" +y;
      y = x + y;
    }
    JOptionPane.showMessageDialog(null, "Serie: " + a);
  }

  public static void main(String[] args) {
    /**
    * Se crea un objeto llamado app y se llama el método calc()
    */
    Serie app = new Serie();
    app.calc();

  }

}
