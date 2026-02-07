--
-- PokéAPI.
-- Prepared SQL queries for 'PokemonSpeciesDetail' definition.
--


--
-- SELECT template for table `PokemonSpeciesDetail`
--
SELECT `id`, `name`, `order`, `gender_rate`, `capture_rate`, `base_happiness`, `is_baby`, `is_legendary`, `is_mythical`, `hatch_counter`, `has_gender_differences`, `forms_switchable`, `growth_rate`, `pokedex_numbers`, `egg_groups`, `color`, `shape`, `evolves_from_species`, `evolution_chain`, `habitat`, `generation`, `names`, `pal_park_encounters`, `form_descriptions`, `flavor_text_entries`, `genera`, `varieties` FROM `PokemonSpeciesDetail` WHERE 1;

--
-- INSERT template for table `PokemonSpeciesDetail`
--
INSERT INTO `PokemonSpeciesDetail`(`id`, `name`, `order`, `gender_rate`, `capture_rate`, `base_happiness`, `is_baby`, `is_legendary`, `is_mythical`, `hatch_counter`, `has_gender_differences`, `forms_switchable`, `growth_rate`, `pokedex_numbers`, `egg_groups`, `color`, `shape`, `evolves_from_species`, `evolution_chain`, `habitat`, `generation`, `names`, `pal_park_encounters`, `form_descriptions`, `flavor_text_entries`, `genera`, `varieties`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PokemonSpeciesDetail`
--
UPDATE `PokemonSpeciesDetail` SET `id` = ?, `name` = ?, `order` = ?, `gender_rate` = ?, `capture_rate` = ?, `base_happiness` = ?, `is_baby` = ?, `is_legendary` = ?, `is_mythical` = ?, `hatch_counter` = ?, `has_gender_differences` = ?, `forms_switchable` = ?, `growth_rate` = ?, `pokedex_numbers` = ?, `egg_groups` = ?, `color` = ?, `shape` = ?, `evolves_from_species` = ?, `evolution_chain` = ?, `habitat` = ?, `generation` = ?, `names` = ?, `pal_park_encounters` = ?, `form_descriptions` = ?, `flavor_text_entries` = ?, `genera` = ?, `varieties` = ? WHERE 1;

--
-- DELETE template for table `PokemonSpeciesDetail`
--
DELETE FROM `PokemonSpeciesDetail` WHERE 0;

