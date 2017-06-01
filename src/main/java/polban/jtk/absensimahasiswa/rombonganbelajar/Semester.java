package polban.jtk.absensimahasiswa.rombonganbelajar;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name= "semester")
public class Semester implements Serializable {

	
private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name= "kode_semester")
	private int kode_semester;
	
	@Column(name = "semester")
	private int semester;
	
	@JoinColumn(name = "kode_tahun_ajaran", referencedColumnName = "kode_tahun_ajaran", nullable = false)
	@ManyToOne(optional = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private TahunAjaran kode_tahun_ajaran;
	
	
	@Column(name = "tanggal_awal_semester")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date tanggal_awal_semester;
	
	@Column(name = "tanggal_akhir_semester")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date tanggal_akhir_semester;
	
	protected Semester(){
		
	}
	
	public Semester (int kode_semester, int semester, TahunAjaran kode_tahun_ajaran,Date tanggal_awal_semester,Date tanggal_akhir_semester){
		this.kode_semester = kode_semester;
		this.semester = semester;
		this.kode_tahun_ajaran = kode_tahun_ajaran;
		this.tanggal_awal_semester = tanggal_awal_semester;
		this.tanggal_akhir_semester = tanggal_akhir_semester;
	}
	
	public void setKodeSemester(int kode_semester)
	{
		this.kode_semester = kode_semester;
	}
	
	public int getKodeSemester()
	{
		return this.kode_semester;
	}
	
	public void setSemester(int semester)
	{
		this.semester = semester;
	}
	
	public int getSemester()
	{
		return this.semester;
	}
	public void setKodeTahunAjaran(TahunAjaran kode_tahun_ajaran)
	{
		this.kode_tahun_ajaran = kode_tahun_ajaran;
	}
	
	public TahunAjaran getKodeTahunAjaran()
	{
		return this.kode_tahun_ajaran;
	}
	
	public void setTanggalAwalSemester(Date tanggal_awal_semester)
	{
		this.tanggal_awal_semester = tanggal_awal_semester;
	}
	
	public Date getTanggalAwalSemester()
	{
		return this.tanggal_awal_semester;
	}
	
	public void setTanggalAkhirSemester(Date tanggal_akhir_semester)
	{
		this.tanggal_akhir_semester = tanggal_akhir_semester;
	}
	
	public Date getTanggalAkhirSemester()
	{
		return this.tanggal_akhir_semester;
	}
	
	
	
	@Override
	public String toString()
	{
		return kode_semester + "\t" + semester  + "\t" + kode_tahun_ajaran + "\t" + tanggal_awal_semester + "\t" + tanggal_akhir_semester ;
	}
}
