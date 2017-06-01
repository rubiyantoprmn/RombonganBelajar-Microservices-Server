package polban.jtk.absensimahasiswa.rombonganbelajar;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramStudiRepository extends JpaRepository<ProgramStudi, Long> {
	
	static List<ProgramStudi> getAllProgramStudi() {
		// TODO Auto-generated method stub
		return null;
	}
	static Kelas getProgramStudi(int kode_program_studi) {
		// TODO Auto-generated method stub
		return null;
	}

}
