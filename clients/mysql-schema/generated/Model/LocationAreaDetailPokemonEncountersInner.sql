--
-- PokéAPI.
-- Prepared SQL queries for 'LocationAreaDetail_pokemon_encounters_inner' definition.
--


--
-- SELECT template for table `LocationAreaDetail_pokemon_encounters_inner`
--
SELECT `pokemon`, `version_details` FROM `LocationAreaDetail_pokemon_encounters_inner` WHERE 1;

--
-- INSERT template for table `LocationAreaDetail_pokemon_encounters_inner`
--
INSERT INTO `LocationAreaDetail_pokemon_encounters_inner`(`pokemon`, `version_details`) VALUES (?, ?);

--
-- UPDATE template for table `LocationAreaDetail_pokemon_encounters_inner`
--
UPDATE `LocationAreaDetail_pokemon_encounters_inner` SET `pokemon` = ?, `version_details` = ? WHERE 1;

--
-- DELETE template for table `LocationAreaDetail_pokemon_encounters_inner`
--
DELETE FROM `LocationAreaDetail_pokemon_encounters_inner` WHERE 0;

