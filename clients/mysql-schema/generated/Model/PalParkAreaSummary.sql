--
-- PokéAPI.
-- Prepared SQL queries for 'PalParkAreaSummary' definition.
--


--
-- SELECT template for table `PalParkAreaSummary`
--
SELECT `name`, `url` FROM `PalParkAreaSummary` WHERE 1;

--
-- INSERT template for table `PalParkAreaSummary`
--
INSERT INTO `PalParkAreaSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `PalParkAreaSummary`
--
UPDATE `PalParkAreaSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PalParkAreaSummary`
--
DELETE FROM `PalParkAreaSummary` WHERE 0;

