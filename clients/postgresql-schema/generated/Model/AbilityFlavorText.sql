--
-- "PokéAPI"
-- Prepared SQL queries for 'AbilityFlavorText' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ability_flavor_text'
--
SELECT flavor_text, "language", version_group FROM ability_flavor_text WHERE 1=1;

--
-- INSERT template for table 'ability_flavor_text'
--
INSERT INTO ability_flavor_text (flavor_text, "language", version_group) VALUES (?, ?, ?);

--
-- UPDATE template for table 'ability_flavor_text'
--
UPDATE ability_flavor_text SET flavor_text = ?, "language" = ?, version_group = ? WHERE 1=2;

--
-- DELETE template for table 'ability_flavor_text'
--
DELETE FROM ability_flavor_text WHERE 1=2;

