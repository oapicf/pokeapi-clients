--
-- PokéAPI.
-- Prepared SQL queries for 'AbilitySummary' definition.
--


--
-- SELECT template for table `AbilitySummary`
--
SELECT `name`, `url` FROM `AbilitySummary` WHERE 1;

--
-- INSERT template for table `AbilitySummary`
--
INSERT INTO `AbilitySummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `AbilitySummary`
--
UPDATE `AbilitySummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `AbilitySummary`
--
DELETE FROM `AbilitySummary` WHERE 0;

