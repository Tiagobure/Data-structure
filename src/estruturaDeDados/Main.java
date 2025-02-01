package estruturaDeDados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[] estados = new String[10];
		//BUSCA LINEAR
		estados[0]= "AM";
		estados[1]= "AC";
		estados[2]= "BA";
		estados[3]= "CE";
		estados[4]= "DF";
		estados[5]= "PB";
		estados[6]= "RN";
		estados[7]= "RJ";
		estados[8]= "MS";
		estados[9]= "SP";
		
		System.out.println("Sigla em busca? ");
		String sigla = sc.nextLine();
		
		boolean n = false;
		
		for(int i=0; i< estados.length;i++ ) {
			String elemento = estados[i];
			
			if(elemento.equalsIgnoreCase(sigla)){
				n = true;
				break;
			}
		}if(n==true) {
			System.out.println("encontrou!!");
			
		}else {
			System.out.println("não encontrou!!");

		}
		
		
		sc.close();
	}

}
