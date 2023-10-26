# Buggrapport

## Bugg:
Fel i flera testfall: `testGenerateNextIntInRange` i `StandardRandomGeneratorTest`, `testInvalidSupportedDataType` i `ExceptionValidatorTest`, `testGetNextIntInEvenlyDivisibleRange` i `UniformDistributionTest`, och `testGenerateNextIntInRange` i `MersenneTwisterGeneratorTest`.

## Sammanfattning:
Flera testfall misslyckas med ett felaktigt undantag.

## Miljöinformation:

**Språk:** Java
**Testverktyg:** JUnit

## Åtgärdssteg:

1. Kör testmetoden `testGenerateNextIntInRange` i klassen `StandardRandomGeneratorTest`.
   - Förväntat beteende: Testet ska passera utan att kasta något undantag. Undersök testkoden i `StandardRandomGeneratorTest` och kontrollera att alla förväntade undantag är korrekt hanterade. Om det finns fel i testkoden, åtgärna dem.

2. Kör testmetoden `testInvalidSupportedDataType` i klassen `ExceptionValidatorTest`.
   - Förväntat beteende: Testet ska passera utan att kasta något undantag. Undersök testkoden i `ExceptionValidatorTest` och kontrollera att alla förväntade undantag är korrekt hanterade. Om det finns fel i testkoden, åtgärna dem.

3. Kör testmetoden `testGetNextIntInEvenlyDivisibleRange` i klassen `UniformDistributionTest`.
   - Förväntat beteende: Testet ska passera utan att kasta något undantag. Undersök testkoden i `UniformDistributionTest` och kontrollera att alla förväntade undantag är korrekt hanterade. Om det finns fel i testkoden, åtgärna dem.

4. Kör testmetoden `testGenerateNextIntInRange` i klassen `MersenneTwisterGeneratorTest`.
   - Förväntat beteende: Testet ska passera utan att kasta något undantag. Undersök testkoden i `MersenneTwisterGeneratorTest` och kontrollera att alla förväntade undantag är korrekt hanterade. Om det finns fel i testkoden, åtgärna dem.

## Felmeddelanden eller Loggar:
StandardRandomGeneratorTest > testGenerateNextIntInRange() FAILED
    org.opentest4j.AssertionFailedError at StandardRandomGeneratorTest.java:34

ExceptionValidatorTest > testInvalidSupportedDataType() FAILED
    org.opentest4j.AssertionFailedError at ExceptionValidatorTest.java:86

UniformDistributionTest > testGetNextIntInEvenlyDivisibleRange() FAILED
    org.opentest4j.AssertionFailedError at UniformDistributionTest.java:27

MersenneTwisterGeneratorTest > testGenerateNextIntInRange() FAILED
    org.opentest4j.AssertionFailedError at MersenneTwisterGeneratorTest.java:34

64 tests completed, 4 failed

FAILURE: Build failed with an exception.

## Frekvens:
Problem uppstår varierande när testmetoderna körs.

## Påverkan:
Problemet påverkar testens pålitlighet och stabilitet.

## Prioritet och Allvarlighetsgrad:
Medel

## Bekräftelseperson:
Cecilia Baik
