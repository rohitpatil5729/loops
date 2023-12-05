package loops;

public class nested_if {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	int marks=62;
	if(marks<35) {
		System.out.println("student is fail");}
	
	else if(marks>=35 && marks <50 ) {
			System.out.println("student pass with 3rd class");
		}
		 else if(marks>=50 && marks<80) {
			 System.out.println("student pass with 2nd class");
			 
		 }
		 else if(marks>=80 && marks<90) {
			 System.out.println("student pass with 1st class ");
		 }
		 else {
			 System.out.println("student pass with topper");
			 }
		
	}

	}


