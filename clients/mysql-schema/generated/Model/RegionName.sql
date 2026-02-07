--
-- PokéAPI.
-- Prepared SQL queries for 'RegionName' definition.
--


--
-- SELECT template for table `RegionName`
--
SELECT `name`, `language` FROM `RegionName` WHERE 1;

--
-- INSERT template for table `RegionName`
--
INSERT INTO `RegionName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `RegionName`
--
UPDATE `RegionName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `RegionName`
--
DELETE FROM `RegionName` WHERE 0;

