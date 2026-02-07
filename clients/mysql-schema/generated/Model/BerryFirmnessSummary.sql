--
-- PokéAPI.
-- Prepared SQL queries for 'BerryFirmnessSummary' definition.
--


--
-- SELECT template for table `BerryFirmnessSummary`
--
SELECT `name`, `url` FROM `BerryFirmnessSummary` WHERE 1;

--
-- INSERT template for table `BerryFirmnessSummary`
--
INSERT INTO `BerryFirmnessSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `BerryFirmnessSummary`
--
UPDATE `BerryFirmnessSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `BerryFirmnessSummary`
--
DELETE FROM `BerryFirmnessSummary` WHERE 0;

