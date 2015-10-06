import javax.swing.JOptionPane;
public class Operations{

  double a, y, z, w = 0;
  int x = 0;
  String valY3 = "";
  String valY5 = "";
    public void calc(){
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
      JOptionPane.showMessageDialog(null, "Suma de todos los Y: " + z + "\n" + "Suma de los valores de Y múltiplos de 3: " + w +
      "\n "+"Valores de Y múltiplos de 3 " +"\n"+ valY3 + "\n" + "Valores de Y cuyo último dígito sea 5: " +"\n"+ valY5 + "\n" +
      "Suma de los valores de Y cuyo último dígito sea 5: " + a);
  }

  public static void main(String[] args) {
    Operations app = new Operations();
    app.calc();
  }
}
