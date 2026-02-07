--
-- PokéAPI.
-- Prepared SQL queries for 'AbilityDetail_pokemon_inner' definition.
--


--
-- SELECT template for table `AbilityDetail_pokemon_inner`
--
SELECT `is_hidden`, `slot`, `pokemon` FROM `AbilityDetail_pokemon_inner` WHERE 1;

--
-- INSERT template for table `AbilityDetail_pokemon_inner`
--
INSERT INTO `AbilityDetail_pokemon_inner`(`is_hidden`, `slot`, `pokemon`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AbilityDetail_pokemon_inner`
--
UPDATE `AbilityDetail_pokemon_inner` SET `is_hidden` = ?, `slot` = ?, `pokemon` = ? WHERE 1;

--
-- DELETE template for table `AbilityDetail_pokemon_inner`
--
DELETE FROM `AbilityDetail_pokemon_inner` WHERE 0;

