--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpritesOtherOfficialArtwork' definition.
--


--
-- SELECT template for table `PokemonSpritesOtherOfficialArtwork`
--
SELECT `front_default`, `front_shiny`, `versions` FROM `PokemonSpritesOtherOfficialArtwork` WHERE 1;

--
-- INSERT template for table `PokemonSpritesOtherOfficialArtwork`
--
INSERT INTO `PokemonSpritesOtherOfficialArtwork`(`front_default`, `front_shiny`, `versions`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PokemonSpritesOtherOfficialArtwork`
--
UPDATE `PokemonSpritesOtherOfficialArtwork` SET `front_default` = ?, `front_shiny` = ?, `versions` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpritesOtherOfficialArtwork`
--
DELETE FROM `PokemonSpritesOtherOfficialArtwork` WHERE 0;

