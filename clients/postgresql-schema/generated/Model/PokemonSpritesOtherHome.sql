--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpritesOtherHome' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_sprites_other_home'
--
SELECT front_default, front_female, front_shiny, front_shiny_female FROM pokemon_sprites_other_home WHERE 1=1;

--
-- INSERT template for table 'pokemon_sprites_other_home'
--
INSERT INTO pokemon_sprites_other_home (front_default, front_female, front_shiny, front_shiny_female) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_sprites_other_home'
--
UPDATE pokemon_sprites_other_home SET front_default = ?, front_female = ?, front_shiny = ?, front_shiny_female = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_sprites_other_home'
--
DELETE FROM pokemon_sprites_other_home WHERE 1=2;

