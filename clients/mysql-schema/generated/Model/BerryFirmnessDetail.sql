--
-- PokéAPI.
-- Prepared SQL queries for 'BerryFirmnessDetail' definition.
--


--
-- SELECT template for table `BerryFirmnessDetail`
--
SELECT `id`, `name`, `berries`, `names` FROM `BerryFirmnessDetail` WHERE 1;

--
-- INSERT template for table `BerryFirmnessDetail`
--
INSERT INTO `BerryFirmnessDetail`(`id`, `name`, `berries`, `names`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `BerryFirmnessDetail`
--
UPDATE `BerryFirmnessDetail` SET `id` = ?, `name` = ?, `berries` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `BerryFirmnessDetail`
--
DELETE FROM `BerryFirmnessDetail` WHERE 0;

