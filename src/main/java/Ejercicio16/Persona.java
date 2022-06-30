package Ejercicio16;

public class Persona {

    //Declaración de variables no accedibles directamente
    private String nombre;
    private Integer edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    //Constantes para devolver valores
    public static final char HOMBRE='H';
    public static final char MUJER='M';
    public static final Integer INFERIOR = -1;
    public static final Integer IDEAL = 0;
    public static final Integer SOBREPESO = 1;

    //Un constructor por defecto.
    public Persona() {
        this.nombre="";
        this.edad=0;
        this.DNI=generaDNI();
        this.sexo='H';
        this.peso=0;
        this.altura=0;
    }

    //Un constructor con el nombre, edad y sexo, el resto por defecto.
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.DNI = generaDNI();
        this.peso=0;
        this.altura=0;
    }

    //Un constructor con todos los atributos como parámetro.
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    //Calculará si la persona está en su peso ideal
    public Integer calcularIMC() {
        double alturaCuadrado = Math.pow(altura,2);
        double imc = peso / alturaCuadrado;
       if (imc <20) {
           return INFERIOR;
       } else if ((imc >= 20) && (imc<= 25)) {
           return IDEAL;
       } else return SOBREPESO;
    }

    //Indica si es mayor de edad, devuelve un booleano.
    public boolean esMayorDeEdad(){
        return this.edad>=18;
    }

    //Comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No será visible al exterior.
    private char comprobarSexo(char sexo) {
        if (sexo == HOMBRE || sexo == MUJER) {
            return sexo;
        }else return HOMBRE;
    }

    //Devuelve toda la información del objeto.
    public String toString() {
        return "Nombre= " + nombre + ", Edad= " + edad + ", DNI= " + DNI + ", Sexo= " + sexo + ", Peso= " + peso + ", Altura= " + altura ;
    }


    //genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente
    //https://www.serautonomo.net/como-calcular-la-letra-del-dni.html
    public static String generaDNI() {
        double numeroRandom = Math.random() * 100000000;
        Integer dniSinLetra = Math.toIntExact(Math.round(numeroRandom));
        String codigo = "TRWAGMYFPDXBNJZSQVHLCKE";
        Integer resto= dniSinLetra % 23;
        char letra = codigo.charAt(resto);
        String dni = String.valueOf(letra + dniSinLetra);
        return dni;
    }

    //Métodos set de cada parámetro, excepto de DNI.

    //Método set de Nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Método set de Edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Método set de Sexo
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //Método set de Peso
    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Método set de Altura
    public void setAltura(double altura) {
        this.altura = altura;
    }

}
