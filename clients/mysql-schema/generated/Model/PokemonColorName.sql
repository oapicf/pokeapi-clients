--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonColorName' definition.
--


--
-- SELECT template for table `PokemonColorName`
--
SELECT `name`, `language` FROM `PokemonColorName` WHERE 1;

--
-- INSERT template for table `PokemonColorName`
--
INSERT INTO `PokemonColorName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonColorName`
--
UPDATE `PokemonColorName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PokemonColorName`
--
DELETE FROM `PokemonColorName` WHERE 0;

