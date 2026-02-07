--
-- PokéAPI.
-- Prepared SQL queries for 'BerryDetail_flavors_inner' definition.
--


--
-- SELECT template for table `BerryDetail_flavors_inner`
--
SELECT `potency`, `flavor` FROM `BerryDetail_flavors_inner` WHERE 1;

--
-- INSERT template for table `BerryDetail_flavors_inner`
--
INSERT INTO `BerryDetail_flavors_inner`(`potency`, `flavor`) VALUES (?, ?);

--
-- UPDATE template for table `BerryDetail_flavors_inner`
--
UPDATE `BerryDetail_flavors_inner` SET `potency` = ?, `flavor` = ? WHERE 1;

--
-- DELETE template for table `BerryDetail_flavors_inner`
--
DELETE FROM `BerryDetail_flavors_inner` WHERE 0;

