package Servicio;

import Entidades.Amarre;
import Entidades.Velero;
import Entidades.Yates;
import Entidades.BarcosMotor;

public class ServicioAmarres {

    public Double CalcularAlquiler(Amarre ama) {

        Integer dias = CalcularDiasOcupados(ama);
        double valorModulo = 0;

        if (ama.getBarco() instanceof Velero) {
            Velero ve = (Velero) ama.getBarco();
         valorModulo= ve.calculaAlquiler();
        }
        if (ama.getBarco() instanceof Yates) {
            Yates ya = (Yates) ama.getBarco();
            valorModulo = ya.calculaAlquiler();
        }
        if (ama.getBarco() instanceof BarcosMotor) {
        BarcosMotor bar = (BarcosMotor)(ama.getBarco());    
        valorModulo = bar.calculaAlquiler();
        }
        return (double) (dias * valorModulo);
    

}

private int CalcularDiasOcupados(Amarre ama) {
        return ((int) ((ama.getFechadevolucion().getTime() - ama.getFechaAlquiler().getTime()) / 86400000));
    }

}
