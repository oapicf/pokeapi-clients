--
-- "PokéAPI"
-- Prepared SQL queries for 'SuperContestEffectFlavorText' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'super_contest_effect_flavor_text'
--
SELECT flavor_text, "language" FROM super_contest_effect_flavor_text WHERE 1=1;

--
-- INSERT template for table 'super_contest_effect_flavor_text'
--
INSERT INTO super_contest_effect_flavor_text (flavor_text, "language") VALUES (?, ?);

--
-- UPDATE template for table 'super_contest_effect_flavor_text'
--
UPDATE super_contest_effect_flavor_text SET flavor_text = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'super_contest_effect_flavor_text'
--
DELETE FROM super_contest_effect_flavor_text WHERE 1=2;

