--
-- PokéAPI.
-- Prepared SQL queries for 'TypeDetail_pokemon_inner_pokemon' definition.
--


--
-- SELECT template for table `TypeDetail_pokemon_inner_pokemon`
--
SELECT `name`, `url` FROM `TypeDetail_pokemon_inner_pokemon` WHERE 1;

--
-- INSERT template for table `TypeDetail_pokemon_inner_pokemon`
--
INSERT INTO `TypeDetail_pokemon_inner_pokemon`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `TypeDetail_pokemon_inner_pokemon`
--
UPDATE `TypeDetail_pokemon_inner_pokemon` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `TypeDetail_pokemon_inner_pokemon`
--
DELETE FROM `TypeDetail_pokemon_inner_pokemon` WHERE 0;

