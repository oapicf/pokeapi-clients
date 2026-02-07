--
-- PokéAPI.
-- Prepared SQL queries for 'EncounterMethodDetail' definition.
--


--
-- SELECT template for table `EncounterMethodDetail`
--
SELECT `id`, `name`, `order`, `names` FROM `EncounterMethodDetail` WHERE 1;

--
-- INSERT template for table `EncounterMethodDetail`
--
INSERT INTO `EncounterMethodDetail`(`id`, `name`, `order`, `names`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `EncounterMethodDetail`
--
UPDATE `EncounterMethodDetail` SET `id` = ?, `name` = ?, `order` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `EncounterMethodDetail`
--
DELETE FROM `EncounterMethodDetail` WHERE 0;

