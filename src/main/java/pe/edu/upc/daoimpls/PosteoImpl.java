package pe.edu.upc.daoimpls;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IPosteoDao;
import pe.edu.upc.entities.Posteo;

public class PosteoImpl implements IPosteoDao {
	@PersistenceContext(unitName = "TF_Joel")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Posteo p) {

		try {
			em.persist(p);
		} catch (Exception e) {
			System.out.println("Error al insertar persona en DAO");

		}

	}
}
