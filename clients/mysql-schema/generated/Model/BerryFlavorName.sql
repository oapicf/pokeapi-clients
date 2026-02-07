--
-- PokéAPI.
-- Prepared SQL queries for 'BerryFlavorName' definition.
--


--
-- SELECT template for table `BerryFlavorName`
--
SELECT `name`, `language` FROM `BerryFlavorName` WHERE 1;

--
-- INSERT template for table `BerryFlavorName`
--
INSERT INTO `BerryFlavorName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `BerryFlavorName`
--
UPDATE `BerryFlavorName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `BerryFlavorName`
--
DELETE FROM `BerryFlavorName` WHERE 0;

