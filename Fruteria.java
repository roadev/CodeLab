/*
* Este programa recibe el valor de masa de un producto y basado en un precio por Kg,
* calcula, si aplica, el precio final con descuento.
*/
import javax.swing.JOptionPane;
/**
*
* @authors Juan Roa, Fabian Santacruz, Victor Uzurriaga
* @version 0.1
* @since 2015-10-01
*/
public class Fruteria{
  /**
  * Este método get recibe la masa del producto, y la pasa por el método calcFruteria();
  */
  public void getFruteria(){
    double mass = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la masa de las manzanas: "));
    this.calcFruteria(mass);
  }

  public void calcFruteria(double mass){
    /**
    * @pF es un real inicializado en cero, será el precio final con descuento
    * @pB es el precio base, el cuál toma el valor de la masa y lo multiplica por la constante 3600.
    * @mass es el valor de la masa, recibido en el método getFruteria() y pasado a través de calcFruteria()
    */
    double pF = 0;
    double pB = mass * 3600;

    if (mass >= 0 && mass <= 2){
      pF = pB * 1.0;
    }
    if (mass >= 2.01 && mass <= 5){
      pF = pB * 1.1;
    }
    if (mass >= 5.01 && mass <= 10){
      pF = pB * 1.15;
    }
    if (mass >= 10.01){
      pF = pB * 1.2;
    }
    /**
    * Aquí se imprime el resultado del proceso en un cuadro de diálogo
    */
    JOptionPane.showMessageDialog(null, "**Frutería** \n Para " + mass + " Kg de manzanas " + "\n El valor con descuento es: "+ pF);
  }

  public static void main(String[] args){
    Fruteria app = new Fruteria();
    /**
    * Se crea un objeto llamado app y se llama el método getFruteria()
    */
    app.getFruteria();
  }

}
