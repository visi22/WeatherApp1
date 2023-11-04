package org.SDA.dao;

import org.SDA.model.Location;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface LocationDao  {

   Location findById(UUID Id);
   List<Location> findAll();
   void save(Location l);

   void update(Location l);

   void delete(Location l);
}
