--
-- PokéAPI.
-- Prepared SQL queries for 'BerryDetail' definition.
--


--
-- SELECT template for table `BerryDetail`
--
SELECT `id`, `name`, `growth_time`, `max_harvest`, `natural_gift_power`, `size`, `smoothness`, `soil_dryness`, `firmness`, `flavors`, `item`, `natural_gift_type` FROM `BerryDetail` WHERE 1;

--
-- INSERT template for table `BerryDetail`
--
INSERT INTO `BerryDetail`(`id`, `name`, `growth_time`, `max_harvest`, `natural_gift_power`, `size`, `smoothness`, `soil_dryness`, `firmness`, `flavors`, `item`, `natural_gift_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BerryDetail`
--
UPDATE `BerryDetail` SET `id` = ?, `name` = ?, `growth_time` = ?, `max_harvest` = ?, `natural_gift_power` = ?, `size` = ?, `smoothness` = ?, `soil_dryness` = ?, `firmness` = ?, `flavors` = ?, `item` = ?, `natural_gift_type` = ? WHERE 1;

--
-- DELETE template for table `BerryDetail`
--
DELETE FROM `BerryDetail` WHERE 0;

