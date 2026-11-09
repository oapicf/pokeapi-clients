--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonFormSprites' definition.
--


--
-- SELECT template for table `PokemonFormSprites`
--
SELECT `front_default`, `front_shiny`, `front_female`, `front_shiny_female`, `back_default`, `back_shiny`, `back_female`, `back_shiny_female`, `other`, `versions` FROM `PokemonFormSprites` WHERE 1;

--
-- INSERT template for table `PokemonFormSprites`
--
INSERT INTO `PokemonFormSprites`(`front_default`, `front_shiny`, `front_female`, `front_shiny_female`, `back_default`, `back_shiny`, `back_female`, `back_shiny_female`, `other`, `versions`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PokemonFormSprites`
--
UPDATE `PokemonFormSprites` SET `front_default` = ?, `front_shiny` = ?, `front_female` = ?, `front_shiny_female` = ?, `back_default` = ?, `back_shiny` = ?, `back_female` = ?, `back_shiny_female` = ?, `other` = ?, `versions` = ? WHERE 1;

--
-- DELETE template for table `PokemonFormSprites`
--
DELETE FROM `PokemonFormSprites` WHERE 0;

