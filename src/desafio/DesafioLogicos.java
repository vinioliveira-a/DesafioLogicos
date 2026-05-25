package desafio;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		boolean trabTerca = true;
		System.out.printf("O trabalho de terça deu certo? %b",
			trabTerca);
		boolean trabQuinta = true;
		System.out.printf("\nO trabalho de quinta deu certo? %b\n",
				trabQuinta);
		boolean tv50 = trabTerca && trabQuinta;
		boolean tv32 = trabTerca ^ trabQuinta;
		
		boolean sorvete = tv50 || tv32;
		boolean maisSaudavel = !sorvete;
		
		System.out.printf("\nVocê comprou a TV de 5\"'? %b. Vamos tomar sorvete? %b",
				tv50, sorvete);

		System.out.printf("\nVocê comprou a TV de 3\"'? %b. Vamos tomar sorvete? %b",
				tv32, sorvete);
		System.out.printf("\nSe não tomou sorvete, ficou mais saudável. %b", maisSaudavel);
	}
}
