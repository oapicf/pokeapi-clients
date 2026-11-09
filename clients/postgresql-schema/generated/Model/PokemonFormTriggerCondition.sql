--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonFormTriggerCondition' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_form_trigger_condition'
--
SELECT "trigger", "name", url, base_form FROM pokemon_form_trigger_condition WHERE 1=1;

--
-- INSERT template for table 'pokemon_form_trigger_condition'
--
INSERT INTO pokemon_form_trigger_condition ("trigger", "name", url, base_form) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_form_trigger_condition'
--
UPDATE pokemon_form_trigger_condition SET "trigger" = ?, "name" = ?, url = ?, base_form = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_form_trigger_condition'
--
DELETE FROM pokemon_form_trigger_condition WHERE 1=2;

