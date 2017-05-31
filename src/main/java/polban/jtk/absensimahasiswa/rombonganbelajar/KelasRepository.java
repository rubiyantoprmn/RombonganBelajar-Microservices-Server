package polban.jtk.absensimahasiswa.rombonganbelajar;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface KelasRepository extends JpaRepository<Kelas, Long>{
	static List<Kelas> getAllKelas() {
		// TODO Auto-generated method stub
		return null;
	}
	static Kelas getKelas(String nama_kelas) {
		// TODO Auto-generated method stub
		return null;
	}

	//List<Kelas> findByName(String name);
}
