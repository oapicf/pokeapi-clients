--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonAbility' definition.
--


--
-- SELECT template for table `PokemonAbility`
--
SELECT `is_hidden`, `slot`, `ability` FROM `PokemonAbility` WHERE 1;

--
-- INSERT template for table `PokemonAbility`
--
INSERT INTO `PokemonAbility`(`is_hidden`, `slot`, `ability`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PokemonAbility`
--
UPDATE `PokemonAbility` SET `is_hidden` = ?, `slot` = ?, `ability` = ? WHERE 1;

--
-- DELETE template for table `PokemonAbility`
--
DELETE FROM `PokemonAbility` WHERE 0;

