--
-- PokéAPI.
-- Prepared SQL queries for 'ItemDetail' definition.
--


--
-- SELECT template for table `ItemDetail`
--
SELECT `id`, `name`, `cost`, `fling_power`, `fling_effect`, `attributes`, `category`, `effect_entries`, `flavor_text_entries`, `game_indices`, `names`, `held_by_pokemon`, `sprites`, `baby_trigger_for`, `machines` FROM `ItemDetail` WHERE 1;

--
-- INSERT template for table `ItemDetail`
--
INSERT INTO `ItemDetail`(`id`, `name`, `cost`, `fling_power`, `fling_effect`, `attributes`, `category`, `effect_entries`, `flavor_text_entries`, `game_indices`, `names`, `held_by_pokemon`, `sprites`, `baby_trigger_for`, `machines`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ItemDetail`
--
UPDATE `ItemDetail` SET `id` = ?, `name` = ?, `cost` = ?, `fling_power` = ?, `fling_effect` = ?, `attributes` = ?, `category` = ?, `effect_entries` = ?, `flavor_text_entries` = ?, `game_indices` = ?, `names` = ?, `held_by_pokemon` = ?, `sprites` = ?, `baby_trigger_for` = ?, `machines` = ? WHERE 1;

--
-- DELETE template for table `ItemDetail`
--
DELETE FROM `ItemDetail` WHERE 0;

