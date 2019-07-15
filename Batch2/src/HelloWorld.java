import com.abdul.net.Student4;


public class HelloWorld {

	public static void main(String[] args) {
		Student abdul ; //declaration
		abdul = new Student(); //instanstiation
		abdul.name = "ansari";    //instance variable = value in the box partition --- initialization
		Student alfred = new Student();   //new will allocate mem in RAM
		System.out.println("hello world");
		
		GST gst;//a variable reference is created on the stack m/y
		gst = new GST(); // a object gets created on the heap m/y
		int tax = gst.calculateTax(1000);
		int gstTax = gst.CalculateIncomeTax(1000, 500);
		Student4.average(10, 20, 30);
		
		System.out.println("tax="+ tax);
		System.out.println("gst="+gstTax);
		
	}
	
	//declaration
	//instanstiation
	//initialization
	

}
