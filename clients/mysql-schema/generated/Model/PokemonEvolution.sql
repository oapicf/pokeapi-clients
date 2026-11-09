--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonEvolution' definition.
--


--
-- SELECT template for table `PokemonEvolution`
--
SELECT `version_group`, `is_default`, `item`, `trigger`, `gender`, `held_item`, `known_move`, `known_move_type`, `location`, `min_level`, `min_happiness`, `min_beauty`, `min_affection`, `near_special_rock`, `needs_multiplayer`, `needs_overworld_rain`, `party_species`, `party_type`, `relative_physical_stats`, `time_of_day`, `trade_species`, `turn_upside_down`, `region`, `required_pokemon_form`, `evolved_pokemon_form`, `used_move`, `min_move_count`, `min_steps`, `min_damage_taken`, `allowed_natures`, `condition_expression` FROM `PokemonEvolution` WHERE 1;

--
-- INSERT template for table `PokemonEvolution`
--
INSERT INTO `PokemonEvolution`(`version_group`, `is_default`, `item`, `trigger`, `gender`, `held_item`, `known_move`, `known_move_type`, `location`, `min_level`, `min_happiness`, `min_beauty`, `min_affection`, `near_special_rock`, `needs_multiplayer`, `needs_overworld_rain`, `party_species`, `party_type`, `relative_physical_stats`, `time_of_day`, `trade_species`, `turn_upside_down`, `region`, `required_pokemon_form`, `evolved_pokemon_form`, `used_move`, `min_move_count`, `min_steps`, `min_damage_taken`, `allowed_natures`, `condition_expression`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PokemonEvolution`
--
UPDATE `PokemonEvolution` SET `version_group` = ?, `is_default` = ?, `item` = ?, `trigger` = ?, `gender` = ?, `held_item` = ?, `known_move` = ?, `known_move_type` = ?, `location` = ?, `min_level` = ?, `min_happiness` = ?, `min_beauty` = ?, `min_affection` = ?, `near_special_rock` = ?, `needs_multiplayer` = ?, `needs_overworld_rain` = ?, `party_species` = ?, `party_type` = ?, `relative_physical_stats` = ?, `time_of_day` = ?, `trade_species` = ?, `turn_upside_down` = ?, `region` = ?, `required_pokemon_form` = ?, `evolved_pokemon_form` = ?, `used_move` = ?, `min_move_count` = ?, `min_steps` = ?, `min_damage_taken` = ?, `allowed_natures` = ?, `condition_expression` = ? WHERE 1;

--
-- DELETE template for table `PokemonEvolution`
--
DELETE FROM `PokemonEvolution` WHERE 0;

