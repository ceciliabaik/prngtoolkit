# Testrapport för PRNG Toolkit

**Datum:** 2023-10-25

**Testutförare:** Cecilia Baik

## Sammanfattning

Under denna testomgång utfördes 64 tester för PRNG Toolkit. Av dessa testfall misslyckades 4, och de har blivit identifierade och dokumenterade nedan. De misslyckade testfallen finns i olika delar av koden.

## Lyckade Testfall

Här är en sammanfattning av de lyckade testfallen:

# ConfigurationTest: Testfall för Configuration

Configuration är en komponent som används för att konfigurera inställningar och parametrar för PRNG Toolkit. Dessa testfall syftar till att verifiera Configuration-komponentens funktioner.

## Testmetoder

1. `testDefaultSeed`: Testar standardstartseed. Validerar att den genererade startseeden inte är null.

2. `testSetSeed`: Testar inställning av startseed. Validerar att den angivna startseeden kan sättas och hämtas korrekt.

3. `testSetMinValue`: Testar inställning av minsta värde. Validerar att det angivna minsta värdet kan sättas och hämtas korrekt.

4. `testSetMaxValue`: Testar inställning av största värde. Validerar att det angivna största värdet kan sättas och hämtas korrekt.

5. `testThreadSafety`: Testar inställning av trådsäkerhet. Validerar att trådsäkerhetsinställningen kan aktiveras och hämtas korrekt.

Dessa testfall säkerställer att Configuration-komponenten fungerar korrekt och kan hantera olika konfigurationsparametrar inom PRNG Toolkit.

# UniformDistributionTest: Testfall för Uniform Distribution

Uniform Distribution är en komponent inom PRNG Toolkit som används för att generera slumpmässiga tal inom jämnt fördelade intervall. Dessa testfall syftar till att verifiera funktionerna i Uniform Distribution-komponenten.

## Testmetoder

1. `testGetNextIntInEvenlyDivisibleRange`: Testar generering av ett jämnt tal inom ett jämnt delbart intervall. Validerar att det genererade talet är inom det specificerade intervallet och att det är ett jämnt tal.

2. `testGetNextDoubleInRangeRoundedDown`: Testar generering av en double inom ett intervall med avrundning nedåt. Validerar att det genererade talet är inom det specificerade intervallet och att det är avrundat nedåt.

Dessa testfall säkerställer att Uniform Distribution-komponenten fungerar korrekt och kan generera slumpmässiga tal inom specificerade interval.

# DistributionFactoryTest: Testfall för Distribution Factory

Distribution Factory är en komponent som används för att skapa distributionsobjekt för PRNG Toolkit. Dessa testfall syftar till att verifiera Distribution Factory-komponentens funktioner.

## Testmetoder

1. `testCreateIntUniformDistribution`: Testar skapandet av en jämn fördelning av heltal. Validerar att den skapade distributionsinstansen inte är null.

2. `testCreateDoubleUniformDistribution`: Testar skapandet av en jämn fördelning av flyttal. Validerar att den skapade distributionsinstansen inte är null.

Dessa testfall säkerställer att Distribution Factory-komponenten kan skapa olika typer av distributionsobjekt för användning inom PRNG Toolkit.

# GeneratorFactoryTest: Testfall för Generator Factory

Generator Factory är en komponent som används för att skapa generatorobjekt för PRNG Toolkit. Dessa testfall syftar till att verifiera Generator Factory-komponentens funktioner.

## Testmetoder

1. `testCreateStandardRandomGenerator`: Testar skapandet av en Standard Random Generator för både heltal och flyttal. Validerar att de skapade generatorinstanserna inte är null.

2. `testCreateMersenneTwisterGenerator`: Testar skapandet av en Mersenne Twister Generator för både heltal och flyttal. Validerar att de skapade generatorinstanserna inte är null.

3. `testCreateCoinFlipGenerator`: Testar skapandet av en Coin Flip Generator. Validerar att den skapade generatorinstansen inte är null.

4. `testCreateDeckShuffleGenerator`: Testar skapandet av en Deck Shuffle Generator. Validerar att den skapade generatorinstansen inte är null.

5. `testCreateDiceRollGenerator`: Testar skapandet av en Dice Roll Generator. Validerar att den skapade generatorinstansen inte är null.

6. `testCreateDiceRollGeneratorWithCustomSides`: Testar skapandet av en Dice Roll Generator med anpassat antal sidor. Validerar att den skapade generatorinstansen inte är null.

