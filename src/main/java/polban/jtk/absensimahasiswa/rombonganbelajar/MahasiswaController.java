package polban.jtk.absensimahasiswa.rombonganbelajar;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaController {
	protected Logger logger = Logger.getLogger(MahasiswaController.class.getName());
	
	private static SessionFactory sessionFactory;
	private static RestTemplate restTemplate;
	//lalalalal
	@Autowired    
	MahasiswaRepository repository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Mahasiswa> findAll()
	{
		//logger.info("kelas-microservice all() invoked");
		//List<Kelas> kelas = KelasRepository.getAllKelas();
		//logger.info("kelas-microservice all() found: " + kelas.size());
		//return kelas.toArray(new Kelas[kelas.size()]);
		List<Mahasiswa> mhs  = repository.findAll();
		return mhs;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Mahasiswa ById(@PathVariable("nim") long id)
	{
		//logger.info("kelas-microservice byId() invoked: " + id);
		//Kelas kelas = KelasRepository.getKelas(id);
		//logger.info("kelas-microservice byId() found: " + kelas);
		Long nim = id;
		Mahasiswa mhs = repository.findOne(nim);
		return mhs;
	}
	
	@RequestMapping(value = "/getmhsbykelas/{id}", method = RequestMethod.GET)
	public List<String> mhsByKelas(@PathVariable("id_kelas") long id){
		
		
			List<String> nim = new ArrayList<String>();
			nim = this.sessionFactory.getCurrentSession().createQuery("SELECT nim  FROM Mahasiswa WHERE id_kelas in(:id_kelas)").setParameter("id_kelas", id).list();
			List<String> mhs = new ArrayList<String>();
			
			for (String nimmhs : nim ){
				mhs.add(restTemplate.getForObject("http://localhost:2002/mahasiswa/"+nimmhs, String.class));
			}
			
			return mhs;			
		
		
	}
	
	
	@RequestMapping(value ="/deletebyid/{id}", method = RequestMethod.DELETE)
	public String deleteById(@RequestParam("nim") long id)
	{
		repository.delete(id);
		
		return "Delete done";
	}
}
