--
-- PokéAPI.
-- Prepared SQL queries for 'BerryFirmnessName' definition.
--


--
-- SELECT template for table `BerryFirmnessName`
--
SELECT `name`, `language` FROM `BerryFirmnessName` WHERE 1;

--
-- INSERT template for table `BerryFirmnessName`
--
INSERT INTO `BerryFirmnessName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `BerryFirmnessName`
--
UPDATE `BerryFirmnessName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `BerryFirmnessName`
--
DELETE FROM `BerryFirmnessName` WHERE 0;

