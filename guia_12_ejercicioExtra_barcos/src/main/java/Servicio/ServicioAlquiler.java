package Servicio;

import Entidades.Amarre;
import Entidades.Velero;
import Entidades.Yates;
import Entidades.Barco;
import Entidades.BarcoMotor;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class ServicioAlquiler {

    private ArrayList<Barco> barcos = new ArrayList<>();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void alquilarBarco() {

        barcos.add(new Velero(2, 255, 25d, 1981));
        barcos.add(new BarcoMotor(250, 378, 45d, 1994));
        barcos.add(new Yates(8, 325, 897, 43d, 2010));

        Amarre amarre = new Amarre();
        System.out.println("INGRESE LOS DATOS SOLICITADOS A CONTINUACION "
                + "PARA GESTIONAR EL ALQUILER");
        System.out.println("NOMBRE DEL CLIENTE");
        amarre.setNombre(leer.next());
        System.out.println("D.N.I.");
        amarre.setDni(leer.nextLong());

        amarre.setFechaAlquiler(new Date());
        System.out.println("INGRESE FECHA DE DEVOLUCION");
        System.out.println("DIA ");
        int dia = leer.nextInt();
        System.out.println("MES ");
        int mes = leer.nextInt();
        System.out.println("AÑO ");
        int anio = leer.nextInt();
        amarre.setFechadevolucion(new Date(anio - 1900, mes - 1, dia));

        System.out.println("SELECCIONE UN BARCO ENTRE LOS DISPONIBLES");

        for (Barco barco : barcos) {
            System.out.println(barco);
            System.out.println("------------------------------------------");
        }

        String op = leer.next().toLowerCase();

        switch (op) {
            case "velero":
                amarre.setBarco(barcos.get(0));
                break;
            case "barco motor":
                amarre.setBarco(barcos.get(1));
                break;
            case "yate":
                amarre.setBarco(barcos.get(2));
        }
        System.out.println("---------------------------------------------");
        System.out.println("LOS SIGUIENTES SON LOS DATOS DE SU ALQUILER");
        System.out.println(amarre.toString());
        System.out.println("USTED ALQUILARA POR LOS DIAS: ");
        System.out.println(CalcularDiasOcupados(amarre));
        System.out.println("EL VALOR TOTAL DEL ALQUILER SE FIJA EN $: ");
        System.out.println(CalcularAlquiler(amarre));
    }

    public Double CalcularAlquiler(Amarre ama) {

        Integer dias = CalcularDiasOcupados(ama);
        double valorModulo = 0;

        if (ama.getBarco() instanceof Velero) {
            Velero ve = (Velero) ama.getBarco();
            valorModulo = ve.calculaAlquiler();
        }
        if (ama.getBarco() instanceof Yates) {
            Yates ya = (Yates) ama.getBarco();
            valorModulo = ya.calculaAlquiler();
        }
        if (ama.getBarco() instanceof BarcoMotor) {
            BarcoMotor bar = (BarcoMotor) (ama.getBarco());
            valorModulo = bar.calculaAlquiler();
        }
        return (double) (dias * valorModulo);

    }

    private int CalcularDiasOcupados(Amarre ama) {
        return ((int) ((ama.getFechadevolucion().getTime() - ama.getFechaAlquiler().getTime()) / 86400000));
    }

}
