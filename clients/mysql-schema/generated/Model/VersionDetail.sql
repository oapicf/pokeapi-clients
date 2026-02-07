--
-- PokéAPI.
-- Prepared SQL queries for 'VersionDetail' definition.
--


--
-- SELECT template for table `VersionDetail`
--
SELECT `id`, `name`, `names`, `version_group` FROM `VersionDetail` WHERE 1;

--
-- INSERT template for table `VersionDetail`
--
INSERT INTO `VersionDetail`(`id`, `name`, `names`, `version_group`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `VersionDetail`
--
UPDATE `VersionDetail` SET `id` = ?, `name` = ?, `names` = ?, `version_group` = ? WHERE 1;

--
-- DELETE template for table `VersionDetail`
--
DELETE FROM `VersionDetail` WHERE 0;

