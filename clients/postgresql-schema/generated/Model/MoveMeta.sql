--
-- "PokéAPI"
-- Prepared SQL queries for 'MoveMeta' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'move_meta'
--
SELECT ailment, category, min_hits, max_hits, min_turns, max_turns, drain, healing, crit_rate, ailment_chance, flinch_chance, stat_chance FROM move_meta WHERE 1=1;

--
-- INSERT template for table 'move_meta'
--
INSERT INTO move_meta (ailment, category, min_hits, max_hits, min_turns, max_turns, drain, healing, crit_rate, ailment_chance, flinch_chance, stat_chance) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'move_meta'
--
UPDATE move_meta SET ailment = ?, category = ?, min_hits = ?, max_hits = ?, min_turns = ?, max_turns = ?, drain = ?, healing = ?, crit_rate = ?, ailment_chance = ?, flinch_chance = ?, stat_chance = ? WHERE 1=2;

--
-- DELETE template for table 'move_meta'
--
DELETE FROM move_meta WHERE 1=2;

