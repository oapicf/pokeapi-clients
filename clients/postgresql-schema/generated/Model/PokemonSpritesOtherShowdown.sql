--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpritesOtherShowdown' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_sprites_other_showdown'
--
SELECT front_default, front_female, front_shiny, front_shiny_female, back_default, back_female, back_shiny, back_shiny_female FROM pokemon_sprites_other_showdown WHERE 1=1;

--
-- INSERT template for table 'pokemon_sprites_other_showdown'
--
INSERT INTO pokemon_sprites_other_showdown (front_default, front_female, front_shiny, front_shiny_female, back_default, back_female, back_shiny, back_shiny_female) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_sprites_other_showdown'
--
UPDATE pokemon_sprites_other_showdown SET front_default = ?, front_female = ?, front_shiny = ?, front_shiny_female = ?, back_default = ?, back_female = ?, back_shiny = ?, back_shiny_female = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_sprites_other_showdown'
--
DELETE FROM pokemon_sprites_other_showdown WHERE 1=2;

