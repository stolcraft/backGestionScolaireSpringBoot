package eu.ensup.gestionscolairespringboot.service;

import eu.ensup.gestionscolairespringboot.dao.IEtudiantDao;
import eu.ensup.gestionscolairespringboot.domaine.Etudiant;
import java.util.List;

public class EtudiantService {
    
    private IEtudiantDao etudiantDAO;
    
    public void saveStudent(Etudiant etu)
    {
        etudiantDAO.save(etu);
    }
    public List<Etudiant> getAll()
    {
        return etudiantDAO.findAll();
    }
    
    public Etudiant getById(int id)
    {
        return etudiantDAO.getOne(id);
    }
    

}
