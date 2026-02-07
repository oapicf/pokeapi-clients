--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonDetail' definition.
--


--
-- SELECT template for table `PokemonDetail`
--
SELECT `id`, `name`, `base_experience`, `height`, `is_default`, `order`, `weight`, `abilities`, `past_abilities`, `forms`, `game_indices`, `held_items`, `location_area_encounters`, `moves`, `species`, `sprites`, `cries`, `stats`, `types`, `past_types` FROM `PokemonDetail` WHERE 1;

--
-- INSERT template for table `PokemonDetail`
--
INSERT INTO `PokemonDetail`(`id`, `name`, `base_experience`, `height`, `is_default`, `order`, `weight`, `abilities`, `past_abilities`, `forms`, `game_indices`, `held_items`, `location_area_encounters`, `moves`, `species`, `sprites`, `cries`, `stats`, `types`, `past_types`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PokemonDetail`
--
UPDATE `PokemonDetail` SET `id` = ?, `name` = ?, `base_experience` = ?, `height` = ?, `is_default` = ?, `order` = ?, `weight` = ?, `abilities` = ?, `past_abilities` = ?, `forms` = ?, `game_indices` = ?, `held_items` = ?, `location_area_encounters` = ?, `moves` = ?, `species` = ?, `sprites` = ?, `cries` = ?, `stats` = ?, `types` = ?, `past_types` = ? WHERE 1;

--
-- DELETE template for table `PokemonDetail`
--
DELETE FROM `PokemonDetail` WHERE 0;

