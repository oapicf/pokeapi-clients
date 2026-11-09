--
-- PokéAPI.
-- Prepared SQL queries for 'BerryFlavorBerryMap' definition.
--


--
-- SELECT template for table `BerryFlavorBerryMap`
--
SELECT `potency`, `berry` FROM `BerryFlavorBerryMap` WHERE 1;

--
-- INSERT template for table `BerryFlavorBerryMap`
--
INSERT INTO `BerryFlavorBerryMap`(`potency`, `berry`) VALUES (?, ?);

--
-- UPDATE template for table `BerryFlavorBerryMap`
--
UPDATE `BerryFlavorBerryMap` SET `potency` = ?, `berry` = ? WHERE 1;

--
-- DELETE template for table `BerryFlavorBerryMap`
--
DELETE FROM `BerryFlavorBerryMap` WHERE 0;

