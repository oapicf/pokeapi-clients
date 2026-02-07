--
-- PokéAPI.
-- Prepared SQL queries for 'PokedexSummary' definition.
--


--
-- SELECT template for table `PokedexSummary`
--
SELECT `name`, `url` FROM `PokedexSummary` WHERE 1;

--
-- INSERT template for table `PokedexSummary`
--
INSERT INTO `PokedexSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `PokedexSummary`
--
UPDATE `PokedexSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PokedexSummary`
--
DELETE FROM `PokedexSummary` WHERE 0;

