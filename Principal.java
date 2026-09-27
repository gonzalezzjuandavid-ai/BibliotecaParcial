import java.util.Scanner;

public class Principal {

public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);

// Objeto 1
Libro libro1 = new Libro(
"Java Basico",
"Juan Perez",
10,
2);

// Objeto 2
Libro libro2 = new Libro();

System.out.print("Ingrese titulo: ");
libro2.setTitulo(teclado.nextLine());

System.out.print("Ingrese autor: ");
libro2.setAutor(teclado.nextLine());

System.out.print("Ingrese numero de ejemplares: ");
libro2.setNumeroEjemplares(teclado.nextInt());

libro2.setNumeroEjemplaresPrestados(0);

teclado.nextLine();

// Objeto 3
LibroTextoUNIAC libroUNIAC =
new LibroTextoUNIAC(
"POO",
"Carlos Ruiz",
15,
3,
"Programacion II",
"Ingenieria");

// Objeto 4
Novela novela =
new Novela(
"1984",
"George Orwell",
6,
1,
"Ciencia Ficcion");

// Prueba de metodos
libro1.prestar();
libro1.devolver();

System.out.println("\n===== LIBRO 1 =====");
System.out.println(libro1);

System.out.println("\n===== LIBRO 2 =====");
System.out.println(libro2);

System.out.println("\n===== LIBRO UNIAC =====");
System.out.println(libroUNIAC);

System.out.println("\n===== NOVELA =====");
System.out.println(novela);

teclado.close();
}
}