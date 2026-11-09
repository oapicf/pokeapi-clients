--
-- PokéAPI.
-- Prepared SQL queries for 'PalParkEncounter' definition.
--


--
-- SELECT template for table `PalParkEncounter`
--
SELECT `base_score`, `rate`, `pokemon_species` FROM `PalParkEncounter` WHERE 1;

--
-- INSERT template for table `PalParkEncounter`
--
INSERT INTO `PalParkEncounter`(`base_score`, `rate`, `pokemon_species`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PalParkEncounter`
--
UPDATE `PalParkEncounter` SET `base_score` = ?, `rate` = ?, `pokemon_species` = ? WHERE 1;

--
-- DELETE template for table `PalParkEncounter`
--
DELETE FROM `PalParkEncounter` WHERE 0;

