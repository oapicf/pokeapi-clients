--
-- PokéAPI.
-- Prepared SQL queries for 'EggGroupDetail_pokemon_species_inner' definition.
--


--
-- SELECT template for table `EggGroupDetail_pokemon_species_inner`
--
SELECT `name`, `url` FROM `EggGroupDetail_pokemon_species_inner` WHERE 1;

--
-- INSERT template for table `EggGroupDetail_pokemon_species_inner`
--
INSERT INTO `EggGroupDetail_pokemon_species_inner`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `EggGroupDetail_pokemon_species_inner`
--
UPDATE `EggGroupDetail_pokemon_species_inner` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `EggGroupDetail_pokemon_species_inner`
--
DELETE FROM `EggGroupDetail_pokemon_species_inner` WHERE 0;

