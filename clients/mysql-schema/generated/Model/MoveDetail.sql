--
-- PokéAPI.
-- Prepared SQL queries for 'MoveDetail' definition.
--


--
-- SELECT template for table `MoveDetail`
--
SELECT `id`, `name`, `accuracy`, `effect_chance`, `pp`, `priority`, `power`, `contest_combos`, `contest_type`, `contest_effect`, `damage_class`, `effect_entries`, `effect_changes`, `generation`, `meta`, `names`, `past_values`, `stat_changes`, `super_contest_effect`, `target`, `type`, `machines`, `flavor_text_entries`, `learned_by_pokemon` FROM `MoveDetail` WHERE 1;

--
-- INSERT template for table `MoveDetail`
--
INSERT INTO `MoveDetail`(`id`, `name`, `accuracy`, `effect_chance`, `pp`, `priority`, `power`, `contest_combos`, `contest_type`, `contest_effect`, `damage_class`, `effect_entries`, `effect_changes`, `generation`, `meta`, `names`, `past_values`, `stat_changes`, `super_contest_effect`, `target`, `type`, `machines`, `flavor_text_entries`, `learned_by_pokemon`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MoveDetail`
--
UPDATE `MoveDetail` SET `id` = ?, `name` = ?, `accuracy` = ?, `effect_chance` = ?, `pp` = ?, `priority` = ?, `power` = ?, `contest_combos` = ?, `contest_type` = ?, `contest_effect` = ?, `damage_class` = ?, `effect_entries` = ?, `effect_changes` = ?, `generation` = ?, `meta` = ?, `names` = ?, `past_values` = ?, `stat_changes` = ?, `super_contest_effect` = ?, `target` = ?, `type` = ?, `machines` = ?, `flavor_text_entries` = ?, `learned_by_pokemon` = ? WHERE 1;

--
-- DELETE template for table `MoveDetail`
--
DELETE FROM `MoveDetail` WHERE 0;

