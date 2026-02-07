--
-- PokéAPI.
-- Prepared SQL queries for 'EncounterConditionValueDetail' definition.
--


--
-- SELECT template for table `EncounterConditionValueDetail`
--
SELECT `id`, `name`, `condition`, `names` FROM `EncounterConditionValueDetail` WHERE 1;

--
-- INSERT template for table `EncounterConditionValueDetail`
--
INSERT INTO `EncounterConditionValueDetail`(`id`, `name`, `condition`, `names`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `EncounterConditionValueDetail`
--
UPDATE `EncounterConditionValueDetail` SET `id` = ?, `name` = ?, `condition` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `EncounterConditionValueDetail`
--
DELETE FROM `EncounterConditionValueDetail` WHERE 0;

