package polban.jtk.absensimahasiswa.rombonganbelajar;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "TahunAjaran")
public class TahunAjaran implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name= "kode_tahun_ajaran")
	private int kode_tahun_ajaran;
	
	@Column(name= "tahun_ajaran")
	private String tahun_ajaran;
	
	protected TahunAjaran(){
		
	}
	
	public TahunAjaran(int kode_tahun_ajaran, String tahun_ajaran){
		
		this.kode_tahun_ajaran = kode_tahun_ajaran;
		this.tahun_ajaran = tahun_ajaran;
		
	}
	
	
	public void setKodeTahunAjaran(int kode_tahun_ajaran)
	{
		this.kode_tahun_ajaran = kode_tahun_ajaran;
	}
	
	public int getKodeTahunAjaran()
	{
		return this.kode_tahun_ajaran;
	}
	
	public void setTahunAjaran(String tahun_ajaran)
	{
		this.tahun_ajaran = tahun_ajaran;
	}
	
	public String getTahunAjaran()
	{
		return this.tahun_ajaran;
	}
	
	@Override
	public String toString()
	{
		return kode_tahun_ajaran + "\t" + tahun_ajaran;
	}
	
	
	
}
