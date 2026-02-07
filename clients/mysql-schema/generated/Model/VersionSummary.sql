--
-- PokéAPI.
-- Prepared SQL queries for 'VersionSummary' definition.
--


--
-- SELECT template for table `VersionSummary`
--
SELECT `name`, `url` FROM `VersionSummary` WHERE 1;

--
-- INSERT template for table `VersionSummary`
--
INSERT INTO `VersionSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `VersionSummary`
--
UPDATE `VersionSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `VersionSummary`
--
DELETE FROM `VersionSummary` WHERE 0;

