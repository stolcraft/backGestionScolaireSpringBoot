package eu.ensup.gestionscolairespringboot.service;

import eu.ensup.gestionscolairespringboot.dao.IEtudiantDao;
import eu.ensup.gestionscolairespringboot.domaine.Etudiant;
import java.util.List;

public class EtudiantService implements IEtudiantService{
    
    private IEtudiantDao etudiantDAO;
    
    @Override
    public void saveStudent(Etudiant etu)
    {
        etudiantDAO.save(etu);
    }
    
    @Override
    public List<Etudiant> getAll()
    {
        return etudiantDAO.findAll();
    }
    @Override
    public Etudiant getById(int id)
    {
        return etudiantDAO.getOne(id);
    }
    

}
