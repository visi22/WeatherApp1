package org.SDA.dao;

import org.SDA.model.Location;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface LocationDao  {

   //Interfacet DAO (Data Access Object) janë përgjegjëse për operacionet e aksesit të të dhënave të
   //nivelit të ulët. Ata zakonisht abstraktojnë bazën e të dhënave ose detajet specifike të ruajtjes
   //së të dhënave dhe ofrojnë operacione bazë CRUD (Krijo, Lexo, Përditëso, Fshi).
   //Qëllimi kryesor i një ndërfaqe DAO është të ndajë kodin e lidhur me bazën e të dhënave nga
   //logjika e biznesit, duke e bërë më të lehtë ndryshimin e ruajtjes së të dhënave themelore ose
   //kryerjen e testimit të njësisë pa një lidhje të bazës së të dhënave.

   Location findById(UUID Id);
   List<Location> findAll();
   void save(Location l);

   void update(Location l);

   void delete(Location l);
}
