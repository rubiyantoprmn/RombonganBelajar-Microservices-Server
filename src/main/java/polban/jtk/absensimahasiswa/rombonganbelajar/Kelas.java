package polban.jtk.absensimahasiswa.rombonganbelajar;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


@Entity
@Table(name= "kelas")
public class Kelas implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name= "nama_kelas")
	private char nama_kelas;
	
	@Column(name = "tingkat_kelas")
	private int tingkat_kelas;
	
	@JoinColumn(name = "kode_program_studi", referencedColumnName = "kode_program_studi", nullable = false)
	@ManyToOne(optional = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private ProgramStudi kode_program_studi;
	
	
	@JoinColumn(name = "kode_semester", referencedColumnName = "kode_semester", nullable = false)
	@ManyToOne(optional = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private Semester kode_semester;
	
	protected Kelas()
	{
		
	}
	
	public Kelas(char id_kelas, int tingkat_mahasiswa, ProgramStudi kode_program_studi, Semester kode_semester)
	{
		this.nama_kelas = id_kelas;
		this.tingkat_kelas = tingkat_mahasiswa;
		this.kode_program_studi = kode_program_studi;
		this.kode_semester = kode_semester;
	}
	
	public void setNamaKelas(char id_kelas)
	{
		this.nama_kelas = id_kelas;
	}
	
	public int getNamaKelas()
	{
		return this.nama_kelas;
	}
	
	public void setTingkatKelas(int tingkat_mahasiswa)
	{
		this.tingkat_kelas = tingkat_mahasiswa;
	}
	
	public int  getTingkatKelas()
	{
		return this.tingkat_kelas;
	}
	
	
	public void setKodeProgramStudi(ProgramStudi kode_program_studi)
	{
		this.kode_program_studi = kode_program_studi;
	}
	
	public ProgramStudi getKodeProgramStudi()
	{
		return this.kode_program_studi;
	}
	
	
	public void setKodeSemester(Semester kode_semester)
	{
		this.kode_semester = kode_semester;
	}
	
	public Semester getKodeSemester()
	{
		return this.kode_semester;
	}
	
	@Override
	public String toString()
	{
		return nama_kelas + "\t" + tingkat_kelas  + "\t" + kode_program_studi + "\t" + kode_semester ;
	}

}
