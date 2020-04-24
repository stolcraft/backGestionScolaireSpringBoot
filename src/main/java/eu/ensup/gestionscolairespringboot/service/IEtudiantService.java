package eu.ensup.gestionscolairespringboot.service;

import eu.ensup.gestionscolairespringboot.domaine.Etudiant;
import java.util.List;

public interface IEtudiantService {
    public void saveStudent(Etudiant etu);
    public List<Etudiant> getAll();
    public Etudiant getById(int id);
    public void deleteStudent(Etudiant etu);

}
