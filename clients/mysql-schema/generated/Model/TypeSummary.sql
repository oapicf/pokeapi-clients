--
-- PokéAPI.
-- Prepared SQL queries for 'TypeSummary' definition.
--


--
-- SELECT template for table `TypeSummary`
--
SELECT `name`, `url` FROM `TypeSummary` WHERE 1;

--
-- INSERT template for table `TypeSummary`
--
INSERT INTO `TypeSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `TypeSummary`
--
UPDATE `TypeSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `TypeSummary`
--
DELETE FROM `TypeSummary` WHERE 0;

