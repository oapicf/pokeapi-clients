--
-- PokéAPI.
-- Prepared SQL queries for 'EggGroupName' definition.
--


--
-- SELECT template for table `EggGroupName`
--
SELECT `name`, `language` FROM `EggGroupName` WHERE 1;

--
-- INSERT template for table `EggGroupName`
--
INSERT INTO `EggGroupName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `EggGroupName`
--
UPDATE `EggGroupName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `EggGroupName`
--
DELETE FROM `EggGroupName` WHERE 0;

