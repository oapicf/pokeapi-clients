--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_detail'
--
SELECT "id", "name", accuracy, effect_chance, pp, priority, "power", contest_combos, contest_type, contest_effect, damage_class, effect_entries, effect_changes, generation, meta, "names", past_values, stat_changes, super_contest_effect, "target", "type", machines, flavor_text_entries, learned_by_pokemon FROM move_detail WHERE 1=1;

--
-- INSERT template for table 'move_detail'
--
INSERT INTO move_detail ("id", "name", accuracy, effect_chance, pp, priority, "power", contest_combos, contest_type, contest_effect, damage_class, effect_entries, effect_changes, generation, meta, "names", past_values, stat_changes, super_contest_effect, "target", "type", machines, flavor_text_entries, learned_by_pokemon) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'move_detail'
--
UPDATE move_detail SET "id" = ?, "name" = ?, accuracy = ?, effect_chance = ?, pp = ?, priority = ?, "power" = ?, contest_combos = ?, contest_type = ?, contest_effect = ?, damage_class = ?, effect_entries = ?, effect_changes = ?, generation = ?, meta = ?, "names" = ?, past_values = ?, stat_changes = ?, super_contest_effect = ?, "target" = ?, "type" = ?, machines = ?, flavor_text_entries = ?, learned_by_pokemon = ? WHERE 1=2;

--
-- DELETE template for table 'move_detail'
--
DELETE FROM move_detail WHERE 1=2;

