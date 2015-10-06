import javax.swing.JOptionPane;

public class Serie{

  public static void main(String[] args) {
    int y = 0;
    String a = "";
    for (int x = 1; x <= 20; x++){
      a += "\n" +y;
      y = x + y;
    }
    JOptionPane.showMessageDialog(null, "Hi" + a);
  }

}
