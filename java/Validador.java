package Validador.java;

import java.util.Scanner;

public class Validador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombreUsuario;
        int edad;
        double saldoCuenta;
        boolean esPremium;

        System.out.print("Nombre de usuario: ");
        nombreUsuario = sc.nextLine();

        System.out.print("Edad: ");
        edad = sc.nextInt();

        System.out.print("Saldo en la cuenta: ");
        saldoCuenta = sc.nextDouble();

        System.out.print("¿Es usuario premium? (true/false): ");
        esPremium = sc.nextBoolean();

        boolean accesoExclusivo = edad >= 18 && esPremium;
        boolean calificaPromocion = saldoCuenta > 1000 || edad < 25;
        boolean perfilIncompleto = saldoCuenta == 0 || !nombreUsuario.equals("invitado");
        boolean perfilActivoTotal = !perfilIncompleto && (accesoExclusivo || calificaPromocion);

        System.out.println("\nRESULTADOS:");
        System.out.println("Acceso exclusivo: " + accesoExclusivo);
        System.out.println("Califica para promoción: " + calificaPromocion);
        System.out.println("Perfil incompleto: " + perfilIncompleto);
        System.out.println("Perfil activo total: " + perfilActivoTotal);
    }
}
