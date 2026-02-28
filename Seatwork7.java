class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class Seatwork7 {
    // Method to check password validity
    static void checkPassword(String password) throws PasswordException {
        if (password.length() < 9) {
            throw new PasswordException("Password must be at least 9 characters long");
        } else {
            System.out.println("accept ko pag cute");
        }
    }

    public static void main(String[] args) {
        try {
            checkPassword("rhihanatrishah03");
        } catch (PasswordException e) {
            System.out.println("User-Defined Exceptions: " + e.getMessage());
        }
    }
}