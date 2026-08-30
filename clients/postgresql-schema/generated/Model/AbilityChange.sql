--
-- "PokéAPI"
-- Prepared SQL queries for 'AbilityChange' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ability_change'
--
SELECT version_group, effect_entries FROM ability_change WHERE 1=1;

--
-- INSERT template for table 'ability_change'
--
INSERT INTO ability_change (version_group, effect_entries) VALUES (?, ?);

--
-- UPDATE template for table 'ability_change'
--
UPDATE ability_change SET version_group = ?, effect_entries = ? WHERE 1=2;

--
-- DELETE template for table 'ability_change'
--
DELETE FROM ability_change WHERE 1=2;

