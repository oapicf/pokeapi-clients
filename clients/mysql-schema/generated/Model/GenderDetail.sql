--
-- PokéAPI.
-- Prepared SQL queries for 'GenderDetail' definition.
--


--
-- SELECT template for table `GenderDetail`
--
SELECT `id`, `name`, `pokemon_species_details`, `required_for_evolution` FROM `GenderDetail` WHERE 1;

--
-- INSERT template for table `GenderDetail`
--
INSERT INTO `GenderDetail`(`id`, `name`, `pokemon_species_details`, `required_for_evolution`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `GenderDetail`
--
UPDATE `GenderDetail` SET `id` = ?, `name` = ?, `pokemon_species_details` = ?, `required_for_evolution` = ? WHERE 1;

--
-- DELETE template for table `GenderDetail`
--
DELETE FROM `GenderDetail` WHERE 0;

