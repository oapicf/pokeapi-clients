--
-- PokéAPI.
-- Prepared SQL queries for 'RegionDetail' definition.
--


--
-- SELECT template for table `RegionDetail`
--
SELECT `id`, `name`, `locations`, `main_generation`, `names`, `pokedexes`, `version_groups` FROM `RegionDetail` WHERE 1;

--
-- INSERT template for table `RegionDetail`
--
INSERT INTO `RegionDetail`(`id`, `name`, `locations`, `main_generation`, `names`, `pokedexes`, `version_groups`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `RegionDetail`
--
UPDATE `RegionDetail` SET `id` = ?, `name` = ?, `locations` = ?, `main_generation` = ?, `names` = ?, `pokedexes` = ?, `version_groups` = ? WHERE 1;

--
-- DELETE template for table `RegionDetail`
--
DELETE FROM `RegionDetail` WHERE 0;

