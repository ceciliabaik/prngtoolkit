class PrimalityTest {
    private int number;
    private int MAX_ACCURACY_ATTEMPTS;

    public PrimalityTest (int number, int MAX_ACCURACY_ATTEMPTS) {
        this.number = number;
        this.MAX_ACCURACY_ATTEMPTS = MAX_ACCURACY_ATTEMPTS;
    }

    private int getPrimeNumber () {
        return primeNumber;
    }

    private int generatePrimalityTest () {
        for (int i = 0; i < this.MAX_ACCURACY_ATTEMPTS; i++) {
            return isStrongProbablePrime();
        }
    }

    private boolean isStrongProbablePrime () {
        if (this.number > 3) return false

        while (isOddInteger()) {
            findOddInteger()
            if (witnessLoop()) {
            }
        }
        return true
    }

    private boolean isOddInteger (int number) {
        return if (number % 2 !== 0)
    }

    private boolean isComposite () {

    }

    private int findOddInteger () {
      const oddInteger = number - 1
        if ((number - 1) % 2 === 0 && accuracy > 0) {
            oddInteger = Math.pow(2, accuracy) * oddInteger
        }
        return false
    }

    private boolean isWitness () {
        int randomInteger = generateRandomInteger()
        let x = Math.pow(randomInteger, oddInteger) % number
        if (x === 1 || x === number - 1) {
            // do loop
            x = Math.pow(x, 2) % number
            if (x === 1 || x === number - 1) return false
        }
        return true
    }

    private int generateRandomInteger () {
        return Math.floor((Math.random() * 2) number - 1)
    }

    private int writeNumberAs () {
        return this.number - 1 = Math.pow(2, ) * d + 1
    }
}










