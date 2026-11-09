--
-- PokéAPI.
-- Prepared SQL queries for 'AbilityPokemonDetail' definition.
--


--
-- SELECT template for table `AbilityPokemonDetail`
--
SELECT `is_hidden`, `slot`, `pokemon` FROM `AbilityPokemonDetail` WHERE 1;

--
-- INSERT template for table `AbilityPokemonDetail`
--
INSERT INTO `AbilityPokemonDetail`(`is_hidden`, `slot`, `pokemon`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AbilityPokemonDetail`
--
UPDATE `AbilityPokemonDetail` SET `is_hidden` = ?, `slot` = ?, `pokemon` = ? WHERE 1;

--
-- DELETE template for table `AbilityPokemonDetail`
--
DELETE FROM `AbilityPokemonDetail` WHERE 0;

