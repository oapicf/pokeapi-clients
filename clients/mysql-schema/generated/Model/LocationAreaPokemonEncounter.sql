--
-- PokéAPI.
-- Prepared SQL queries for 'LocationAreaPokemonEncounter' definition.
--


--
-- SELECT template for table `LocationAreaPokemonEncounter`
--
SELECT `pokemon`, `version_details` FROM `LocationAreaPokemonEncounter` WHERE 1;

--
-- INSERT template for table `LocationAreaPokemonEncounter`
--
INSERT INTO `LocationAreaPokemonEncounter`(`pokemon`, `version_details`) VALUES (?, ?);

--
-- UPDATE template for table `LocationAreaPokemonEncounter`
--
UPDATE `LocationAreaPokemonEncounter` SET `pokemon` = ?, `version_details` = ? WHERE 1;

--
-- DELETE template for table `LocationAreaPokemonEncounter`
--
DELETE FROM `LocationAreaPokemonEncounter` WHERE 0;

