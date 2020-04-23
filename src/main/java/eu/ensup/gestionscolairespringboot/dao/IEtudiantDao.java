package eu.ensup.gestionscolairespringboot.dao;


import eu.ensup.gestionscolairespringboot.domaine.Etudiant;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IEtudiantDao extends JpaRepository<Etudiant, Integer>{
    
     public void saveStudent(Etudiant etu);
 
    

}
