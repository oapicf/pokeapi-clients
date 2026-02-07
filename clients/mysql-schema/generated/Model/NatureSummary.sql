--
-- PokéAPI.
-- Prepared SQL queries for 'NatureSummary' definition.
--


--
-- SELECT template for table `NatureSummary`
--
SELECT `name`, `url` FROM `NatureSummary` WHERE 1;

--
-- INSERT template for table `NatureSummary`
--
INSERT INTO `NatureSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `NatureSummary`
--
UPDATE `NatureSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `NatureSummary`
--
DELETE FROM `NatureSummary` WHERE 0;

