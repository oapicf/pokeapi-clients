--
-- PokéAPI.
-- Prepared SQL queries for 'StatDetail' definition.
--


--
-- SELECT template for table `StatDetail`
--
SELECT `id`, `name`, `game_index`, `is_battle_only`, `affecting_moves`, `affecting_natures`, `characteristics`, `move_damage_class`, `names` FROM `StatDetail` WHERE 1;

--
-- INSERT template for table `StatDetail`
--
INSERT INTO `StatDetail`(`id`, `name`, `game_index`, `is_battle_only`, `affecting_moves`, `affecting_natures`, `characteristics`, `move_damage_class`, `names`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `StatDetail`
--
UPDATE `StatDetail` SET `id` = ?, `name` = ?, `game_index` = ?, `is_battle_only` = ?, `affecting_moves` = ?, `affecting_natures` = ?, `characteristics` = ?, `move_damage_class` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `StatDetail`
--
DELETE FROM `StatDetail` WHERE 0;

