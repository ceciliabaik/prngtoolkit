function getTwoRandomIntegers () {
  let randomIntegerList = Array.from({length: 2}, () => 
    Math.floor((Math.random() * 1000) + 100))

  return randomIntegerList
}

function findPrimeNumbersByUsingPrimalityTest () {
  let numbers = getTwoRandomIntegers()
  numbers.forEach(number => {
    if (number /  ) {

    } else {
      return
    }
  })  
}

function findCoPrimeNumberByUsing () {
}

function generateKey (primeNumberOne, primeNumberTwo) {
  let modulus = primeNumberOne * primeNumberTwo
  let totient = (primeNumberOne - 1) * (primeNumberTwo - 1)
  let publicExponent = 
  let secretExponent = publicExponent - 1 % (primeNumberOne - 1) * (primeNumberTwo - 1) 
  return (modulus, publicExponent, secretExponent)
}

function generatePublicKey (modulus, publicExponent) {
  const publicKey = message % generateKey(modulus)
}

function generatePrivateKey (secretExponent, publicExponent, totient) {
  return (secretExponent * publicExponent) % totient

}

function convertStringCharactersIntoASCII (message) {
  let charAsciiList = []

  for (let i = 0; i < message.length; i++) {
    let convertedMessage = message.charCodeAt(i)
    charAsciiList.push(convertedMessage)
  }

  return charAsciiList
}

function encryptPlainText () {
  const message = getPlainText()
  const publicKey = getPublicKey()
  const cipherText = Math.pow((message, publicKey(publicExponent)) % publicKey(modulus))
  return cipherText
}

function decryptCipherText () {
  const message = getCipherText()
  const privateKey = getPrivateKey()
  const plainText = Math.pow((message, privateKey(secretExponent)) % privateKey(modulus))
  return plainText
}