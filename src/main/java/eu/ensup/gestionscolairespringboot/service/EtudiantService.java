package eu.ensup.gestionscolairespringboot.service;

import eu.ensup.gestionscolairespringboot.dao.EtudiantRepository;
import eu.ensup.gestionscolairespringboot.domaine.Etudiant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EtudiantService implements IEtudiantService{
    
	//On connecte la dao avec l'auto configuration
	@Autowired
    private EtudiantRepository etudiantDAO;
	
	
    //Constructeur par défault
    public EtudiantService() {
		super();
	}

    //Constructeur avec l'interface EtudiantRepository
	public EtudiantService(EtudiantRepository etudiantDAO) {
		super();
		this.etudiantDAO = etudiantDAO;
	}

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

    @Override
    public void deleteStudent(String id) {
      etudiantDAO.delete(id);
    }
    

}
