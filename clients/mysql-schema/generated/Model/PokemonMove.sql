--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonMove' definition.
--


--
-- SELECT template for table `PokemonMove`
--
SELECT `move`, `version_group_details` FROM `PokemonMove` WHERE 1;

--
-- INSERT template for table `PokemonMove`
--
INSERT INTO `PokemonMove`(`move`, `version_group_details`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonMove`
--
UPDATE `PokemonMove` SET `move` = ?, `version_group_details` = ? WHERE 1;

--
-- DELETE template for table `PokemonMove`
--
DELETE FROM `PokemonMove` WHERE 0;

