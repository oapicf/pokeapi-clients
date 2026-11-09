--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonEncounterDetailResponse' definition.
--


--
-- SELECT template for table `PokemonEncounterDetailResponse`
--
SELECT `chance`, `condition_values`, `max_level`, `method`, `min_level` FROM `PokemonEncounterDetailResponse` WHERE 1;

--
-- INSERT template for table `PokemonEncounterDetailResponse`
--
INSERT INTO `PokemonEncounterDetailResponse`(`chance`, `condition_values`, `max_level`, `method`, `min_level`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `PokemonEncounterDetailResponse`
--
UPDATE `PokemonEncounterDetailResponse` SET `chance` = ?, `condition_values` = ?, `max_level` = ?, `method` = ?, `min_level` = ? WHERE 1;

--
-- DELETE template for table `PokemonEncounterDetailResponse`
--
DELETE FROM `PokemonEncounterDetailResponse` WHERE 0;

