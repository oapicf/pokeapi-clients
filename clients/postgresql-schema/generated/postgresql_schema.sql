--
-- Schema objects for PostgreSQL
-- "PokéAPI"
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--

--
-- DROP OBJECTS
-- (remove comment prefix to start using DROP commands)
--
-- TABLES
--
-- DROP TABLE IF EXISTS ability_change;
-- DROP TABLE IF EXISTS ability_change_effect_text;
-- DROP TABLE IF EXISTS ability_detail;
-- DROP TABLE IF EXISTS ability_detail_pokemon_inner;
-- DROP TABLE IF EXISTS ability_detail_pokemon_inner_pokemon;
-- DROP TABLE IF EXISTS ability_effect_text;
-- DROP TABLE IF EXISTS ability_flavor_text;
-- DROP TABLE IF EXISTS ability_name;
-- DROP TABLE IF EXISTS ability_summary;
-- DROP TABLE IF EXISTS berry_detail;
-- DROP TABLE IF EXISTS berry_detail_flavors_inner;
-- DROP TABLE IF EXISTS berry_detail_flavors_inner_flavor;
-- DROP TABLE IF EXISTS berry_firmness_detail;
-- DROP TABLE IF EXISTS berry_firmness_name;
-- DROP TABLE IF EXISTS berry_firmness_summary;
-- DROP TABLE IF EXISTS berry_flavor_detail;
-- DROP TABLE IF EXISTS berry_flavor_detail_berries_inner;
-- DROP TABLE IF EXISTS berry_flavor_detail_berries_inner_berry;
-- DROP TABLE IF EXISTS berry_flavor_name;
-- DROP TABLE IF EXISTS berry_flavor_summary;
-- DROP TABLE IF EXISTS berry_summary;
-- DROP TABLE IF EXISTS characteristic_description;
-- DROP TABLE IF EXISTS characteristic_detail;
-- DROP TABLE IF EXISTS characteristic_summary;
-- DROP TABLE IF EXISTS contest_effect_detail;
-- DROP TABLE IF EXISTS contest_effect_effect_text;
-- DROP TABLE IF EXISTS contest_effect_flavor_text;
-- DROP TABLE IF EXISTS contest_effect_summary;
-- DROP TABLE IF EXISTS contest_type_detail;
-- DROP TABLE IF EXISTS contest_type_name;
-- DROP TABLE IF EXISTS contest_type_summary;
-- DROP TABLE IF EXISTS egg_group_detail;
-- DROP TABLE IF EXISTS egg_group_detail_pokemon_species_inner;
-- DROP TABLE IF EXISTS egg_group_name;
-- DROP TABLE IF EXISTS egg_group_summary;
-- DROP TABLE IF EXISTS encounter_condition_detail;
-- DROP TABLE IF EXISTS encounter_condition_name;
-- DROP TABLE IF EXISTS encounter_condition_summary;
-- DROP TABLE IF EXISTS encounter_condition_value_detail;
-- DROP TABLE IF EXISTS encounter_condition_value_name;
-- DROP TABLE IF EXISTS encounter_condition_value_summary;
-- DROP TABLE IF EXISTS encounter_method_detail;
-- DROP TABLE IF EXISTS encounter_method_name;
-- DROP TABLE IF EXISTS encounter_method_summary;
-- DROP TABLE IF EXISTS evolution_chain_detail;
-- DROP TABLE IF EXISTS evolution_chain_detail_chain;
-- DROP TABLE IF EXISTS evolution_chain_detail_chain_evolves_to_inner;
-- DROP TABLE IF EXISTS evolution_chain_detail_chain_evolves_to_inner_evolution_details;
-- DROP TABLE IF EXISTS evolution_chain_detail_chain_evolves_to_inner_evolution_details;
-- DROP TABLE IF EXISTS evolution_chain_summary;
-- DROP TABLE IF EXISTS evolution_trigger_detail;
-- DROP TABLE IF EXISTS evolution_trigger_name;
-- DROP TABLE IF EXISTS evolution_trigger_summary;
-- DROP TABLE IF EXISTS experience;
-- DROP TABLE IF EXISTS gender_detail;
-- DROP TABLE IF EXISTS gender_detail_pokemon_species_details_inner;
-- DROP TABLE IF EXISTS gender_summary;
-- DROP TABLE IF EXISTS generation_detail;
-- DROP TABLE IF EXISTS generation_name;
-- DROP TABLE IF EXISTS generation_summary;
-- DROP TABLE IF EXISTS growth_rate_description;
-- DROP TABLE IF EXISTS growth_rate_detail;
-- DROP TABLE IF EXISTS growth_rate_summary;
-- DROP TABLE IF EXISTS item_attribute_description;
-- DROP TABLE IF EXISTS item_attribute_detail;
-- DROP TABLE IF EXISTS item_attribute_name;
-- DROP TABLE IF EXISTS item_attribute_summary;
-- DROP TABLE IF EXISTS item_category_detail;
-- DROP TABLE IF EXISTS item_category_name;
-- DROP TABLE IF EXISTS item_category_summary;
-- DROP TABLE IF EXISTS item_detail;
-- DROP TABLE IF EXISTS item_detail_baby_trigger_for;
-- DROP TABLE IF EXISTS item_detail_held_by_pokemon_inner;
-- DROP TABLE IF EXISTS item_detail_held_by_pokemon_inner_version_details_inner;
-- DROP TABLE IF EXISTS item_detail_machines_inner;
-- DROP TABLE IF EXISTS item_detail_sprites;
-- DROP TABLE IF EXISTS item_effect_text;
-- DROP TABLE IF EXISTS item_flavor_text;
-- DROP TABLE IF EXISTS item_fling_effect_detail;
-- DROP TABLE IF EXISTS item_fling_effect_effect_text;
-- DROP TABLE IF EXISTS item_fling_effect_summary;
-- DROP TABLE IF EXISTS item_game_index;
-- DROP TABLE IF EXISTS item_name;
-- DROP TABLE IF EXISTS item_pocket_detail;
-- DROP TABLE IF EXISTS item_pocket_name;
-- DROP TABLE IF EXISTS item_pocket_summary;
-- DROP TABLE IF EXISTS item_summary;
-- DROP TABLE IF EXISTS language_detail;
-- DROP TABLE IF EXISTS language_name;
-- DROP TABLE IF EXISTS language_summary;
-- DROP TABLE IF EXISTS location_area_detail;
-- DROP TABLE IF EXISTS location_area_detail_encounter_method_rates_inner;
-- DROP TABLE IF EXISTS location_area_detail_encounter_method_rates_inner_version_detai;
-- DROP TABLE IF EXISTS location_area_detail_pokemon_encounters_inner;
-- DROP TABLE IF EXISTS location_area_detail_pokemon_encounters_inner_version_details_i;
-- DROP TABLE IF EXISTS location_area_detail_pokemon_encounters_inner_version_details_i;
-- DROP TABLE IF EXISTS location_area_name;
-- DROP TABLE IF EXISTS location_area_summary;
-- DROP TABLE IF EXISTS location_detail;
-- DROP TABLE IF EXISTS location_game_index;
-- DROP TABLE IF EXISTS location_name;
-- DROP TABLE IF EXISTS location_summary;
-- DROP TABLE IF EXISTS machine_detail;
-- DROP TABLE IF EXISTS machine_summary;
-- DROP TABLE IF EXISTS move_battle_style_detail;
-- DROP TABLE IF EXISTS move_battle_style_name;
-- DROP TABLE IF EXISTS move_battle_style_summary;
-- DROP TABLE IF EXISTS move_change;
-- DROP TABLE IF EXISTS move_change_effect_entries_inner;
-- DROP TABLE IF EXISTS move_damage_class_description;
-- DROP TABLE IF EXISTS move_damage_class_detail;
-- DROP TABLE IF EXISTS move_damage_class_name;
-- DROP TABLE IF EXISTS move_damage_class_summary;
-- DROP TABLE IF EXISTS move_detail;
-- DROP TABLE IF EXISTS move_detail_contest_combos;
-- DROP TABLE IF EXISTS move_detail_contest_combos_normal;
-- DROP TABLE IF EXISTS move_detail_effect_changes_inner;
-- DROP TABLE IF EXISTS move_detail_effect_changes_inner_effect_entries_inner;
-- DROP TABLE IF EXISTS move_detail_machines_inner;
-- DROP TABLE IF EXISTS move_detail_machines_inner_machine;
-- DROP TABLE IF EXISTS move_detail_stat_changes_inner;
-- DROP TABLE IF EXISTS move_flavor_text;
-- DROP TABLE IF EXISTS move_learn_method_description;
-- DROP TABLE IF EXISTS move_learn_method_detail;
-- DROP TABLE IF EXISTS move_learn_method_name;
-- DROP TABLE IF EXISTS move_learn_method_summary;
-- DROP TABLE IF EXISTS move_meta;
-- DROP TABLE IF EXISTS move_meta_ailment_detail;
-- DROP TABLE IF EXISTS move_meta_ailment_name;
-- DROP TABLE IF EXISTS move_meta_ailment_summary;
-- DROP TABLE IF EXISTS move_meta_category_description;
-- DROP TABLE IF EXISTS move_meta_category_detail;
-- DROP TABLE IF EXISTS move_meta_category_summary;
-- DROP TABLE IF EXISTS move_name;
-- DROP TABLE IF EXISTS move_summary;
-- DROP TABLE IF EXISTS move_target_description;
-- DROP TABLE IF EXISTS move_target_detail;
-- DROP TABLE IF EXISTS move_target_name;
-- DROP TABLE IF EXISTS move_target_summary;
-- DROP TABLE IF EXISTS nature_battle_style_preference;
-- DROP TABLE IF EXISTS nature_detail;
-- DROP TABLE IF EXISTS nature_detail_pokeathlon_stat_changes_inner;
-- DROP TABLE IF EXISTS nature_name;
-- DROP TABLE IF EXISTS nature_summary;
-- DROP TABLE IF EXISTS paginated_ability_summary_list;
-- DROP TABLE IF EXISTS paginated_berry_firmness_summary_list;
-- DROP TABLE IF EXISTS paginated_berry_flavor_summary_list;
-- DROP TABLE IF EXISTS paginated_berry_summary_list;
-- DROP TABLE IF EXISTS paginated_characteristic_summary_list;
-- DROP TABLE IF EXISTS paginated_contest_effect_summary_list;
-- DROP TABLE IF EXISTS paginated_contest_type_summary_list;
-- DROP TABLE IF EXISTS paginated_egg_group_summary_list;
-- DROP TABLE IF EXISTS paginated_encounter_condition_summary_list;
-- DROP TABLE IF EXISTS paginated_encounter_condition_value_summary_list;
-- DROP TABLE IF EXISTS paginated_encounter_method_summary_list;
-- DROP TABLE IF EXISTS paginated_evolution_chain_summary_list;
-- DROP TABLE IF EXISTS paginated_evolution_trigger_summary_list;
-- DROP TABLE IF EXISTS paginated_gender_summary_list;
-- DROP TABLE IF EXISTS paginated_generation_summary_list;
-- DROP TABLE IF EXISTS paginated_growth_rate_summary_list;
-- DROP TABLE IF EXISTS paginated_item_attribute_summary_list;
-- DROP TABLE IF EXISTS paginated_item_category_summary_list;
-- DROP TABLE IF EXISTS paginated_item_fling_effect_summary_list;
-- DROP TABLE IF EXISTS paginated_item_pocket_summary_list;
-- DROP TABLE IF EXISTS paginated_item_summary_list;
-- DROP TABLE IF EXISTS paginated_language_summary_list;
-- DROP TABLE IF EXISTS paginated_location_area_summary_list;
-- DROP TABLE IF EXISTS paginated_location_summary_list;
-- DROP TABLE IF EXISTS paginated_machine_summary_list;
-- DROP TABLE IF EXISTS paginated_move_battle_style_summary_list;
-- DROP TABLE IF EXISTS paginated_move_damage_class_summary_list;
-- DROP TABLE IF EXISTS paginated_move_learn_method_summary_list;
-- DROP TABLE IF EXISTS paginated_move_meta_ailment_summary_list;
-- DROP TABLE IF EXISTS paginated_move_meta_category_summary_list;
-- DROP TABLE IF EXISTS paginated_move_summary_list;
-- DROP TABLE IF EXISTS paginated_move_target_summary_list;
-- DROP TABLE IF EXISTS paginated_nature_summary_list;
-- DROP TABLE IF EXISTS paginated_pal_park_area_summary_list;
-- DROP TABLE IF EXISTS paginated_pokeathlon_stat_summary_list;
-- DROP TABLE IF EXISTS paginated_pokedex_summary_list;
-- DROP TABLE IF EXISTS paginated_pokemon_color_summary_list;
-- DROP TABLE IF EXISTS paginated_pokemon_form_summary_list;
-- DROP TABLE IF EXISTS paginated_pokemon_habitat_summary_list;
-- DROP TABLE IF EXISTS paginated_pokemon_shape_summary_list;
-- DROP TABLE IF EXISTS paginated_pokemon_species_summary_list;
-- DROP TABLE IF EXISTS paginated_pokemon_summary_list;
-- DROP TABLE IF EXISTS paginated_region_summary_list;
-- DROP TABLE IF EXISTS paginated_stat_summary_list;
-- DROP TABLE IF EXISTS paginated_super_contest_effect_summary_list;
-- DROP TABLE IF EXISTS paginated_type_summary_list;
-- DROP TABLE IF EXISTS paginated_version_group_summary_list;
-- DROP TABLE IF EXISTS paginated_version_summary_list;
-- DROP TABLE IF EXISTS pal_park_area_detail;
-- DROP TABLE IF EXISTS pal_park_area_detail_pokemon_encounters_inner;
-- DROP TABLE IF EXISTS pal_park_area_name;
-- DROP TABLE IF EXISTS pal_park_area_summary;
-- DROP TABLE IF EXISTS pokeathlon_stat_detail;
-- DROP TABLE IF EXISTS pokeathlon_stat_detail_affecting_natures;
-- DROP TABLE IF EXISTS pokeathlon_stat_detail_affecting_natures_decrease_inner;
-- DROP TABLE IF EXISTS pokeathlon_stat_detail_affecting_natures_increase_inner;
-- DROP TABLE IF EXISTS pokeathlon_stat_name;
-- DROP TABLE IF EXISTS pokeathlon_stat_summary;
-- DROP TABLE IF EXISTS pokedex_description;
-- DROP TABLE IF EXISTS pokedex_detail;
-- DROP TABLE IF EXISTS pokedex_detail_pokemon_entries_inner;
-- DROP TABLE IF EXISTS pokedex_name;
-- DROP TABLE IF EXISTS pokedex_summary;
-- DROP TABLE IF EXISTS pokemon_color_detail;
-- DROP TABLE IF EXISTS pokemon_color_name;
-- DROP TABLE IF EXISTS pokemon_color_summary;
-- DROP TABLE IF EXISTS pokemon_detail;
-- DROP TABLE IF EXISTS pokemon_detail_abilities_inner;
-- DROP TABLE IF EXISTS pokemon_detail_cries;
-- DROP TABLE IF EXISTS pokemon_detail_held_items;
-- DROP TABLE IF EXISTS pokemon_detail_moves_inner;
-- DROP TABLE IF EXISTS pokemon_detail_moves_inner_version_group_details_inner;
-- DROP TABLE IF EXISTS pokemon_detail_past_abilities_inner;
-- DROP TABLE IF EXISTS pokemon_detail_past_types_inner;
-- DROP TABLE IF EXISTS pokemon_detail_sprites;
-- DROP TABLE IF EXISTS pokemon_detail_types_inner;
-- DROP TABLE IF EXISTS pokemon_dex_entry;
-- DROP TABLE IF EXISTS pokemon_form_detail;
-- DROP TABLE IF EXISTS pokemon_form_detail_form_names_inner;
-- DROP TABLE IF EXISTS pokemon_form_detail_sprites;
-- DROP TABLE IF EXISTS pokemon_form_summary;
-- DROP TABLE IF EXISTS pokemon_game_index;
-- DROP TABLE IF EXISTS pokemon_habitat_detail;
-- DROP TABLE IF EXISTS pokemon_habitat_name;
-- DROP TABLE IF EXISTS pokemon_habitat_summary;
-- DROP TABLE IF EXISTS pokemon_shape_detail;
-- DROP TABLE IF EXISTS pokemon_shape_detail_awesome_names_inner;
-- DROP TABLE IF EXISTS pokemon_shape_detail_names_inner;
-- DROP TABLE IF EXISTS pokemon_shape_summary;
-- DROP TABLE IF EXISTS pokemon_species_description;
-- DROP TABLE IF EXISTS pokemon_species_detail;
-- DROP TABLE IF EXISTS pokemon_species_detail_genera_inner;
-- DROP TABLE IF EXISTS pokemon_species_detail_pal_park_encounters_inner;
-- DROP TABLE IF EXISTS pokemon_species_detail_varieties_inner;
-- DROP TABLE IF EXISTS pokemon_species_flavor_text;
-- DROP TABLE IF EXISTS pokemon_species_summary;
-- DROP TABLE IF EXISTS pokemon_stat;
-- DROP TABLE IF EXISTS pokemon_summary;
-- DROP TABLE IF EXISTS region_detail;
-- DROP TABLE IF EXISTS region_name;
-- DROP TABLE IF EXISTS region_summary;
-- DROP TABLE IF EXISTS stat_detail;
-- DROP TABLE IF EXISTS stat_detail_affecting_moves;
-- DROP TABLE IF EXISTS stat_detail_affecting_moves_increase_inner;
-- DROP TABLE IF EXISTS stat_detail_affecting_natures;
-- DROP TABLE IF EXISTS stat_name;
-- DROP TABLE IF EXISTS stat_summary;
-- DROP TABLE IF EXISTS super_contest_effect_detail;
-- DROP TABLE IF EXISTS super_contest_effect_flavor_text;
-- DROP TABLE IF EXISTS super_contest_effect_summary;
-- DROP TABLE IF EXISTS type_detail;
-- DROP TABLE IF EXISTS type_detail_damage_relations;
-- DROP TABLE IF EXISTS type_detail_past_damage_relations_inner;
-- DROP TABLE IF EXISTS type_detail_past_damage_relations_inner_damage_relations;
-- DROP TABLE IF EXISTS type_detail_pokemon_inner;
-- DROP TABLE IF EXISTS type_detail_pokemon_inner_pokemon;
-- DROP TABLE IF EXISTS type_detail_sprites_value_value;
-- DROP TABLE IF EXISTS type_game_index;
-- DROP TABLE IF EXISTS type_summary;
-- DROP TABLE IF EXISTS version_detail;
-- DROP TABLE IF EXISTS version_group_detail;
-- DROP TABLE IF EXISTS version_group_summary;
-- DROP TABLE IF EXISTS version_name;
-- DROP TABLE IF EXISTS version_summary;

