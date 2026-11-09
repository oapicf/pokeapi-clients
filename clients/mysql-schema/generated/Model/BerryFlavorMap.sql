--
-- PokéAPI.
-- Prepared SQL queries for 'BerryFlavorMap' definition.
--


--
-- SELECT template for table `BerryFlavorMap`
--
SELECT `potency`, `flavor` FROM `BerryFlavorMap` WHERE 1;

--
-- INSERT template for table `BerryFlavorMap`
--
INSERT INTO `BerryFlavorMap`(`potency`, `flavor`) VALUES (?, ?);

--
-- UPDATE template for table `BerryFlavorMap`
--
UPDATE `BerryFlavorMap` SET `potency` = ?, `flavor` = ? WHERE 1;

--
-- DELETE template for table `BerryFlavorMap`
--
DELETE FROM `BerryFlavorMap` WHERE 0;

