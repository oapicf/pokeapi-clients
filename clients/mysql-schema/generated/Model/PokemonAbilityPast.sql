--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonAbilityPast' definition.
--


--
-- SELECT template for table `PokemonAbilityPast`
--
SELECT `is_hidden`, `slot`, `ability` FROM `PokemonAbilityPast` WHERE 1;

--
-- INSERT template for table `PokemonAbilityPast`
--
INSERT INTO `PokemonAbilityPast`(`is_hidden`, `slot`, `ability`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PokemonAbilityPast`
--
UPDATE `PokemonAbilityPast` SET `is_hidden` = ?, `slot` = ?, `ability` = ? WHERE 1;

--
-- DELETE template for table `PokemonAbilityPast`
--
DELETE FROM `PokemonAbilityPast` WHERE 0;

