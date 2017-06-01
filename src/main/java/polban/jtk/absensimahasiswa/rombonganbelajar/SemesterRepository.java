package polban.jtk.absensimahasiswa.rombonganbelajar;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SemesterRepository extends JpaRepository<Semester, Long>{
	
	static List<Semester> getAllSemester() {
		// TODO Auto-generated method stub
		return null;
	}
	static Semester getSemester(int kode_semester) {
		// TODO Auto-generated method stub
		return null;
	}

}
