--
-- PokéAPI.
-- Prepared SQL queries for 'BerryFlavorDetail_berries_inner' definition.
--


--
-- SELECT template for table `BerryFlavorDetail_berries_inner`
--
SELECT `potency`, `berry` FROM `BerryFlavorDetail_berries_inner` WHERE 1;

--
-- INSERT template for table `BerryFlavorDetail_berries_inner`
--
INSERT INTO `BerryFlavorDetail_berries_inner`(`potency`, `berry`) VALUES (?, ?);

--
-- UPDATE template for table `BerryFlavorDetail_berries_inner`
--
UPDATE `BerryFlavorDetail_berries_inner` SET `potency` = ?, `berry` = ? WHERE 1;

--
-- DELETE template for table `BerryFlavorDetail_berries_inner`
--
DELETE FROM `BerryFlavorDetail_berries_inner` WHERE 0;

