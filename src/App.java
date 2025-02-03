import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import java.util.Arrays;
import java.util.Scanner;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empleadoContoller = new EmpleadoContoller();
        boolean result = empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("\n------ Empleado ------");
        System.out.println("Ingreso: " + result );
        result = empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso: " + result );

        empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(2, "Juan", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(3, "Andres", "Senior"));

        empleadoContoller.displayEmpleados();
        empleadoContoller.displayEmpleadosSoloNombres();
        empleadoContoller.displayLlaves();
        empleadoContoller.displayEmpleadosValues();



    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
        Scanner scanner = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();
        int opcion;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Verificar si dos palabras son anagramas");
            System.out.println("2. Encontrar dos números en un array que sumen un objetivo");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la primera palabra: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Ingrese la segunda palabra: ");
                    String str2 = scanner.nextLine();

                    boolean resultado = Ejercicios.areAnagrams(str1, str2);
                    System.out.println("Son anagramas: " + resultado);
                    break;

                case 2:
                    System.out.print("Ingrese los números separados por espacio: ");
                    String[] numStrings = scanner.nextLine().split(" ");
                    int[] nums = new int[numStrings.length];

                    for (int i = 0; i < numStrings.length; i++) {
                        nums[i] = Integer.parseInt(numStrings[i]);
                    }

                    System.out.print("Ingrese el objetivo: ");
                    int objetivo = scanner.nextInt();

                    int[] indices = ejercicios.sumatoriaDeDos(nums, objetivo);
                    System.out.println(indices != null ? "Índices encontrados: " + Arrays.toString(indices) : "No se encontraron dos números que sumen: " + objetivo);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}