--
-- TYPES
--


--
-- CREATE OBJECTS
--
-- TYPES
--

--
-- TABLES
--
--
-- Table 'ability_change' generated from model 'AbilityChange'
--
CREATE TABLE IF NOT EXISTS ability_change (
    version_group TEXT NOT NULL,
    effect_entries JSON NOT NULL
);
COMMENT ON TABLE ability_change IS 'Original model name - AbilityChange.';

--
-- Table 'ability_change_effect_text' generated from model 'AbilityChangeEffectText'
--
CREATE TABLE IF NOT EXISTS ability_change_effect_text (
    effect VARCHAR(6000) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE ability_change_effect_text IS 'Original model name - AbilityChangeEffectText.';

--
-- Table 'ability_detail' generated from model 'AbilityDetail'
--
CREATE TABLE IF NOT EXISTS ability_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    is_main_series BOOLEAN DEFAULT NULL,
    generation TEXT NOT NULL,
    "names" JSON NOT NULL,
    effect_entries JSON NOT NULL,
    effect_changes JSON NOT NULL,
    flavor_text_entries JSON NOT NULL,
    pokemon JSON NOT NULL
);
COMMENT ON TABLE ability_detail IS 'Original model name - AbilityDetail.';

--
-- Table 'ability_detail_pokemon_inner' generated from model 'AbilityDetailUnderscorepokemonUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS ability_detail_pokemon_inner (
    is_hidden BOOLEAN NOT NULL,
    slot INTEGER NOT NULL,
    pokemon TEXT NOT NULL
);
COMMENT ON TABLE ability_detail_pokemon_inner IS 'Original model name - AbilityDetail_pokemon_inner.';

--
-- Table 'ability_detail_pokemon_inner_pokemon' generated from model 'AbilityDetailUnderscorepokemonUnderscoreinnerUnderscorepokemon'
--
CREATE TABLE IF NOT EXISTS ability_detail_pokemon_inner_pokemon (
    "name" TEXT NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE ability_detail_pokemon_inner_pokemon IS 'Original model name - AbilityDetail_pokemon_inner_pokemon.';

--
-- Table 'ability_effect_text' generated from model 'AbilityEffectText'
--
CREATE TABLE IF NOT EXISTS ability_effect_text (
    effect VARCHAR(6000) NOT NULL,
    short_effect VARCHAR(300) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE ability_effect_text IS 'Original model name - AbilityEffectText.';

--
-- Table 'ability_flavor_text' generated from model 'AbilityFlavorText'
--
CREATE TABLE IF NOT EXISTS ability_flavor_text (
    flavor_text TEXT NOT NULL,
    "language" TEXT NOT NULL,
    version_group TEXT NOT NULL
);
COMMENT ON TABLE ability_flavor_text IS 'Original model name - AbilityFlavorText.';

--
-- Table 'ability_name' generated from model 'AbilityName'
--
CREATE TABLE IF NOT EXISTS ability_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE ability_name IS 'Original model name - AbilityName.';

--
-- Table 'ability_summary' generated from model 'AbilitySummary'
--
CREATE TABLE IF NOT EXISTS ability_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE ability_summary IS 'Original model name - AbilitySummary.';

--
-- Table 'berry_detail' generated from model 'BerryDetail'
--
CREATE TABLE IF NOT EXISTS berry_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    growth_time INTEGER NOT NULL,
    max_harvest INTEGER NOT NULL,
    natural_gift_power INTEGER NOT NULL,
    "size" INTEGER NOT NULL,
    smoothness INTEGER NOT NULL,
    soil_dryness INTEGER NOT NULL,
    firmness TEXT NOT NULL,
    flavors JSON NOT NULL,
    item TEXT NOT NULL,
    natural_gift_type TEXT NOT NULL
);
COMMENT ON TABLE berry_detail IS 'Original model name - BerryDetail.';

--
-- Table 'berry_detail_flavors_inner' generated from model 'BerryDetailUnderscoreflavorsUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS berry_detail_flavors_inner (
    potency INTEGER NOT NULL,
    flavor TEXT NOT NULL
);
COMMENT ON TABLE berry_detail_flavors_inner IS 'Original model name - BerryDetail_flavors_inner.';

--
-- Table 'berry_detail_flavors_inner_flavor' generated from model 'BerryDetailUnderscoreflavorsUnderscoreinnerUnderscoreflavor'
--
CREATE TABLE IF NOT EXISTS berry_detail_flavors_inner_flavor (
    "name" TEXT DEFAULT NULL,
    url TEXT DEFAULT NULL
);
COMMENT ON TABLE berry_detail_flavors_inner_flavor IS 'Original model name - BerryDetail_flavors_inner_flavor.';
COMMENT ON COLUMN berry_detail_flavors_inner_flavor."name" IS 'The name of the flavor';
COMMENT ON COLUMN berry_detail_flavors_inner_flavor.url IS 'The URL to get more information about the flavor';

--
-- Table 'berry_firmness_detail' generated from model 'BerryFirmnessDetail'
--
CREATE TABLE IF NOT EXISTS berry_firmness_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    berries JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE berry_firmness_detail IS 'Original model name - BerryFirmnessDetail.';

--
-- Table 'berry_firmness_name' generated from model 'BerryFirmnessName'
--
CREATE TABLE IF NOT EXISTS berry_firmness_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE berry_firmness_name IS 'Original model name - BerryFirmnessName.';

--
-- Table 'berry_firmness_summary' generated from model 'BerryFirmnessSummary'
--
CREATE TABLE IF NOT EXISTS berry_firmness_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE berry_firmness_summary IS 'Original model name - BerryFirmnessSummary.';

--
-- Table 'berry_flavor_detail' generated from model 'BerryFlavorDetail'
--
CREATE TABLE IF NOT EXISTS berry_flavor_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    berries JSON NOT NULL,
    contest_type TEXT NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE berry_flavor_detail IS 'Original model name - BerryFlavorDetail.';

--
-- Table 'berry_flavor_detail_berries_inner' generated from model 'BerryFlavorDetailUnderscoreberriesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS berry_flavor_detail_berries_inner (
    potency INTEGER NOT NULL,
    berry TEXT NOT NULL
);
COMMENT ON TABLE berry_flavor_detail_berries_inner IS 'Original model name - BerryFlavorDetail_berries_inner.';

--
-- Table 'berry_flavor_detail_berries_inner_berry' generated from model 'BerryFlavorDetailUnderscoreberriesUnderscoreinnerUnderscoreberry'
--
CREATE TABLE IF NOT EXISTS berry_flavor_detail_berries_inner_berry (
    "name" TEXT DEFAULT NULL,
    url TEXT DEFAULT NULL
);
COMMENT ON TABLE berry_flavor_detail_berries_inner_berry IS 'Original model name - BerryFlavorDetail_berries_inner_berry.';
COMMENT ON COLUMN berry_flavor_detail_berries_inner_berry."name" IS 'The name of the berry';
COMMENT ON COLUMN berry_flavor_detail_berries_inner_berry.url IS 'The URL to get more information about the berry';

--
-- Table 'berry_flavor_name' generated from model 'BerryFlavorName'
--
CREATE TABLE IF NOT EXISTS berry_flavor_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE berry_flavor_name IS 'Original model name - BerryFlavorName.';

--
-- Table 'berry_flavor_summary' generated from model 'BerryFlavorSummary'
--
CREATE TABLE IF NOT EXISTS berry_flavor_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE berry_flavor_summary IS 'Original model name - BerryFlavorSummary.';

--
-- Table 'berry_summary' generated from model 'BerrySummary'
--
CREATE TABLE IF NOT EXISTS berry_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE berry_summary IS 'Original model name - BerrySummary.';

