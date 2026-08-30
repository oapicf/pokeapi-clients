--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonFormSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_form_summary'
--
SELECT "name", url FROM pokemon_form_summary WHERE 1=1;

--
-- INSERT template for table 'pokemon_form_summary'
--
INSERT INTO pokemon_form_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_form_summary'
--
UPDATE pokemon_form_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_form_summary'
--
DELETE FROM pokemon_form_summary WHERE 1=2;

