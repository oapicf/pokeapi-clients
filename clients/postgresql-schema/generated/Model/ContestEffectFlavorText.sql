--
-- "PokéAPI"
-- Prepared SQL queries for 'ContestEffectFlavorText' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'contest_effect_flavor_text'
--
SELECT flavor_text, "language" FROM contest_effect_flavor_text WHERE 1=1;

--
-- INSERT template for table 'contest_effect_flavor_text'
--
INSERT INTO contest_effect_flavor_text (flavor_text, "language") VALUES (?, ?);

--
-- UPDATE template for table 'contest_effect_flavor_text'
--
UPDATE contest_effect_flavor_text SET flavor_text = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'contest_effect_flavor_text'
--
DELETE FROM contest_effect_flavor_text WHERE 1=2;

