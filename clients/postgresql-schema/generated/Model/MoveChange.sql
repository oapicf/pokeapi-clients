--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveChange' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_change'
--
SELECT accuracy, "power", pp, effect_chance, effect_entries, "type", version_group FROM move_change WHERE 1=1;

--
-- INSERT template for table 'move_change'
--
INSERT INTO move_change (accuracy, "power", pp, effect_chance, effect_entries, "type", version_group) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'move_change'
--
UPDATE move_change SET accuracy = ?, "power" = ?, pp = ?, effect_chance = ?, effect_entries = ?, "type" = ?, version_group = ? WHERE 1=2;

--
-- DELETE template for table 'move_change'
--
DELETE FROM move_change WHERE 1=2;

