--
-- PokéAPI.
-- Prepared SQL queries for 'VersionName' definition.
--


--
-- SELECT template for table `VersionName`
--
SELECT `name`, `language` FROM `VersionName` WHERE 1;

--
-- INSERT template for table `VersionName`
--
INSERT INTO `VersionName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `VersionName`
--
UPDATE `VersionName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `VersionName`
--
DELETE FROM `VersionName` WHERE 0;

