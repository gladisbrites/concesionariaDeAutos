
package com.gladisbrites.concesionaria.persistencia;

import com.gladisbrites.concesionaria.logica.Automovil;
import com.gladisbrites.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
  AutomovilJpaController autoJpa = new AutomovilJpaController();
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traeAuto() {
        return autoJpa.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {
      try {
          autoJpa.destroy(idAuto);
      } catch (NonexistentEntityException ex) {
          Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    public Automovil traerAuto(int id) {
       return autoJpa.findAutomovil(id);
    }

    public void modificar(Automovil auto) {
      try {
          autoJpa.edit(auto);
      } catch (Exception ex) {
          Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    
    
}
