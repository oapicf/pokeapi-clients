--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonFormDetail_form_names_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_form_detail_form_names_inner'
--
SELECT "language", "name" FROM pokemon_form_detail_form_names_inner WHERE 1=1;

--
-- INSERT template for table 'pokemon_form_detail_form_names_inner'
--
INSERT INTO pokemon_form_detail_form_names_inner ("language", "name") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_form_detail_form_names_inner'
--
UPDATE pokemon_form_detail_form_names_inner SET "language" = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_form_detail_form_names_inner'
--
DELETE FROM pokemon_form_detail_form_names_inner WHERE 1=2;

