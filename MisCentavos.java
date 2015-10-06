import javax.swing.JOptionPane;

public class MisCentavos {

  // public void MisCentavos(){
  //
  // }

  public void get(){
    double vp = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de la consignación: "));
    this.calc(vp);
  }

  public void calc(double vp){
    double vf = vp * (Math.pow((1 + 0.098),24));
    JOptionPane.showMessageDialog(null, "**Banco Mis Centavos** \n Valor consignado      Valor futuro en 2 años \n " + vp + "      " + vf);
  }

  public static void main(String[] args){
    MisCentavos app = new MisCentavos();
    app.get();
    // app.calc();
  }
}