--
-- Table 'characteristic_description' generated from model 'CharacteristicDescription'
--
CREATE TABLE IF NOT EXISTS characteristic_description (
    description VARCHAR(1000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE characteristic_description IS 'Original model name - CharacteristicDescription.';

--
-- Table 'characteristic_detail' generated from model 'CharacteristicDetail'
--
CREATE TABLE IF NOT EXISTS characteristic_detail (
    "id" INTEGER NOT NULL,
    gene_modulo INTEGER NOT NULL,
    possible_values JSON NOT NULL,
    highest_stat TEXT NOT NULL,
    descriptions JSON NOT NULL
);
COMMENT ON TABLE characteristic_detail IS 'Original model name - CharacteristicDetail.';

--
-- Table 'characteristic_summary' generated from model 'CharacteristicSummary'
--
CREATE TABLE IF NOT EXISTS characteristic_summary (
    url TEXT NOT NULL
);
COMMENT ON TABLE characteristic_summary IS 'Original model name - CharacteristicSummary.';

--
-- Table 'contest_effect_detail' generated from model 'ContestEffectDetail'
--
CREATE TABLE IF NOT EXISTS contest_effect_detail (
    "id" INTEGER NOT NULL,
    appeal INTEGER NOT NULL,
    jam INTEGER NOT NULL,
    effect_entries JSON NOT NULL,
    flavor_text_entries JSON NOT NULL
);
COMMENT ON TABLE contest_effect_detail IS 'Original model name - ContestEffectDetail.';

--
-- Table 'contest_effect_effect_text' generated from model 'ContestEffectEffectText'
--
CREATE TABLE IF NOT EXISTS contest_effect_effect_text (
    effect VARCHAR(6000) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE contest_effect_effect_text IS 'Original model name - ContestEffectEffectText.';

--
-- Table 'contest_effect_flavor_text' generated from model 'ContestEffectFlavorText'
--
CREATE TABLE IF NOT EXISTS contest_effect_flavor_text (
    flavor_text VARCHAR(500) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE contest_effect_flavor_text IS 'Original model name - ContestEffectFlavorText.';

--
-- Table 'contest_effect_summary' generated from model 'ContestEffectSummary'
--
CREATE TABLE IF NOT EXISTS contest_effect_summary (
    url TEXT NOT NULL
);
COMMENT ON TABLE contest_effect_summary IS 'Original model name - ContestEffectSummary.';

--
-- Table 'contest_type_detail' generated from model 'ContestTypeDetail'
--
CREATE TABLE IF NOT EXISTS contest_type_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    berry_flavor TEXT NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE contest_type_detail IS 'Original model name - ContestTypeDetail.';

--
-- Table 'contest_type_name' generated from model 'ContestTypeName'
--
CREATE TABLE IF NOT EXISTS contest_type_name (
    "name" VARCHAR(100) NOT NULL,
    color VARCHAR(10) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE contest_type_name IS 'Original model name - ContestTypeName.';

--
-- Table 'contest_type_summary' generated from model 'ContestTypeSummary'
--
CREATE TABLE IF NOT EXISTS contest_type_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE contest_type_summary IS 'Original model name - ContestTypeSummary.';

--
-- Table 'egg_group_detail' generated from model 'EggGroupDetail'
--
CREATE TABLE IF NOT EXISTS egg_group_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "names" JSON NOT NULL,
    pokemon_species JSON NOT NULL
);
COMMENT ON TABLE egg_group_detail IS 'Original model name - EggGroupDetail.';

--
-- Table 'egg_group_detail_pokemon_species_inner' generated from model 'EggGroupDetailUnderscorepokemonUnderscorespeciesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS egg_group_detail_pokemon_species_inner (
    "name" TEXT DEFAULT NULL,
    url TEXT DEFAULT NULL
);
COMMENT ON TABLE egg_group_detail_pokemon_species_inner IS 'Original model name - EggGroupDetail_pokemon_species_inner.';
COMMENT ON COLUMN egg_group_detail_pokemon_species_inner."name" IS 'Pokemon species name.';
COMMENT ON COLUMN egg_group_detail_pokemon_species_inner.url IS 'The URL to get more information about the species';

--
-- Table 'egg_group_name' generated from model 'EggGroupName'
--
CREATE TABLE IF NOT EXISTS egg_group_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE egg_group_name IS 'Original model name - EggGroupName.';

--
-- Table 'egg_group_summary' generated from model 'EggGroupSummary'
--
CREATE TABLE IF NOT EXISTS egg_group_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE egg_group_summary IS 'Original model name - EggGroupSummary.';

--
-- Table 'encounter_condition_detail' generated from model 'EncounterConditionDetail'
--
CREATE TABLE IF NOT EXISTS encounter_condition_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "values" JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE encounter_condition_detail IS 'Original model name - EncounterConditionDetail.';

--
-- Table 'encounter_condition_name' generated from model 'EncounterConditionName'
--
CREATE TABLE IF NOT EXISTS encounter_condition_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE encounter_condition_name IS 'Original model name - EncounterConditionName.';

--
-- Table 'encounter_condition_summary' generated from model 'EncounterConditionSummary'
--
CREATE TABLE IF NOT EXISTS encounter_condition_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE encounter_condition_summary IS 'Original model name - EncounterConditionSummary.';

--
-- Table 'encounter_condition_value_detail' generated from model 'EncounterConditionValueDetail'
--
CREATE TABLE IF NOT EXISTS encounter_condition_value_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "condition" TEXT NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE encounter_condition_value_detail IS 'Original model name - EncounterConditionValueDetail.';

--
-- Table 'encounter_condition_value_name' generated from model 'EncounterConditionValueName'
--
CREATE TABLE IF NOT EXISTS encounter_condition_value_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE encounter_condition_value_name IS 'Original model name - EncounterConditionValueName.';

--
-- Table 'encounter_condition_value_summary' generated from model 'EncounterConditionValueSummary'
--
CREATE TABLE IF NOT EXISTS encounter_condition_value_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE encounter_condition_value_summary IS 'Original model name - EncounterConditionValueSummary.';

--
-- Table 'encounter_method_detail' generated from model 'EncounterMethodDetail'
--
CREATE TABLE IF NOT EXISTS encounter_method_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "order" INTEGER DEFAULT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE encounter_method_detail IS 'Original model name - EncounterMethodDetail.';

--
-- Table 'encounter_method_name' generated from model 'EncounterMethodName'
--
CREATE TABLE IF NOT EXISTS encounter_method_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE encounter_method_name IS 'Original model name - EncounterMethodName.';

--
-- Table 'encounter_method_summary' generated from model 'EncounterMethodSummary'
--
CREATE TABLE IF NOT EXISTS encounter_method_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE encounter_method_summary IS 'Original model name - EncounterMethodSummary.';

--
-- Table 'evolution_chain_detail' generated from model 'EvolutionChainDetail'
--
CREATE TABLE IF NOT EXISTS evolution_chain_detail (
    "id" INTEGER NOT NULL,
    baby_trigger_item TEXT NOT NULL,
    "chain" TEXT NOT NULL
);
COMMENT ON TABLE evolution_chain_detail IS 'Original model name - EvolutionChainDetail.';

--
-- Table 'evolution_chain_detail_chain' generated from model 'EvolutionChainDetailUnderscorechain'
--
CREATE TABLE IF NOT EXISTS evolution_chain_detail_chain (
    evolution_details JSON NOT NULL,
    evolves_to JSON NOT NULL,
    is_baby BOOLEAN NOT NULL,
    species TEXT NOT NULL
);
COMMENT ON TABLE evolution_chain_detail_chain IS 'Original model name - EvolutionChainDetail_chain.';

--
-- Table 'evolution_chain_detail_chain_evolves_to_inner' generated from model 'EvolutionChainDetailUnderscorechainUnderscoreevolvesUnderscoretoUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS evolution_chain_detail_chain_evolves_to_inner (
    evolution_details JSON NOT NULL,
    is_baby BOOLEAN NOT NULL,
    species TEXT NOT NULL
);
COMMENT ON TABLE evolution_chain_detail_chain_evolves_to_inner IS 'Original model name - EvolutionChainDetail_chain_evolves_to_inner.';

--
-- Table 'evolution_chain_detail_chain_evolves_to_inner_evolution_details' generated from model 'EvolutionChainDetailUnderscorechainUnderscoreevolvesUnderscoretoUnderscoreinnerUnderscoreevolutionUnderscoredetailsUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS evolution_chain_detail_chain_evolves_to_inner_evolution_details (
    gender TEXT NOT NULL,
    held_item TEXT NOT NULL,
    item TEXT NOT NULL,
    known_move TEXT NOT NULL,
    known_move_type TEXT NOT NULL,
    "location" TEXT NOT NULL,
    min_affection INTEGER NOT NULL,
    min_beauty INTEGER NOT NULL,
    min_happiness INTEGER NOT NULL,
    min_level INTEGER NOT NULL,
    needs_overworld_rain BOOLEAN NOT NULL,
    party_species TEXT NOT NULL,
    party_type TEXT NOT NULL,
    relative_physical_stats TEXT NOT NULL,
    time_of_day TEXT NOT NULL,
    trade_species TEXT NOT NULL,
    "trigger" TEXT NOT NULL,
    turn_upside_down BOOLEAN NOT NULL
);
COMMENT ON TABLE evolution_chain_detail_chain_evolves_to_inner_evolution_details IS 'Original model name - EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner.';

--
-- Table 'evolution_chain_detail_chain_evolves_to_inner_evolution_details' generated from model 'EvolutionChainDetailUnderscorechainUnderscoreevolvesUnderscoretoUnderscoreinnerUnderscoreevolutionUnderscoredetailsUnderscoreinnerUnderscoregender'
--
CREATE TABLE IF NOT EXISTS evolution_chain_detail_chain_evolves_to_inner_evolution_details (
    "name" TEXT NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE evolution_chain_detail_chain_evolves_to_inner_evolution_details IS 'Original model name - EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.';

--
-- Table 'evolution_chain_summary' generated from model 'EvolutionChainSummary'
--
CREATE TABLE IF NOT EXISTS evolution_chain_summary (
    url TEXT NOT NULL
);
COMMENT ON TABLE evolution_chain_summary IS 'Original model name - EvolutionChainSummary.';

--
-- Table 'evolution_trigger_detail' generated from model 'EvolutionTriggerDetail'
--
CREATE TABLE IF NOT EXISTS evolution_trigger_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "names" JSON NOT NULL,
    pokemon_species JSON NOT NULL
);
COMMENT ON TABLE evolution_trigger_detail IS 'Original model name - EvolutionTriggerDetail.';

--
-- Table 'evolution_trigger_name' generated from model 'EvolutionTriggerName'
--
CREATE TABLE IF NOT EXISTS evolution_trigger_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE evolution_trigger_name IS 'Original model name - EvolutionTriggerName.';

--
-- Table 'evolution_trigger_summary' generated from model 'EvolutionTriggerSummary'
--
CREATE TABLE IF NOT EXISTS evolution_trigger_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE evolution_trigger_summary IS 'Original model name - EvolutionTriggerSummary.';

--
-- Table 'experience' generated from model 'Experience'
--
CREATE TABLE IF NOT EXISTS experience (
    "level" INTEGER NOT NULL,
    experience INTEGER NOT NULL
);
COMMENT ON TABLE experience IS 'Original model name - Experience.';

--
-- Table 'gender_detail' generated from model 'GenderDetail'
--
CREATE TABLE IF NOT EXISTS gender_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    pokemon_species_details JSON NOT NULL,
    required_for_evolution JSON NOT NULL
);
COMMENT ON TABLE gender_detail IS 'Original model name - GenderDetail.';

--
-- Table 'gender_detail_pokemon_species_details_inner' generated from model 'GenderDetailUnderscorepokemonUnderscorespeciesUnderscoredetailsUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS gender_detail_pokemon_species_details_inner (
    rate INTEGER NOT NULL,
    pokemon_species TEXT NOT NULL
);
COMMENT ON TABLE gender_detail_pokemon_species_details_inner IS 'Original model name - GenderDetail_pokemon_species_details_inner.';

--
-- Table 'gender_summary' generated from model 'GenderSummary'
--
CREATE TABLE IF NOT EXISTS gender_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE gender_summary IS 'Original model name - GenderSummary.';

--
-- Table 'generation_detail' generated from model 'GenerationDetail'
--
CREATE TABLE IF NOT EXISTS generation_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    abilities JSON NOT NULL,
    main_region TEXT NOT NULL,
    moves JSON NOT NULL,
    "names" JSON NOT NULL,
    pokemon_species JSON NOT NULL,
    "types" JSON NOT NULL,
    version_groups JSON NOT NULL
);
COMMENT ON TABLE generation_detail IS 'Original model name - GenerationDetail.';

--
-- Table 'generation_name' generated from model 'GenerationName'
--
CREATE TABLE IF NOT EXISTS generation_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE generation_name IS 'Original model name - GenerationName.';

--
-- Table 'generation_summary' generated from model 'GenerationSummary'
--
CREATE TABLE IF NOT EXISTS generation_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE generation_summary IS 'Original model name - GenerationSummary.';