Dessa testfall säkerställer att Generator Factory-komponenten kan skapa olika typer av generatorer för användning inom PRNG Toolkit.

# CoinFlipValidatorTest: Testfall för CoinFlip Validator

CoinFlip Validator är en komponent som används för att validera parametrar för myntkastningssimulering inom PRNG Toolkit. Dessa testfall syftar till att verifiera CoinFlip Validator-komponentens funktioner.

## Testmetoder

1. `testValidMaxNumOfFlips`: Testar giltigt maximalt antal myntkast. Validerar att ett giltigt maximalt antal myntkast godkänns av valideringskomponenten.

2. `testInvalidMaxNumOfFlips`: Bekräftar att ogiltigt maximalt antal myntkast (0 i detta fall) genererar en IllegalArgumentException.

3. `testValidProbabilityOfHeads`: Testar giltig sannolikhet för krona i myntkastning. Validerar att en giltig sannolikhet godkänns av valideringskomponenten.

4. `testInvalidProbabilityOfHeadsLow`: Kontrollerar att en ogiltig sannolikhet för krona (negativt värde) genererar en IllegalArgumentException.

5. `testInvalidProbabilityOfHeadsHigh`: Validerar att en ogiltig sannolikhet för krona (värde över 1.0) genererar en IllegalArgumentException.

6. `testValidNumOfFlips`: Testar giltigt antal myntkast. Validerar att ett giltigt antal myntkast godkänns av valideringskomponenten.

7. `testValidNumOfFlipsZero`: Bekräftar att ett noll antal myntkast godkänns som giltigt av valideringskomponenten.

8. `testInvalidNumOfFlipsNegative`: Validerar att ett ogiltigt negativt antal myntkast genererar en IllegalArgumentException.

Dessa testfall säkerställer att CoinFlip Validator-komponenten fungerar korrekt och kan hantera sina respektive uppgifter inom PRNG Toolkit.

# ExceptionValidatorTest: Testfall för Exception Validator

Exception Validator är en komponent som används för att validera olika typer av undantag och fel i PRNG Toolkit. Dessa testfall syftar till att verifiera Exception Validator-komponentens funktioner.

## Testmetoder

1. `testValidMinValueOfInt`: Testar giltig minsta värde av en Integer. Validerar att ett giltigt minsta värde godkänns av valideringskomponenten.

2. `testMinValueWithNullInt`: Bekräftar att ogiltig minsta värde (null i detta fall) genererar en IllegalArgumentException.

3. `testValidMaxValueOfDouble`: Testar giltig största värde av en Double. Validerar att ett giltigt största värde godkänns av valideringskomponenten.

4. `testMaxValueWithNullDouble`: Kontrollerar att ogiltig största värde (null i detta fall) genererar en IllegalArgumentException.

5. `testValidMinLessThanOrEqualMax`: Validerar att en giltig minsta och största värde är mindre än eller lika med varandra.

6. `testInvalidateMinLessThanOrEqualMax`: Testar ogiltiga minsta och största värden där minsta är större än största och genererar en IllegalArgumentException.

7. `testValidPositiveSeed`: Testar en giltig positiv startseed (Long). Validerar att en positiv seed godkänns av valideringskomponenten.

8. `testInvalidNegativeSeed`: Validerar att en ogiltig negativ seed genererar en IllegalArgumentException.

9. `testValidPositiveCount`: Testar ett giltigt positivt antal (Integer). Validerar att ett positivt antal godkänns av valideringskomponenten.

10. `testInvalidNegativeCount`: Kontrollerar att ett ogiltigt negativt antal genererar en IllegalArgumentException.

11. `testValidSupportedDataType`: Testar en giltig datatyp (Integer) som stöds av komponenten.

12. `testInvalidSupportedDataType`: Validerar att en ogiltig datatyp (Double) genererar en IllegalArgumentException.

Dessa testfall säkerställer att Exception Validator-komponenten fungerar korrekt och kan hantera olika typer av undantag och fel inom PRNG Toolkit.

# CoinFlipGeneratorTest: Testfall för CoinFlip Generator

CoinFlip Generator är en komponent som används för att simulera myntkastningar inom PRNG Toolkit. Dessa testfall syftar till att verifiera CoinFlip Generator-komponentens funktioner.

## Testmetoder

1. `testEqualProbabilityCoinFlip`: Testar simulering av myntkast med lika sannolikhet för krona och klave. Validerar att resultatet är giltigt.

