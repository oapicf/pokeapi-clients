--
-- "PokéAPI"
-- Prepared SQL queries for 'AbilityDetail_pokemon_inner_pokemon' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ability_detail_pokemon_inner_pokemon'
--
SELECT "name", url FROM ability_detail_pokemon_inner_pokemon WHERE 1=1;

--
-- INSERT template for table 'ability_detail_pokemon_inner_pokemon'
--
INSERT INTO ability_detail_pokemon_inner_pokemon ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'ability_detail_pokemon_inner_pokemon'
--
UPDATE ability_detail_pokemon_inner_pokemon SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'ability_detail_pokemon_inner_pokemon'
--
DELETE FROM ability_detail_pokemon_inner_pokemon WHERE 1=2;

