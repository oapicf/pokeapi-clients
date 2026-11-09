--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpritesOther' definition.
--


--
-- SELECT template for table `PokemonSpritesOther`
--
SELECT `dream_world`, `home`, `showdown`, `official-artwork` FROM `PokemonSpritesOther` WHERE 1;

--
-- INSERT template for table `PokemonSpritesOther`
--
INSERT INTO `PokemonSpritesOther`(`dream_world`, `home`, `showdown`, `official-artwork`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PokemonSpritesOther`
--
UPDATE `PokemonSpritesOther` SET `dream_world` = ?, `home` = ?, `showdown` = ?, `official-artwork` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpritesOther`
--
DELETE FROM `PokemonSpritesOther` WHERE 0;

