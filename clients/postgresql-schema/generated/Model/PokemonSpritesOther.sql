--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpritesOther' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_sprites_other'
--
SELECT dream_world, home, showdown, official_artwork FROM pokemon_sprites_other WHERE 1=1;

--
-- INSERT template for table 'pokemon_sprites_other'
--
INSERT INTO pokemon_sprites_other (dream_world, home, showdown, official_artwork) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_sprites_other'
--
UPDATE pokemon_sprites_other SET dream_world = ?, home = ?, showdown = ?, official_artwork = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_sprites_other'
--
DELETE FROM pokemon_sprites_other WHERE 1=2;

