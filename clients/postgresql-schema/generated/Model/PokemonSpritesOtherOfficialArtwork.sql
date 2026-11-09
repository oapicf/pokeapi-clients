--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpritesOtherOfficialArtwork' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_sprites_other_official_artwork'
--
SELECT front_default, front_shiny, versions FROM pokemon_sprites_other_official_artwork WHERE 1=1;

--
-- INSERT template for table 'pokemon_sprites_other_official_artwork'
--
INSERT INTO pokemon_sprites_other_official_artwork (front_default, front_shiny, versions) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pokemon_sprites_other_official_artwork'
--
UPDATE pokemon_sprites_other_official_artwork SET front_default = ?, front_shiny = ?, versions = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_sprites_other_official_artwork'
--
DELETE FROM pokemon_sprites_other_official_artwork WHERE 1=2;

