--
-- PokéAPI.
-- Prepared SQL queries for 'EvolutionChainLink' definition.
--


--
-- SELECT template for table `EvolutionChainLink`
--
SELECT `is_baby`, `species`, `evolution_details`, `evolves_to` FROM `EvolutionChainLink` WHERE 1;

--
-- INSERT template for table `EvolutionChainLink`
--
INSERT INTO `EvolutionChainLink`(`is_baby`, `species`, `evolution_details`, `evolves_to`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `EvolutionChainLink`
--
UPDATE `EvolutionChainLink` SET `is_baby` = ?, `species` = ?, `evolution_details` = ?, `evolves_to` = ? WHERE 1;

--
-- DELETE template for table `EvolutionChainLink`
--
DELETE FROM `EvolutionChainLink` WHERE 0;