2. `testHeadsProbabilityCoinFlip`: Testar simulering av myntkast med anpassad sannolikhet för krona. Validerar att resultatet är giltigt.

3. `testSimulateHeadsAndUpdateStats`: Testar simulering av flera myntkast med anpassad sannolikhet för krona och uppdatering av statistik. Validerar att statistiken uppdateras korrekt.

4. `testSetMaxNumOfFlips`: Testar att sätta det maximala antalet myntkast. Validerar att det maximala antalet uppdateras korrekt.

5. `testInvalidProbabilityOfHeads`: Validerar att ogiltig sannolikhet för krona (negativt värde) genererar en IllegalArgumentException.

6. `testInvalidNumOfFlips`: Validerar att ett ogiltigt antal myntkast (negativt värde) genererar en IllegalArgumentException.

Dessa testfall säkerställer att CoinFlip Generator-komponenten fungerar korrekt och kan simulera myntkastningar med olika inställningar inom PRNG Toolkit.

# DeckShuffleGeneratorTest: Testfall för Deck Shuffle Generator

Deck Shuffle Generator är en komponent som används för att slumpmässigt blanda en lek kort inom PRNG Toolkit. Dessa testfall syftar till att verifiera Deck Shuffle Generator-komponentens funktioner.

## Testmetoder

1. `testShuffleDeck`: Testar att slumpmässigt blanda leken med kort. Validerar att den blandade leken inte är identisk med den ursprungliga leken och att alla element från den ursprungliga leken finns i den blandade leken.

2. `testGetShuffledDeck`: Validerar att `getShuffledDeck` returnerar den aktuella blandade leken och inte påverkar leken.

3. `testResetDeck`: Testar återställning av leken till sitt ursprungliga skick efter blandning. Validerar att leken återställs korrekt.

4. `testInvalidDeck`: Validerar att försöka skapa en generator med en tom lek genererar en IllegalArgumentException.

Dessa testfall säkerställer att Deck Shuffle Generator-komponenten fungerar korrekt och kan hantera blandning och återställning av en lek med kort inom PRNG Toolkit.

# DiceRollGeneratorTest: Testfall för Dice Roll Generator

Dice Roll Generator är en komponent som används för att simulera tärningskast inom PRNG Toolkit. Dessa testfall syftar till att verifiera Dice Roll Generator-komponentens funktioner.

## Testmetoder

1. `testRollDieWithDefaultSides`: Testar simulering av tärningskast med standardantal sidor (6 sidor). Validerar att resultatet är inom det förväntade intervallet (1-6).

2. `testRollDieWithDifferentSides`: Testar simulering av tärningskast med olika antal sidor. Validerar att resultatet är inom det förväntade intervallet baserat på det anpassade antalet sidor.

3. `testInvalidNumberOfDice`: Validerar att ett ogiltigt antal tärningar (0 eller negativt värde) genererar en IllegalArgumentException.

Dessa testfall säkerställer att Dice Roll Generator-komponenten fungerar korrekt och kan simulera tärningskast med olika inställningar inom PRNG Toolkit.

# MersenneTwisterGeneratorTest: Testfall för Mersenne Twister Generator

Mersenne Twister Generator är en komponent som används för att generera slumpmässiga heltal och flyttal inom PRNG Toolkit. Dessa testfall syftar till att verifiera Mersenne Twister Generator-komponentens funktioner.

## Testmetoder

1. `testGenerateNextInt`: Testar generering av slumpmässigt heltal. Validerar att det genererade heltalet är inom det förväntade intervallet (från `Integer.MIN_VALUE` till `Integer.MAX_VALUE`).

2. `testGenerateNextDouble`: Testar generering av slumpmässigt flyttal. Validerar att det genererade flyttalet är inom det förväntade intervallet (från 0.0 till 1.0).

3. `testGenerateNextIntInRange`: Testar generering av slumpmässigt heltal inom ett givet intervall. Validerar att det genererade heltalet är inom det angivna intervallet.

4. `testGenerateNextDoubleInRange`: Testar generering av slumpmässigt flyttal inom ett givet intervall. Validerar att det genererade flyttalet är inom det angivna intervallet.

5. `testGenerateNextIntSequence`: Testar generering av en sekvens av slumpmässiga heltal. Validerar att antalet genererade heltal är korrekt.

6. `testGenerateNextDoubleSequence`: Testar generering av en sekvens av slumpmässiga flyttal. Validerar att antalet genererade flyttal är korrekt.

