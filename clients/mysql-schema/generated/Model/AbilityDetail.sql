--
-- PokéAPI.
-- Prepared SQL queries for 'AbilityDetail' definition.
--


--
-- SELECT template for table `AbilityDetail`
--
SELECT `id`, `name`, `is_main_series`, `generation`, `names`, `effect_entries`, `effect_changes`, `flavor_text_entries`, `pokemon` FROM `AbilityDetail` WHERE 1;

--
-- INSERT template for table `AbilityDetail`
--
INSERT INTO `AbilityDetail`(`id`, `name`, `is_main_series`, `generation`, `names`, `effect_entries`, `effect_changes`, `flavor_text_entries`, `pokemon`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AbilityDetail`
--
UPDATE `AbilityDetail` SET `id` = ?, `name` = ?, `is_main_series` = ?, `generation` = ?, `names` = ?, `effect_entries` = ?, `effect_changes` = ?, `flavor_text_entries` = ?, `pokemon` = ? WHERE 1;

--
-- DELETE template for table `AbilityDetail`
--
DELETE FROM `AbilityDetail` WHERE 0;

