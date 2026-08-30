--
-- "PokéAPI"
-- Prepared SQL queries for 'NatureBattleStylePreference' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'nature_battle_style_preference'
--
SELECT low_hp_preference, high_hp_preference, move_battle_style FROM nature_battle_style_preference WHERE 1=1;

--
-- INSERT template for table 'nature_battle_style_preference'
--
INSERT INTO nature_battle_style_preference (low_hp_preference, high_hp_preference, move_battle_style) VALUES (?, ?, ?);

--
-- UPDATE template for table 'nature_battle_style_preference'
--
UPDATE nature_battle_style_preference SET low_hp_preference = ?, high_hp_preference = ?, move_battle_style = ? WHERE 1=2;

--
-- DELETE template for table 'nature_battle_style_preference'
--
DELETE FROM nature_battle_style_preference WHERE 1=2;

