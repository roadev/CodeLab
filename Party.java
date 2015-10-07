import javax.swing.JOptionPane;
public class Party{
  int men, women, n;
  double promMen = 0, promWomen = 0;
  int[] menAge = new int[10];
  int[] womenAge = new int[10];
  char option;
  String[] menNames = new String[10];
  String[] womenNames = new String[10];
  int i = 0;
  public void calc(){
    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de invitados: "));
    men = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de hombres: "));
    women = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de mujeres: "));

    do{
      menNames[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre de el asistente"+(i+1)+": ");
      menAge[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del asistente "+(i+1)+": "));
      i++;
    }while(i == (men-1));

    do{
      womenNames[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre de la asistente"+(i+1)+": ");
      womenAge[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del asistente"+(i+1)+": "));
      i++;
    }while(i == (women-1));

    for(int j=0; j <= men; j++){
      promMen += menAge[j];
    }
    for(int j=0; j <= women; j++){
      promWomen += womenAge[j];
    }
    promMen = promMen/men;
    promWomen = promWomen/women;
    JOptionPane.showMessageDialog(null, "Promedio de Edad de las mujeres: " + promWomen +"\n"+ "Promedio de Edad de los hombres: "+ promMen +
    "");

  }
    public static void main(String[] args) {
      Party app = new Party();
      app.calc();
    }

}
