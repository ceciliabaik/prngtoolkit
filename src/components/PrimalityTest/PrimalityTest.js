class PrimalityTest {
  #number
  #accuracy = 0

  constructor (number, accuracy) {
    this.#number = number
    this.#accuracy = accuracy
  }

  #isStrongProbablePrime (number) {
      if (number < 3) return false 
    
      while (isOddInteger()) {
        findOddInteger()
        if (witnessLoop()) {
          
        }
      }
    }

    #isOddInteger (number) {
      if (number % 2 === 0) return false
    }

    #findOddInteger (number, accuracy) {
      const oddInteger = number - 1
      if ((number - 1) % 2 === 0 && accuracy > 0) {
      oddInteger = Math.pow(2, accuracy) * oddInteger
      } 
      return false
    }

    #witnessLoop (number, oddInteger) {
      let randomInteger = getRandomInteger()
      let x = Math.pow(randomInteger, oddInteger) % number
      if (x === 1 || x === number - 1) {
        // do loop
        x = Math.pow(x, 2) % number
        if (x === 1 || x === number - 1) return false
      }
      return true
    }

    #getRandomInteger (number) {
      return Math.floor((Math.random() * 2) * number - 2)
    } 
}








 

