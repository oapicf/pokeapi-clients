--
-- PokéAPI.
-- Prepared SQL queries for 'PokedexDetail_pokemon_entries_inner' definition.
--


--
-- SELECT template for table `PokedexDetail_pokemon_entries_inner`
--
SELECT `entry_number`, `pokemon_species` FROM `PokedexDetail_pokemon_entries_inner` WHERE 1;

--
-- INSERT template for table `PokedexDetail_pokemon_entries_inner`
--
INSERT INTO `PokedexDetail_pokemon_entries_inner`(`entry_number`, `pokemon_species`) VALUES (?, ?);

--
-- UPDATE template for table `PokedexDetail_pokemon_entries_inner`
--
UPDATE `PokedexDetail_pokemon_entries_inner` SET `entry_number` = ?, `pokemon_species` = ? WHERE 1;

--
-- DELETE template for table `PokedexDetail_pokemon_entries_inner`
--
DELETE FROM `PokedexDetail_pokemon_entries_inner` WHERE 0;

