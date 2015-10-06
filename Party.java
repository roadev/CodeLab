public class Party{
  int men, women, people;
  char option;
  public void calc(){
    //people = Integer.parseInt(JOptiomPane.showInputDialog(null, "Ingrese la cantidad de invitados: "));
    men = Integer.parseInt(JOptiomPane.showInputDialog(null, "Ingrese la cantidad de hombres: "));
    women = Integer.parseInt(JOptiomPane.showInputDialog(null, "Ingrese la cantidad de mujeres: "));
    do{

    }while((option == 'S') || (option == 's'));
  }
    // switch(option){
    //   case 1: ;
    //   break;
    // }
    public static void main(String[] args) {
      Party app = new Party();
      app.calc();
    }

}