--
-- Table 'growth_rate_description' generated from model 'GrowthRateDescription'
--
CREATE TABLE IF NOT EXISTS growth_rate_description (
    description VARCHAR(1000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE growth_rate_description IS 'Original model name - GrowthRateDescription.';

--
-- Table 'growth_rate_detail' generated from model 'GrowthRateDetail'
--
CREATE TABLE IF NOT EXISTS growth_rate_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    formula VARCHAR(500) NOT NULL,
    descriptions JSON NOT NULL,
    levels JSON NOT NULL,
    pokemon_species JSON NOT NULL
);
COMMENT ON TABLE growth_rate_detail IS 'Original model name - GrowthRateDetail.';

--
-- Table 'growth_rate_summary' generated from model 'GrowthRateSummary'
--
CREATE TABLE IF NOT EXISTS growth_rate_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE growth_rate_summary IS 'Original model name - GrowthRateSummary.';

--
-- Table 'item_attribute_description' generated from model 'ItemAttributeDescription'
--
CREATE TABLE IF NOT EXISTS item_attribute_description (
    description VARCHAR(1000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_attribute_description IS 'Original model name - ItemAttributeDescription.';

--
-- Table 'item_attribute_detail' generated from model 'ItemAttributeDetail'
--
CREATE TABLE IF NOT EXISTS item_attribute_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    descriptions JSON NOT NULL,
    items JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE item_attribute_detail IS 'Original model name - ItemAttributeDetail.';

--
-- Table 'item_attribute_name' generated from model 'ItemAttributeName'
--
CREATE TABLE IF NOT EXISTS item_attribute_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_attribute_name IS 'Original model name - ItemAttributeName.';

--
-- Table 'item_attribute_summary' generated from model 'ItemAttributeSummary'
--
CREATE TABLE IF NOT EXISTS item_attribute_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE item_attribute_summary IS 'Original model name - ItemAttributeSummary.';

--
-- Table 'item_category_detail' generated from model 'ItemCategoryDetail'
--
CREATE TABLE IF NOT EXISTS item_category_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    items JSON NOT NULL,
    "names" JSON NOT NULL,
    pocket TEXT NOT NULL
);
COMMENT ON TABLE item_category_detail IS 'Original model name - ItemCategoryDetail.';

--
-- Table 'item_category_name' generated from model 'ItemCategoryName'
--
CREATE TABLE IF NOT EXISTS item_category_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_category_name IS 'Original model name - ItemCategoryName.';

--
-- Table 'item_category_summary' generated from model 'ItemCategorySummary'
--
CREATE TABLE IF NOT EXISTS item_category_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE item_category_summary IS 'Original model name - ItemCategorySummary.';

--
-- Table 'item_detail' generated from model 'ItemDetail'
--
CREATE TABLE IF NOT EXISTS item_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "cost" INTEGER DEFAULT NULL,
    fling_power INTEGER DEFAULT NULL,
    fling_effect TEXT NOT NULL,
    "attributes" JSON NOT NULL,
    category TEXT NOT NULL,
    effect_entries JSON NOT NULL,
    flavor_text_entries JSON NOT NULL,
    game_indices JSON NOT NULL,
    "names" JSON NOT NULL,
    held_by_pokemon JSON NOT NULL,
    sprites TEXT NOT NULL,
    baby_trigger_for TEXT NOT NULL,
    machines JSON NOT NULL
);
COMMENT ON TABLE item_detail IS 'Original model name - ItemDetail.';

--
-- Table 'item_detail_baby_trigger_for' generated from model 'ItemDetailUnderscorebabyUnderscoretriggerUnderscorefor'
--
CREATE TABLE IF NOT EXISTS item_detail_baby_trigger_for (
    url TEXT NOT NULL
);
COMMENT ON TABLE item_detail_baby_trigger_for IS 'Original model name - ItemDetail_baby_trigger_for.';

--
-- Table 'item_detail_held_by_pokemon_inner' generated from model 'ItemDetailUnderscoreheldUnderscorebyUnderscorepokemonUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS item_detail_held_by_pokemon_inner (
    pokemon TEXT NOT NULL,
    version_details JSON NOT NULL
);
COMMENT ON TABLE item_detail_held_by_pokemon_inner IS 'Original model name - ItemDetail_held_by_pokemon_inner.';
COMMENT ON COLUMN item_detail_held_by_pokemon_inner.version_details IS 'Original param name - version-details.';

--
-- Table 'item_detail_held_by_pokemon_inner_version_details_inner' generated from model 'ItemDetailUnderscoreheldUnderscorebyUnderscorepokemonUnderscoreinnerUnderscoreversionUnderscoredetailsUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS item_detail_held_by_pokemon_inner_version_details_inner (
    rarity INTEGER NOT NULL,
    "version" TEXT NOT NULL
);
COMMENT ON TABLE item_detail_held_by_pokemon_inner_version_details_inner IS 'Original model name - ItemDetail_held_by_pokemon_inner_version_details_inner.';

--
-- Table 'item_detail_machines_inner' generated from model 'ItemDetailUnderscoremachinesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS item_detail_machines_inner (
    machine TEXT NOT NULL,
    version_group TEXT NOT NULL
);
COMMENT ON TABLE item_detail_machines_inner IS 'Original model name - ItemDetail_machines_inner.';

--
-- Table 'item_detail_sprites' generated from model 'ItemDetailUnderscoresprites'
--
CREATE TABLE IF NOT EXISTS item_detail_sprites (
    "default" TEXT NOT NULL
);
COMMENT ON TABLE item_detail_sprites IS 'Original model name - ItemDetail_sprites.';

--
-- Table 'item_effect_text' generated from model 'ItemEffectText'
--
CREATE TABLE IF NOT EXISTS item_effect_text (
    effect VARCHAR(6000) NOT NULL,
    short_effect VARCHAR(300) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_effect_text IS 'Original model name - ItemEffectText.';

--
-- Table 'item_flavor_text' generated from model 'ItemFlavorText'
--
CREATE TABLE IF NOT EXISTS item_flavor_text (
    "text" TEXT NOT NULL,
    version_group TEXT NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_flavor_text IS 'Original model name - ItemFlavorText.';

--
-- Table 'item_fling_effect_detail' generated from model 'ItemFlingEffectDetail'
--
CREATE TABLE IF NOT EXISTS item_fling_effect_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    effect_entries JSON NOT NULL,
    items JSON NOT NULL
);
COMMENT ON TABLE item_fling_effect_detail IS 'Original model name - ItemFlingEffectDetail.';

--
-- Table 'item_fling_effect_effect_text' generated from model 'ItemFlingEffectEffectText'
--
CREATE TABLE IF NOT EXISTS item_fling_effect_effect_text (
    effect VARCHAR(6000) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_fling_effect_effect_text IS 'Original model name - ItemFlingEffectEffectText.';

--
-- Table 'item_fling_effect_summary' generated from model 'ItemFlingEffectSummary'
--
CREATE TABLE IF NOT EXISTS item_fling_effect_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE item_fling_effect_summary IS 'Original model name - ItemFlingEffectSummary.';

--
-- Table 'item_game_index' generated from model 'ItemGameIndex'
--
CREATE TABLE IF NOT EXISTS item_game_index (
    game_index INTEGER NOT NULL,
    generation TEXT NOT NULL
);
COMMENT ON TABLE item_game_index IS 'Original model name - ItemGameIndex.';

--
-- Table 'item_name' generated from model 'ItemName'
--
CREATE TABLE IF NOT EXISTS item_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_name IS 'Original model name - ItemName.';

--
-- Table 'item_pocket_detail' generated from model 'ItemPocketDetail'
--
CREATE TABLE IF NOT EXISTS item_pocket_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    categories JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE item_pocket_detail IS 'Original model name - ItemPocketDetail.';

--
-- Table 'item_pocket_name' generated from model 'ItemPocketName'
--
CREATE TABLE IF NOT EXISTS item_pocket_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_pocket_name IS 'Original model name - ItemPocketName.';

--
-- Table 'item_pocket_summary' generated from model 'ItemPocketSummary'
--
CREATE TABLE IF NOT EXISTS item_pocket_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE item_pocket_summary IS 'Original model name - ItemPocketSummary.';

--
-- Table 'item_summary' generated from model 'ItemSummary'
--
CREATE TABLE IF NOT EXISTS item_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE item_summary IS 'Original model name - ItemSummary.';

--
-- Table 'language_detail' generated from model 'LanguageDetail'
--
CREATE TABLE IF NOT EXISTS language_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    official BOOLEAN DEFAULT NULL,
    iso639 VARCHAR(10) NOT NULL,
    iso3166 VARCHAR(2) NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE language_detail IS 'Original model name - LanguageDetail.';

--
-- Table 'language_name' generated from model 'LanguageName'
--
CREATE TABLE IF NOT EXISTS language_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE language_name IS 'Original model name - LanguageName.';

--
-- Table 'language_summary' generated from model 'LanguageSummary'
--
CREATE TABLE IF NOT EXISTS language_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE language_summary IS 'Original model name - LanguageSummary.';

--
-- Table 'location_area_detail' generated from model 'LocationAreaDetail'
--
CREATE TABLE IF NOT EXISTS location_area_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    game_index INTEGER NOT NULL,
    encounter_method_rates JSON NOT NULL,
    "location" TEXT NOT NULL,
    "names" JSON NOT NULL,
    pokemon_encounters JSON NOT NULL
);
COMMENT ON TABLE location_area_detail IS 'Original model name - LocationAreaDetail.';

--
-- Table 'location_area_detail_encounter_method_rates_inner' generated from model 'LocationAreaDetailUnderscoreencounterUnderscoremethodUnderscoreratesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS location_area_detail_encounter_method_rates_inner (
    encounter_method TEXT NOT NULL,
    version_details JSON NOT NULL
);
COMMENT ON TABLE location_area_detail_encounter_method_rates_inner IS 'Original model name - LocationAreaDetail_encounter_method_rates_inner.';

--
-- Table 'location_area_detail_encounter_method_rates_inner_version_detai' generated from model 'LocationAreaDetailUnderscoreencounterUnderscoremethodUnderscoreratesUnderscoreinnerUnderscoreversionUnderscoredetailsUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS location_area_detail_encounter_method_rates_inner_version_detai (
    rate INTEGER NOT NULL,
    "version" TEXT NOT NULL
);
COMMENT ON TABLE location_area_detail_encounter_method_rates_inner_version_detai IS 'Original model name - LocationAreaDetail_encounter_method_rates_inner_version_details_inner.';

--
-- Table 'location_area_detail_pokemon_encounters_inner' generated from model 'LocationAreaDetailUnderscorepokemonUnderscoreencountersUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS location_area_detail_pokemon_encounters_inner (
    pokemon TEXT NOT NULL,
    version_details JSON NOT NULL
);
COMMENT ON TABLE location_area_detail_pokemon_encounters_inner IS 'Original model name - LocationAreaDetail_pokemon_encounters_inner.';

--
-- Table 'location_area_detail_pokemon_encounters_inner_version_details_i' generated from model 'LocationAreaDetailUnderscorepokemonUnderscoreencountersUnderscoreinnerUnderscoreversionUnderscoredetailsUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS location_area_detail_pokemon_encounters_inner_version_details_i (
    "version" TEXT NOT NULL,
    max_chance INTEGER NOT NULL,
    encounter_details TEXT NOT NULL
);
COMMENT ON TABLE location_area_detail_pokemon_encounters_inner_version_details_i IS 'Original model name - LocationAreaDetail_pokemon_encounters_inner_version_details_inner.';

--
-- Table 'location_area_detail_pokemon_encounters_inner_version_details_i' generated from model 'LocationAreaDetailUnderscorepokemonUnderscoreencountersUnderscoreinnerUnderscoreversionUnderscoredetailsUnderscoreinnerUnderscoreencounterUnderscoredetails'
--
CREATE TABLE IF NOT EXISTS location_area_detail_pokemon_encounters_inner_version_details_i (
    min_level INTEGER NOT NULL,
    max_level INTEGER NOT NULL,
    condition_values TEXT DEFAULT NULL,
    chance INTEGER NOT NULL,
    "method" TEXT NOT NULL
);
COMMENT ON TABLE location_area_detail_pokemon_encounters_inner_version_details_i IS 'Original model name - LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details.';

--
-- Table 'location_area_name' generated from model 'LocationAreaName'
--
CREATE TABLE IF NOT EXISTS location_area_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE location_area_name IS 'Original model name - LocationAreaName.';

--
-- Table 'location_area_summary' generated from model 'LocationAreaSummary'
--
CREATE TABLE IF NOT EXISTS location_area_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE location_area_summary IS 'Original model name - LocationAreaSummary.';

--
-- Table 'location_detail' generated from model 'LocationDetail'
--
CREATE TABLE IF NOT EXISTS location_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    region TEXT NOT NULL,
    "names" JSON NOT NULL,
    game_indices JSON NOT NULL,
    areas JSON NOT NULL
);
COMMENT ON TABLE location_detail IS 'Original model name - LocationDetail.';

--
-- Table 'location_game_index' generated from model 'LocationGameIndex'
--
CREATE TABLE IF NOT EXISTS location_game_index (
    game_index INTEGER NOT NULL,
    generation TEXT NOT NULL
);
COMMENT ON TABLE location_game_index IS 'Original model name - LocationGameIndex.';

--
-- Table 'location_name' generated from model 'LocationName'
--
CREATE TABLE IF NOT EXISTS location_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE location_name IS 'Original model name - LocationName.';

--
-- Table 'location_summary' generated from model 'LocationSummary'
--
CREATE TABLE IF NOT EXISTS location_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE location_summary IS 'Original model name - LocationSummary.';

