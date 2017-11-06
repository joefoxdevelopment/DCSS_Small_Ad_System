package JoeFox.Exceptions.UserAuth;

public class NoSuchPasswordException extends Exception
{
	public NoSuchPasswordException () {
		super ();
	}

    public NoSuchPasswordException (String message) {
        super (message);
    }
}
