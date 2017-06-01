package polban.jtk.absensimahasiswa.rombonganbelajar;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tahunajaran")
public class TahunAjaranController {
	
protected Logger logger = Logger.getLogger(TahunAjaranController.class.getName());
	
	
	@Autowired    
	TahunAjaranRepository repository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<TahunAjaran> findAll()
	{
		//logger.info("kelas-microservice all() invoked");
		//List<Kelas> kelas = KelasRepository.getAllKelas();
		//logger.info("kelas-microservice all() found: " + kelas.size());
		//return kelas.toArray(new Kelas[kelas.size()]);
		List<TahunAjaran> ta  = repository.findAll();
		return ta;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public TahunAjaran ById(@RequestParam("kode_tahun_ajaran") long id)
	{
		//logger.info("kelas-microservice byId() invoked: " + id);
		//Kelas kelas = KelasRepository.getKelas(id);
		//logger.info("kelas-microservice byId() found: " + kelas);
		Long kode_tahun_ajaran = id;
		TahunAjaran ta = repository.findOne(kode_tahun_ajaran);
		return ta;
	}


	
	
}
