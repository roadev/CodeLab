import javax.swing.JOptionPane;
public class PartyDos {
	int sexo, m=0, f=0, n, menorM, menorF, menor;
	double promF, promM;
	int edadesM, edadesF, contEdadesM, contEdadesF;
	char option;
	public void calc(){

			do{			
				sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione el sexo del invitado "+"\n"+"1. Masculino"+"\n"+"2. Femenino"));
				if (sexo == 1){
					edadesM = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad el invitado: "));
					contEdadesM = edadesM + contEdadesM;
					
					m++;
					
				}else if(sexo == 2){
					edadesF = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad la invitada: "));
					contEdadesF = edadesF + contEdadesF;
					f++;
				}
				if (edadesM < edadesF){
					menor = edadesM;
				}else if(edadesF < edadesM){
					menor = edadesF;
				}
				option = (JOptionPane.showInputDialog(null, "¿Desea ingresar otro invitado?"+"\n"+"Digite S para continuar")).charAt(0);
			}while((option == 's')||(option == 'S'));
	
		n = m+f;
		promF = (contEdadesF)/f;
		promM = contEdadesM/m;
		JOptionPane.showMessageDialog(null, "Total de invitados: " + n + "\n"+ "Total de hombres: " + m + "\n"+"Total de Mujeres: "+f+
				"\n"+"Promedio de edad de mujeres: "+promF+"\n"+"Promedio de edad de Hombres: "+promM + "\n" + "La persona con menor edad tiene: " + menor);
	}
	
	public static void main(String[] args){
		PartyDos app = new PartyDos();
		app.calc();
	}
}