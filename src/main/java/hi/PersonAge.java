package hi;

import static org.junit.Assert.assertThrows;

public class PersonAge
{
	String firstName;
	String lastName;
	int age;
	/**
	 * @param fname- First Name
	 * @param lname- Last Name
	 * @param age- age of person in years
	 */
	public PersonAge(String fname, String lname, int age)
	{
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
	}
	public String getFname()
	{
		return firstName;
	}
	public void setFname(String fname)
	{
		this.firstName = fname;
	}
	public String getLname()
	{
		return lastName;
	}
	public void setLname(String lname)
	{
		this.lastName = lname;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Person: " + firstName + " " + lastName + ", " + age ;
	}
	
	public PersonAge makePerson(PersonAge that) throws UnderAgeException
	{
		if (age<18 || that.age<18)
		{
			throw new UnderAgeException();
		}
		PersonAge child= new PersonAge(this.firstName, that.lastName,0);
		return child;
	}
	public static void main(String[] args)
	{
		PersonAge r=new PersonAge("Romeo", "Mon", 15);
		
		System.out.println("R "+r);
	}
}
