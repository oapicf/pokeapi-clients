--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpritesOtherHome' definition.
--


--
-- SELECT template for table `PokemonSpritesOtherHome`
--
SELECT `front_default`, `front_female`, `front_shiny`, `front_shiny_female` FROM `PokemonSpritesOtherHome` WHERE 1;

--
-- INSERT template for table `PokemonSpritesOtherHome`
--
INSERT INTO `PokemonSpritesOtherHome`(`front_default`, `front_female`, `front_shiny`, `front_shiny_female`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PokemonSpritesOtherHome`
--
UPDATE `PokemonSpritesOtherHome` SET `front_default` = ?, `front_female` = ?, `front_shiny` = ?, `front_shiny_female` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpritesOtherHome`
--
DELETE FROM `PokemonSpritesOtherHome` WHERE 0;

