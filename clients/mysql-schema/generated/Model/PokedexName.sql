--
-- PokéAPI.
-- Prepared SQL queries for 'PokedexName' definition.
--


--
-- SELECT template for table `PokedexName`
--
SELECT `name`, `language` FROM `PokedexName` WHERE 1;

--
-- INSERT template for table `PokedexName`
--
INSERT INTO `PokedexName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PokedexName`
--
UPDATE `PokedexName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PokedexName`
--
DELETE FROM `PokedexName` WHERE 0;

