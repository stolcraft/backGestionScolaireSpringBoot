package eu.ensup.gestionscolairespringboot.dao;


import eu.ensup.gestionscolairespringboot.domaine.Etudiant;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IEtudiantDao extends JpaRepository<Etudiant, Integer>{
    
     public S save(Etudiant etu);
     public List<Etudiant> findAll();
     public Etudiant getById(int id);
    

}
