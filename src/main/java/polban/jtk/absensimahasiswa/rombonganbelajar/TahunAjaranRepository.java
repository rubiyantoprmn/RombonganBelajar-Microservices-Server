package polban.jtk.absensimahasiswa.rombonganbelajar;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TahunAjaranRepository extends JpaRepository<TahunAjaran, Long> {
	static List<TahunAjaran> getAllTahunAjaran() {
		// TODO Auto-generated method stub
		return null;
	}
	static TahunAjaran getTahunAjaran(int kode_tahun_ajaran) {
		// TODO Auto-generated method stub
		return null;
	}

}
