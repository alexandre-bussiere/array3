public class AlexandreExepction extends Exception {

    String msgres;

    public AlexandreExepction() {
        super("Error");
    }

    public AlexandreExepction(String msg) {
        super("Error :" + msg);
    }

    /*
     * public String exepctionmath(String msg) {
     * msgres = "Error math : ";
     * msgres = msgres + msg;
     * return msgres;
     * }
     */
}
