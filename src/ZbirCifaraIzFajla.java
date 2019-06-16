import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ZbirCifaraIzFajla {

	public static void main(String[] args) {
		
		BufferedReader unosImenaFajla = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite ime fajla iz kojeg zelite izcitati podatke (fajl se zove cifre) : ");
		
		String imeFajla = "";
		
		try {
			
			imeFajla = unosImenaFajla.readLine();
			
		} catch (IOException e1) {
			
			System.out.println("Greska prilikom unosa naziva fajla !");
		}
		
		
		int sumaBrojeva = 0;
		
		double prosjekBrojeva = 0;
		
		int brojacBrojeva = 0;
		
		Path putanja = Paths.get(imeFajla.concat(".txt"));

        try(Scanner  unos = new Scanner(putanja)) {	
    		
        	while (unos.hasNextInt()) {
			
			sumaBrojeva += unos.nextInt();
			
			brojacBrojeva++;
			
        	}
		} catch (IOException e) {
			
			System.out.println("Greska prilikom iscitavanja brojeva iz fajla ! Napominjemo da se fajl u kojem se nalaze cifre zove \"cifre\" ");
		}
        
        System.out.println("Suma svih broeva u fajlu je  : " + sumaBrojeva);
        
        System.out.println("Prosjek iscitanih brojeva je : " + ((double)sumaBrojeva / brojacBrojeva));

	}

}
