package aula24.exercicios.ex1;

public class LampadaFlorecente {
    public static void main(String[] args) {

        Lampada led = new Lampada();

        led.fabricante = "Toschiba";
        led.tipo = "Fluorecente";
        led.potencia = 15; // Watts
        led.voltagem = "127"; // 127v

        System.out.println(led.fabricante);
        System.out.println(led.tipo);
        System.out.println(led.potencia);
        System.out.println(led.voltagem);



    }
}
