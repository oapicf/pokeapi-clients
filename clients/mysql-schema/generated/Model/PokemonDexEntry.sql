--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonDexEntry' definition.
--


--
-- SELECT template for table `PokemonDexEntry`
--
SELECT `entry_number`, `pokedex` FROM `PokemonDexEntry` WHERE 1;

--
-- INSERT template for table `PokemonDexEntry`
--
INSERT INTO `PokemonDexEntry`(`entry_number`, `pokedex`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonDexEntry`
--
UPDATE `PokemonDexEntry` SET `entry_number` = ?, `pokedex` = ? WHERE 1;

--
-- DELETE template for table `PokemonDexEntry`
--
DELETE FROM `PokemonDexEntry` WHERE 0;

