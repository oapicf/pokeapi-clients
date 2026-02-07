--
-- PokéAPI.
-- Prepared SQL queries for 'GenderSummary' definition.
--


--
-- SELECT template for table `GenderSummary`
--
SELECT `name`, `url` FROM `GenderSummary` WHERE 1;

--
-- INSERT template for table `GenderSummary`
--
INSERT INTO `GenderSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `GenderSummary`
--
UPDATE `GenderSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `GenderSummary`
--
DELETE FROM `GenderSummary` WHERE 0;

