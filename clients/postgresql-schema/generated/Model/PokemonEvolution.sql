--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonEvolution' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_evolution'
--
SELECT version_group, is_default, item, "trigger", gender, held_item, known_move, known_move_type, "location", min_level, min_happiness, min_beauty, min_affection, near_special_rock, needs_multiplayer, needs_overworld_rain, party_species, party_type, relative_physical_stats, time_of_day, trade_species, turn_upside_down, region, required_pokemon_form, evolved_pokemon_form, used_move, min_move_count, min_steps, min_damage_taken, allowed_natures, condition_expression FROM pokemon_evolution WHERE 1=1;

--
-- INSERT template for table 'pokemon_evolution'
--
INSERT INTO pokemon_evolution (version_group, is_default, item, "trigger", gender, held_item, known_move, known_move_type, "location", min_level, min_happiness, min_beauty, min_affection, near_special_rock, needs_multiplayer, needs_overworld_rain, party_species, party_type, relative_physical_stats, time_of_day, trade_species, turn_upside_down, region, required_pokemon_form, evolved_pokemon_form, used_move, min_move_count, min_steps, min_damage_taken, allowed_natures, condition_expression) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_evolution'
--
UPDATE pokemon_evolution SET version_group = ?, is_default = ?, item = ?, "trigger" = ?, gender = ?, held_item = ?, known_move = ?, known_move_type = ?, "location" = ?, min_level = ?, min_happiness = ?, min_beauty = ?, min_affection = ?, near_special_rock = ?, needs_multiplayer = ?, needs_overworld_rain = ?, party_species = ?, party_type = ?, relative_physical_stats = ?, time_of_day = ?, trade_species = ?, turn_upside_down = ?, region = ?, required_pokemon_form = ?, evolved_pokemon_form = ?, used_move = ?, min_move_count = ?, min_steps = ?, min_damage_taken = ?, allowed_natures = ?, condition_expression = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_evolution'
--
DELETE FROM pokemon_evolution WHERE 1=2;

