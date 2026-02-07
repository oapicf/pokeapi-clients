--
-- PokéAPI.
-- Prepared SQL queries for 'EvolutionChainDetail_chain_evolves_to_inner' definition.
--


--
-- SELECT template for table `EvolutionChainDetail_chain_evolves_to_inner`
--
SELECT `evolution_details`, `is_baby`, `species` FROM `EvolutionChainDetail_chain_evolves_to_inner` WHERE 1;

--
-- INSERT template for table `EvolutionChainDetail_chain_evolves_to_inner`
--
INSERT INTO `EvolutionChainDetail_chain_evolves_to_inner`(`evolution_details`, `is_baby`, `species`) VALUES (?, ?, ?);

--
-- UPDATE template for table `EvolutionChainDetail_chain_evolves_to_inner`
--
UPDATE `EvolutionChainDetail_chain_evolves_to_inner` SET `evolution_details` = ?, `is_baby` = ?, `species` = ? WHERE 1;

--
-- DELETE template for table `EvolutionChainDetail_chain_evolves_to_inner`
--
DELETE FROM `EvolutionChainDetail_chain_evolves_to_inner` WHERE 0;