Dessa testfall säkerställer att Mersenne Twister Generator-komponenten fungerar korrekt och kan generera slumpmässiga tal inom olika intervall inom PRNG Toolkit.

# StandardRandomGeneratorTest: Testfall för Standard Random Generator

Standard Random Generator är en komponent som används för att generera slumpmässiga heltal och flyttal inom PRNG Toolkit. Dessa testfall syftar till att verifiera Standard Random Generator-komponentens funktioner.

## Testmetoder

1. `testGenerateNextInt`: Testar generering av slumpmässigt heltal. Validerar att det genererade heltalet är inom det förväntade intervallet (från `Integer.MIN_VALUE` till `Integer.MAX_VALUE`).

2. `testGenerateNextDouble`: Testar generering av slumpmässigt flyttal. Validerar att det genererade flyttalet är inom det förväntade intervallet (från 0.0 till 1.0).

3. `testGenerateNextIntInRange`: Testar generering av slumpmässigt heltal inom ett givet intervall. Validerar att det genererade heltalet är inom det angivna intervallet.

4. `testGenerateNextDoubleInRange`: Testar generering av slumpmässigt flyttal inom ett givet intervall. Validerar att det genererade flyttalet är inom det angivna intervallet.

5. `testGenerateNextIntSequence`: Testar generering av en sekvens av slumpmässiga heltal. Validerar att antalet genererade heltal är korrekt.

6. `testGenerateNextDoubleSequence`: Testar generering av en sekvens av slumpmässiga flyttal. Validerar att antalet genererade flyttal är korrekt.

Dessa testfall säkerställer att Standard Random Generator-komponenten fungerar korrekt och kan generera slumpmässiga tal inom olika intervall inom PRNG Toolkit.

## Slutsats för Lyckade Testfall

De lyckade testfallen visar att olika delar av PRNG Toolkit fungerar korrekt och levererar förväntade resultat. Dessa testfall täcker olika aspekter av programvaran, inklusive konfigurationsinställningar, generering av slumpmässiga tal och validering av parametrar. De har passerats utan problem och bekräftar programvarans funktionalitet och tillförlitlighet.

## Misslyckade Testfall

### 1. ExceptionValidatorTest > testInvalidSupportedDataType

- **Testklass:** ExceptionValidatorTest
- **Testmetod:** testInvalidSupportedDataType
- **Fil:** ExceptionValidatorTest.java
- **Rad:** 86

**Beskrivning**: Detta test misslyckades på grund av en okänd anledning. Det kräver ytterligare undersökning för att identifiera problemet och korrigera det.

### 2. UniformDistributionTest > testGetNextIntInEvenlyDivisibleRange

- **Testklass:** UniformDistributionTest
- **Testmetod:** testGetNextIntInEvenlyDivisibleRange
- **Fil:** UniformDistributionTest.java
- **Rad:** 27

**Beskrivning**: Testet misslyckades utan tydlig orsak. Felsökning är nödvändig för att lösa problemet.

### 3. MersenneTwisterGeneratorTest > testGenerateNextIntInRange

- **Testklass:** MersenneTwisterGeneratorTest
- **Testmetod:** testGenerateNextIntInRange
- **Fil:** MersenneTwisterGeneratorTest.java
- **Rad:** 34

**Beskrivning**: Testet misslyckades i denna specifika metod utan en uppenbar orsak. Det kräver en närmare granskning.

### 4. StandardRandomGeneratorTest > testGenerateNextIntInRange

- **Testklass:** StandardRandomGeneratorTest
- **Testmetod:** testGenerateNextIntInRange
- **Fil:** StandardRandomGeneratorTest.java
- **Rad:** 34

**Beskrivning**: Även detta test misslyckades på grund av en okänd anledning. Det kräver ytterligare analys.

## Åtgärder

För att åtgärda de misslyckade testfallen bör följande steg vidtas:

1. Granska koden för varje misslyckat testfall och använd lämplig felsökningsmetodik för att identifiera problemen.

2. Korrigera kodfel och implementera eventuella nödvändiga ändringar i de relevanta testfallen.

3. Kör testerna igen efter korrigeringarna för att säkerställa att de nu passerar.

4. Uppdatera testrapporten med resultaten efter att testerna har kört igen.

## Slutsats för Misslyckade Testfall

Misslyckade testfall är en viktig del av utvecklingsprocessen, och de hjälper till att identifiera och åtgärda problem i koden. Genom att noggrant analysera och rätta till dessa misslyckade testfall kan kvaliteten och tillförlitligheten i koden förbättras.
