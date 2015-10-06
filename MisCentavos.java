import javax.swing.JOptionPane;

public class MisCentavos {

  // public void MisCentavos(){
  //
  // }

  public double calc(double vp){
    double vf = vp * ((1 + 0.098)^24);
    return vf;
  }

  public void get(double vp){
    vp = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de la consignación: "));
  }

  public void show(){
    JOptionPane.showMessageDialog(null, "**Banco Mis Centavos** \n Valor consignado      Valor futuro en 2 años \n " + vp + "      " + vf);
  }

  public static void main(String[] args){
    MisCentavos app = new MisCentavos();
    app.get();
    app.calc();
    app.show();
  }
}
