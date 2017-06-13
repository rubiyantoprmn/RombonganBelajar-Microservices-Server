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
@Table(name= "Mahasiswa")
public class Mahasiswa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name= "nim")
	private String nim;
	//lalalala
	
	@JoinColumn(name = "id_kelas", referencedColumnName = "id_kelas", nullable = false)
	@ManyToOne(optional = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private Kelas id_kelas;
	
	
	protected Mahasiswa(){
		
	}
	public Mahasiswa(String nim, Kelas id_kelas){
		this.nim = nim;
		this.id_kelas = id_kelas;
	}
	
	public void setNim(String nim){
		this.nim = nim;
	}
	public String getNim(){
		return nim;
	}
	public void setIdKelas(Kelas id_kelas){
		this.id_kelas = id_kelas;
	}
	public Kelas getIdKelas(){
		return id_kelas;
	}
	
	@Override
	public String toString()
	{
		return nim + "\t" + id_kelas ;
	}
	
}
