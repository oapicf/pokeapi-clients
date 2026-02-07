--
-- PokéAPI.
-- Prepared SQL queries for 'TypeDetail' definition.
--


--
-- SELECT template for table `TypeDetail`
--
SELECT `id`, `name`, `damage_relations`, `past_damage_relations`, `game_indices`, `generation`, `move_damage_class`, `names`, `pokemon`, `moves`, `sprites` FROM `TypeDetail` WHERE 1;

--
-- INSERT template for table `TypeDetail`
--
INSERT INTO `TypeDetail`(`id`, `name`, `damage_relations`, `past_damage_relations`, `game_indices`, `generation`, `move_damage_class`, `names`, `pokemon`, `moves`, `sprites`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TypeDetail`
--
UPDATE `TypeDetail` SET `id` = ?, `name` = ?, `damage_relations` = ?, `past_damage_relations` = ?, `game_indices` = ?, `generation` = ?, `move_damage_class` = ?, `names` = ?, `pokemon` = ?, `moves` = ?, `sprites` = ? WHERE 1;

--
-- DELETE template for table `TypeDetail`
--
DELETE FROM `TypeDetail` WHERE 0;

