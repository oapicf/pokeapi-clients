--
-- PokéAPI.
-- Prepared SQL queries for 'TypeDetail_pokemon_inner' definition.
--


--
-- SELECT template for table `TypeDetail_pokemon_inner`
--
SELECT `slot`, `pokemon` FROM `TypeDetail_pokemon_inner` WHERE 1;

--
-- INSERT template for table `TypeDetail_pokemon_inner`
--
INSERT INTO `TypeDetail_pokemon_inner`(`slot`, `pokemon`) VALUES (?, ?);

--
-- UPDATE template for table `TypeDetail_pokemon_inner`
--
UPDATE `TypeDetail_pokemon_inner` SET `slot` = ?, `pokemon` = ? WHERE 1;

--
-- DELETE template for table `TypeDetail_pokemon_inner`
--
DELETE FROM `TypeDetail_pokemon_inner` WHERE 0;

