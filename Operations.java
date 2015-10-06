import javax.swing.JOptionPane;
public class Operations{

  double y, z, w;
  int x = 0;
  String valY3 = " ";
    public void calc(){
      while(x <= 10){
        y = (Math.pow(x,2) - (2*x));
        z = z + y;

        if (z % 3 == 0){
          valY3 += z + " , ";
          w = z + w;
        }
        x++;

      }

      JOptionPane.showMessageDialog(null, "Suma de todos los Y: " + z + "\n" + "Suma de los valores de Y múltiplos de 3: " + w +
      "\n "+"Valores de Y múltiplos de 3 " + valY3);
  }

  public static void main(String[] args) {
    Operations app = new Operations();
    app.calc();
  }
}
