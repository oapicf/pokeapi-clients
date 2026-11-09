--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonFormSprites' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_form_sprites'
--
SELECT front_default, front_shiny, front_female, front_shiny_female, back_default, back_shiny, back_female, back_shiny_female, other, versions FROM pokemon_form_sprites WHERE 1=1;

--
-- INSERT template for table 'pokemon_form_sprites'
--
INSERT INTO pokemon_form_sprites (front_default, front_shiny, front_female, front_shiny_female, back_default, back_shiny, back_female, back_shiny_female, other, versions) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_form_sprites'
--
UPDATE pokemon_form_sprites SET front_default = ?, front_shiny = ?, front_female = ?, front_shiny_female = ?, back_default = ?, back_shiny = ?, back_female = ?, back_shiny_female = ?, other = ?, versions = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_form_sprites'
--
DELETE FROM pokemon_form_sprites WHERE 1=2;

