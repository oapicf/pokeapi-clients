--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonDetail_moves_inner_version_group_details_inner' definition.
--


--
-- SELECT template for table `PokemonDetail_moves_inner_version_group_details_inner`
--
SELECT `level_learned_at`, `move_learn_method`, `version_group` FROM `PokemonDetail_moves_inner_version_group_details_inner` WHERE 1;

--
-- INSERT template for table `PokemonDetail_moves_inner_version_group_details_inner`
--
INSERT INTO `PokemonDetail_moves_inner_version_group_details_inner`(`level_learned_at`, `move_learn_method`, `version_group`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PokemonDetail_moves_inner_version_group_details_inner`
--
UPDATE `PokemonDetail_moves_inner_version_group_details_inner` SET `level_learned_at` = ?, `move_learn_method` = ?, `version_group` = ? WHERE 1;

--
-- DELETE template for table `PokemonDetail_moves_inner_version_group_details_inner`
--
DELETE FROM `PokemonDetail_moves_inner_version_group_details_inner` WHERE 0;

