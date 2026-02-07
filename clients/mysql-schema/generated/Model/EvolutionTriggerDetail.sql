--
-- PokéAPI.
-- Prepared SQL queries for 'EvolutionTriggerDetail' definition.
--


--
-- SELECT template for table `EvolutionTriggerDetail`
--
SELECT `id`, `name`, `names`, `pokemon_species` FROM `EvolutionTriggerDetail` WHERE 1;

--
-- INSERT template for table `EvolutionTriggerDetail`
--
INSERT INTO `EvolutionTriggerDetail`(`id`, `name`, `names`, `pokemon_species`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `EvolutionTriggerDetail`
--
UPDATE `EvolutionTriggerDetail` SET `id` = ?, `name` = ?, `names` = ?, `pokemon_species` = ? WHERE 1;

--
-- DELETE template for table `EvolutionTriggerDetail`
--
DELETE FROM `EvolutionTriggerDetail` WHERE 0;

