public class App {
    public static void main(String[] args) throws Exception {
        long numeroIntroducido = Long.parseLong(System.console().readLine("Por favor, introduzca un número entero postivo: "));
        long posicion = Long.parseLong(System.console().readLine("Introduzca la posición donde quiere insertar: "));
        long nuevoNumero = Long.parseLong(System.console().readLine("Introduzca el digito que quiere insertar: "));

        long numero = numeroIntroducido;
        long volteado = 0;

        while (numero != 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }

        long primeraMitad = 0;

        for (int i = 0; i < posicion - 1; i++) {
            primeraMitad = (primeraMitad * 10) + (volteado % 10);
            volteado /= 10;
        }

        primeraMitad = (primeraMitad * 10) + nuevoNumero;

        while (volteado != 0) {
            primeraMitad = (primeraMitad * 10) + (volteado % 10);
            volteado /= 10;
        }

        System.out.println("El número resultante es " + primeraMitad);
    }
}
