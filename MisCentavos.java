/*
* Este programa recibe un valor real de una consignación, calcula un interés + capital
* e imprime el resultado final debido.
*/
import javax.swing.JOptionPane;
/**
*
* @authors Juan Roa, Fabian Santacruz, Victor Uzurriaga
* @version 0.1
* @since 2015-10-01
*/
public class MisCentavos {

  /**
  * Método get donde se recibe el valor presente y se ingresa al método calc()
  */
  public void get(){
    double vp = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de la consignación: "));
    this.calc(vp);
  }
  /**
  * Método que recibe el valor de vp ingresado en la función anterior y calcula el valor futuro, además, lo imprime en un JOptionPane
  */
  public void calc(double vp){
    /**
    * @vf es un real que almacena el valor futuro calculado.
    * @vp es el valor presente y se utuiliza para realizar el cálculo de valor futuro
    */
    double vf = vp * (Math.pow((1 + 0.098),24));
    JOptionPane.showMessageDialog(null, "**Banco Mis Centavos** \n Valor consignado      Valor futuro en 2 años \n " + vp + "      " + vf);
  }

  public static void main(String[] args){
    /**
    * Se crea un objeto llamado app y se llama el método get()
    */
    MisCentavos app = new MisCentavos();
    app.get();
  }
}
