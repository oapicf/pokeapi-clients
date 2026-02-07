--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonDetail_cries' definition.
--


--
-- SELECT template for table `PokemonDetail_cries`
--
SELECT `latest`, `legacy` FROM `PokemonDetail_cries` WHERE 1;

--
-- INSERT template for table `PokemonDetail_cries`
--
INSERT INTO `PokemonDetail_cries`(`latest`, `legacy`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonDetail_cries`
--
UPDATE `PokemonDetail_cries` SET `latest` = ?, `legacy` = ? WHERE 1;

--
-- DELETE template for table `PokemonDetail_cries`
--
DELETE FROM `PokemonDetail_cries` WHERE 0;

