/*
* Este programa recibe edades de invitados a una fiesta, muestra promedios
* de edades de los dos sexos y también calcula el menor de las edades
*/

import javax.swing.JOptionPane;
/**
*
* @authors Juan Roa, Fabian Santacruz, Victor Uzurriaga
* @version 0.1
* @since 2015-10-01
*/
public class PartyDos {
	/**
	* @sexo es un entero, se utiliza para un menú
	* @m, f, n -> contadores y la última variable es la suma de las dos primeras
	* @menorM, menorF, menor -> Edades menores individuales y general
	* @option es la opción del menú de continuación o break de la app
	* @promF, promM son promedios de edades para los dos sexos
	*/

	int sexo, m=0, f=0, n, menorM, menorF, menor;
	double promF, promM;
	int edadesM, edadesF, contEdadesM, contEdadesF;
	char option;

	/**
	* Éste método hace las operaciones y recibe los datos de las variables sexo, edadesF, edadesM y la opción del menú.
	* También imprime el resultado final
	*/
	public void calc(){
		do{
			/**
			* Menú 1
			*/
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
			/**
			* Aquí se define y almacena el menor valor de las edades en general
			*/
			if (edadesM < edadesF){
				menor = edadesM;
			}else if(edadesF < edadesM){
				menor = edadesF;
			}
			/**
			*   Menú principal
			*/
			option = (JOptionPane.showInputDialog(null, "¿Desea ingresar otro invitado?"+"\n"+"Digite S para continuar")).charAt(0);
		}while((option == 's')||(option == 'S'));

		n = m+f;
		promF = (contEdadesF)/f;
		promM = contEdadesM/m;
		JOptionPane.showMessageDialog(null, "Total de invitados: " + n + "\n"+ "Total de hombres: " + m + "\n"+"Total de Mujeres: "+f+
		"\n"+"Promedio de edad de mujeres: "+promF+"\n"+"Promedio de edad de Hombres: "+promM + "\n" + "La persona con menor edad tiene: " + menor);
	}

	public static void main(String[] args){
		/**
		* Se crea un objeto llamado app y se llama el método calc()
		*/
		PartyDos app = new PartyDos();
		app.calc();
	}
}
