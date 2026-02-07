--
-- PokéAPI.
-- Prepared SQL queries for 'AbilityDetail_pokemon_inner_pokemon' definition.
--


--
-- SELECT template for table `AbilityDetail_pokemon_inner_pokemon`
--
SELECT `name`, `url` FROM `AbilityDetail_pokemon_inner_pokemon` WHERE 1;

--
-- INSERT template for table `AbilityDetail_pokemon_inner_pokemon`
--
INSERT INTO `AbilityDetail_pokemon_inner_pokemon`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `AbilityDetail_pokemon_inner_pokemon`
--
UPDATE `AbilityDetail_pokemon_inner_pokemon` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `AbilityDetail_pokemon_inner_pokemon`
--
DELETE FROM `AbilityDetail_pokemon_inner_pokemon` WHERE 0;

