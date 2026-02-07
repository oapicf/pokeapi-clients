--
-- PokéAPI.
-- Prepared SQL queries for 'StatSummary' definition.
--


--
-- SELECT template for table `StatSummary`
--
SELECT `name`, `url` FROM `StatSummary` WHERE 1;

--
-- INSERT template for table `StatSummary`
--
INSERT INTO `StatSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `StatSummary`
--
UPDATE `StatSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `StatSummary`
--
DELETE FROM `StatSummary` WHERE 0;

