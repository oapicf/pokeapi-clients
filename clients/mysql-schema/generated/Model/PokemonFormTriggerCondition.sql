--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonFormTriggerCondition' definition.
--


--
-- SELECT template for table `PokemonFormTriggerCondition`
--
SELECT `trigger`, `name`, `url`, `base_form` FROM `PokemonFormTriggerCondition` WHERE 1;

--
-- INSERT template for table `PokemonFormTriggerCondition`
--
INSERT INTO `PokemonFormTriggerCondition`(`trigger`, `name`, `url`, `base_form`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PokemonFormTriggerCondition`
--
UPDATE `PokemonFormTriggerCondition` SET `trigger` = ?, `name` = ?, `url` = ?, `base_form` = ? WHERE 1;

--
-- DELETE template for table `PokemonFormTriggerCondition`
--
DELETE FROM `PokemonFormTriggerCondition` WHERE 0;

