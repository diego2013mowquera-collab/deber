import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona = new Persona();
        Persona persona1 = new Persona("Ana");
        Persona persona2 = new Persona("Andres", 25, 1.70f);

        // Lista
        System.out.println("List");
        System.out.println();

        List<Persona> lista = new ArrayList<>();
        lista.add(persona);
        lista.add(persona1);
        lista.add(persona2);
        lista.add(new Persona("Pepe", 46, 1.60f));
        lista.add(new Persona("Carlos", 38, 1.70f));

        persona.setNombre("David");
        System.out.println("Listado de personas iniciales:");
        for (Persona p : lista) {
            System.out.println(p.descripcion());
        }

        // Ingresar personas hasta que el usuario presione/escriba 0 ---
        System.out.println(" REGISTRO DINÁMICO DE PERSONAS");
        System.out.println("Escribe '0' en el nombre para terminar el ingreso");

        while (true) {
            System.out.print("Ingrese el nombre de la persona (o 0 para salir): ");
            String nombre = sc.nextLine();

            // Condición de salida
            if (nombre.equals("0")) {
                System.out.println("Finalizando ingreso de personas");
                break;
            }

            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();

            System.out.print("Ingrese la estatura (ej. 1.70): ");
            float estatura = sc.nextFloat();
            sc.nextLine();

            // Crear objeto y añadirlo a la lista
            Persona nuevaPersona = new Persona(nombre, edad, estatura);
            lista.add(nuevaPersona);
            System.out.println("¡Persona agregada exitosamente!");
        }

    
        System.out.println("=================================");
        System.out.println("LISTADO FINAL DE PERSONAS EN LA LISTA:");
        System.out.println("=================================");
        for (Persona p : lista) {
            p.imprimirdatos();
        }

        // Conjunto
        System.out.println("\nSet");
        Set<String> nombres = new HashSet<>();
        nombres.add("Mateo");
        nombres.add("Javier");
        nombres.add("Mateo");
        System.out.println("Nombres unicos sin orden garantizado: " + nombres);

        // Hash set de objetos
        Set<Persona> nombres2 = new HashSet<>();
        nombres2.add(new Persona("Ana", 25, 1.73f));
        nombres2.add(new Persona("Carlos", 38, 1.70f));
        nombres2.add(new Persona("Carlos", 38, 1.70f));

        for (Persona p : nombres2) {
            System.out.println(p.descripcion());
        }

        // Hash map
        System.out.println("Hashmap");
        Map<String, Persona> codigounico = new HashMap<>();
        codigounico.put("e01", persona);
        codigounico.put("e02", persona1);
        codigounico.put("e03", persona2);
        System.out.println("Codigo unico e02: " + codigounico.get("e02").descripcion());

        sc.close();
    }
}