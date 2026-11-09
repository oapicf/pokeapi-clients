--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpritesOtherShowdown' definition.
--


--
-- SELECT template for table `PokemonSpritesOtherShowdown`
--
SELECT `front_default`, `front_female`, `front_shiny`, `front_shiny_female`, `back_default`, `back_female`, `back_shiny`, `back_shiny_female` FROM `PokemonSpritesOtherShowdown` WHERE 1;

--
-- INSERT template for table `PokemonSpritesOtherShowdown`
--
INSERT INTO `PokemonSpritesOtherShowdown`(`front_default`, `front_female`, `front_shiny`, `front_shiny_female`, `back_default`, `back_female`, `back_shiny`, `back_shiny_female`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PokemonSpritesOtherShowdown`
--
UPDATE `PokemonSpritesOtherShowdown` SET `front_default` = ?, `front_female` = ?, `front_shiny` = ?, `front_shiny_female` = ?, `back_default` = ?, `back_female` = ?, `back_shiny` = ?, `back_shiny_female` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpritesOtherShowdown`
--
DELETE FROM `PokemonSpritesOtherShowdown` WHERE 0;

