--
-- PokéAPI.
-- Prepared SQL queries for 'PokedexDescription' definition.
--


--
-- SELECT template for table `PokedexDescription`
--
SELECT `description`, `language` FROM `PokedexDescription` WHERE 1;

--
-- INSERT template for table `PokedexDescription`
--
INSERT INTO `PokedexDescription`(`description`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PokedexDescription`
--
UPDATE `PokedexDescription` SET `description` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PokedexDescription`
--
DELETE FROM `PokedexDescription` WHERE 0;

