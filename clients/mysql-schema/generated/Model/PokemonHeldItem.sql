--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonHeldItem' definition.
--


--
-- SELECT template for table `PokemonHeldItem`
--
SELECT `pokemon`, `version_details` FROM `PokemonHeldItem` WHERE 1;

--
-- INSERT template for table `PokemonHeldItem`
--
INSERT INTO `PokemonHeldItem`(`pokemon`, `version_details`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonHeldItem`
--
UPDATE `PokemonHeldItem` SET `pokemon` = ?, `version_details` = ? WHERE 1;

--
-- DELETE template for table `PokemonHeldItem`
--
DELETE FROM `PokemonHeldItem` WHERE 0;

