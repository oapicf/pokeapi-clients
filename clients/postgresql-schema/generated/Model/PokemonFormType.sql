--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonFormType' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_form_type'
--
SELECT slot, "type" FROM pokemon_form_type WHERE 1=1;

--
-- INSERT template for table 'pokemon_form_type'
--
INSERT INTO pokemon_form_type (slot, "type") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_form_type'
--
UPDATE pokemon_form_type SET slot = ?, "type" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_form_type'
--
DELETE FROM pokemon_form_type WHERE 1=2;

