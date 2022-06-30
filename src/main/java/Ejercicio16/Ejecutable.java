package Ejercicio16;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {

        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        String nombre;
        Integer edad;
        char sexo;
        double peso;
        double altura;

        //Pide por teclado el nombre, la edad, sexo, peso y altura.
        System.out.println("Por favor ingrese el nombre");
        nombre = sc.nextLine();
        System.out.println("Por favor ingrese la edad");
        edad = sc.nextInt();
        System.out.println("Por favor ingrese el sexo Ejemplo: M o H");
        sexo = sc.next().charAt(0);
        System.out.println("Por favor ingrese el peso");
        peso = sc.nextDouble();
        System.out.println("Por favor ingrese la altura Ejemplo: 1,70");
        altura = sc.nextDouble();

        //3 personas con sus cualidades según la letra

        //Persona 1 obtendrá todas las variables ateriormente pedidas por teclado
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

        //Persona 2 obtendrá todas las variables anteriores pero sin el peso ni la altura
        Persona persona2 = new Persona(nombre, edad, sexo);

        //Persona 3 obtendrá todas las variables por defecto y le daremos nuevas con los métodos set
        Persona persona3 = new Persona();
        persona3.setNombre("Nicolás");
        persona3.setEdad(23);
        persona3.setSexo('H');
        persona3.setPeso(84);
        persona3.setAltura(1.70);

        //Para cada objeto, deberá comprobar el imc con un mensaje.

        //Persona 1
        Integer imc1 = persona1.calcularIMC();
        switch (imc1) {
            case 1:
                System.out.println("Tiene sobrepeso");
                break;
            case 0:
                System.out.println("Está en su peso ideal");
                break;
            case -1:
                System.out.println("Está por debajo de su peso ideal");
                break;
        }

        //Persona 2
        Integer imc2 = persona2.calcularIMC();
        switch (imc2) {
            case 1:
                System.out.println("Tiene sobrepeso");
                break;
            case 0:
                System.out.println("Está en su peso ideal");
                break;
            case -1:
                System.out.println("Está por debajo de su peso ideal");
                break;
        }

        //Persona 3
        Integer imc3 = persona3.calcularIMC();
        switch (imc3) {
            case 1:
                System.out.println("Tiene sobrepeso");
                break;
            case 0:
                System.out.println("Está en su peso ideal");
                break;
            case -1:
                System.out.println("Está por debajo de su peso ideal");
                break;
        }

        //Indicar para cada objeto si es mayor de edad.

        //Persona1
        if (persona1.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        //Persona2
        if (persona2.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        //Persona3
        if (persona3.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        //Por último, mostrar la información de cada objeto.

        //Persona1
        System.out.println(persona1.toString());

        //Persona2
        System.out.println(persona2.toString());

        //Persona3
        System.out.println(persona3.toString());

    }
}
