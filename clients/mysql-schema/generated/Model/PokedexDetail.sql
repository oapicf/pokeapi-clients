--
-- PokéAPI.
-- Prepared SQL queries for 'PokedexDetail' definition.
--


--
-- SELECT template for table `PokedexDetail`
--
SELECT `id`, `name`, `is_main_series`, `descriptions`, `names`, `pokemon_entries`, `region`, `version_groups` FROM `PokedexDetail` WHERE 1;

--
-- INSERT template for table `PokedexDetail`
--
INSERT INTO `PokedexDetail`(`id`, `name`, `is_main_series`, `descriptions`, `names`, `pokemon_entries`, `region`, `version_groups`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PokedexDetail`
--
UPDATE `PokedexDetail` SET `id` = ?, `name` = ?, `is_main_series` = ?, `descriptions` = ?, `names` = ?, `pokemon_entries` = ?, `region` = ?, `version_groups` = ? WHERE 1;

--
-- DELETE template for table `PokedexDetail`
--
DELETE FROM `PokedexDetail` WHERE 0;

