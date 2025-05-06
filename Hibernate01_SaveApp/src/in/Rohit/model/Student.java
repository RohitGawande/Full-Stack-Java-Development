package in.Rohit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STDTAB")
public class Student {
    @Id
    @Column(name="stdid")
    private Integer sid;
    @Column(name="stdName",length=20)
    private String sname;
    @Column(name="stdAdd",length=20)
    private String saddr;
    @Column(name="stdAge")
    private Integer sage;
    public Student() {
    System.out.println("Hibernate uses zero argument constructor internally");
    }
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddr=" + saddr + ", sage=" + sage + "]";
	}
}
