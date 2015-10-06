import javax.swing.JOptionPane;

public class Serie{

  int y = 0;
  String a = "";

  public void calc(){
    for (int x = 1; x <= 20; x++){
      a += "\n" +y;
      y = x + y;
    }
    JOptionPane.showMessageDialog(null, "Serie: " + a);
  }

  public static void main(String[] args) {

    Serie app = new Serie();
    app.calc();

  }

}
