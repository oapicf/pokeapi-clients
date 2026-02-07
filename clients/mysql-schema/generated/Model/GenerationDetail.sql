--
-- PokéAPI.
-- Prepared SQL queries for 'GenerationDetail' definition.
--


--
-- SELECT template for table `GenerationDetail`
--
SELECT `id`, `name`, `abilities`, `main_region`, `moves`, `names`, `pokemon_species`, `types`, `version_groups` FROM `GenerationDetail` WHERE 1;

--
-- INSERT template for table `GenerationDetail`
--
INSERT INTO `GenerationDetail`(`id`, `name`, `abilities`, `main_region`, `moves`, `names`, `pokemon_species`, `types`, `version_groups`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GenerationDetail`
--
UPDATE `GenerationDetail` SET `id` = ?, `name` = ?, `abilities` = ?, `main_region` = ?, `moves` = ?, `names` = ?, `pokemon_species` = ?, `types` = ?, `version_groups` = ? WHERE 1;

--
-- DELETE template for table `GenerationDetail`
--
DELETE FROM `GenerationDetail` WHERE 0;

