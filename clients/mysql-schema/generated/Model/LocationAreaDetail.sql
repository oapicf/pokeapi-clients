--
-- PokéAPI.
-- Prepared SQL queries for 'LocationAreaDetail' definition.
--


--
-- SELECT template for table `LocationAreaDetail`
--
SELECT `id`, `name`, `game_index`, `encounter_method_rates`, `location`, `names`, `pokemon_encounters` FROM `LocationAreaDetail` WHERE 1;

--
-- INSERT template for table `LocationAreaDetail`
--
INSERT INTO `LocationAreaDetail`(`id`, `name`, `game_index`, `encounter_method_rates`, `location`, `names`, `pokemon_encounters`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LocationAreaDetail`
--
UPDATE `LocationAreaDetail` SET `id` = ?, `name` = ?, `game_index` = ?, `encounter_method_rates` = ?, `location` = ?, `names` = ?, `pokemon_encounters` = ? WHERE 1;

--
-- DELETE template for table `LocationAreaDetail`
--
DELETE FROM `LocationAreaDetail` WHERE 0;

