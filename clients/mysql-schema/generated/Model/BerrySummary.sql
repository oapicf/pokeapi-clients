--
-- PokéAPI.
-- Prepared SQL queries for 'BerrySummary' definition.
--


--
-- SELECT template for table `BerrySummary`
--
SELECT `name`, `url` FROM `BerrySummary` WHERE 1;

--
-- INSERT template for table `BerrySummary`
--
INSERT INTO `BerrySummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `BerrySummary`
--
UPDATE `BerrySummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `BerrySummary`
--
DELETE FROM `BerrySummary` WHERE 0;

