--
-- PokéAPI.
-- Prepared SQL queries for 'MoveSummary' definition.
--


--
-- SELECT template for table `MoveSummary`
--
SELECT `name`, `url` FROM `MoveSummary` WHERE 1;

--
-- INSERT template for table `MoveSummary`
--
INSERT INTO `MoveSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `MoveSummary`
--
UPDATE `MoveSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `MoveSummary`
--
DELETE FROM `MoveSummary` WHERE 0;

