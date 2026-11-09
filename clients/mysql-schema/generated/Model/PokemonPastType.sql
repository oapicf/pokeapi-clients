--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonPastType' definition.
--


--
-- SELECT template for table `PokemonPastType`
--
SELECT `generation`, `types` FROM `PokemonPastType` WHERE 1;

--
-- INSERT template for table `PokemonPastType`
--
INSERT INTO `PokemonPastType`(`generation`, `types`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonPastType`
--
UPDATE `PokemonPastType` SET `generation` = ?, `types` = ? WHERE 1;

--
-- DELETE template for table `PokemonPastType`
--
DELETE FROM `PokemonPastType` WHERE 0;

