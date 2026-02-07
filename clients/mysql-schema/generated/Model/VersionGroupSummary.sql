--
-- PokéAPI.
-- Prepared SQL queries for 'VersionGroupSummary' definition.
--


--
-- SELECT template for table `VersionGroupSummary`
--
SELECT `name`, `url` FROM `VersionGroupSummary` WHERE 1;

--
-- INSERT template for table `VersionGroupSummary`
--
INSERT INTO `VersionGroupSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `VersionGroupSummary`
--
UPDATE `VersionGroupSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `VersionGroupSummary`
--
DELETE FROM `VersionGroupSummary` WHERE 0;

