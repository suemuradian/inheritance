public class Mynewexception extends Exception {
    private String errorMessage;

    public Mynewexception(String error) {
        this.errorMessage = error;
    }

    public String getMessage() {
        System.out.println("can't do");
        return null;
    }
}




