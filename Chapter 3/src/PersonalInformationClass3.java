

/**
 * @author jts5b_000
 *
 */
public class PersonalInformationClass3 {
	
	//get and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//fields
	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	
	public PersonalInformationClass3(){
		name = "";
		address = "";
		age = 0;
		phoneNumber = "(314) 488-3709";
		
	}
	
	public static void main(String[] args){
		
		PersonalInformationClass3 Jacob = new PersonalInformationClass3();
		PersonalInformationClass3 friend = new PersonalInformationClass3();
		PersonalInformationClass3 familyMember = new PersonalInformationClass3();
		//sets data
		Jacob.setName("Stich");
		Jacob.setAddress("1 ABC Street");
		Jacob.setAge(19);
		friend.setName("Adam");
		friend.setAddress("12 B Street");
		friend.setAge(21);
		friend.setPhoneNumber("(314) 867-5309");
		familyMember.setPhoneNumber("(636) 867-5309");
		familyMember.setName("Mike");
		familyMember.setAge(40);
    	familyMember.setAddress("123 F Street");
		
		//output
		System.out.println(" Name\t\tAddress\t\tAge\t\tPhone Number");
		System.out.println( Jacob.getName() + "\t\t" + Jacob.getAddress() + "\t\t" + Jacob.getAge() + "\t\t" + Jacob.getPhoneNumber() );
		System.out.println( friend.getName() + "\t\t" + friend.getAddress() + "\t\t" + friend.getAge() + "\t\t" + friend.getPhoneNumber() );
		System.out.println( familyMember.getName() + "\t\t" + familyMember.getAddress() + "\t\t" + familyMember.getAge() + "\t\t" + familyMember.getPhoneNumber() );
		
	}
	}


