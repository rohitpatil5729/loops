package loops;

public class nested_if_2nd_example {

	public static void main(String[] args) {
	int age =70;
	
	if(age<5) {
		System.out.println("no ticket");
	}
	else if(age>=5 && age<=12) {
		System.out.println("half ticket");
	}else if(age>12 && age<=60) {
		System.out.println("full ticket");
	}
	else {
		System.out.println("i am eligible for 60%off ticket");
		}
	
	

	}

}
