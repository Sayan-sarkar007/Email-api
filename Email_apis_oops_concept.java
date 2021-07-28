package email;
import java.util.Scanner;

public class Email_apis_oops_concept {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int PasswordLength = 8;
	private String email;
	private String companynameforgmail = "mycomapy.com";
	private int mailbox = 500;
	private String alternativePassword;
	private String alternetEmail;
	
	
	// constructor banabo first name r last name nebar jonne
	
	public Email_apis_oops_concept(String firstname, String lastname){
            this.firstname = firstname;
            this.lastname = lastname;
          //  System.out.println("NAME: " + this.firstname + " " + this.lastname);
            
            //call korchi ami department method k r sathe print o korchi
            this.department = setDept();
            //System.out.println("Department: " + this.department);
            
            //call the password method
            this.password = randomPassword(PasswordLength); // ekhane PasswordLength ta holo length number mane ami koto gulo charecter er password chai seta ekane set korte hobe. oi jonnei length neowa.
            System.out.println("Your passwod is: " + this.password);
            
            //combination kore mail toiri kora
            email = firstname.toLowerCase()+lastname.toLowerCase() + "@" + department + "." + companynameforgmail; // just data gulo diye akta gmail banalam
            //System.out.println("Your Generated Mail id: " + email);
	}
	
	
	
	
	// input for department
	private String setDept() {
		System.out.println("New Employee: " + firstname + " " + lastname + "\nENTER YOUR DEPARTMENT(enter the number)\n1 for the sales\n2 for the devolopment\n3 for the accouting\n0 for none\nEnter the number here- ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==1) {
			return("sales");
		}
		else if(a==2) {
			return("devolopment");
		}
		else if(a==3) {
			return("accounting");
		}
		else {
			return "" ;
		}
	}		
		
		// generating random password****
		private String randomPassword(int length) {
			
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz12345678910!@#$%&*";
			char[] password = new char[length]; //password akta set of array hobe jeta kina uporer ai charecter r number gulo diye toiri hobe, tai jonne amder ekhane array nite hobe 
			for(int i=0 ; i<length; i++) {
				int random = (int) (Math.random() * passwordSet.length()); //Math.random() akta random number generate korbe 1-10 er modheye kintu amader to sudhu number holei hobe na amder charecter o chai tai jonne amra oi numgulo ke passwordSet variable e jet charecter gulo set korechi otar sathe gun koriye chi jate number o peye jai
				password[i] = passwordSet.charAt(random); // jei password ta toiri holo ota ke to amak abar ferot dite hobe tai jonne ami password array te jei i ta generate hob seta k ferot dilam with help of  ".charAt(random)" . Ekhane paswordSet er theke nicchi bol eota k mention korahoyeche r "random" e charecter ta ferot dite hobe bole oi .charAt er pore braccet e deowa.	
			}
			return new String(password);
		}
		
		
		//*************set method***********
		
		//mail box capacity er jonne
		public void setMailBox(int capacity) {
			this.mailbox = capacity;
		}
		
		//alternative email
		public void setAlternetiveEmail(String altEmail) {
			this.alternetEmail = altEmail;
		}
		
		//change password er jonne
		public void changePassword(String password) {
			this.alternativePassword = password;
		}
		
		//***********get methods**************
		public int getMailBox() {
			return  mailbox;
		}
		
		public String getAlternetiveEmail() {
			return alternetEmail;
		}
		
		public String getchangePassword() {
			return alternativePassword;
		}
		
		// method to print the info
		public String showInfo() {
			return "DISPLAY NAME: " + firstname + " " + lastname +
					"\nCompany Email: " + email +
					"\nMailbox cap: " + mailbox + "mb";
		}
}


