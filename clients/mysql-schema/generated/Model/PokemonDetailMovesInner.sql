--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonDetail_moves_inner' definition.
--


--
-- SELECT template for table `PokemonDetail_moves_inner`
--
SELECT `move`, `version_group_details` FROM `PokemonDetail_moves_inner` WHERE 1;

--
-- INSERT template for table `PokemonDetail_moves_inner`
--
INSERT INTO `PokemonDetail_moves_inner`(`move`, `version_group_details`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonDetail_moves_inner`
--
UPDATE `PokemonDetail_moves_inner` SET `move` = ?, `version_group_details` = ? WHERE 1;

--
-- DELETE template for table `PokemonDetail_moves_inner`
--
DELETE FROM `PokemonDetail_moves_inner` WHERE 0;

