package CarolinaCT;

import java.util.ArrayList;
import java.util.Scanner;
public class MainAutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Autos> lista = new ArrayList<Autos>();
        int idC = 1;

        for (int i = 1; i <= 2; i++) {
            Autos auto = new Autos();
            auto.id = idC++;

            System.out.println("Marca");
            auto.marca = sc.next();
            System.out.println("Modelo");
            auto.modelo = sc.next();
            System.out.println("Año");
            auto.año = sc.nextInt();
            System.out.println("Color");
            auto.color = sc.next();
            System.out.println("Precio");
            auto.precio = sc.nextInt();
            lista.add(auto);
        }
        System.out.println(lista);
        
        for(Autos au: lista){
            System.out.println(au);
        }
        sc.close();
    



       
        
}

            
}