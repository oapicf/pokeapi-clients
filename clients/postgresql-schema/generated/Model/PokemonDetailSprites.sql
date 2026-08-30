--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonDetail_sprites' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_detail_sprites'
--
SELECT front_default FROM pokemon_detail_sprites WHERE 1=1;

--
-- INSERT template for table 'pokemon_detail_sprites'
--
INSERT INTO pokemon_detail_sprites (front_default) VALUES (?);

--
-- UPDATE template for table 'pokemon_detail_sprites'
--
UPDATE pokemon_detail_sprites SET front_default = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_detail_sprites'
--
DELETE FROM pokemon_detail_sprites WHERE 1=2;

