package chapter14.string;

import java.util.Objects;

public class Student {
	
	int studentId;
	String studentName;
	
	//积己磊
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
    //拱府利 林家(寇何 = 林扁撅厘摹 皋葛府 林家)
	@Override
	public int hashCode() {
		return studentId;
	}
	
    //稠府利 林家(郴何 = 蔼)
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std=(Student)obj;
			if(studentId==std.studentId) {
				return true;
			}else {
				return false;
			}
		}//if
		
		return false;
	}
	
	
	
	

}
