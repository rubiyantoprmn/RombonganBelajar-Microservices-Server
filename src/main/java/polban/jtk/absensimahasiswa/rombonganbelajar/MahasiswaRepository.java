package polban.jtk.absensimahasiswa.rombonganbelajar;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long>{
	static List<Mahasiswa> getAllMahasiswa(){
		// TODO Auto-generated method stub
		return null;
	}
	static Mahasiswa getMahasiswa(String nim){
		// TODO Auto-generated method stub
		return null;
	}
}
