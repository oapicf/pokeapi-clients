--
-- PokéAPI.
-- Prepared SQL queries for 'PokeathlonStatSummary' definition.
--


--
-- SELECT template for table `PokeathlonStatSummary`
--
SELECT `name`, `url` FROM `PokeathlonStatSummary` WHERE 1;

--
-- INSERT template for table `PokeathlonStatSummary`
--
INSERT INTO `PokeathlonStatSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `PokeathlonStatSummary`
--
UPDATE `PokeathlonStatSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PokeathlonStatSummary`
--
DELETE FROM `PokeathlonStatSummary` WHERE 0;

