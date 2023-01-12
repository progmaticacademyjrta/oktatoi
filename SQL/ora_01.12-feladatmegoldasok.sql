/*
19. Készítsünk lekérdezést, mely visszaadja azon csoportok nemzetiségét és nevét, előadott táncuk nevét, akik által előadott tánc nevében van bárhol "a" betű.
*/
SELECT csoport.csoport_neve,csoport.nemzetiseg, tancol.cd_sorszam, tancol.tanc_neve FROM csoport
JOIN tancol
ON csoport.nemzetiseg=tancol.nemzetiseg
WHERE tancol.tanc_neve LIKE '%a%';

/* (NEM NÉZTÜK EGGYÜTT, DE AZÉRT FELTÖLTÖM)
20. Készítsünk lekérdezést, amely visszaadja azon csoportok nevét csökkenő sorrendben akiknek a pontszáma az átlag pontszám felett van.
*/
SELECT csoport_neve FROM csoport
WHERE pontszam >(SELECT AVG(pontszam) FROM csoport)
ORDER BY csoport_neve DESC;

/*
21. Készítsünk lekérdezést, mely visszaadja azon csoportok neveit és előadott táncuk nevét,
pontszám alapján csökkenő sorrendben, akik az előadásban olyan zenére táncoltak, aminek a műfaja nem pop vagy rock.
*/
SELECT csoport.csoport_neve,tancol.tanc_neve FROM csoport
JOIN tancol ON csoport.nemzetiseg=tancol.nemzetiseg
WHERE tancol.cd_sorszam IN (SELECT zene.cd_sorszam FROM zene WHERE zene.mufaj NOT IN ('pop','rock'))
ORDER BY csoport.pontszam DESC;
