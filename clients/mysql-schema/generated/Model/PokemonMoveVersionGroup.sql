--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonMoveVersionGroup' definition.
--


--
-- SELECT template for table `PokemonMoveVersionGroup`
--
SELECT `level_learned_at`, `move_learn_method`, `version_group`, `order` FROM `PokemonMoveVersionGroup` WHERE 1;

--
-- INSERT template for table `PokemonMoveVersionGroup`
--
INSERT INTO `PokemonMoveVersionGroup`(`level_learned_at`, `move_learn_method`, `version_group`, `order`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PokemonMoveVersionGroup`
--
UPDATE `PokemonMoveVersionGroup` SET `level_learned_at` = ?, `move_learn_method` = ?, `version_group` = ?, `order` = ? WHERE 1;

--
-- DELETE template for table `PokemonMoveVersionGroup`
--
DELETE FROM `PokemonMoveVersionGroup` WHERE 0;

