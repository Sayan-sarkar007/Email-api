package email;

public class Email_body {

	public static void main(String[] args) {
		
		Email_apis_oops_concept emp1 = new Email_apis_oops_concept("subir","sarkar");
		
		/* for printing alternative email. amra set r get method use kore korte pari ai vabe.
		emp1.setAlternetiveEmail("sayanbolchi@gmail.com");
		System.out.println(emp1.getAlternetiveEmail()); */

		System.out.println(emp1.showInfo());
		
		System.out.println("\n");
		
		Email_apis_oops_concept emp2 = new Email_apis_oops_concept("sayan","sarkar");
		System.out.println(emp2.showInfo());
		
		System.out.println("\n");
		
		Email_apis_oops_concept emp3 = new Email_apis_oops_concept("Tamali","sarkar");
		System.out.println(emp3.showInfo());
	}

}
