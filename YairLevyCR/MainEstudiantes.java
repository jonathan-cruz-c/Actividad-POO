import java.util.ArrayList;
import java.util.Scanner;

public class MainEstudiantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiantes> estudiantes = new ArrayList<>();
        boolean salir = true;
        while (salir) {
            System.out.println("\t\tMENÚ");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Mostrar Estudiantes");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    if(estudiantes.size()<5){
                        System.out.println("Introduzca la carrera del Estudiante");
                        String carrera = sc.nextLine();
                        System.out.println("Introduzca el nombre del Estudiante");
                        String nombre = sc.nextLine();
                        System.out.println("Introduzca el promedio del Estudiante");
                        double promedio = sc.nextDouble();
                        sc.nextLine();
                        int id = estudiantes.size() + 1;
                        Estudiantes estudiante = new Estudiantes(id, carrera, nombre, promedio);
                        estudiantes.add(estudiante);
                    }else{
                        System.out.println("No puedes agregar mas de 5 estudiantes");
                    }
                    break;
                case 2:
                    System.out.println("Estudiantes");
                    for (Estudiantes est : estudiantes) {
                        System.out.println(est);
                    }
                    break;
                case 3:
                    salir = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                sc.close();
            }
        }
    }
}