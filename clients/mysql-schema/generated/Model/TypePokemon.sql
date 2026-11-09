--
-- PokéAPI.
-- Prepared SQL queries for 'TypePokemon' definition.
--


--
-- SELECT template for table `TypePokemon`
--
SELECT `slot`, `pokemon` FROM `TypePokemon` WHERE 1;

--
-- INSERT template for table `TypePokemon`
--
INSERT INTO `TypePokemon`(`slot`, `pokemon`) VALUES (?, ?);

--
-- UPDATE template for table `TypePokemon`
--
UPDATE `TypePokemon` SET `slot` = ?, `pokemon` = ? WHERE 1;

--
-- DELETE template for table `TypePokemon`
--
DELETE FROM `TypePokemon` WHERE 0;

