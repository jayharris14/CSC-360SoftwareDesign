package hi;

public class UnderAgeException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7398838034634013461L;
	/**
	 * 
	 */
	public UnderAgeException()
	{
		super("Parent is too Young");
	}

		

	/**
	 * @param message
	 */
	public UnderAgeException(String message)
	{
		super(message);
		
	}

}
