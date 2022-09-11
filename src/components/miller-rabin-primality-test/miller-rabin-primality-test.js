function isStrongProbablePrime (number) {
  if (number < 3) return false 

  while (isOddInteger()) {
    findOddInteger()
    if (witnessLoop()) {
      
    }
  }
}

function isOddInteger (number) {
  if (number % 2 === 0) return false
}

function findOddInteger (number, accuracy) {
  const oddInteger = number - 1
  if ((number - 1) % 2 === 0 && accuracy > 0) {
    oddInteger = Math.pow(2, accuracy) * oddInteger
  } 
  return false
}

function witnessLoop (number, oddInteger) {
  let randomNumber = getRandomInteger()
  let x = Math.pow(randomNumber, oddInteger) % number
  if (x === 1 || x === number - 1) {
    // do loop
    x = Math.pow(x, 2) % number
    if (x === 1 || x === number - 1) return false
  }
  return true
}
 
function getRandomInteger (number) {
  return Math.floor((Math.random() * 2) * number - 2)
}
