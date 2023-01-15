/*
22. Keressük az összes "A" betűvel kezdődő betegséget, amely 2018-02-08-án lett diagnosztizálva.
*/
SELECT betegseg.betegseg_neve
FROM betegseg
INNER JOIN diagnosztizal ON diagnosztizal.betegseg_neve=betegseg.betegseg_neve
WHERE betegseg.betegseg_neve LIKE 'A%'
AND diagnosztizal.datum='2018-02-08'

/*
23. Írjunk lekérdezést, mely visszaadja, hogy Szonja milyen gyógyszerre érzékeny.
*/
SELECT beteg.taj, erzekeny.gyogyszer_neve
FROM beteg
INNER JOIN erzekeny ON erzekeny.taj=beteg.taj
WHERE beteg.nev='Szonja'

/*
24. Készítsünk statisztikát, hogy hány betegnek van Sorelvonas betegsége és csoportosítsuk az eredményt diagnosztizálás napja szerint. 
Ezen felül csak azokra a betegségekre vagyunk kíváncsiak, amik legalább kétszer előfordultak.
A diagnosztizálást dátumát jelenítsük meg "Előfordulás (db)" névvel.
*/
SELECT COUNT(betegseg.betegseg_neve) AS "Előfordulás (db)", diagnosztizal.datum
FROM betegseg
INNER JOIN diagnosztizal ON diagnosztizal.betegseg_neve=betegseg.betegseg_neve
WHERE betegseg.betegseg_neve='Sorelvonas'
GROUP BY diagnosztizal.datum
HAVING COUNT(betegseg.betegseg_neve) > 1
