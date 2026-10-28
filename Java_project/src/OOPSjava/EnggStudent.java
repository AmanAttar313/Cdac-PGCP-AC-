package OOPSjava;

public class EnggStudent {
	
		private int StudentId;
		private String name;
		private String branch;
		
		public int getStudentId() {
			return StudentId;
		}
		public void setStudentId(int studentId) {
			StudentId = studentId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public void assignValues(int id,String nm,String br) {
			StudentId=id;
			name=nm;
			
			branch=br;
		}
		public void printValues() {
			System.out.println("Student id "+StudentId);
			System.out.println("name "+name);
			System.out.println("branch "+branch);
		}
	
}
