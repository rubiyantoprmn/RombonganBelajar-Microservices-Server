package polban.jtk.absensimahasiswa.rombonganbelajar;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/semester")
public class SemesterController {
	protected Logger logger = Logger.getLogger(SemesterController.class.getName());
	
	
	@Autowired    
	SemesterRepository repository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Semester> findAll()
	{
		//logger.info("kelas-microservice all() invoked");
		//List<Kelas> kelas = KelasRepository.getAllKelas();
		//logger.info("kelas-microservice all() found: " + kelas.size());
		//return kelas.toArray(new Kelas[kelas.size()]);
		List<Semester> se  = repository.findAll();
		return se;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Semester ById(@RequestParam("kode_semester") long id)
	{
		//logger.info("kelas-microservice byId() invoked: " + id);
		//Kelas kelas = KelasRepository.getKelas(id);
		//logger.info("kelas-microservice byId() found: " + kelas);
		Long kode_semester = id;
		Semester se = repository.findOne(kode_semester);
		return se;
	}

}
