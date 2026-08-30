--
-- "PokéAPI"
-- Prepared SQL queries for 'EggGroupDetail_pokemon_species_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'egg_group_detail_pokemon_species_inner'
--
SELECT "name", url FROM egg_group_detail_pokemon_species_inner WHERE 1=1;

--
-- INSERT template for table 'egg_group_detail_pokemon_species_inner'
--
INSERT INTO egg_group_detail_pokemon_species_inner ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'egg_group_detail_pokemon_species_inner'
--
UPDATE egg_group_detail_pokemon_species_inner SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'egg_group_detail_pokemon_species_inner'
--
DELETE FROM egg_group_detail_pokemon_species_inner WHERE 1=2;

