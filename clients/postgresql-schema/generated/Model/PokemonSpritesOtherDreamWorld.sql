--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpritesOtherDreamWorld' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_sprites_other_dream_world'
--
SELECT front_default, front_female FROM pokemon_sprites_other_dream_world WHERE 1=1;

--
-- INSERT template for table 'pokemon_sprites_other_dream_world'
--
INSERT INTO pokemon_sprites_other_dream_world (front_default, front_female) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_sprites_other_dream_world'
--
UPDATE pokemon_sprites_other_dream_world SET front_default = ?, front_female = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_sprites_other_dream_world'
--
DELETE FROM pokemon_sprites_other_dream_world WHERE 1=2;

