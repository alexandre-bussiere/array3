public class Test {
    public int factoriel(int nb) throws AlexandreExepction {
        int nb2 = 1;
        if (nb > 1 && nb < 10) {
            for (int i = 1; i <= nb; i++) {
                nb2 = nb2 * i;
            }
        } else {

            throw new AlexandreExepction(" under 1 or over 10");
        }
        return (nb2);
    }
}
