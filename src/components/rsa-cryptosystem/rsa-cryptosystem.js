function getTwoRandomIntegers () {
  let randomIntegerList = Array.from({length: 2}, () => 
    Math.floor((Math.random() * 100) + 1))

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

function findCoPrimeNumber () {
}

function getPublicExponent () {

}


function generateKey (primeNumberOne, primeNumberTwo) {
  let modulus = primeNumberOne * primeNumberTwo
  let greatestCommonDivisor = (primeNumberOne - 1) * (primeNumberTwo - 1)
  // let publicExponent = 
  let secretExponent = publicExponent - 1 % greatestCommonDivisor
  return (modulus, publicExponent, secretExponent)
}

function getPublicKey () {
  const publicKey = generateKey(modulus).generateKey(publicExponent)
  return publicKey
}

function getPrivateKey () {
  const privateKey = generateKey(modulus).generateKey(secretExponent)
  return privateKey
}


function encodeStringCharIntoAscii (message) {
  let charAsciiList = []

  for (let i = 0; i < message.length; i++) {
    let convertedMessage = message.charCodeAt(i)
    charAsciiList.push(convertedMessage)
  }

  return charAsciiList
}

function encodeAsciiIntoStringChar (message) {
  const asciiMessage = getDecryptedCipherText()
  return asciiMessage.fromCharCode()
}

function generateLargeNumber () {
  const cipherText = getEncryptedPlainText()
  cipherText.reduce((previousValue, currentValue))
}

function encryptPlainText () {
  const asciiMessage = getPlainText()
  const publicKey = getPublicKey()
  const cipherText = Math.pow(asciiMessage, publicKey(publicExponent)) % publicKey(modulus)
  return cipherText
}

function decryptCipherText () {
  const cipherText = getCipherText()
  const privateKey = getPrivateKey()
  const plainText = Math.pow(cipherText, privateKey(secretExponent)) % privateKey(modulus)
  return plainText
}

function toString () {
  return getPlainText().toString()
}