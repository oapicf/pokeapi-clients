--
-- PokéAPI.
-- Prepared SQL queries for 'ItemMachine' definition.
--


--
-- SELECT template for table `ItemMachine`
--
SELECT `machine`, `version_group` FROM `ItemMachine` WHERE 1;

--
-- INSERT template for table `ItemMachine`
--
INSERT INTO `ItemMachine`(`machine`, `version_group`) VALUES (?, ?);

--
-- UPDATE template for table `ItemMachine`
--
UPDATE `ItemMachine` SET `machine` = ?, `version_group` = ? WHERE 1;

--
-- DELETE template for table `ItemMachine`
--
DELETE FROM `ItemMachine` WHERE 0;

