--
-- PokéAPI.
-- Prepared SQL queries for 'EncounterConditionDetail' definition.
--


--
-- SELECT template for table `EncounterConditionDetail`
--
SELECT `id`, `name`, `values`, `names` FROM `EncounterConditionDetail` WHERE 1;

--
-- INSERT template for table `EncounterConditionDetail`
--
INSERT INTO `EncounterConditionDetail`(`id`, `name`, `values`, `names`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `EncounterConditionDetail`
--
UPDATE `EncounterConditionDetail` SET `id` = ?, `name` = ?, `values` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `EncounterConditionDetail`
--
DELETE FROM `EncounterConditionDetail` WHERE 0;

