--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonDexNumber' definition.
--


--
-- SELECT template for table `PokemonDexNumber`
--
SELECT `entry_number`, `pokemon_species` FROM `PokemonDexNumber` WHERE 1;

--
-- INSERT template for table `PokemonDexNumber`
--
INSERT INTO `PokemonDexNumber`(`entry_number`, `pokemon_species`) VALUES (?, ?);

--
-- UPDATE template for table `PokemonDexNumber`
--
UPDATE `PokemonDexNumber` SET `entry_number` = ?, `pokemon_species` = ? WHERE 1;

--
-- DELETE template for table `PokemonDexNumber`
--
DELETE FROM `PokemonDexNumber` WHERE 0;

