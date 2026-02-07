--
-- PokéAPI.
-- Prepared SQL queries for 'LocationAreaSummary' definition.
--


--
-- SELECT template for table `LocationAreaSummary`
--
SELECT `name`, `url` FROM `LocationAreaSummary` WHERE 1;

--
-- INSERT template for table `LocationAreaSummary`
--
INSERT INTO `LocationAreaSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `LocationAreaSummary`
--
UPDATE `LocationAreaSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `LocationAreaSummary`
--
DELETE FROM `LocationAreaSummary` WHERE 0;

