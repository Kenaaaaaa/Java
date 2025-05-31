package Exception;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);

    }
    static boolean  checkAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("mosha nuk mund te jete me e vogel se 18");
        }
        return true;
    }
}
