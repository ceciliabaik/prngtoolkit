package cryptosystem.primality;

/**
 * Represents a Miller-Rabin Primality Test.
 * Generates large prime numbers.
 *
 * @version     1.0.0 17 September 2022
 * @author      Cecilia Baik
 */
class PrimalityTest {
    private long number;
    private int MAX_ACCURACY_ATTEMPTS;

    public PrimalityTest(long number, int MAX_ACCURACY_ATTEMPTS) {
        this.number = number;
        this.MAX_ACCURACY_ATTEMPTS = MAX_ACCURACY_ATTEMPTS;
    }

    private int performPrimalityTest () {
        for (int i = 0; i < this.MAX_ACCURACY_ATTEMPTS; i++) {
            isStrongProbablePrime();
        }
    }

    private boolean isStrongProbablePrime() {
        isSmallPrime();
        while (isOddInteger()) {
            findOddInteger();
        }
    }

    private boolean isSmallPrime() {
        if (this.number == 0 || this.number == 1) {
            return false;
        } else if (this.number == 2 || this.number == 3) {
            return true;
        }
    }

    private boolean isOddInteger() {
        this.number % 2 == 0 ? false : true;
    }

    private int findOddInteger() {
        int oddNumber = this.number - 1;
        while (oddNumber % 2 == 0) {

        }
    }

    private boolean isWitnessOne() {
        int randomNumber = generateRandomNumber()
        int x = Math.pow(randomNumber, getOddInteger()) % this.number
        if (x == 1 || x == this.number - 1) {
            return true;
        }
    }

    private boolean isWitnessTwo() {
        int x = Math.pow(x, 2) % this.number;
        if (x == this.number - 1) {
           return false;
        } else if (x == this.number - 1) {
            return true;
        }
    }

    private long generateRandomLargeNumber() {
        int minimumRange = 2;
        long maximumRange = this.number - 2;
        return minimumRange + (int)(Math.random() * maximumRange)
    }
}










