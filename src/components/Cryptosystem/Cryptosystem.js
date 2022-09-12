const { number } = require("assert-plus")

class Cryptosystem {
  #primeNumberOne
  #primeNumberTwo

  constructor(primeNumberOne, primeNumberTwo) {
    this.#primeNumberOne = primeNumberOne
    this.#primeNumberTwo = primeNumberTwo
  }

  get modulus () {
    return this.#computeKeyLength()
  }

  get phi () {
    return this.#countNumbersOfIntegersBetweenOneAndNumber()
  }

  get publicExponent () {
    return this.#findCoPrimeToPhi()
  }

  get privateExponent () {
    return this.#findGreatestCommonDivisor()
  }

  #computeKeyLength () {
    let modulus = this.#primeNumberOne * this.#primeNumberTwo
    return modulus
  }

  #countNumbersOfIntegersBetweenOneAndNumber () {
    // Euler's totient function
    let phi = (this.#primeNumberOne - 1) * (this.#primeNumberTwo - 1)
    return phi
  }

  #findCoPrimeToPhi () {
    return encryptionExponent - 1 % greatestCommonDivisor
  }

  #findGreatestCommonDivisor () {
    // Extended Euclidean algorithm and Bézout's identity
    let greatestCommonDivisor = 0

    if (number === 0) return greatestCommonDivisor
    while (number !== 0) {
      number = greatestCommonDivisor % number
      greatestCommonDivisor = number
      return greatestCommonDivisor
    }
  }

  getPublicKey (publicExponent, modulus) {
  }

  getPrivateKey (secretExponent, modulus) {
  }

  generateKeyPair () {
  }

  encrypt () {
    const publicKey = getPublicKey()
    const message = getPlainText().convertToAscii().reduceToLargeNumber()
    const cipherText = Math.pow(message, publicKey.publicExponent) % publicKey.modulus
    return cipherText
  }

  decrypt () {
    const privateKey = getPrivateKey()
    const encryptedMessage = getCipherText()
    const plainText = Math.pow(encryptedMessage, privateKey.privateExponent) % privateKey.modulus
    return plainText
  }

  #convertToAscii (message) {
    let charAsciiList = []

    for (let i = 0; i < message.length; i++) {
      let convertedMessage = message.charCodeAt(i)
      charAsciiList.push(convertedMessage)
    }
    return charAsciiList
  }

  #convertToString (message) {
    return message.getDecryptedCipherText().fromCharCode()
  }

  #reduceToLargeNumber (message) {
    return message.reduce((previousValue, currentValue))
  }

  #getTwoRandomIntegers () {
    let randomIntegerList = Array.from({length: 2}, () => 
      Math.floor((Math.random() * 100) + 1))
    
    return randomIntegerList
  }
}

 








