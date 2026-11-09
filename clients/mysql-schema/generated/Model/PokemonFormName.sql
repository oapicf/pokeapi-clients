--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonFormName' definition.
--


--
-- SELECT template for table `PokemonFormName`
--
SELECT `name`, `language` FROM `PokemonFormName` WHERE 1;

--
-- INSERT template for table `PokemonFormName`
--
INSERT INTO `PokemonFormName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonFormName`
--
UPDATE `PokemonFormName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PokemonFormName`
--
DELETE FROM `PokemonFormName` WHERE 0;

