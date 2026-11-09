--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonCries' definition.
--


--
-- SELECT template for table `PokemonCries`
--
SELECT `latest`, `legacy` FROM `PokemonCries` WHERE 1;

--
-- INSERT template for table `PokemonCries`
--
INSERT INTO `PokemonCries`(`latest`, `legacy`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonCries`
--
UPDATE `PokemonCries` SET `latest` = ?, `legacy` = ? WHERE 1;

--
-- DELETE template for table `PokemonCries`
--
DELETE FROM `PokemonCries` WHERE 0;

