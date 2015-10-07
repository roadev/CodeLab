import javax.swing.JOptionPane;
public class Students{
  int a, b, c, d;
  double calc=0;
  public void calc(){

    for(int j = 1; j<=10; j++){


      calc = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la calificación del estudiante "+(j)));
      if((calc >= 1)||(calc <= 100)){

        if(calc < 50){
          a++;
        }else if(calc >= 50 && calc < 80){
          b++;
        }else if(calc >= 70 && calc < 80){
          c++	;
        }else if(calc >= 80){
          d++;
        }else{
          JOptionPane.showMessageDialog(null, "¡Debe ingresar valores entre 1 y 100!");
          break;
        }
      }
    }
    JOptionPane.showMessageDialog(null, "La cantidad de estudiantes que obtuvieron calificación < 50: "+ a + "\n" +
    "La cantidad de estudiantes que obtuvieron calificación < 50: " + b + "\n" + "La cantidad de estudiantes que obtuvieron calificación >= 50 y < 80: " + b +
    "La cantidad de estudiantes que obtuvieron calificación >= 70 y < 80: " + c + "\n" + "La cantidad de estudiantes que obtuvieron calificación >= 80: " + d +
    "\n" + "");


  }
  public static void main(String[] args){
    Students app = new Students();
    app.calc();
  }
}
