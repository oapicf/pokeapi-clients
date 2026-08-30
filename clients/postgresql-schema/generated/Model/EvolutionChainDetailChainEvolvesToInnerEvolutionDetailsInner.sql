--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_chain_detail_chain_evolves_to_inner_evolution_details'
--
SELECT gender, held_item, item, known_move, known_move_type, "location", min_affection, min_beauty, min_happiness, min_level, needs_overworld_rain, party_species, party_type, relative_physical_stats, time_of_day, trade_species, "trigger", turn_upside_down FROM evolution_chain_detail_chain_evolves_to_inner_evolution_details WHERE 1=1;

--
-- INSERT template for table 'evolution_chain_detail_chain_evolves_to_inner_evolution_details'
--
INSERT INTO evolution_chain_detail_chain_evolves_to_inner_evolution_details (gender, held_item, item, known_move, known_move_type, "location", min_affection, min_beauty, min_happiness, min_level, needs_overworld_rain, party_species, party_type, relative_physical_stats, time_of_day, trade_species, "trigger", turn_upside_down) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'evolution_chain_detail_chain_evolves_to_inner_evolution_details'
--
UPDATE evolution_chain_detail_chain_evolves_to_inner_evolution_details SET gender = ?, held_item = ?, item = ?, known_move = ?, known_move_type = ?, "location" = ?, min_affection = ?, min_beauty = ?, min_happiness = ?, min_level = ?, needs_overworld_rain = ?, party_species = ?, party_type = ?, relative_physical_stats = ?, time_of_day = ?, trade_species = ?, "trigger" = ?, turn_upside_down = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_chain_detail_chain_evolves_to_inner_evolution_details'
--
DELETE FROM evolution_chain_detail_chain_evolves_to_inner_evolution_details WHERE 1=2;