--
-- Table 'machine_detail' generated from model 'MachineDetail'
--
CREATE TABLE IF NOT EXISTS machine_detail (
    "id" INTEGER NOT NULL,
    item TEXT NOT NULL,
    version_group TEXT NOT NULL,
    "move" TEXT NOT NULL
);
COMMENT ON TABLE machine_detail IS 'Original model name - MachineDetail.';

--
-- Table 'machine_summary' generated from model 'MachineSummary'
--
CREATE TABLE IF NOT EXISTS machine_summary (
    url TEXT NOT NULL
);
COMMENT ON TABLE machine_summary IS 'Original model name - MachineSummary.';

--
-- Table 'move_battle_style_detail' generated from model 'MoveBattleStyleDetail'
--
CREATE TABLE IF NOT EXISTS move_battle_style_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE move_battle_style_detail IS 'Original model name - MoveBattleStyleDetail.';

--
-- Table 'move_battle_style_name' generated from model 'MoveBattleStyleName'
--
CREATE TABLE IF NOT EXISTS move_battle_style_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_battle_style_name IS 'Original model name - MoveBattleStyleName.';

--
-- Table 'move_battle_style_summary' generated from model 'MoveBattleStyleSummary'
--
CREATE TABLE IF NOT EXISTS move_battle_style_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_battle_style_summary IS 'Original model name - MoveBattleStyleSummary.';

--
-- Table 'move_change' generated from model 'MoveChange'
--
CREATE TABLE IF NOT EXISTS move_change (
    accuracy INTEGER DEFAULT NULL,
    "power" INTEGER DEFAULT NULL,
    pp INTEGER DEFAULT NULL,
    effect_chance INTEGER NOT NULL,
    effect_entries JSON NOT NULL,
    "type" TEXT NOT NULL,
    version_group TEXT NOT NULL
);
COMMENT ON TABLE move_change IS 'Original model name - MoveChange.';

--
-- Table 'move_change_effect_entries_inner' generated from model 'MoveChangeUnderscoreeffectUnderscoreentriesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS move_change_effect_entries_inner (
    effect TEXT NOT NULL,
    short_effect TEXT NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_change_effect_entries_inner IS 'Original model name - MoveChange_effect_entries_inner.';

--
-- Table 'move_damage_class_description' generated from model 'MoveDamageClassDescription'
--
CREATE TABLE IF NOT EXISTS move_damage_class_description (
    description VARCHAR(1000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_damage_class_description IS 'Original model name - MoveDamageClassDescription.';

--
-- Table 'move_damage_class_detail' generated from model 'MoveDamageClassDetail'
--
CREATE TABLE IF NOT EXISTS move_damage_class_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    descriptions JSON NOT NULL,
    moves JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE move_damage_class_detail IS 'Original model name - MoveDamageClassDetail.';

--
-- Table 'move_damage_class_name' generated from model 'MoveDamageClassName'
--
CREATE TABLE IF NOT EXISTS move_damage_class_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_damage_class_name IS 'Original model name - MoveDamageClassName.';

--
-- Table 'move_damage_class_summary' generated from model 'MoveDamageClassSummary'
--
CREATE TABLE IF NOT EXISTS move_damage_class_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_damage_class_summary IS 'Original model name - MoveDamageClassSummary.';

--
-- Table 'move_detail' generated from model 'MoveDetail'
--
CREATE TABLE IF NOT EXISTS move_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    accuracy INTEGER DEFAULT NULL,
    effect_chance INTEGER NOT NULL,
    pp INTEGER DEFAULT NULL,
    priority INTEGER DEFAULT NULL,
    "power" INTEGER DEFAULT NULL,
    contest_combos TEXT NOT NULL,
    contest_type TEXT NOT NULL,
    contest_effect TEXT NOT NULL,
    damage_class TEXT NOT NULL,
    effect_entries JSON NOT NULL,
    effect_changes JSON NOT NULL,
    generation TEXT NOT NULL,
    meta TEXT NOT NULL,
    "names" JSON NOT NULL,
    past_values JSON NOT NULL,
    stat_changes JSON NOT NULL,
    super_contest_effect TEXT NOT NULL,
    "target" TEXT NOT NULL,
    "type" TEXT NOT NULL,
    machines JSON NOT NULL,
    flavor_text_entries JSON NOT NULL,
    learned_by_pokemon JSON NOT NULL
);
COMMENT ON TABLE move_detail IS 'Original model name - MoveDetail.';

--
-- Table 'move_detail_contest_combos' generated from model 'MoveDetailUnderscorecontestUnderscorecombos'
--
CREATE TABLE IF NOT EXISTS move_detail_contest_combos (
    normal TEXT NOT NULL,
    super TEXT NOT NULL
);
COMMENT ON TABLE move_detail_contest_combos IS 'Original model name - MoveDetail_contest_combos.';

--
-- Table 'move_detail_contest_combos_normal' generated from model 'MoveDetailUnderscorecontestUnderscorecombosUnderscorenormal'
--
CREATE TABLE IF NOT EXISTS move_detail_contest_combos_normal (
    use_before JSON NOT NULL,
    use_after JSON NOT NULL
);
COMMENT ON TABLE move_detail_contest_combos_normal IS 'Original model name - MoveDetail_contest_combos_normal.';

--
-- Table 'move_detail_effect_changes_inner' generated from model 'MoveDetailUnderscoreeffectUnderscorechangesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS move_detail_effect_changes_inner (
    effect_entries JSON NOT NULL,
    version_group TEXT NOT NULL
);
COMMENT ON TABLE move_detail_effect_changes_inner IS 'Original model name - MoveDetail_effect_changes_inner.';

--
-- Table 'move_detail_effect_changes_inner_effect_entries_inner' generated from model 'MoveDetailUnderscoreeffectUnderscorechangesUnderscoreinnerUnderscoreeffectUnderscoreentriesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS move_detail_effect_changes_inner_effect_entries_inner (
    effect TEXT NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_detail_effect_changes_inner_effect_entries_inner IS 'Original model name - MoveDetail_effect_changes_inner_effect_entries_inner.';

--
-- Table 'move_detail_machines_inner' generated from model 'MoveDetailUnderscoremachinesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS move_detail_machines_inner (
    machine TEXT NOT NULL,
    version_group TEXT NOT NULL
);
COMMENT ON TABLE move_detail_machines_inner IS 'Original model name - MoveDetail_machines_inner.';

--
-- Table 'move_detail_machines_inner_machine' generated from model 'MoveDetailUnderscoremachinesUnderscoreinnerUnderscoremachine'
--
CREATE TABLE IF NOT EXISTS move_detail_machines_inner_machine (
    url TEXT NOT NULL
);
COMMENT ON TABLE move_detail_machines_inner_machine IS 'Original model name - MoveDetail_machines_inner_machine.';

--
-- Table 'move_detail_stat_changes_inner' generated from model 'MoveDetailUnderscorestatUnderscorechangesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS move_detail_stat_changes_inner (
    change INTEGER NOT NULL,
    stat TEXT NOT NULL
);
COMMENT ON TABLE move_detail_stat_changes_inner IS 'Original model name - MoveDetail_stat_changes_inner.';

--
-- Table 'move_flavor_text' generated from model 'MoveFlavorText'
--
CREATE TABLE IF NOT EXISTS move_flavor_text (
    flavor_text TEXT NOT NULL,
    "language" TEXT NOT NULL,
    version_group TEXT NOT NULL
);
COMMENT ON TABLE move_flavor_text IS 'Original model name - MoveFlavorText.';

