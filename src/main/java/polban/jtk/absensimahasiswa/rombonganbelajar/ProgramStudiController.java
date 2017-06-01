package polban.jtk.absensimahasiswa.rombonganbelajar;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/programstudi")
public class ProgramStudiController {
	
	protected Logger logger = Logger.getLogger(ProgramStudiController.class.getName());
	
	
	@Autowired    
	ProgramStudiRepository repository;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<ProgramStudi> findAll()
	{
		//logger.info("kelas-microservice all() invoked");
		//List<Kelas> kelas = KelasRepository.getAllKelas();
		//logger.info("kelas-microservice all() found: " + kelas.size());
		//return kelas.toArray(new Kelas[kelas.size()]);
		List<ProgramStudi> pr  = repository.findAll();
		return pr;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ProgramStudi ById(@RequestParam("kode_program_studi") long id)
	{
		//logger.info("kelas-microservice byId() invoked: " + id);
		//Kelas kelas = KelasRepository.getKelas(id);
		//logger.info("kelas-microservice byId() found: " + kelas);
		Long kode_program_studi = id;
		ProgramStudi pr = repository.findOne(kode_program_studi);
		return pr;
	}

}
