--
-- PokéAPI.
-- Prepared SQL queries for 'EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner' definition.
--


--
-- SELECT template for table `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_in`
--
SELECT `gender`, `held_item`, `item`, `known_move`, `known_move_type`, `location`, `min_affection`, `min_beauty`, `min_happiness`, `min_level`, `needs_overworld_rain`, `party_species`, `party_type`, `relative_physical_stats`, `time_of_day`, `trade_species`, `trigger`, `turn_upside_down` FROM `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_in` WHERE 1;

--
-- INSERT template for table `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_in`
--
INSERT INTO `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_in`(`gender`, `held_item`, `item`, `known_move`, `known_move_type`, `location`, `min_affection`, `min_beauty`, `min_happiness`, `min_level`, `needs_overworld_rain`, `party_species`, `party_type`, `relative_physical_stats`, `time_of_day`, `trade_species`, `trigger`, `turn_upside_down`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_in`
--
UPDATE `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_in` SET `gender` = ?, `held_item` = ?, `item` = ?, `known_move` = ?, `known_move_type` = ?, `location` = ?, `min_affection` = ?, `min_beauty` = ?, `min_happiness` = ?, `min_level` = ?, `needs_overworld_rain` = ?, `party_species` = ?, `party_type` = ?, `relative_physical_stats` = ?, `time_of_day` = ?, `trade_species` = ?, `trigger` = ?, `turn_upside_down` = ? WHERE 1;

--
-- DELETE template for table `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_in`
--
DELETE FROM `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_in` WHERE 0;

