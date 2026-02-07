--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonDetail_past_types_inner' definition.
--


--
-- SELECT template for table `PokemonDetail_past_types_inner`
--
SELECT `generation`, `types` FROM `PokemonDetail_past_types_inner` WHERE 1;

--
-- INSERT template for table `PokemonDetail_past_types_inner`
--
INSERT INTO `PokemonDetail_past_types_inner`(`generation`, `types`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonDetail_past_types_inner`
--
UPDATE `PokemonDetail_past_types_inner` SET `generation` = ?, `types` = ? WHERE 1;

--
-- DELETE template for table `PokemonDetail_past_types_inner`
--
DELETE FROM `PokemonDetail_past_types_inner` WHERE 0;

