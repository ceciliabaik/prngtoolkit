# Testrapport för PRNG Toolkit

**Datum:** 2023-10-25

**Testutförare:** Cecilia Baik

## Sammanfattning

Under denna testomgång utfördes 64 tester för PRNG Toolkit. Av dessa testfall misslyckades 4, och de har blivit identifierade och dokumenterade nedan. De misslyckade testfallen finns i olika delar av koden.

## Lyckade Testfall

Här är en sammanfattning av de lyckade testfallen:

| Vad som testats / Ex metodnamn, eller krav                             | Hur det testats                                                                 | Testresultat |
|-----------------------------------------------------------------------|-------------------------------------------------------------------------------|--------------|
| ConfigurationTest: Testfall för Configuration                         | Testade de olika inställningarna för Configuration-komponenten.             | Lyckades     |
| UniformDistributionTest: Testfall för Uniform Distribution              | Validerade Uniform Distribution-komponentens funktioner genom att testa generering av slumpmässiga tal inom olika intervall. | Lyckades |
| DistributionFactoryTest: Testfall för Distribution Factory             | Testade skapandet av olika distributionsobjekt.                             | Lyckades     |
| GeneratorFactoryTest: Testfall för Generator Factory                   | Testade skapandet av olika generatorer.                                     | Lyckades     |
| CoinFlipValidatorTest: Testfall för CoinFlip Validator                  | Validerade olika parametrar för myntkastningssimulering.                    | Lyckades     |
| ExceptionValidatorTest: Testfall för Exception Validator                | Validerade hanteringen av olika typer av undantag och fel.                   | Lyckades     |
| CoinFlipGeneratorTest: Testfall för CoinFlip Generator                  | Testade simulering av myntkastningar med olika inställningar.               | Lyckades     |
| DeckShuffleGeneratorTest: Testfall för Deck Shuffle Generator           | Validerade blandning och återställning av en lek med kort.                   | Lyckades     |
| DiceRollGeneratorTest: Testfall för Dice Roll Generator                 | Testade simulering av tärningskast med olika inställningar.                | Lyckades     |
| MersenneTwisterGeneratorTest: Testfall för Mersenne Twister Generator  | Validerade generering av slumpmässiga tal inom olika intervall.             | Lyckades     |
| StandardRandomGeneratorTest: Testfall för Standard Random Generator    | Validerade generering av slumpmässiga heltal och flyttal inom olika intervall. | Lyckades     |


## Misslyckade Testfall

Här är en sammanfattning av de misslyckade testfallen:

| Vad som testats / Ex metodnamn, eller krav                             | Hur det testats                                                                 | Testresultat     |
|-----------------------------------------------------------------------|-------------------------------------------------------------------------------|------------------|
| ExceptionValidatorTest > testInvalidSupportedDataType                   | Testade hantering av ogiltig datatyp (Double) i Exception Validator.         | Misslyckades      |
| UniformDistributionTest > testGetNextIntInEvenlyDivisibleRange          | Validerade generering av slumpmässiga tal inom ett jämnt delbart intervall. | Misslyckades      |
| MersenneTwisterGeneratorTest > testGenerateNextIntInRange               | Validerade generering av slumpmässiga heltal inom ett givet intervall.     | Misslyckades      |
| StandardRandomGeneratorTest > testGenerateNextIntInRange                | Validerade generering av slumpmässiga heltal inom ett givet intervall.     | Misslyckades      |


## Åtgärder

För att åtgärda de misslyckade testfallen bör följande steg vidtas:

1. Granska koden för varje misslyckat testfall och använd lämplig felsökningsmetodik för att identifiera problemen.

2. Korrigera kodfel och implementera eventuella nödvändiga ändringar i de relevanta testfallen.

3. Kör testerna igen efter korrigeringarna för att säkerställa att de nu passerar.

4. Uppdatera testrapporten med resultaten efter att testerna har kört igen.

## Slutsats för Misslyckade Testfall

Misslyckade testfall är en viktig del av utvecklingsprocessen, och de hjälper till att identifiera och åtgärda problem i koden. Genom att noggrant analysera och rätta till dessa misslyckade testfall kan kvaliteten och tillförlitligheten i koden förbättras.
