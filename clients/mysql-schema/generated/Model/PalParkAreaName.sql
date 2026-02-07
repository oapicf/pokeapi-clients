--
-- PokéAPI.
-- Prepared SQL queries for 'PalParkAreaName' definition.
--


--
-- SELECT template for table `PalParkAreaName`
--
SELECT `name`, `language` FROM `PalParkAreaName` WHERE 1;

--
-- INSERT template for table `PalParkAreaName`
--
INSERT INTO `PalParkAreaName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `PalParkAreaName`
--
UPDATE `PalParkAreaName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `PalParkAreaName`
--
DELETE FROM `PalParkAreaName` WHERE 0;

