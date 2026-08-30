--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSpeciesDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_species_detail'
--
SELECT "id", "name", "order", gender_rate, capture_rate, base_happiness, is_baby, is_legendary, is_mythical, hatch_counter, has_gender_differences, forms_switchable, growth_rate, pokedex_numbers, egg_groups, color, shape, evolves_from_species, evolution_chain, habitat, generation, "names", pal_park_encounters, form_descriptions, flavor_text_entries, genera, varieties FROM pokemon_species_detail WHERE 1=1;

--
-- INSERT template for table 'pokemon_species_detail'
--
INSERT INTO pokemon_species_detail ("id", "name", "order", gender_rate, capture_rate, base_happiness, is_baby, is_legendary, is_mythical, hatch_counter, has_gender_differences, forms_switchable, growth_rate, pokedex_numbers, egg_groups, color, shape, evolves_from_species, evolution_chain, habitat, generation, "names", pal_park_encounters, form_descriptions, flavor_text_entries, genera, varieties) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_species_detail'
--
UPDATE pokemon_species_detail SET "id" = ?, "name" = ?, "order" = ?, gender_rate = ?, capture_rate = ?, base_happiness = ?, is_baby = ?, is_legendary = ?, is_mythical = ?, hatch_counter = ?, has_gender_differences = ?, forms_switchable = ?, growth_rate = ?, pokedex_numbers = ?, egg_groups = ?, color = ?, shape = ?, evolves_from_species = ?, evolution_chain = ?, habitat = ?, generation = ?, "names" = ?, pal_park_encounters = ?, form_descriptions = ?, flavor_text_entries = ?, genera = ?, varieties = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_species_detail'
--
DELETE FROM pokemon_species_detail WHERE 1=2;

