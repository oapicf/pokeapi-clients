--
-- PokéAPI.
-- Prepared SQL queries for 'LocationSummary' definition.
--


--
-- SELECT template for table `LocationSummary`
--
SELECT `name`, `url` FROM `LocationSummary` WHERE 1;

--
-- INSERT template for table `LocationSummary`
--
INSERT INTO `LocationSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `LocationSummary`
--
UPDATE `LocationSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `LocationSummary`
--
DELETE FROM `LocationSummary` WHERE 0;

