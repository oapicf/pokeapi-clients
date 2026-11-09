--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpritesOtherDreamWorld' definition.
--


--
-- SELECT template for table `PokemonSpritesOtherDreamWorld`
--
SELECT `front_default`, `front_female` FROM `PokemonSpritesOtherDreamWorld` WHERE 1;

--
-- INSERT template for table `PokemonSpritesOtherDreamWorld`
--
INSERT INTO `PokemonSpritesOtherDreamWorld`(`front_default`, `front_female`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonSpritesOtherDreamWorld`
--
UPDATE `PokemonSpritesOtherDreamWorld` SET `front_default` = ?, `front_female` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpritesOtherDreamWorld`
--
DELETE FROM `PokemonSpritesOtherDreamWorld` WHERE 0;

