 
package com.gladisbrites.concesionaria.logica;

import com.gladisbrites.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

 
public class ControladoraLogica {
    ControladoraPersistencia controlPersis=new ControladoraPersistencia();

    public void agrearAutomovil(String modelo, String marca, String motor, 
            String color, String patente, int cantPuertas) {
    
        Automovil auto= new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traeAuto() {
        return controlPersis.traeAuto();
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    
}