--
-- Table 'move_learn_method_description' generated from model 'MoveLearnMethodDescription'
--
CREATE TABLE IF NOT EXISTS move_learn_method_description (
    description VARCHAR(1000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_learn_method_description IS 'Original model name - MoveLearnMethodDescription.';

--
-- Table 'move_learn_method_detail' generated from model 'MoveLearnMethodDetail'
--
CREATE TABLE IF NOT EXISTS move_learn_method_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "names" JSON NOT NULL,
    descriptions JSON NOT NULL,
    version_groups JSON NOT NULL
);
COMMENT ON TABLE move_learn_method_detail IS 'Original model name - MoveLearnMethodDetail.';

--
-- Table 'move_learn_method_name' generated from model 'MoveLearnMethodName'
--
CREATE TABLE IF NOT EXISTS move_learn_method_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_learn_method_name IS 'Original model name - MoveLearnMethodName.';

--
-- Table 'move_learn_method_summary' generated from model 'MoveLearnMethodSummary'
--
CREATE TABLE IF NOT EXISTS move_learn_method_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_learn_method_summary IS 'Original model name - MoveLearnMethodSummary.';

--
-- Table 'move_meta' generated from model 'MoveMeta'
--
CREATE TABLE IF NOT EXISTS move_meta (
    ailment TEXT NOT NULL,
    category TEXT NOT NULL,
    min_hits INTEGER DEFAULT NULL,
    max_hits INTEGER DEFAULT NULL,
    min_turns INTEGER DEFAULT NULL,
    max_turns INTEGER DEFAULT NULL,
    drain INTEGER DEFAULT NULL,
    healing INTEGER DEFAULT NULL,
    crit_rate INTEGER DEFAULT NULL,
    ailment_chance INTEGER DEFAULT NULL,
    flinch_chance INTEGER DEFAULT NULL,
    stat_chance INTEGER DEFAULT NULL
);
COMMENT ON TABLE move_meta IS 'Original model name - MoveMeta.';

--
-- Table 'move_meta_ailment_detail' generated from model 'MoveMetaAilmentDetail'
--
CREATE TABLE IF NOT EXISTS move_meta_ailment_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    moves JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE move_meta_ailment_detail IS 'Original model name - MoveMetaAilmentDetail.';

--
-- Table 'move_meta_ailment_name' generated from model 'MoveMetaAilmentName'
--
CREATE TABLE IF NOT EXISTS move_meta_ailment_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_meta_ailment_name IS 'Original model name - MoveMetaAilmentName.';

--
-- Table 'move_meta_ailment_summary' generated from model 'MoveMetaAilmentSummary'
--
CREATE TABLE IF NOT EXISTS move_meta_ailment_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_meta_ailment_summary IS 'Original model name - MoveMetaAilmentSummary.';

--
-- Table 'move_meta_category_description' generated from model 'MoveMetaCategoryDescription'
--
CREATE TABLE IF NOT EXISTS move_meta_category_description (
    description VARCHAR(1000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_meta_category_description IS 'Original model name - MoveMetaCategoryDescription.';

--
-- Table 'move_meta_category_detail' generated from model 'MoveMetaCategoryDetail'
--
CREATE TABLE IF NOT EXISTS move_meta_category_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    descriptions JSON NOT NULL,
    moves JSON NOT NULL
);
COMMENT ON TABLE move_meta_category_detail IS 'Original model name - MoveMetaCategoryDetail.';

--
-- Table 'move_meta_category_summary' generated from model 'MoveMetaCategorySummary'
--
CREATE TABLE IF NOT EXISTS move_meta_category_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_meta_category_summary IS 'Original model name - MoveMetaCategorySummary.';

--
-- Table 'move_name' generated from model 'MoveName'
--
CREATE TABLE IF NOT EXISTS move_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_name IS 'Original model name - MoveName.';

--
-- Table 'move_summary' generated from model 'MoveSummary'
--
CREATE TABLE IF NOT EXISTS move_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_summary IS 'Original model name - MoveSummary.';

--
-- Table 'move_target_description' generated from model 'MoveTargetDescription'
--
CREATE TABLE IF NOT EXISTS move_target_description (
    description VARCHAR(1000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_target_description IS 'Original model name - MoveTargetDescription.';

--
-- Table 'move_target_detail' generated from model 'MoveTargetDetail'
--
CREATE TABLE IF NOT EXISTS move_target_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    descriptions JSON NOT NULL,
    moves JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE move_target_detail IS 'Original model name - MoveTargetDetail.';

--
-- Table 'move_target_name' generated from model 'MoveTargetName'
--
CREATE TABLE IF NOT EXISTS move_target_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_target_name IS 'Original model name - MoveTargetName.';

--
-- Table 'move_target_summary' generated from model 'MoveTargetSummary'
--
CREATE TABLE IF NOT EXISTS move_target_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_target_summary IS 'Original model name - MoveTargetSummary.';

--
-- Table 'nature_battle_style_preference' generated from model 'NatureBattleStylePreference'
--
CREATE TABLE IF NOT EXISTS nature_battle_style_preference (
    low_hp_preference INTEGER NOT NULL,
    high_hp_preference INTEGER NOT NULL,
    move_battle_style TEXT NOT NULL
);
COMMENT ON TABLE nature_battle_style_preference IS 'Original model name - NatureBattleStylePreference.';

--
-- Table 'nature_detail' generated from model 'NatureDetail'
--
CREATE TABLE IF NOT EXISTS nature_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    decreased_stat TEXT NOT NULL,
    increased_stat TEXT NOT NULL,
    likes_flavor TEXT NOT NULL,
    hates_flavor TEXT NOT NULL,
    berries JSON NOT NULL,
    pokeathlon_stat_changes JSON NOT NULL,
    move_battle_style_preferences JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE nature_detail IS 'Original model name - NatureDetail.';

--
-- Table 'nature_detail_pokeathlon_stat_changes_inner' generated from model 'NatureDetailUnderscorepokeathlonUnderscorestatUnderscorechangesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS nature_detail_pokeathlon_stat_changes_inner (
    max_change INTEGER NOT NULL,
    pokeathlon_stat TEXT NOT NULL
);
COMMENT ON TABLE nature_detail_pokeathlon_stat_changes_inner IS 'Original model name - NatureDetail_pokeathlon_stat_changes_inner.';

--
-- Table 'nature_name' generated from model 'NatureName'
--
CREATE TABLE IF NOT EXISTS nature_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE nature_name IS 'Original model name - NatureName.';

--
-- Table 'nature_summary' generated from model 'NatureSummary'
--
CREATE TABLE IF NOT EXISTS nature_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE nature_summary IS 'Original model name - NatureSummary.';

--
-- Table 'paginated_ability_summary_list' generated from model 'PaginatedAbilitySummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_ability_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_ability_summary_list IS 'Original model name - PaginatedAbilitySummaryList.';

--
-- Table 'paginated_berry_firmness_summary_list' generated from model 'PaginatedBerryFirmnessSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_berry_firmness_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_berry_firmness_summary_list IS 'Original model name - PaginatedBerryFirmnessSummaryList.';

--
-- Table 'paginated_berry_flavor_summary_list' generated from model 'PaginatedBerryFlavorSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_berry_flavor_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_berry_flavor_summary_list IS 'Original model name - PaginatedBerryFlavorSummaryList.';

--
-- Table 'paginated_berry_summary_list' generated from model 'PaginatedBerrySummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_berry_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_berry_summary_list IS 'Original model name - PaginatedBerrySummaryList.';

--
-- Table 'paginated_characteristic_summary_list' generated from model 'PaginatedCharacteristicSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_characteristic_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_characteristic_summary_list IS 'Original model name - PaginatedCharacteristicSummaryList.';

--
-- Table 'paginated_contest_effect_summary_list' generated from model 'PaginatedContestEffectSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_contest_effect_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_contest_effect_summary_list IS 'Original model name - PaginatedContestEffectSummaryList.';

--
-- Table 'paginated_contest_type_summary_list' generated from model 'PaginatedContestTypeSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_contest_type_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_contest_type_summary_list IS 'Original model name - PaginatedContestTypeSummaryList.';

--
-- Table 'paginated_egg_group_summary_list' generated from model 'PaginatedEggGroupSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_egg_group_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_egg_group_summary_list IS 'Original model name - PaginatedEggGroupSummaryList.';

--
-- Table 'paginated_encounter_condition_summary_list' generated from model 'PaginatedEncounterConditionSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_encounter_condition_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_encounter_condition_summary_list IS 'Original model name - PaginatedEncounterConditionSummaryList.';

--
-- Table 'paginated_encounter_condition_value_summary_list' generated from model 'PaginatedEncounterConditionValueSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_encounter_condition_value_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_encounter_condition_value_summary_list IS 'Original model name - PaginatedEncounterConditionValueSummaryList.';

--
-- Table 'paginated_encounter_method_summary_list' generated from model 'PaginatedEncounterMethodSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_encounter_method_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_encounter_method_summary_list IS 'Original model name - PaginatedEncounterMethodSummaryList.';

--
-- Table 'paginated_evolution_chain_summary_list' generated from model 'PaginatedEvolutionChainSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_evolution_chain_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_evolution_chain_summary_list IS 'Original model name - PaginatedEvolutionChainSummaryList.';

--
-- Table 'paginated_evolution_trigger_summary_list' generated from model 'PaginatedEvolutionTriggerSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_evolution_trigger_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_evolution_trigger_summary_list IS 'Original model name - PaginatedEvolutionTriggerSummaryList.';

--
-- Table 'paginated_gender_summary_list' generated from model 'PaginatedGenderSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_gender_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_gender_summary_list IS 'Original model name - PaginatedGenderSummaryList.';

--
-- Table 'paginated_generation_summary_list' generated from model 'PaginatedGenerationSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_generation_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_generation_summary_list IS 'Original model name - PaginatedGenerationSummaryList.';

--
-- Table 'paginated_growth_rate_summary_list' generated from model 'PaginatedGrowthRateSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_growth_rate_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_growth_rate_summary_list IS 'Original model name - PaginatedGrowthRateSummaryList.';

--
-- Table 'paginated_item_attribute_summary_list' generated from model 'PaginatedItemAttributeSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_item_attribute_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_item_attribute_summary_list IS 'Original model name - PaginatedItemAttributeSummaryList.';

--
-- Table 'paginated_item_category_summary_list' generated from model 'PaginatedItemCategorySummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_item_category_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_item_category_summary_list IS 'Original model name - PaginatedItemCategorySummaryList.';

--
-- Table 'paginated_item_fling_effect_summary_list' generated from model 'PaginatedItemFlingEffectSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_item_fling_effect_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_item_fling_effect_summary_list IS 'Original model name - PaginatedItemFlingEffectSummaryList.';

--
-- Table 'paginated_item_pocket_summary_list' generated from model 'PaginatedItemPocketSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_item_pocket_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_item_pocket_summary_list IS 'Original model name - PaginatedItemPocketSummaryList.';

--
-- Table 'paginated_item_summary_list' generated from model 'PaginatedItemSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_item_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_item_summary_list IS 'Original model name - PaginatedItemSummaryList.';

--
-- Table 'paginated_language_summary_list' generated from model 'PaginatedLanguageSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_language_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_language_summary_list IS 'Original model name - PaginatedLanguageSummaryList.';

--
-- Table 'paginated_location_area_summary_list' generated from model 'PaginatedLocationAreaSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_location_area_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_location_area_summary_list IS 'Original model name - PaginatedLocationAreaSummaryList.';

--
-- Table 'paginated_location_summary_list' generated from model 'PaginatedLocationSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_location_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_location_summary_list IS 'Original model name - PaginatedLocationSummaryList.';

--
-- Table 'paginated_machine_summary_list' generated from model 'PaginatedMachineSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_machine_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_machine_summary_list IS 'Original model name - PaginatedMachineSummaryList.';

--
-- Table 'paginated_move_battle_style_summary_list' generated from model 'PaginatedMoveBattleStyleSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_battle_style_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_move_battle_style_summary_list IS 'Original model name - PaginatedMoveBattleStyleSummaryList.';

--
-- Table 'paginated_move_damage_class_summary_list' generated from model 'PaginatedMoveDamageClassSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_damage_class_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_move_damage_class_summary_list IS 'Original model name - PaginatedMoveDamageClassSummaryList.';

--
-- Table 'paginated_move_learn_method_summary_list' generated from model 'PaginatedMoveLearnMethodSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_learn_method_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_move_learn_method_summary_list IS 'Original model name - PaginatedMoveLearnMethodSummaryList.';

--
-- Table 'paginated_move_meta_ailment_summary_list' generated from model 'PaginatedMoveMetaAilmentSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_meta_ailment_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_move_meta_ailment_summary_list IS 'Original model name - PaginatedMoveMetaAilmentSummaryList.';

--
-- Table 'paginated_move_meta_category_summary_list' generated from model 'PaginatedMoveMetaCategorySummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_meta_category_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_move_meta_category_summary_list IS 'Original model name - PaginatedMoveMetaCategorySummaryList.';

--
-- Table 'paginated_move_summary_list' generated from model 'PaginatedMoveSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_move_summary_list IS 'Original model name - PaginatedMoveSummaryList.';

--
-- Table 'paginated_move_target_summary_list' generated from model 'PaginatedMoveTargetSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_target_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_move_target_summary_list IS 'Original model name - PaginatedMoveTargetSummaryList.';

--
-- Table 'paginated_nature_summary_list' generated from model 'PaginatedNatureSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_nature_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_nature_summary_list IS 'Original model name - PaginatedNatureSummaryList.';

--
-- Table 'paginated_pal_park_area_summary_list' generated from model 'PaginatedPalParkAreaSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pal_park_area_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_pal_park_area_summary_list IS 'Original model name - PaginatedPalParkAreaSummaryList.';

--
-- Table 'paginated_pokeathlon_stat_summary_list' generated from model 'PaginatedPokeathlonStatSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokeathlon_stat_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_pokeathlon_stat_summary_list IS 'Original model name - PaginatedPokeathlonStatSummaryList.';

--
-- Table 'paginated_pokedex_summary_list' generated from model 'PaginatedPokedexSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokedex_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_pokedex_summary_list IS 'Original model name - PaginatedPokedexSummaryList.';

--
-- Table 'paginated_pokemon_color_summary_list' generated from model 'PaginatedPokemonColorSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokemon_color_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_pokemon_color_summary_list IS 'Original model name - PaginatedPokemonColorSummaryList.';

--
-- Table 'paginated_pokemon_form_summary_list' generated from model 'PaginatedPokemonFormSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokemon_form_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_pokemon_form_summary_list IS 'Original model name - PaginatedPokemonFormSummaryList.';

--
-- Table 'paginated_pokemon_habitat_summary_list' generated from model 'PaginatedPokemonHabitatSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokemon_habitat_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_pokemon_habitat_summary_list IS 'Original model name - PaginatedPokemonHabitatSummaryList.';

--
-- Table 'paginated_pokemon_shape_summary_list' generated from model 'PaginatedPokemonShapeSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokemon_shape_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_pokemon_shape_summary_list IS 'Original model name - PaginatedPokemonShapeSummaryList.';

--
-- Table 'paginated_pokemon_species_summary_list' generated from model 'PaginatedPokemonSpeciesSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokemon_species_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_pokemon_species_summary_list IS 'Original model name - PaginatedPokemonSpeciesSummaryList.';

--
-- Table 'paginated_pokemon_summary_list' generated from model 'PaginatedPokemonSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokemon_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_pokemon_summary_list IS 'Original model name - PaginatedPokemonSummaryList.';

--
-- Table 'paginated_region_summary_list' generated from model 'PaginatedRegionSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_region_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_region_summary_list IS 'Original model name - PaginatedRegionSummaryList.';

--
-- Table 'paginated_stat_summary_list' generated from model 'PaginatedStatSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_stat_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_stat_summary_list IS 'Original model name - PaginatedStatSummaryList.';

--
-- Table 'paginated_super_contest_effect_summary_list' generated from model 'PaginatedSuperContestEffectSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_super_contest_effect_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_super_contest_effect_summary_list IS 'Original model name - PaginatedSuperContestEffectSummaryList.';

--
-- Table 'paginated_type_summary_list' generated from model 'PaginatedTypeSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_type_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_type_summary_list IS 'Original model name - PaginatedTypeSummaryList.';

--
-- Table 'paginated_version_group_summary_list' generated from model 'PaginatedVersionGroupSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_version_group_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_version_group_summary_list IS 'Original model name - PaginatedVersionGroupSummaryList.';

--
-- Table 'paginated_version_summary_list' generated from model 'PaginatedVersionSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_version_summary_list (
    "count" INTEGER DEFAULT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON DEFAULT NULL
);
COMMENT ON TABLE paginated_version_summary_list IS 'Original model name - PaginatedVersionSummaryList.';

--
-- Table 'pal_park_area_detail' generated from model 'PalParkAreaDetail'
--
CREATE TABLE IF NOT EXISTS pal_park_area_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "names" JSON NOT NULL,
    pokemon_encounters JSON NOT NULL
);
COMMENT ON TABLE pal_park_area_detail IS 'Original model name - PalParkAreaDetail.';

--
-- Table 'pal_park_area_detail_pokemon_encounters_inner' generated from model 'PalParkAreaDetailUnderscorepokemonUnderscoreencountersUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pal_park_area_detail_pokemon_encounters_inner (
    base_score INTEGER NOT NULL,
    pokemon_species TEXT NOT NULL,
    rate INTEGER NOT NULL
);
COMMENT ON TABLE pal_park_area_detail_pokemon_encounters_inner IS 'Original model name - PalParkAreaDetail_pokemon_encounters_inner.';
COMMENT ON COLUMN pal_park_area_detail_pokemon_encounters_inner.pokemon_species IS 'Original param name - pokemon-species.';

--
-- Table 'pal_park_area_name' generated from model 'PalParkAreaName'
--
CREATE TABLE IF NOT EXISTS pal_park_area_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pal_park_area_name IS 'Original model name - PalParkAreaName.';

--
-- Table 'pal_park_area_summary' generated from model 'PalParkAreaSummary'
--
CREATE TABLE IF NOT EXISTS pal_park_area_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pal_park_area_summary IS 'Original model name - PalParkAreaSummary.';

--
-- Table 'pokeathlon_stat_detail' generated from model 'PokeathlonStatDetail'
--
CREATE TABLE IF NOT EXISTS pokeathlon_stat_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    affecting_natures TEXT NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE pokeathlon_stat_detail IS 'Original model name - PokeathlonStatDetail.';

--
-- Table 'pokeathlon_stat_detail_affecting_natures' generated from model 'PokeathlonStatDetailUnderscoreaffectingUnderscorenatures'
--
CREATE TABLE IF NOT EXISTS pokeathlon_stat_detail_affecting_natures (
    decrease JSON NOT NULL,
    increase JSON NOT NULL
);
COMMENT ON TABLE pokeathlon_stat_detail_affecting_natures IS 'Original model name - PokeathlonStatDetail_affecting_natures.';

