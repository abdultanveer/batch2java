package mypackage;

public class Student {
	String name;
	float stipend;
	int marks;
	private int dob;
	public int age;

	 
	
	
	public Student(String name, float stipend, int marks, int dob, int age) {
		super();
		this.name = name;
		this.stipend = stipend;
		this.marks = marks;
		this.dob = dob;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}

	/**
	 * @return the dob
	 */
	private int getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(int dob) {
		this.dob = dob;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	private void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param stipend the stipend to set
	 */
	public void setStipend(float stipend) {
		this.stipend = stipend;
	}

	private  int getStipend() {
		return 1000;
	}
	
	private void askDoubt(String doubt) {}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " name="+name+
				"\n age="+age+
				"\n date of birth ="+dob
				+"\n stipend ="+stipend+
				"\n marks= "+marks;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("student object is garbage collected");
	}

}
