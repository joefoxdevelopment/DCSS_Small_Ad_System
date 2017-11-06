package JoeFox.Exceptions.UserAuth;

public class InvalidAttemptException extends Exception
{
	public InvalidAttemptException () {
		super ();
	}

    public InvalidAttemptException (String message) {
        super (message);
    }
}
