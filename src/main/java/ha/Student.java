package ha;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
	@Id
	int studentid;
	
	String name;
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
