--
-- PokéAPI.
-- Prepared SQL queries for 'ContestTypeSummary' definition.
--


--
-- SELECT template for table `ContestTypeSummary`
--
SELECT `name`, `url` FROM `ContestTypeSummary` WHERE 1;

--
-- INSERT template for table `ContestTypeSummary`
--
INSERT INTO `ContestTypeSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `ContestTypeSummary`
--
UPDATE `ContestTypeSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `ContestTypeSummary`
--
DELETE FROM `ContestTypeSummary` WHERE 0;