--
-- Table 'pokeathlon_stat_detail_affecting_natures_decrease_inner' generated from model 'PokeathlonStatDetailUnderscoreaffectingUnderscorenaturesUnderscoredecreaseUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokeathlon_stat_detail_affecting_natures_decrease_inner (
    max_change INTEGER NOT NULL,
    nature TEXT NOT NULL
);
COMMENT ON TABLE pokeathlon_stat_detail_affecting_natures_decrease_inner IS 'Original model name - PokeathlonStatDetail_affecting_natures_decrease_inner.';

--
-- Table 'pokeathlon_stat_detail_affecting_natures_increase_inner' generated from model 'PokeathlonStatDetailUnderscoreaffectingUnderscorenaturesUnderscoreincreaseUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokeathlon_stat_detail_affecting_natures_increase_inner (
    max_change INTEGER NOT NULL,
    nature TEXT NOT NULL
);
COMMENT ON TABLE pokeathlon_stat_detail_affecting_natures_increase_inner IS 'Original model name - PokeathlonStatDetail_affecting_natures_increase_inner.';

--
-- Table 'pokeathlon_stat_name' generated from model 'PokeathlonStatName'
--
CREATE TABLE IF NOT EXISTS pokeathlon_stat_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokeathlon_stat_name IS 'Original model name - PokeathlonStatName.';

--
-- Table 'pokeathlon_stat_summary' generated from model 'PokeathlonStatSummary'
--
CREATE TABLE IF NOT EXISTS pokeathlon_stat_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokeathlon_stat_summary IS 'Original model name - PokeathlonStatSummary.';

--
-- Table 'pokedex_description' generated from model 'PokedexDescription'
--
CREATE TABLE IF NOT EXISTS pokedex_description (
    description VARCHAR(1000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokedex_description IS 'Original model name - PokedexDescription.';

--
-- Table 'pokedex_detail' generated from model 'PokedexDetail'
--
CREATE TABLE IF NOT EXISTS pokedex_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    is_main_series BOOLEAN DEFAULT NULL,
    descriptions JSON NOT NULL,
    "names" JSON NOT NULL,
    pokemon_entries JSON NOT NULL,
    region TEXT NOT NULL,
    version_groups JSON NOT NULL
);
COMMENT ON TABLE pokedex_detail IS 'Original model name - PokedexDetail.';

--
-- Table 'pokedex_detail_pokemon_entries_inner' generated from model 'PokedexDetailUnderscorepokemonUnderscoreentriesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokedex_detail_pokemon_entries_inner (
    entry_number INTEGER NOT NULL,
    pokemon_species TEXT NOT NULL
);
COMMENT ON TABLE pokedex_detail_pokemon_entries_inner IS 'Original model name - PokedexDetail_pokemon_entries_inner.';

--
-- Table 'pokedex_name' generated from model 'PokedexName'
--
CREATE TABLE IF NOT EXISTS pokedex_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokedex_name IS 'Original model name - PokedexName.';

--
-- Table 'pokedex_summary' generated from model 'PokedexSummary'
--
CREATE TABLE IF NOT EXISTS pokedex_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokedex_summary IS 'Original model name - PokedexSummary.';

--
-- Table 'pokemon_color_detail' generated from model 'PokemonColorDetail'
--
CREATE TABLE IF NOT EXISTS pokemon_color_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "names" JSON NOT NULL,
    pokemon_species JSON NOT NULL
);
COMMENT ON TABLE pokemon_color_detail IS 'Original model name - PokemonColorDetail.';

--
-- Table 'pokemon_color_name' generated from model 'PokemonColorName'
--
CREATE TABLE IF NOT EXISTS pokemon_color_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_color_name IS 'Original model name - PokemonColorName.';

--
-- Table 'pokemon_color_summary' generated from model 'PokemonColorSummary'
--
CREATE TABLE IF NOT EXISTS pokemon_color_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokemon_color_summary IS 'Original model name - PokemonColorSummary.';

--
-- Table 'pokemon_detail' generated from model 'PokemonDetail'
--
CREATE TABLE IF NOT EXISTS pokemon_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    base_experience INTEGER DEFAULT NULL,
    height INTEGER DEFAULT NULL,
    is_default BOOLEAN DEFAULT NULL,
    "order" INTEGER DEFAULT NULL,
    weight INTEGER DEFAULT NULL,
    abilities JSON NOT NULL,
    past_abilities JSON NOT NULL,
    forms JSON NOT NULL,
    game_indices JSON NOT NULL,
    held_items TEXT NOT NULL,
    location_area_encounters TEXT NOT NULL,
    moves JSON NOT NULL,
    species TEXT NOT NULL,
    sprites TEXT NOT NULL,
    cries TEXT NOT NULL,
    stats JSON NOT NULL,
    "types" JSON NOT NULL,
    past_types JSON NOT NULL
);
COMMENT ON TABLE pokemon_detail IS 'Original model name - PokemonDetail.';

--
-- Table 'pokemon_detail_abilities_inner' generated from model 'PokemonDetailUnderscoreabilitiesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokemon_detail_abilities_inner (
    ability TEXT NOT NULL,
    is_hidden BOOLEAN NOT NULL,
    slot INTEGER NOT NULL
);
COMMENT ON TABLE pokemon_detail_abilities_inner IS 'Original model name - PokemonDetail_abilities_inner.';

--
-- Table 'pokemon_detail_cries' generated from model 'PokemonDetailUnderscorecries'
--
CREATE TABLE IF NOT EXISTS pokemon_detail_cries (
    latest TEXT NOT NULL,
    legacy TEXT NOT NULL
);
COMMENT ON TABLE pokemon_detail_cries IS 'Original model name - PokemonDetail_cries.';

--
-- Table 'pokemon_detail_held_items' generated from model 'PokemonDetailUnderscoreheldUnderscoreitems'
--
CREATE TABLE IF NOT EXISTS pokemon_detail_held_items (
    item TEXT NOT NULL,
    version_details JSON NOT NULL
);
COMMENT ON TABLE pokemon_detail_held_items IS 'Original model name - PokemonDetail_held_items.';

--
-- Table 'pokemon_detail_moves_inner' generated from model 'PokemonDetailUnderscoremovesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokemon_detail_moves_inner (
    "move" TEXT NOT NULL,
    version_group_details JSON NOT NULL
);
COMMENT ON TABLE pokemon_detail_moves_inner IS 'Original model name - PokemonDetail_moves_inner.';

--
-- Table 'pokemon_detail_moves_inner_version_group_details_inner' generated from model 'PokemonDetailUnderscoremovesUnderscoreinnerUnderscoreversionUnderscoregroupUnderscoredetailsUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokemon_detail_moves_inner_version_group_details_inner (
    level_learned_at INTEGER NOT NULL,
    move_learn_method TEXT NOT NULL,
    version_group TEXT NOT NULL
);
COMMENT ON TABLE pokemon_detail_moves_inner_version_group_details_inner IS 'Original model name - PokemonDetail_moves_inner_version_group_details_inner.';

--
-- Table 'pokemon_detail_past_abilities_inner' generated from model 'PokemonDetailUnderscorepastUnderscoreabilitiesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokemon_detail_past_abilities_inner (
    abilities JSON NOT NULL,
    generation TEXT NOT NULL
);
COMMENT ON TABLE pokemon_detail_past_abilities_inner IS 'Original model name - PokemonDetail_past_abilities_inner.';

--
-- Table 'pokemon_detail_past_types_inner' generated from model 'PokemonDetailUnderscorepastUnderscoretypesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokemon_detail_past_types_inner (
    generation TEXT NOT NULL,
    "types" JSON NOT NULL
);
COMMENT ON TABLE pokemon_detail_past_types_inner IS 'Original model name - PokemonDetail_past_types_inner.';

--
-- Table 'pokemon_detail_sprites' generated from model 'PokemonDetailUnderscoresprites'
--
CREATE TABLE IF NOT EXISTS pokemon_detail_sprites (
    front_default TEXT DEFAULT NULL
);
COMMENT ON TABLE pokemon_detail_sprites IS 'Original model name - PokemonDetail_sprites.';

--
-- Table 'pokemon_detail_types_inner' generated from model 'PokemonDetailUnderscoretypesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokemon_detail_types_inner (
    slot INTEGER NOT NULL,
    "type" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_detail_types_inner IS 'Original model name - PokemonDetail_types_inner.';

--
-- Table 'pokemon_dex_entry' generated from model 'PokemonDexEntry'
--
CREATE TABLE IF NOT EXISTS pokemon_dex_entry (
    entry_number INTEGER NOT NULL,
    pokedex TEXT NOT NULL
);
COMMENT ON TABLE pokemon_dex_entry IS 'Original model name - PokemonDexEntry.';

--
-- Table 'pokemon_form_detail' generated from model 'PokemonFormDetail'
--
CREATE TABLE IF NOT EXISTS pokemon_form_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "order" INTEGER DEFAULT NULL,
    form_order INTEGER DEFAULT NULL,
    is_default BOOLEAN DEFAULT NULL,
    is_battle_only BOOLEAN DEFAULT NULL,
    is_mega BOOLEAN DEFAULT NULL,
    form_name VARCHAR(30) NOT NULL,
    pokemon TEXT NOT NULL,
    sprites TEXT NOT NULL,
    version_group TEXT NOT NULL,
    form_names JSON NOT NULL,
    "names" JSON NOT NULL,
    "types" JSON NOT NULL
);
COMMENT ON TABLE pokemon_form_detail IS 'Original model name - PokemonFormDetail.';

--
-- Table 'pokemon_form_detail_form_names_inner' generated from model 'PokemonFormDetailUnderscoreformUnderscorenamesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokemon_form_detail_form_names_inner (
    "language" TEXT NOT NULL,
    "name" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_form_detail_form_names_inner IS 'Original model name - PokemonFormDetail_form_names_inner.';

--
-- Table 'pokemon_form_detail_sprites' generated from model 'PokemonFormDetailUnderscoresprites'
--
CREATE TABLE IF NOT EXISTS pokemon_form_detail_sprites (
    "default" TEXT DEFAULT NULL
);
COMMENT ON TABLE pokemon_form_detail_sprites IS 'Original model name - PokemonFormDetail_sprites.';

--
-- Table 'pokemon_form_summary' generated from model 'PokemonFormSummary'
--
CREATE TABLE IF NOT EXISTS pokemon_form_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokemon_form_summary IS 'Original model name - PokemonFormSummary.';

--
-- Table 'pokemon_game_index' generated from model 'PokemonGameIndex'
--
CREATE TABLE IF NOT EXISTS pokemon_game_index (
    game_index INTEGER NOT NULL,
    "version" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_game_index IS 'Original model name - PokemonGameIndex.';

--
-- Table 'pokemon_habitat_detail' generated from model 'PokemonHabitatDetail'
--
CREATE TABLE IF NOT EXISTS pokemon_habitat_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "names" JSON NOT NULL,
    pokemon_species JSON NOT NULL
);
COMMENT ON TABLE pokemon_habitat_detail IS 'Original model name - PokemonHabitatDetail.';

--
-- Table 'pokemon_habitat_name' generated from model 'PokemonHabitatName'
--
CREATE TABLE IF NOT EXISTS pokemon_habitat_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_habitat_name IS 'Original model name - PokemonHabitatName.';

--
-- Table 'pokemon_habitat_summary' generated from model 'PokemonHabitatSummary'
--
CREATE TABLE IF NOT EXISTS pokemon_habitat_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokemon_habitat_summary IS 'Original model name - PokemonHabitatSummary.';

--
-- Table 'pokemon_shape_detail' generated from model 'PokemonShapeDetail'
--
CREATE TABLE IF NOT EXISTS pokemon_shape_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    awesome_names JSON NOT NULL,
    "names" JSON NOT NULL,
    pokemon_species JSON NOT NULL
);
COMMENT ON TABLE pokemon_shape_detail IS 'Original model name - PokemonShapeDetail.';

--
-- Table 'pokemon_shape_detail_awesome_names_inner' generated from model 'PokemonShapeDetailUnderscoreawesomeUnderscorenamesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokemon_shape_detail_awesome_names_inner (
    awesome_name TEXT NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_shape_detail_awesome_names_inner IS 'Original model name - PokemonShapeDetail_awesome_names_inner.';

--
-- Table 'pokemon_shape_detail_names_inner' generated from model 'PokemonShapeDetailUnderscorenamesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokemon_shape_detail_names_inner (
    url TEXT NOT NULL,
    "name" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_shape_detail_names_inner IS 'Original model name - PokemonShapeDetail_names_inner.';

--
-- Table 'pokemon_shape_summary' generated from model 'PokemonShapeSummary'
--
CREATE TABLE IF NOT EXISTS pokemon_shape_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokemon_shape_summary IS 'Original model name - PokemonShapeSummary.';

