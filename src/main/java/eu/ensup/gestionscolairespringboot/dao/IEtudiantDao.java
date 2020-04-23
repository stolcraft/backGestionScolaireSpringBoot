package eu.ensup.gestionscolairespringboot.dao;

import eu.ensup.gestionscolairespringboot.domaine.Etudiant;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEtudiantDao extends JpaRepository<Etudiant, Integer>{
    
      public void createStudent(Etudiant eleve);
    public Etudiant getEleveById(int id);
    public void delete(Etudiant eleve);
    public List<Etudiant> getAll();
    

}
