--
-- PokéAPI.
-- Prepared SQL queries for 'BerryFlavorSummary' definition.
--


--
-- SELECT template for table `BerryFlavorSummary`
--
SELECT `name`, `url` FROM `BerryFlavorSummary` WHERE 1;

--
-- INSERT template for table `BerryFlavorSummary`
--
INSERT INTO `BerryFlavorSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `BerryFlavorSummary`
--
UPDATE `BerryFlavorSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `BerryFlavorSummary`
--
DELETE FROM `BerryFlavorSummary` WHERE 0;

