
package com.gladisbrites.concesionaria.persistencia;

import com.gladisbrites.concesionaria.logica.Automovil;

public class ControladoraPersistencia {
  AutomovilJpaController autoJpa = new AutomovilJpaController();
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }
    
}
