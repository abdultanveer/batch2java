package inheritance;

public class Test {

	public static void main(String[] args) {
		Programmer programmer;
		programmer = new ExcellentProgrammer();
				//new Programmer();
		
		
		programmer.doProgramming();
		programmer.analyseData();
		programmer.prepareReports();

	}

}
