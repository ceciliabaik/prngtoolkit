class Cryptosystem {
  #primeNumberOne
  #primeNumberTwo

  constructor(primeNumberOne, primeNumberTwo) {
    this.#primeNumberOne = primeNumberOne
    this.#primeNumberTwo = primeNumberTwo
  }

  get modulus() {
    return this.#computeModulus()
  }

  get totient() {
    return this.#computeTotient()
  }

  get publicExponent() {
    return this.#computePublicExponent()
  }

  get secretExponent() {
    return this.#computeSecretExponent()
  }

  #getTwoRandomIntegers () {
    let randomIntegerList = Array.from({length: 2}, () => 
      Math.floor((Math.random() * 100) + 1))
    
    return randomIntegerList
  }

  #computeModulus () {
    return this.#primeNumberOne * this.#primeNumberTwo
  }

  #computeTotient () {
    return (this.#primeNumberOne - 1) * (this.#primeNumberTwo - 1)
  }

  #computePublicExponent () {
  }

  #computeSecretExponent () {
    return encryptionExponent - 1 % greatestCommonDivisor
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

  getPublicKey () {
    return generateKey(modulus, encryptionExponent)
  }

  getSecretKey () {
    return generateKey(modulus, decryptionExponent)
  }

  generateKey () {
    let modulus = modulus()
    let greatestCommonDivisor = totient()
    let encryptionExponent = publicExponent()
    let decryptionExponent = secretExponent()
    return (modulus, encryptionExponent, decryptionExponent)
  }

  encryptPlainText () {
    const publicKey = getPublicKey()
    const message = getPlainText().convertToAscii().reduceToLargeNumber()
    const cipherText = Math.pow(message, publicKey.encryptionExponent) % publicKey.modulus
    return cipherText
  }

  decryptCipherText () {
    const privateKey = getSecretKey()
    const encryptedMessage = encryptPlainText()
    const plainText = Math.pow(encryptedMessage, privateKey.decryptionExponent) % privateKey.modulus
    return plainText
  }
}

 








