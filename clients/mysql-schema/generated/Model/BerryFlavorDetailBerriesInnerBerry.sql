--
-- PokéAPI.
-- Prepared SQL queries for 'BerryFlavorDetail_berries_inner_berry' definition.
--


--
-- SELECT template for table `BerryFlavorDetail_berries_inner_berry`
--
SELECT `name`, `url` FROM `BerryFlavorDetail_berries_inner_berry` WHERE 1;

--
-- INSERT template for table `BerryFlavorDetail_berries_inner_berry`
--
INSERT INTO `BerryFlavorDetail_berries_inner_berry`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `BerryFlavorDetail_berries_inner_berry`
--
UPDATE `BerryFlavorDetail_berries_inner_berry` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `BerryFlavorDetail_berries_inner_berry`
--
DELETE FROM `BerryFlavorDetail_berries_inner_berry` WHERE 0;

