
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		GST gst;//a variable reference is created on the stack m/y
		gst = new GST(); // a object gets created on the heap m/y
		int tax = gst.calculateTax(1000);
		int gstTax = gst.CalculateIncomeTax(1000, 500);
		
		System.out.println("tax="+ tax);
		System.out.println("gst="+gstTax);
		
	}

}
