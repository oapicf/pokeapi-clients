--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonFormDetail' definition.
--


--
-- SELECT template for table `PokemonFormDetail`
--
SELECT `id`, `name`, `order`, `form_order`, `is_default`, `is_battle_only`, `is_mega`, `form_name`, `pokemon`, `sprites`, `version_group`, `form_names`, `names`, `types` FROM `PokemonFormDetail` WHERE 1;

--
-- INSERT template for table `PokemonFormDetail`
--
INSERT INTO `PokemonFormDetail`(`id`, `name`, `order`, `form_order`, `is_default`, `is_battle_only`, `is_mega`, `form_name`, `pokemon`, `sprites`, `version_group`, `form_names`, `names`, `types`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PokemonFormDetail`
--
UPDATE `PokemonFormDetail` SET `id` = ?, `name` = ?, `order` = ?, `form_order` = ?, `is_default` = ?, `is_battle_only` = ?, `is_mega` = ?, `form_name` = ?, `pokemon` = ?, `sprites` = ?, `version_group` = ?, `form_names` = ?, `names` = ?, `types` = ? WHERE 1;

--
-- DELETE template for table `PokemonFormDetail`
--
DELETE FROM `PokemonFormDetail` WHERE 0;

