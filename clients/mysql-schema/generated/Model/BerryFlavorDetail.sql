--
-- PokéAPI.
-- Prepared SQL queries for 'BerryFlavorDetail' definition.
--


--
-- SELECT template for table `BerryFlavorDetail`
--
SELECT `id`, `name`, `berries`, `contest_type`, `names` FROM `BerryFlavorDetail` WHERE 1;

--
-- INSERT template for table `BerryFlavorDetail`
--
INSERT INTO `BerryFlavorDetail`(`id`, `name`, `berries`, `contest_type`, `names`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `BerryFlavorDetail`
--
UPDATE `BerryFlavorDetail` SET `id` = ?, `name` = ?, `berries` = ?, `contest_type` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `BerryFlavorDetail`
--
DELETE FROM `BerryFlavorDetail` WHERE 0;

