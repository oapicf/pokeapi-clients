--
-- PokéAPI.
-- Prepared SQL queries for 'EggGroupSummary' definition.
--


--
-- SELECT template for table `EggGroupSummary`
--
SELECT `name`, `url` FROM `EggGroupSummary` WHERE 1;

--
-- INSERT template for table `EggGroupSummary`
--
INSERT INTO `EggGroupSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `EggGroupSummary`
--
UPDATE `EggGroupSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `EggGroupSummary`
--
DELETE FROM `EggGroupSummary` WHERE 0;

