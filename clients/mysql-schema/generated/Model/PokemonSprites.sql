--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSprites' definition.
--


--
-- SELECT template for table `PokemonSprites`
--
SELECT `front_default`, `front_shiny`, `front_female`, `front_shiny_female`, `back_default`, `back_shiny`, `back_female`, `back_shiny_female`, `other`, `versions` FROM `PokemonSprites` WHERE 1;

--
-- INSERT template for table `PokemonSprites`
--
INSERT INTO `PokemonSprites`(`front_default`, `front_shiny`, `front_female`, `front_shiny_female`, `back_default`, `back_shiny`, `back_female`, `back_shiny_female`, `other`, `versions`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PokemonSprites`
--
UPDATE `PokemonSprites` SET `front_default` = ?, `front_shiny` = ?, `front_female` = ?, `front_shiny_female` = ?, `back_default` = ?, `back_shiny` = ?, `back_female` = ?, `back_shiny_female` = ?, `other` = ?, `versions` = ? WHERE 1;

--
-- DELETE template for table `PokemonSprites`
--
DELETE FROM `PokemonSprites` WHERE 0;

