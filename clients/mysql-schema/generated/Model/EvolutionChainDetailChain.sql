--
-- PokéAPI.
-- Prepared SQL queries for 'EvolutionChainDetail_chain' definition.
--


--
-- SELECT template for table `EvolutionChainDetail_chain`
--
SELECT `evolution_details`, `evolves_to`, `is_baby`, `species` FROM `EvolutionChainDetail_chain` WHERE 1;

--
-- INSERT template for table `EvolutionChainDetail_chain`
--
INSERT INTO `EvolutionChainDetail_chain`(`evolution_details`, `evolves_to`, `is_baby`, `species`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `EvolutionChainDetail_chain`
--
UPDATE `EvolutionChainDetail_chain` SET `evolution_details` = ?, `evolves_to` = ?, `is_baby` = ?, `species` = ? WHERE 1;

--
-- DELETE template for table `EvolutionChainDetail_chain`
--
DELETE FROM `EvolutionChainDetail_chain` WHERE 0;

