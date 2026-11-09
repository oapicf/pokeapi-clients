--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonPastAbility' definition.
--


--
-- SELECT template for table `PokemonPastAbility`
--
SELECT `abilities`, `generation` FROM `PokemonPastAbility` WHERE 1;

--
-- INSERT template for table `PokemonPastAbility`
--
INSERT INTO `PokemonPastAbility`(`abilities`, `generation`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonPastAbility`
--
UPDATE `PokemonPastAbility` SET `abilities` = ?, `generation` = ? WHERE 1;

--
-- DELETE template for table `PokemonPastAbility`
--
DELETE FROM `PokemonPastAbility` WHERE 0;

