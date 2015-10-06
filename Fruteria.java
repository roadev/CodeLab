import javax.swing.JOptionPane;

public class Fruteria{

  public void get(){
    double mass = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la masa de las manzanas: "));
    this.calc(mass);
  }

  public void calc(double mass){
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

    JOptionPane.showMessageDialog(null, "**Frutería** \n  Para " + mass + " Kg de manzanas " + "\n El valor con descuento es: "+ pF);
  }

  public static void main(String[] args){
    Fruteria app = new Fruteria();
    app.get();
    //app.calc();
  }

  // int k = 3600;
  //
  // public double getMass(){
  //   double mass = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la masa de las manzanas: "));
  //   return mass;
  // }
  //
  // public void setMass(double mass){
  //   double pB = mass * k;
  // }
  //
  // public double getDescuento(){
  //   double descuento = pB / 1.1;
  //   return descuento;
  // }
  //
  // public void setDescuento(double descuento){
  //
  // }
  //
  //
  // public void show(double pF){
  //   JOptionPane.showMessageDialog(null, "*Frutería Apple** \n " + getMass() + );
  // }
  //
  //
  //
  // public static void main(String[] args){
  //   MisCentavos app = new MisCentavos();
  //   app.get();
  //   // app.calc();
  // }

}
