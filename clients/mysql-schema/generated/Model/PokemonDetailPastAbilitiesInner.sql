--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonDetail_past_abilities_inner' definition.
--


--
-- SELECT template for table `PokemonDetail_past_abilities_inner`
--
SELECT `abilities`, `generation` FROM `PokemonDetail_past_abilities_inner` WHERE 1;

--
-- INSERT template for table `PokemonDetail_past_abilities_inner`
--
INSERT INTO `PokemonDetail_past_abilities_inner`(`abilities`, `generation`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonDetail_past_abilities_inner`
--
UPDATE `PokemonDetail_past_abilities_inner` SET `abilities` = ?, `generation` = ? WHERE 1;

--
-- DELETE template for table `PokemonDetail_past_abilities_inner`
--
DELETE FROM `PokemonDetail_past_abilities_inner` WHERE 0;

