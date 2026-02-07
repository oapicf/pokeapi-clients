--
-- PokéAPI.
-- Prepared SQL queries for 'NatureDetail' definition.
--


--
-- SELECT template for table `NatureDetail`
--
SELECT `id`, `name`, `decreased_stat`, `increased_stat`, `likes_flavor`, `hates_flavor`, `berries`, `pokeathlon_stat_changes`, `move_battle_style_preferences`, `names` FROM `NatureDetail` WHERE 1;

--
-- INSERT template for table `NatureDetail`
--
INSERT INTO `NatureDetail`(`id`, `name`, `decreased_stat`, `increased_stat`, `likes_flavor`, `hates_flavor`, `berries`, `pokeathlon_stat_changes`, `move_battle_style_preferences`, `names`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `NatureDetail`
--
UPDATE `NatureDetail` SET `id` = ?, `name` = ?, `decreased_stat` = ?, `increased_stat` = ?, `likes_flavor` = ?, `hates_flavor` = ?, `berries` = ?, `pokeathlon_stat_changes` = ?, `move_battle_style_preferences` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `NatureDetail`
--
DELETE FROM `NatureDetail` WHERE 0;

