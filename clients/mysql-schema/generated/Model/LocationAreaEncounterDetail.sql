--
-- PokéAPI.
-- Prepared SQL queries for 'LocationAreaEncounterDetail' definition.
--


--
-- SELECT template for table `LocationAreaEncounterDetail`
--
SELECT `min_level`, `max_level`, `chance`, `method`, `condition_values`, `pokemon_details` FROM `LocationAreaEncounterDetail` WHERE 1;

--
-- INSERT template for table `LocationAreaEncounterDetail`
--
INSERT INTO `LocationAreaEncounterDetail`(`min_level`, `max_level`, `chance`, `method`, `condition_values`, `pokemon_details`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LocationAreaEncounterDetail`
--
UPDATE `LocationAreaEncounterDetail` SET `min_level` = ?, `max_level` = ?, `chance` = ?, `method` = ?, `condition_values` = ?, `pokemon_details` = ? WHERE 1;

--
-- DELETE template for table `LocationAreaEncounterDetail`
--
DELETE FROM `LocationAreaEncounterDetail` WHERE 0;

