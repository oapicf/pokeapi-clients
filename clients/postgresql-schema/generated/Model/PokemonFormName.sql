--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonFormName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_form_name'
--
SELECT "name", "language" FROM pokemon_form_name WHERE 1=1;

--
-- INSERT template for table 'pokemon_form_name'
--
INSERT INTO pokemon_form_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_form_name'
--
UPDATE pokemon_form_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_form_name'
--
DELETE FROM pokemon_form_name WHERE 1=2;