--
-- Table 'pokemon_species_description' generated from model 'PokemonSpeciesDescription'
--
CREATE TABLE IF NOT EXISTS pokemon_species_description (
    description VARCHAR(1000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_species_description IS 'Original model name - PokemonSpeciesDescription.';

--
-- Table 'pokemon_species_detail' generated from model 'PokemonSpeciesDetail'
--
CREATE TABLE IF NOT EXISTS pokemon_species_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "order" INTEGER DEFAULT NULL,
    gender_rate INTEGER DEFAULT NULL,
    capture_rate INTEGER DEFAULT NULL,
    base_happiness INTEGER DEFAULT NULL,
    is_baby BOOLEAN DEFAULT NULL,
    is_legendary BOOLEAN DEFAULT NULL,
    is_mythical BOOLEAN DEFAULT NULL,
    hatch_counter INTEGER DEFAULT NULL,
    has_gender_differences BOOLEAN DEFAULT NULL,
    forms_switchable BOOLEAN DEFAULT NULL,
    growth_rate TEXT NOT NULL,
    pokedex_numbers JSON NOT NULL,
    egg_groups JSON NOT NULL,
    color TEXT NOT NULL,
    shape TEXT NOT NULL,
    evolves_from_species TEXT NOT NULL,
    evolution_chain TEXT NOT NULL,
    habitat TEXT NOT NULL,
    generation TEXT NOT NULL,
    "names" JSON NOT NULL,
    pal_park_encounters JSON NOT NULL,
    form_descriptions JSON NOT NULL,
    flavor_text_entries JSON NOT NULL,
    genera JSON NOT NULL,
    varieties JSON NOT NULL
);
COMMENT ON TABLE pokemon_species_detail IS 'Original model name - PokemonSpeciesDetail.';

--
-- Table 'pokemon_species_detail_genera_inner' generated from model 'PokemonSpeciesDetailUnderscoregeneraUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokemon_species_detail_genera_inner (
    genus TEXT NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_species_detail_genera_inner IS 'Original model name - PokemonSpeciesDetail_genera_inner.';

--
-- Table 'pokemon_species_detail_pal_park_encounters_inner' generated from model 'PokemonSpeciesDetailUnderscorepalUnderscoreparkUnderscoreencountersUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokemon_species_detail_pal_park_encounters_inner (
    area TEXT NOT NULL,
    base_score INTEGER NOT NULL,
    rate INTEGER NOT NULL
);
COMMENT ON TABLE pokemon_species_detail_pal_park_encounters_inner IS 'Original model name - PokemonSpeciesDetail_pal_park_encounters_inner.';

--
-- Table 'pokemon_species_detail_varieties_inner' generated from model 'PokemonSpeciesDetailUnderscorevarietiesUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS pokemon_species_detail_varieties_inner (
    is_default BOOLEAN NOT NULL,
    pokemon TEXT NOT NULL
);
COMMENT ON TABLE pokemon_species_detail_varieties_inner IS 'Original model name - PokemonSpeciesDetail_varieties_inner.';

--
-- Table 'pokemon_species_flavor_text' generated from model 'PokemonSpeciesFlavorText'
--
CREATE TABLE IF NOT EXISTS pokemon_species_flavor_text (
    flavor_text TEXT NOT NULL,
    "language" TEXT NOT NULL,
    "version" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_species_flavor_text IS 'Original model name - PokemonSpeciesFlavorText.';

--
-- Table 'pokemon_species_summary' generated from model 'PokemonSpeciesSummary'
--
CREATE TABLE IF NOT EXISTS pokemon_species_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokemon_species_summary IS 'Original model name - PokemonSpeciesSummary.';

--
-- Table 'pokemon_stat' generated from model 'PokemonStat'
--
CREATE TABLE IF NOT EXISTS pokemon_stat (
    base_stat INTEGER NOT NULL,
    effort INTEGER NOT NULL,
    stat TEXT NOT NULL
);
COMMENT ON TABLE pokemon_stat IS 'Original model name - PokemonStat.';

--
-- Table 'pokemon_summary' generated from model 'PokemonSummary'
--
CREATE TABLE IF NOT EXISTS pokemon_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokemon_summary IS 'Original model name - PokemonSummary.';

--
-- Table 'region_detail' generated from model 'RegionDetail'
--
CREATE TABLE IF NOT EXISTS region_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    locations JSON NOT NULL,
    main_generation TEXT NOT NULL,
    "names" JSON NOT NULL,
    pokedexes JSON NOT NULL,
    version_groups JSON NOT NULL
);
COMMENT ON TABLE region_detail IS 'Original model name - RegionDetail.';

--
-- Table 'region_name' generated from model 'RegionName'
--
CREATE TABLE IF NOT EXISTS region_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE region_name IS 'Original model name - RegionName.';

--
-- Table 'region_summary' generated from model 'RegionSummary'
--
CREATE TABLE IF NOT EXISTS region_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE region_summary IS 'Original model name - RegionSummary.';

--
-- Table 'stat_detail' generated from model 'StatDetail'
--
CREATE TABLE IF NOT EXISTS stat_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    game_index INTEGER NOT NULL,
    is_battle_only BOOLEAN DEFAULT NULL,
    affecting_moves TEXT NOT NULL,
    affecting_natures TEXT NOT NULL,
    "characteristics" JSON NOT NULL,
    move_damage_class TEXT NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE stat_detail IS 'Original model name - StatDetail.';

--
-- Table 'stat_detail_affecting_moves' generated from model 'StatDetailUnderscoreaffectingUnderscoremoves'
--
CREATE TABLE IF NOT EXISTS stat_detail_affecting_moves (
    increase JSON NOT NULL,
    decrease JSON NOT NULL
);
COMMENT ON TABLE stat_detail_affecting_moves IS 'Original model name - StatDetail_affecting_moves.';

--
-- Table 'stat_detail_affecting_moves_increase_inner' generated from model 'StatDetailUnderscoreaffectingUnderscoremovesUnderscoreincreaseUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS stat_detail_affecting_moves_increase_inner (
    change INTEGER NOT NULL,
    "move" TEXT NOT NULL
);
COMMENT ON TABLE stat_detail_affecting_moves_increase_inner IS 'Original model name - StatDetail_affecting_moves_increase_inner.';

--
-- Table 'stat_detail_affecting_natures' generated from model 'StatDetailUnderscoreaffectingUnderscorenatures'
--
CREATE TABLE IF NOT EXISTS stat_detail_affecting_natures (
    increase JSON NOT NULL,
    decrease JSON NOT NULL
);
COMMENT ON TABLE stat_detail_affecting_natures IS 'Original model name - StatDetail_affecting_natures.';

--
-- Table 'stat_name' generated from model 'StatName'
--
CREATE TABLE IF NOT EXISTS stat_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE stat_name IS 'Original model name - StatName.';

--
-- Table 'stat_summary' generated from model 'StatSummary'
--
CREATE TABLE IF NOT EXISTS stat_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE stat_summary IS 'Original model name - StatSummary.';

--
-- Table 'super_contest_effect_detail' generated from model 'SuperContestEffectDetail'
--
CREATE TABLE IF NOT EXISTS super_contest_effect_detail (
    "id" INTEGER NOT NULL,
    appeal INTEGER NOT NULL,
    flavor_text_entries JSON NOT NULL,
    moves JSON NOT NULL
);
COMMENT ON TABLE super_contest_effect_detail IS 'Original model name - SuperContestEffectDetail.';

--
-- Table 'super_contest_effect_flavor_text' generated from model 'SuperContestEffectFlavorText'
--
CREATE TABLE IF NOT EXISTS super_contest_effect_flavor_text (
    flavor_text VARCHAR(500) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE super_contest_effect_flavor_text IS 'Original model name - SuperContestEffectFlavorText.';

--
-- Table 'super_contest_effect_summary' generated from model 'SuperContestEffectSummary'
--
CREATE TABLE IF NOT EXISTS super_contest_effect_summary (
    url TEXT NOT NULL
);
COMMENT ON TABLE super_contest_effect_summary IS 'Original model name - SuperContestEffectSummary.';

--
-- Table 'type_detail' generated from model 'TypeDetail'
-- Serializer for the Type resource
--
CREATE TABLE IF NOT EXISTS type_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    damage_relations TEXT NOT NULL,
    past_damage_relations JSON NOT NULL,
    game_indices JSON NOT NULL,
    generation TEXT NOT NULL,
    move_damage_class TEXT NOT NULL,
    "names" JSON NOT NULL,
    pokemon JSON NOT NULL,
    moves JSON NOT NULL,
    sprites JSON NOT NULL
);
COMMENT ON TABLE type_detail IS 'Serializer for the Type resource. Original model name - TypeDetail.';

--
-- Table 'type_detail_damage_relations' generated from model 'TypeDetailUnderscoredamageUnderscorerelations'
--
CREATE TABLE IF NOT EXISTS type_detail_damage_relations (
    no_damage_to JSON NOT NULL,
    half_damage_to JSON NOT NULL,
    double_damage_to JSON NOT NULL,
    no_damage_from JSON NOT NULL,
    half_damage_from JSON NOT NULL,
    double_damage_from JSON NOT NULL
);
COMMENT ON TABLE type_detail_damage_relations IS 'Original model name - TypeDetail_damage_relations.';

--
-- Table 'type_detail_past_damage_relations_inner' generated from model 'TypeDetailUnderscorepastUnderscoredamageUnderscorerelationsUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS type_detail_past_damage_relations_inner (
    generation TEXT NOT NULL,
    damage_relations TEXT NOT NULL
);
COMMENT ON TABLE type_detail_past_damage_relations_inner IS 'Original model name - TypeDetail_past_damage_relations_inner.';

--
-- Table 'type_detail_past_damage_relations_inner_damage_relations' generated from model 'TypeDetailUnderscorepastUnderscoredamageUnderscorerelationsUnderscoreinnerUnderscoredamageUnderscorerelations'
--
CREATE TABLE IF NOT EXISTS type_detail_past_damage_relations_inner_damage_relations (
    no_damage_to JSON NOT NULL,
    half_damage_to JSON NOT NULL,
    double_damage_to JSON NOT NULL,
    no_damage_from JSON NOT NULL,
    half_damage_from JSON NOT NULL,
    double_damage_from JSON NOT NULL
);
COMMENT ON TABLE type_detail_past_damage_relations_inner_damage_relations IS 'Original model name - TypeDetail_past_damage_relations_inner_damage_relations.';

--
-- Table 'type_detail_pokemon_inner' generated from model 'TypeDetailUnderscorepokemonUnderscoreinner'
--
CREATE TABLE IF NOT EXISTS type_detail_pokemon_inner (
    slot INTEGER DEFAULT NULL,
    pokemon TEXT DEFAULT NULL
);
COMMENT ON TABLE type_detail_pokemon_inner IS 'Original model name - TypeDetail_pokemon_inner.';

--
-- Table 'type_detail_pokemon_inner_pokemon' generated from model 'TypeDetailUnderscorepokemonUnderscoreinnerUnderscorepokemon'
--
CREATE TABLE IF NOT EXISTS type_detail_pokemon_inner_pokemon (
    "name" TEXT DEFAULT NULL,
    url TEXT DEFAULT NULL
);
COMMENT ON TABLE type_detail_pokemon_inner_pokemon IS 'Original model name - TypeDetail_pokemon_inner_pokemon.';
COMMENT ON COLUMN type_detail_pokemon_inner_pokemon."name" IS 'The name of the pokemon';
COMMENT ON COLUMN type_detail_pokemon_inner_pokemon.url IS 'The URL to get more information about the pokemon';

--
-- Table 'type_detail_sprites_value_value' generated from model 'TypeDetailUnderscorespritesUnderscorevalueUnderscorevalue'
--
CREATE TABLE IF NOT EXISTS type_detail_sprites_value_value (
    name_icon TEXT DEFAULT NULL
);
COMMENT ON TABLE type_detail_sprites_value_value IS 'Original model name - TypeDetail_sprites_value_value.';
COMMENT ON COLUMN type_detail_sprites_value_value.name_icon IS 'Original param name - name-icon.';

--
-- Table 'type_game_index' generated from model 'TypeGameIndex'
--
CREATE TABLE IF NOT EXISTS type_game_index (
    game_index INTEGER NOT NULL,
    generation TEXT NOT NULL
);
COMMENT ON TABLE type_game_index IS 'Original model name - TypeGameIndex.';

--
-- Table 'type_summary' generated from model 'TypeSummary'
--
CREATE TABLE IF NOT EXISTS type_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE type_summary IS 'Original model name - TypeSummary.';

--
-- Table 'version_detail' generated from model 'VersionDetail'
-- Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink
--
CREATE TABLE IF NOT EXISTS version_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "names" JSON NOT NULL,
    version_group TEXT NOT NULL
);
COMMENT ON TABLE version_detail IS 'Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink. Original model name - VersionDetail.';

--
-- Table 'version_group_detail' generated from model 'VersionGroupDetail'
--
CREATE TABLE IF NOT EXISTS version_group_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(100) NOT NULL,
    "order" INTEGER DEFAULT NULL,
    generation TEXT NOT NULL,
    move_learn_methods JSON NOT NULL,
    pokedexes JSON NOT NULL,
    regions JSON NOT NULL,
    versions JSON NOT NULL
);
COMMENT ON TABLE version_group_detail IS 'Original model name - VersionGroupDetail.';

--
-- Table 'version_group_summary' generated from model 'VersionGroupSummary'
--
CREATE TABLE IF NOT EXISTS version_group_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE version_group_summary IS 'Original model name - VersionGroupSummary.';

--
-- Table 'version_name' generated from model 'VersionName'
--
CREATE TABLE IF NOT EXISTS version_name (
    "name" VARCHAR(100) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE version_name IS 'Original model name - VersionName.';

--
-- Table 'version_summary' generated from model 'VersionSummary'
--
CREATE TABLE IF NOT EXISTS version_summary (
    "name" VARCHAR(100) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE version_summary IS 'Original model name - VersionSummary.';

