package polban.jtk.absensimahasiswa.rombonganbelajar;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ProgramStudi")
public class ProgramStudi implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id	
	@Column(name= "kode_program_studi")
	private int kode_program_studi;
	
	@Column(name= "nama_program_studi")
	private String nama_program_studi;
	
	
	protected ProgramStudi(){
		
	}
	
	public ProgramStudi(int kode_program_studi, String nama_program_studi){
		this.kode_program_studi = kode_program_studi;
		this.nama_program_studi = nama_program_studi;
	}
	
	public void setKodeProgramStudi(int kode_program_studi)
	{
		this.kode_program_studi = kode_program_studi;
	}
	
	public int getKodeProgramStudi()
	{
		return this.kode_program_studi;
	}
	
	public void setNamaProgramStudi(String nama_program_studi)
	{
		this.nama_program_studi = nama_program_studi;
	}
	
	public String getNamaProgramStudi()
	{
		return this.nama_program_studi;
	}
	
	@Override
	public String toString()
	{
		return kode_program_studi + "\t" + nama_program_studi;
	}
	
}
