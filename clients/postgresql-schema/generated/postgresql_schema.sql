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
-- DROP TABLE IF EXISTS ability_effect_text;
-- DROP TABLE IF EXISTS ability_flavor_text;
-- DROP TABLE IF EXISTS ability_name;
-- DROP TABLE IF EXISTS ability_pokemon_detail;
-- DROP TABLE IF EXISTS ability_summary;
-- DROP TABLE IF EXISTS berry_detail;
-- DROP TABLE IF EXISTS berry_firmness_detail;
-- DROP TABLE IF EXISTS berry_firmness_name;
-- DROP TABLE IF EXISTS berry_firmness_summary;
-- DROP TABLE IF EXISTS berry_flavor_berry_map;
-- DROP TABLE IF EXISTS berry_flavor_detail;
-- DROP TABLE IF EXISTS berry_flavor_map;
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
-- DROP TABLE IF EXISTS currency_detail;
-- DROP TABLE IF EXISTS currency_name;
-- DROP TABLE IF EXISTS currency_summary;
-- DROP TABLE IF EXISTS egg_group_detail;
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
-- DROP TABLE IF EXISTS encounter_pokemon_detail;
-- DROP TABLE IF EXISTS evolution_chain_detail;
-- DROP TABLE IF EXISTS evolution_chain_link;
-- DROP TABLE IF EXISTS evolution_chain_summary;
-- DROP TABLE IF EXISTS evolution_condition_expression;
-- DROP TABLE IF EXISTS evolution_trigger_detail;
-- DROP TABLE IF EXISTS evolution_trigger_name;
-- DROP TABLE IF EXISTS evolution_trigger_summary;
-- DROP TABLE IF EXISTS evolution_variable_description;
-- DROP TABLE IF EXISTS evolution_variable_detail;
-- DROP TABLE IF EXISTS evolution_variable_name;
-- DROP TABLE IF EXISTS evolution_variable_summary;
-- DROP TABLE IF EXISTS experience;
-- DROP TABLE IF EXISTS gender_detail;
-- DROP TABLE IF EXISTS gender_pokemon_species;
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
-- DROP TABLE IF EXISTS item_effect_text;
-- DROP TABLE IF EXISTS item_flavor_text;
-- DROP TABLE IF EXISTS item_fling_effect_detail;
-- DROP TABLE IF EXISTS item_fling_effect_effect_text;
-- DROP TABLE IF EXISTS item_fling_effect_summary;
-- DROP TABLE IF EXISTS item_game_index;
-- DROP TABLE IF EXISTS item_machine;
-- DROP TABLE IF EXISTS item_name;
-- DROP TABLE IF EXISTS item_pocket_detail;
-- DROP TABLE IF EXISTS item_pocket_name;
-- DROP TABLE IF EXISTS item_pocket_summary;
-- DROP TABLE IF EXISTS item_price;
-- DROP TABLE IF EXISTS item_sprites;
-- DROP TABLE IF EXISTS item_summary;
-- DROP TABLE IF EXISTS language_detail;
-- DROP TABLE IF EXISTS language_name;
-- DROP TABLE IF EXISTS language_summary;
-- DROP TABLE IF EXISTS location_area_detail;
-- DROP TABLE IF EXISTS location_area_encounter_detail;
-- DROP TABLE IF EXISTS location_area_encounter_rate;
-- DROP TABLE IF EXISTS location_area_encounter_version_detail;
-- DROP TABLE IF EXISTS location_area_name;
-- DROP TABLE IF EXISTS location_area_pokemon_encounter;
-- DROP TABLE IF EXISTS location_area_pokemon_encounter_version;
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
-- DROP TABLE IF EXISTS move_combo_usage;
-- DROP TABLE IF EXISTS move_combos;
-- DROP TABLE IF EXISTS move_damage_class_description;
-- DROP TABLE IF EXISTS move_damage_class_detail;
-- DROP TABLE IF EXISTS move_damage_class_name;
-- DROP TABLE IF EXISTS move_damage_class_summary;
-- DROP TABLE IF EXISTS move_detail;
-- DROP TABLE IF EXISTS move_effect_change;
-- DROP TABLE IF EXISTS move_effect_change_effect_text;
-- DROP TABLE IF EXISTS move_effect_effect_text;
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
-- DROP TABLE IF EXISTS move_meta_stat_change;
-- DROP TABLE IF EXISTS move_name;
-- DROP TABLE IF EXISTS move_stat_change;
-- DROP TABLE IF EXISTS move_summary;
-- DROP TABLE IF EXISTS move_target_description;
-- DROP TABLE IF EXISTS move_target_detail;
-- DROP TABLE IF EXISTS move_target_name;
-- DROP TABLE IF EXISTS move_target_summary;
-- DROP TABLE IF EXISTS nature_battle_style_preference;
-- DROP TABLE IF EXISTS nature_detail;
-- DROP TABLE IF EXISTS nature_name;
-- DROP TABLE IF EXISTS nature_pokeathlon_stat;
-- DROP TABLE IF EXISTS nature_summary;
-- DROP TABLE IF EXISTS paginated_ability_summary_list;
-- DROP TABLE IF EXISTS paginated_berry_firmness_summary_list;
-- DROP TABLE IF EXISTS paginated_berry_flavor_summary_list;
-- DROP TABLE IF EXISTS paginated_berry_summary_list;
-- DROP TABLE IF EXISTS paginated_characteristic_summary_list;
-- DROP TABLE IF EXISTS paginated_contest_effect_summary_list;
-- DROP TABLE IF EXISTS paginated_contest_type_summary_list;
-- DROP TABLE IF EXISTS paginated_currency_summary_list;
-- DROP TABLE IF EXISTS paginated_egg_group_summary_list;
-- DROP TABLE IF EXISTS paginated_encounter_condition_summary_list;
-- DROP TABLE IF EXISTS paginated_encounter_condition_value_summary_list;
-- DROP TABLE IF EXISTS paginated_encounter_method_summary_list;
-- DROP TABLE IF EXISTS paginated_evolution_chain_summary_list;
-- DROP TABLE IF EXISTS paginated_evolution_trigger_summary_list;
-- DROP TABLE IF EXISTS paginated_evolution_variable_summary_list;
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
-- DROP TABLE IF EXISTS pal_park_area_name;
-- DROP TABLE IF EXISTS pal_park_area_summary;
-- DROP TABLE IF EXISTS pal_park_encounter;
-- DROP TABLE IF EXISTS pokeapi_meta_response;
-- DROP TABLE IF EXISTS pokeathlon_stat_affecting_nature;
-- DROP TABLE IF EXISTS pokeathlon_stat_affecting_natures;
-- DROP TABLE IF EXISTS pokeathlon_stat_detail;
-- DROP TABLE IF EXISTS pokeathlon_stat_name;
-- DROP TABLE IF EXISTS pokeathlon_stat_summary;
-- DROP TABLE IF EXISTS pokedex_description;
-- DROP TABLE IF EXISTS pokedex_detail;
-- DROP TABLE IF EXISTS pokedex_name;
-- DROP TABLE IF EXISTS pokedex_summary;
-- DROP TABLE IF EXISTS pokemon_ability;
-- DROP TABLE IF EXISTS pokemon_ability_past;
-- DROP TABLE IF EXISTS pokemon_color_detail;
-- DROP TABLE IF EXISTS pokemon_color_name;
-- DROP TABLE IF EXISTS pokemon_color_summary;
-- DROP TABLE IF EXISTS pokemon_cries;
-- DROP TABLE IF EXISTS pokemon_detail;
-- DROP TABLE IF EXISTS pokemon_dex_entry;
-- DROP TABLE IF EXISTS pokemon_dex_number;
-- DROP TABLE IF EXISTS pokemon_encounter_detail_response;
-- DROP TABLE IF EXISTS pokemon_encounter_response;
-- DROP TABLE IF EXISTS pokemon_encounter_version_detail_response;
-- DROP TABLE IF EXISTS pokemon_evolution;
-- DROP TABLE IF EXISTS pokemon_evolution_known_move;
-- DROP TABLE IF EXISTS pokemon_form_detail;
-- DROP TABLE IF EXISTS pokemon_form_flavor_text;
-- DROP TABLE IF EXISTS pokemon_form_name;
-- DROP TABLE IF EXISTS pokemon_form_sprites;
-- DROP TABLE IF EXISTS pokemon_form_summary;
-- DROP TABLE IF EXISTS pokemon_form_trigger_condition;
-- DROP TABLE IF EXISTS pokemon_form_type;
-- DROP TABLE IF EXISTS pokemon_game_index;
-- DROP TABLE IF EXISTS pokemon_habitat_detail;
-- DROP TABLE IF EXISTS pokemon_habitat_name;
-- DROP TABLE IF EXISTS pokemon_habitat_summary;
-- DROP TABLE IF EXISTS pokemon_held_item;
-- DROP TABLE IF EXISTS pokemon_held_item_summary;
-- DROP TABLE IF EXISTS pokemon_held_item_version;
-- DROP TABLE IF EXISTS pokemon_move;
-- DROP TABLE IF EXISTS pokemon_move_version_group;
-- DROP TABLE IF EXISTS pokemon_past_ability;
-- DROP TABLE IF EXISTS pokemon_past_stat;
-- DROP TABLE IF EXISTS pokemon_past_type;
-- DROP TABLE IF EXISTS pokemon_shape_awesome_name;
-- DROP TABLE IF EXISTS pokemon_shape_detail;
-- DROP TABLE IF EXISTS pokemon_shape_name;
-- DROP TABLE IF EXISTS pokemon_shape_summary;
-- DROP TABLE IF EXISTS pokemon_species_description;
-- DROP TABLE IF EXISTS pokemon_species_detail;
-- DROP TABLE IF EXISTS pokemon_species_flavor_text;
-- DROP TABLE IF EXISTS pokemon_species_genus;
-- DROP TABLE IF EXISTS pokemon_species_name;
-- DROP TABLE IF EXISTS pokemon_species_pal_park_encounter;
-- DROP TABLE IF EXISTS pokemon_species_summary;
-- DROP TABLE IF EXISTS pokemon_species_variety;
-- DROP TABLE IF EXISTS pokemon_sprites;
-- DROP TABLE IF EXISTS pokemon_sprites_other;
-- DROP TABLE IF EXISTS pokemon_sprites_other_dream_world;
-- DROP TABLE IF EXISTS pokemon_sprites_other_home;
-- DROP TABLE IF EXISTS pokemon_sprites_other_official_artwork;
-- DROP TABLE IF EXISTS pokemon_sprites_other_showdown;
-- DROP TABLE IF EXISTS pokemon_stat;
-- DROP TABLE IF EXISTS pokemon_summary;
-- DROP TABLE IF EXISTS pokemon_type;
-- DROP TABLE IF EXISTS region_detail;
-- DROP TABLE IF EXISTS region_name;
-- DROP TABLE IF EXISTS region_summary;
-- DROP TABLE IF EXISTS stat_affecting_moves;
-- DROP TABLE IF EXISTS stat_affecting_natures;
-- DROP TABLE IF EXISTS stat_detail;
-- DROP TABLE IF EXISTS stat_name;
-- DROP TABLE IF EXISTS stat_summary;
-- DROP TABLE IF EXISTS super_contest_effect_detail;
-- DROP TABLE IF EXISTS super_contest_effect_flavor_text;
-- DROP TABLE IF EXISTS super_contest_effect_summary;
-- DROP TABLE IF EXISTS type_detail;
-- DROP TABLE IF EXISTS type_game_index;
-- DROP TABLE IF EXISTS type_game_sprite;
-- DROP TABLE IF EXISTS type_name;
-- DROP TABLE IF EXISTS type_past_relationships;
-- DROP TABLE IF EXISTS type_pokemon;
-- DROP TABLE IF EXISTS type_relationships;
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
COMMENT ON COLUMN ability_change.version_group IS 'The version group in which the previous effect of this ability originated.';
COMMENT ON COLUMN ability_change.effect_entries IS 'The previous effect of this ability listed in different languages.';

--
-- Table 'ability_change_effect_text' generated from model 'AbilityChangeEffectText'
--
CREATE TABLE IF NOT EXISTS ability_change_effect_text (
    effect VARCHAR(6000) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE ability_change_effect_text IS 'Original model name - AbilityChangeEffectText.';
COMMENT ON COLUMN ability_change_effect_text.effect IS 'The localized effect text for an API resource in a specific language.';
COMMENT ON COLUMN ability_change_effect_text."language" IS 'The language this effect is in.';

--
-- Table 'ability_detail' generated from model 'AbilityDetail'
--
CREATE TABLE IF NOT EXISTS ability_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    is_main_series BOOLEAN DEFAULT NULL,
    generation TEXT NOT NULL,
    "names" JSON NOT NULL,
    effect_entries JSON NOT NULL,
    effect_changes JSON NOT NULL,
    flavor_text_entries JSON NOT NULL,
    pokemon JSON NOT NULL
);
COMMENT ON TABLE ability_detail IS 'Original model name - AbilityDetail.';
COMMENT ON COLUMN ability_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN ability_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN ability_detail.is_main_series IS 'Whether or not this ability originated in the main series of the video games.';
COMMENT ON COLUMN ability_detail.generation IS 'The generation this ability originated in.';
COMMENT ON COLUMN ability_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN ability_detail.effect_entries IS 'The effect of this ability listed in different languages.';
COMMENT ON COLUMN ability_detail.effect_changes IS 'The list of previous effects this ability has had across version groups.';
COMMENT ON COLUMN ability_detail.flavor_text_entries IS 'The flavor text of this ability listed in different languages.';
COMMENT ON COLUMN ability_detail.pokemon IS 'A list of Pokémon that could potentially have this ability.';

--
-- Table 'ability_effect_text' generated from model 'AbilityEffectText'
--
CREATE TABLE IF NOT EXISTS ability_effect_text (
    effect VARCHAR(6000) NOT NULL,
    short_effect VARCHAR(300) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE ability_effect_text IS 'Original model name - AbilityEffectText.';
COMMENT ON COLUMN ability_effect_text.effect IS 'The localized effect text for an API resource in a specific language.';
COMMENT ON COLUMN ability_effect_text.short_effect IS 'The localized effect text in brief.';
COMMENT ON COLUMN ability_effect_text."language" IS 'The language this effect is in.';

--
-- Table 'ability_flavor_text' generated from model 'AbilityFlavorText'
--
CREATE TABLE IF NOT EXISTS ability_flavor_text (
    flavor_text TEXT NOT NULL,
    "language" TEXT NOT NULL,
    version_group TEXT NOT NULL
);
COMMENT ON TABLE ability_flavor_text IS 'Original model name - AbilityFlavorText.';
COMMENT ON COLUMN ability_flavor_text.flavor_text IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN ability_flavor_text."language" IS 'The language this text resource is in.';
COMMENT ON COLUMN ability_flavor_text.version_group IS 'The version group that uses this flavor text.';

--
-- Table 'ability_name' generated from model 'AbilityName'
--
CREATE TABLE IF NOT EXISTS ability_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE ability_name IS 'Original model name - AbilityName.';
COMMENT ON COLUMN ability_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN ability_name."language" IS 'The language this name is in.';

--
-- Table 'ability_pokemon_detail' generated from model 'AbilityPokemonDetail'
--
CREATE TABLE IF NOT EXISTS ability_pokemon_detail (
    is_hidden BOOLEAN DEFAULT NULL,
    slot INTEGER NOT NULL,
    pokemon TEXT NOT NULL
);
COMMENT ON TABLE ability_pokemon_detail IS 'Original model name - AbilityPokemonDetail.';
COMMENT ON COLUMN ability_pokemon_detail.is_hidden IS 'Whether or not this a hidden ability for the referenced Pokémon.';
COMMENT ON COLUMN ability_pokemon_detail.slot IS 'Pokémon have 3 ability &#39;slots&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.';
COMMENT ON COLUMN ability_pokemon_detail.pokemon IS 'The Pokémon this ability could belong to.';

--
-- Table 'ability_summary' generated from model 'AbilitySummary'
--
CREATE TABLE IF NOT EXISTS ability_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE ability_summary IS 'Original model name - AbilitySummary.';
COMMENT ON COLUMN ability_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN ability_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'berry_detail' generated from model 'BerryDetail'
--
CREATE TABLE IF NOT EXISTS berry_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    growth_time INTEGER DEFAULT NULL,
    max_harvest INTEGER DEFAULT NULL,
    natural_gift_power INTEGER DEFAULT NULL,
    "size" INTEGER DEFAULT NULL,
    smoothness INTEGER DEFAULT NULL,
    soil_dryness INTEGER DEFAULT NULL,
    firmness TEXT NOT NULL,
    flavors JSON NOT NULL,
    item TEXT NOT NULL,
    natural_gift_type TEXT NOT NULL
);
COMMENT ON TABLE berry_detail IS 'Original model name - BerryDetail.';
COMMENT ON COLUMN berry_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN berry_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN berry_detail.growth_time IS 'Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.';
COMMENT ON COLUMN berry_detail.max_harvest IS 'The maximum number of these berries that can grow on one tree in Generation IV.';
COMMENT ON COLUMN berry_detail.natural_gift_power IS 'The power of the move \&quot;Natural Gift\&quot; when used with this Berry.';
COMMENT ON COLUMN berry_detail."size" IS 'The size of this Berry, in millimeters.';
COMMENT ON COLUMN berry_detail.smoothness IS 'The smoothness of this Berry, used in making Pokéblocks or Poffins.';
COMMENT ON COLUMN berry_detail.soil_dryness IS 'The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.';
COMMENT ON COLUMN berry_detail.firmness IS 'The firmness of this berry, used in making Pokéblocks or Poffins.';
COMMENT ON COLUMN berry_detail.flavors IS 'A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.';
COMMENT ON COLUMN berry_detail.item IS 'Berries are actually items. This is a reference to the item specific data for this berry.';
COMMENT ON COLUMN berry_detail.natural_gift_type IS 'The type inherited by \&quot;Natural Gift\&quot; when used with this Berry.';

--
-- Table 'berry_firmness_detail' generated from model 'BerryFirmnessDetail'
--
CREATE TABLE IF NOT EXISTS berry_firmness_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    berries JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE berry_firmness_detail IS 'Original model name - BerryFirmnessDetail.';
COMMENT ON COLUMN berry_firmness_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN berry_firmness_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN berry_firmness_detail.berries IS 'A list of the berries with this firmness.';
COMMENT ON COLUMN berry_firmness_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'berry_firmness_name' generated from model 'BerryFirmnessName'
--
CREATE TABLE IF NOT EXISTS berry_firmness_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE berry_firmness_name IS 'Original model name - BerryFirmnessName.';
COMMENT ON COLUMN berry_firmness_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN berry_firmness_name."language" IS 'The language this name is in.';

--
-- Table 'berry_firmness_summary' generated from model 'BerryFirmnessSummary'
--
CREATE TABLE IF NOT EXISTS berry_firmness_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE berry_firmness_summary IS 'Original model name - BerryFirmnessSummary.';
COMMENT ON COLUMN berry_firmness_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN berry_firmness_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'berry_flavor_berry_map' generated from model 'BerryFlavorBerryMap'
--
CREATE TABLE IF NOT EXISTS berry_flavor_berry_map (
    potency INTEGER NOT NULL,
    berry TEXT NOT NULL
);
COMMENT ON TABLE berry_flavor_berry_map IS 'Original model name - BerryFlavorBerryMap.';
COMMENT ON COLUMN berry_flavor_berry_map.potency IS 'How powerful the referenced flavor is for this berry.';
COMMENT ON COLUMN berry_flavor_berry_map.berry IS 'The berry with the referenced flavor.';

--
-- Table 'berry_flavor_detail' generated from model 'BerryFlavorDetail'
--
CREATE TABLE IF NOT EXISTS berry_flavor_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    berries JSON NOT NULL,
    contest_type TEXT NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE berry_flavor_detail IS 'Original model name - BerryFlavorDetail.';
COMMENT ON COLUMN berry_flavor_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN berry_flavor_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN berry_flavor_detail.berries IS 'A list of the berries with this flavor.';
COMMENT ON COLUMN berry_flavor_detail.contest_type IS 'The contest type that correlates with this berry flavor.';
COMMENT ON COLUMN berry_flavor_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'berry_flavor_map' generated from model 'BerryFlavorMap'
--
CREATE TABLE IF NOT EXISTS berry_flavor_map (
    potency INTEGER NOT NULL,
    flavor TEXT NOT NULL
);
COMMENT ON TABLE berry_flavor_map IS 'Original model name - BerryFlavorMap.';
COMMENT ON COLUMN berry_flavor_map.potency IS 'How powerful the referenced flavor is for this berry.';
COMMENT ON COLUMN berry_flavor_map.flavor IS 'The referenced berry flavor.';

--
-- Table 'berry_flavor_name' generated from model 'BerryFlavorName'
--
CREATE TABLE IF NOT EXISTS berry_flavor_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE berry_flavor_name IS 'Original model name - BerryFlavorName.';
COMMENT ON COLUMN berry_flavor_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN berry_flavor_name."language" IS 'The language this name is in.';

--
-- Table 'berry_flavor_summary' generated from model 'BerryFlavorSummary'
--
CREATE TABLE IF NOT EXISTS berry_flavor_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE berry_flavor_summary IS 'Original model name - BerryFlavorSummary.';
COMMENT ON COLUMN berry_flavor_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN berry_flavor_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'berry_summary' generated from model 'BerrySummary'
--
CREATE TABLE IF NOT EXISTS berry_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE berry_summary IS 'Original model name - BerrySummary.';
COMMENT ON COLUMN berry_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN berry_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'characteristic_description' generated from model 'CharacteristicDescription'
--
CREATE TABLE IF NOT EXISTS characteristic_description (
    description VARCHAR(2000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE characteristic_description IS 'Original model name - CharacteristicDescription.';
COMMENT ON COLUMN characteristic_description.description IS 'The localized description for an API resource in a specific language.';
COMMENT ON COLUMN characteristic_description."language" IS 'The language this name is in.';

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
COMMENT ON COLUMN characteristic_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN characteristic_detail.gene_modulo IS 'The remainder of the highest stat/IV divided by 5.';
COMMENT ON COLUMN characteristic_detail.possible_values IS 'The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.';
COMMENT ON COLUMN characteristic_detail.highest_stat IS 'The stat which results in this characteristic.';
COMMENT ON COLUMN characteristic_detail.descriptions IS 'The descriptions of this characteristic listed in different languages.';

--
-- Table 'characteristic_summary' generated from model 'CharacteristicSummary'
--
CREATE TABLE IF NOT EXISTS characteristic_summary (
    url TEXT NOT NULL
);
COMMENT ON TABLE characteristic_summary IS 'Original model name - CharacteristicSummary.';
COMMENT ON COLUMN characteristic_summary.url IS 'The URL of the referenced resource.';

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
COMMENT ON COLUMN contest_effect_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN contest_effect_detail.appeal IS 'The base number of hearts the user of this move gets.';
COMMENT ON COLUMN contest_effect_detail.jam IS 'The base number of hearts the user&#39;s opponent loses.';
COMMENT ON COLUMN contest_effect_detail.effect_entries IS 'The result of this contest effect listed in different languages.';
COMMENT ON COLUMN contest_effect_detail.flavor_text_entries IS 'The flavor text of this contest effect listed in different languages.';

--
-- Table 'contest_effect_effect_text' generated from model 'ContestEffectEffectText'
--
CREATE TABLE IF NOT EXISTS contest_effect_effect_text (
    effect VARCHAR(6000) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE contest_effect_effect_text IS 'Original model name - ContestEffectEffectText.';
COMMENT ON COLUMN contest_effect_effect_text.effect IS 'The localized effect text for an API resource in a specific language.';
COMMENT ON COLUMN contest_effect_effect_text."language" IS 'The language this effect is in.';

--
-- Table 'contest_effect_flavor_text' generated from model 'ContestEffectFlavorText'
--
CREATE TABLE IF NOT EXISTS contest_effect_flavor_text (
    flavor_text VARCHAR(500) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE contest_effect_flavor_text IS 'Original model name - ContestEffectFlavorText.';
COMMENT ON COLUMN contest_effect_flavor_text.flavor_text IS 'The localized flavor text for an API resource in a specific language.';
COMMENT ON COLUMN contest_effect_flavor_text."language" IS 'The language this name is in.';

--
-- Table 'contest_effect_summary' generated from model 'ContestEffectSummary'
--
CREATE TABLE IF NOT EXISTS contest_effect_summary (
    url TEXT NOT NULL
);
COMMENT ON TABLE contest_effect_summary IS 'Original model name - ContestEffectSummary.';
COMMENT ON COLUMN contest_effect_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'contest_type_detail' generated from model 'ContestTypeDetail'
--
CREATE TABLE IF NOT EXISTS contest_type_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    berry_flavor TEXT NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE contest_type_detail IS 'Original model name - ContestTypeDetail.';
COMMENT ON COLUMN contest_type_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN contest_type_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN contest_type_detail.berry_flavor IS 'The berry flavor that correlates with this contest type.';
COMMENT ON COLUMN contest_type_detail."names" IS 'The name of this contest type listed in different languages.';

--
-- Table 'contest_type_name' generated from model 'ContestTypeName'
--
CREATE TABLE IF NOT EXISTS contest_type_name (
    "name" VARCHAR(200) NOT NULL,
    color VARCHAR(10) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE contest_type_name IS 'Original model name - ContestTypeName.';
COMMENT ON COLUMN contest_type_name."name" IS 'The name for this contest.';
COMMENT ON COLUMN contest_type_name.color IS 'The color associated with this contest&#39;s name.';
COMMENT ON COLUMN contest_type_name."language" IS 'The language that this name is in.';

--
-- Table 'contest_type_summary' generated from model 'ContestTypeSummary'
--
CREATE TABLE IF NOT EXISTS contest_type_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE contest_type_summary IS 'Original model name - ContestTypeSummary.';
COMMENT ON COLUMN contest_type_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN contest_type_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'currency_detail' generated from model 'CurrencyDetail'
--
CREATE TABLE IF NOT EXISTS currency_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE currency_detail IS 'Original model name - CurrencyDetail.';
COMMENT ON COLUMN currency_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN currency_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN currency_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'currency_name' generated from model 'CurrencyName'
--
CREATE TABLE IF NOT EXISTS currency_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE currency_name IS 'Original model name - CurrencyName.';
COMMENT ON COLUMN currency_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN currency_name."language" IS 'The language this name is in.';

--
-- Table 'currency_summary' generated from model 'CurrencySummary'
--
CREATE TABLE IF NOT EXISTS currency_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE currency_summary IS 'Original model name - CurrencySummary.';
COMMENT ON COLUMN currency_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN currency_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'egg_group_detail' generated from model 'EggGroupDetail'
--
CREATE TABLE IF NOT EXISTS egg_group_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    "names" JSON NOT NULL,
    pokemon_species JSON NOT NULL
);
COMMENT ON TABLE egg_group_detail IS 'Original model name - EggGroupDetail.';
COMMENT ON COLUMN egg_group_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN egg_group_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN egg_group_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN egg_group_detail.pokemon_species IS 'A list of all Pokémon species that are members of this egg group.';

--
-- Table 'egg_group_name' generated from model 'EggGroupName'
--
CREATE TABLE IF NOT EXISTS egg_group_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE egg_group_name IS 'Original model name - EggGroupName.';
COMMENT ON COLUMN egg_group_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN egg_group_name."language" IS 'The language this name is in.';

--
-- Table 'egg_group_summary' generated from model 'EggGroupSummary'
--
CREATE TABLE IF NOT EXISTS egg_group_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE egg_group_summary IS 'Original model name - EggGroupSummary.';
COMMENT ON COLUMN egg_group_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN egg_group_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'encounter_condition_detail' generated from model 'EncounterConditionDetail'
--
CREATE TABLE IF NOT EXISTS encounter_condition_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    "values" JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE encounter_condition_detail IS 'Original model name - EncounterConditionDetail.';
COMMENT ON COLUMN encounter_condition_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN encounter_condition_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN encounter_condition_detail."values" IS 'A list of possible values for this encounter condition.';
COMMENT ON COLUMN encounter_condition_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'encounter_condition_name' generated from model 'EncounterConditionName'
--
CREATE TABLE IF NOT EXISTS encounter_condition_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE encounter_condition_name IS 'Original model name - EncounterConditionName.';
COMMENT ON COLUMN encounter_condition_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN encounter_condition_name."language" IS 'The language this name is in.';

--
-- Table 'encounter_condition_summary' generated from model 'EncounterConditionSummary'
--
CREATE TABLE IF NOT EXISTS encounter_condition_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE encounter_condition_summary IS 'Original model name - EncounterConditionSummary.';
COMMENT ON COLUMN encounter_condition_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN encounter_condition_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'encounter_condition_value_detail' generated from model 'EncounterConditionValueDetail'
--
CREATE TABLE IF NOT EXISTS encounter_condition_value_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    "condition" TEXT NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE encounter_condition_value_detail IS 'Original model name - EncounterConditionValueDetail.';
COMMENT ON COLUMN encounter_condition_value_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN encounter_condition_value_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN encounter_condition_value_detail."condition" IS 'The condition this encounter condition value pertains to.';
COMMENT ON COLUMN encounter_condition_value_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'encounter_condition_value_name' generated from model 'EncounterConditionValueName'
--
CREATE TABLE IF NOT EXISTS encounter_condition_value_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE encounter_condition_value_name IS 'Original model name - EncounterConditionValueName.';
COMMENT ON COLUMN encounter_condition_value_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN encounter_condition_value_name."language" IS 'The language this name is in.';

--
-- Table 'encounter_condition_value_summary' generated from model 'EncounterConditionValueSummary'
--
CREATE TABLE IF NOT EXISTS encounter_condition_value_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE encounter_condition_value_summary IS 'Original model name - EncounterConditionValueSummary.';
COMMENT ON COLUMN encounter_condition_value_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN encounter_condition_value_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'encounter_method_detail' generated from model 'EncounterMethodDetail'
--
CREATE TABLE IF NOT EXISTS encounter_method_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    "order" INTEGER DEFAULT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE encounter_method_detail IS 'Original model name - EncounterMethodDetail.';
COMMENT ON COLUMN encounter_method_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN encounter_method_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN encounter_method_detail."order" IS 'A good value for sorting.';
COMMENT ON COLUMN encounter_method_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'encounter_method_name' generated from model 'EncounterMethodName'
--
CREATE TABLE IF NOT EXISTS encounter_method_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE encounter_method_name IS 'Original model name - EncounterMethodName.';
COMMENT ON COLUMN encounter_method_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN encounter_method_name."language" IS 'The language this name is in.';

--
-- Table 'encounter_method_summary' generated from model 'EncounterMethodSummary'
--
CREATE TABLE IF NOT EXISTS encounter_method_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE encounter_method_summary IS 'Original model name - EncounterMethodSummary.';
COMMENT ON COLUMN encounter_method_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN encounter_method_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'encounter_pokemon_detail' generated from model 'EncounterPokemonDetail'
--
CREATE TABLE IF NOT EXISTS encounter_pokemon_detail (
    min_perfect_ivs INTEGER DEFAULT NULL,
    always_shiny BOOLEAN DEFAULT NULL,
    never_shiny BOOLEAN DEFAULT NULL,
    is_alpha BOOLEAN DEFAULT NULL
);
COMMENT ON TABLE encounter_pokemon_detail IS 'Original model name - EncounterPokemonDetail.';
COMMENT ON COLUMN encounter_pokemon_detail.min_perfect_ivs IS 'The minimum number of perfect IVs, or null if unspecified.';
COMMENT ON COLUMN encounter_pokemon_detail.always_shiny IS 'Whether the encountered Pokémon is always shiny.';
COMMENT ON COLUMN encounter_pokemon_detail.never_shiny IS 'Whether the encountered Pokémon can never be shiny.';
COMMENT ON COLUMN encounter_pokemon_detail.is_alpha IS 'Whether the encountered Pokémon is an alpha Pokémon.';

--
-- Table 'evolution_chain_detail' generated from model 'EvolutionChainDetail'
--
CREATE TABLE IF NOT EXISTS evolution_chain_detail (
    "id" INTEGER NOT NULL,
    baby_trigger_item TEXT NOT NULL,
    "chain" TEXT NOT NULL
);
COMMENT ON TABLE evolution_chain_detail IS 'Original model name - EvolutionChainDetail.';
COMMENT ON COLUMN evolution_chain_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN evolution_chain_detail.baby_trigger_item IS 'The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.';
COMMENT ON COLUMN evolution_chain_detail."chain" IS 'The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.';

--
-- Table 'evolution_chain_link' generated from model 'EvolutionChainLink'
--
CREATE TABLE IF NOT EXISTS evolution_chain_link (
    is_baby BOOLEAN NOT NULL,
    species TEXT NOT NULL,
    evolution_details JSON NOT NULL,
    evolves_to JSON NOT NULL
);
COMMENT ON TABLE evolution_chain_link IS 'Original model name - EvolutionChainLink.';
COMMENT ON COLUMN evolution_chain_link.is_baby IS 'Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.';
COMMENT ON COLUMN evolution_chain_link.species IS 'The Pokémon species at this point in the evolution chain.';
COMMENT ON COLUMN evolution_chain_link.evolution_details IS 'All details regarding the specific details of the referenced Pokémon species evolution.';
COMMENT ON COLUMN evolution_chain_link.evolves_to IS 'A List of chain objects.';

--
-- Table 'evolution_chain_summary' generated from model 'EvolutionChainSummary'
--
CREATE TABLE IF NOT EXISTS evolution_chain_summary (
    url TEXT NOT NULL
);
COMMENT ON TABLE evolution_chain_summary IS 'Original model name - EvolutionChainSummary.';
COMMENT ON COLUMN evolution_chain_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'evolution_condition_expression' generated from model 'EvolutionConditionExpression'
--
CREATE TABLE IF NOT EXISTS evolution_condition_expression (
    "expression" TEXT NOT NULL,
    percentage_chance DECIMAL(20, 9) NOT NULL,
    variables JSON NOT NULL
);
COMMENT ON TABLE evolution_condition_expression IS 'Original model name - EvolutionConditionExpression.';
COMMENT ON COLUMN evolution_condition_expression."expression" IS 'Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;)';
COMMENT ON COLUMN evolution_condition_expression.percentage_chance IS 'Percentage chance of evolution under this condition (0-100)';
COMMENT ON COLUMN evolution_condition_expression.variables IS 'Evolution variables referenced in the expression';

--
-- Table 'evolution_trigger_detail' generated from model 'EvolutionTriggerDetail'
--
CREATE TABLE IF NOT EXISTS evolution_trigger_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    "names" JSON NOT NULL,
    pokemon_species JSON NOT NULL
);
COMMENT ON TABLE evolution_trigger_detail IS 'Original model name - EvolutionTriggerDetail.';
COMMENT ON COLUMN evolution_trigger_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN evolution_trigger_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN evolution_trigger_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN evolution_trigger_detail.pokemon_species IS 'A list of pokemon species that result from this evolution trigger.';

--
-- Table 'evolution_trigger_name' generated from model 'EvolutionTriggerName'
--
CREATE TABLE IF NOT EXISTS evolution_trigger_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE evolution_trigger_name IS 'Original model name - EvolutionTriggerName.';
COMMENT ON COLUMN evolution_trigger_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN evolution_trigger_name."language" IS 'The language this name is in.';

--
-- Table 'evolution_trigger_summary' generated from model 'EvolutionTriggerSummary'
--
CREATE TABLE IF NOT EXISTS evolution_trigger_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE evolution_trigger_summary IS 'Original model name - EvolutionTriggerSummary.';
COMMENT ON COLUMN evolution_trigger_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN evolution_trigger_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'evolution_variable_description' generated from model 'EvolutionVariableDescription'
--
CREATE TABLE IF NOT EXISTS evolution_variable_description (
    description VARCHAR(2000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE evolution_variable_description IS 'Original model name - EvolutionVariableDescription.';
COMMENT ON COLUMN evolution_variable_description.description IS 'The localized description for an API resource in a specific language.';
COMMENT ON COLUMN evolution_variable_description."language" IS 'The language this name is in.';

--
-- Table 'evolution_variable_detail' generated from model 'EvolutionVariableDetail'
--
CREATE TABLE IF NOT EXISTS evolution_variable_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    symbol VARCHAR(10) NOT NULL,
    data_type VARCHAR(20) DEFAULT NULL,
    "source" VARCHAR(20) DEFAULT NULL,
    version_group TEXT NOT NULL,
    "names" JSON NOT NULL,
    descriptions JSON NOT NULL
);
COMMENT ON TABLE evolution_variable_detail IS 'Original model name - EvolutionVariableDetail.';
COMMENT ON COLUMN evolution_variable_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN evolution_variable_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN evolution_variable_detail.symbol IS 'The symbol used for this variable in evolution condition expressions.';
COMMENT ON COLUMN evolution_variable_detail.data_type IS 'The data type of this variable.';
COMMENT ON COLUMN evolution_variable_detail."source" IS 'The source of the variable value.';
COMMENT ON COLUMN evolution_variable_detail.version_group IS 'The version group in which this variable was introduced.';
COMMENT ON COLUMN evolution_variable_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN evolution_variable_detail.descriptions IS 'The description of this resource listed in different languages.';

--
-- Table 'evolution_variable_name' generated from model 'EvolutionVariableName'
--
CREATE TABLE IF NOT EXISTS evolution_variable_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE evolution_variable_name IS 'Original model name - EvolutionVariableName.';
COMMENT ON COLUMN evolution_variable_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN evolution_variable_name."language" IS 'The language this name is in.';

--
-- Table 'evolution_variable_summary' generated from model 'EvolutionVariableSummary'
--
CREATE TABLE IF NOT EXISTS evolution_variable_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE evolution_variable_summary IS 'Original model name - EvolutionVariableSummary.';
COMMENT ON COLUMN evolution_variable_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN evolution_variable_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'experience' generated from model 'Experience'
--
CREATE TABLE IF NOT EXISTS experience (
    "level" INTEGER NOT NULL,
    experience INTEGER NOT NULL
);
COMMENT ON TABLE experience IS 'Original model name - Experience.';
COMMENT ON COLUMN experience."level" IS 'The level gained.';
COMMENT ON COLUMN experience.experience IS 'The amount of experience required to reach the referenced level.';

--
-- Table 'gender_detail' generated from model 'GenderDetail'
--
CREATE TABLE IF NOT EXISTS gender_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    pokemon_species_details JSON NOT NULL,
    required_for_evolution JSON NOT NULL
);
COMMENT ON TABLE gender_detail IS 'Original model name - GenderDetail.';
COMMENT ON COLUMN gender_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN gender_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN gender_detail.pokemon_species_details IS 'A list of Pokémon species that can be this gender and how likely it is that they will be.';
COMMENT ON COLUMN gender_detail.required_for_evolution IS 'A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.';

--
-- Table 'gender_pokemon_species' generated from model 'GenderPokemonSpecies'
--
CREATE TABLE IF NOT EXISTS gender_pokemon_species (
    rate INTEGER NOT NULL,
    pokemon_species TEXT NOT NULL
);
COMMENT ON TABLE gender_pokemon_species IS 'Original model name - GenderPokemonSpecies.';
COMMENT ON COLUMN gender_pokemon_species.rate IS 'The chance of this Pokémon being female, in eighths; or -1 for genderless.';
COMMENT ON COLUMN gender_pokemon_species.pokemon_species IS 'A Pokémon species that can be the referenced gender.';

--
-- Table 'gender_summary' generated from model 'GenderSummary'
--
CREATE TABLE IF NOT EXISTS gender_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE gender_summary IS 'Original model name - GenderSummary.';
COMMENT ON COLUMN gender_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN gender_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'generation_detail' generated from model 'GenerationDetail'
--
CREATE TABLE IF NOT EXISTS generation_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    abilities JSON NOT NULL,
    main_region TEXT NOT NULL,
    moves JSON NOT NULL,
    "names" JSON NOT NULL,
    pokemon_species JSON NOT NULL,
    "types" JSON NOT NULL,
    version_groups JSON NOT NULL
);
COMMENT ON TABLE generation_detail IS 'Original model name - GenerationDetail.';
COMMENT ON COLUMN generation_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN generation_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN generation_detail.abilities IS 'A list of abilities that were introduced in this generation.';
COMMENT ON COLUMN generation_detail.main_region IS 'The main region travelled in this generation.';
COMMENT ON COLUMN generation_detail.moves IS 'A list of moves that were introduced in this generation.';
COMMENT ON COLUMN generation_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN generation_detail.pokemon_species IS 'A list of Pokémon species that were introduced in this generation.';
COMMENT ON COLUMN generation_detail."types" IS 'A list of types that were introduced in this generation.';
COMMENT ON COLUMN generation_detail.version_groups IS 'A list of version groups that were introduced in this generation.';

--
-- Table 'generation_name' generated from model 'GenerationName'
--
CREATE TABLE IF NOT EXISTS generation_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE generation_name IS 'Original model name - GenerationName.';
COMMENT ON COLUMN generation_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN generation_name."language" IS 'The language this name is in.';

--
-- Table 'generation_summary' generated from model 'GenerationSummary'
--
CREATE TABLE IF NOT EXISTS generation_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE generation_summary IS 'Original model name - GenerationSummary.';
COMMENT ON COLUMN generation_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN generation_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'growth_rate_description' generated from model 'GrowthRateDescription'
--
CREATE TABLE IF NOT EXISTS growth_rate_description (
    description VARCHAR(2000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE growth_rate_description IS 'Original model name - GrowthRateDescription.';
COMMENT ON COLUMN growth_rate_description.description IS 'The localized description for an API resource in a specific language.';
COMMENT ON COLUMN growth_rate_description."language" IS 'The language this name is in.';

--
-- Table 'growth_rate_detail' generated from model 'GrowthRateDetail'
--
CREATE TABLE IF NOT EXISTS growth_rate_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    formula VARCHAR(500) NOT NULL,
    descriptions JSON NOT NULL,
    levels JSON NOT NULL,
    pokemon_species JSON NOT NULL
);
COMMENT ON TABLE growth_rate_detail IS 'Original model name - GrowthRateDetail.';
COMMENT ON COLUMN growth_rate_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN growth_rate_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN growth_rate_detail.formula IS 'The formula used to calculate the rate at which the Pokémon species gains level.';
COMMENT ON COLUMN growth_rate_detail.descriptions IS 'The descriptions of this characteristic listed in different languages.';
COMMENT ON COLUMN growth_rate_detail.levels IS 'A list of levels and the amount of experienced needed to atain them based on this growth rate.';
COMMENT ON COLUMN growth_rate_detail.pokemon_species IS 'A list of Pokémon species that gain levels at this growth rate.';

--
-- Table 'growth_rate_summary' generated from model 'GrowthRateSummary'
--
CREATE TABLE IF NOT EXISTS growth_rate_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE growth_rate_summary IS 'Original model name - GrowthRateSummary.';
COMMENT ON COLUMN growth_rate_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN growth_rate_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'item_attribute_description' generated from model 'ItemAttributeDescription'
--
CREATE TABLE IF NOT EXISTS item_attribute_description (
    description VARCHAR(2000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_attribute_description IS 'Original model name - ItemAttributeDescription.';
COMMENT ON COLUMN item_attribute_description.description IS 'The localized description for an API resource in a specific language.';
COMMENT ON COLUMN item_attribute_description."language" IS 'The language this name is in.';

--
-- Table 'item_attribute_detail' generated from model 'ItemAttributeDetail'
--
CREATE TABLE IF NOT EXISTS item_attribute_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    descriptions JSON NOT NULL,
    items JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE item_attribute_detail IS 'Original model name - ItemAttributeDetail.';
COMMENT ON COLUMN item_attribute_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN item_attribute_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN item_attribute_detail.descriptions IS 'The description of this item attribute listed in different languages.';
COMMENT ON COLUMN item_attribute_detail.items IS 'A list of items that have this attribute.';
COMMENT ON COLUMN item_attribute_detail."names" IS 'The name of this item attribute listed in different languages.';

--
-- Table 'item_attribute_name' generated from model 'ItemAttributeName'
--
CREATE TABLE IF NOT EXISTS item_attribute_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_attribute_name IS 'Original model name - ItemAttributeName.';
COMMENT ON COLUMN item_attribute_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN item_attribute_name."language" IS 'The language this name is in.';

--
-- Table 'item_attribute_summary' generated from model 'ItemAttributeSummary'
--
CREATE TABLE IF NOT EXISTS item_attribute_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE item_attribute_summary IS 'Original model name - ItemAttributeSummary.';
COMMENT ON COLUMN item_attribute_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN item_attribute_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'item_category_detail' generated from model 'ItemCategoryDetail'
--
CREATE TABLE IF NOT EXISTS item_category_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    items JSON NOT NULL,
    "names" JSON NOT NULL,
    pocket TEXT NOT NULL
);
COMMENT ON TABLE item_category_detail IS 'Original model name - ItemCategoryDetail.';
COMMENT ON COLUMN item_category_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN item_category_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN item_category_detail.items IS 'A list of items that are a part of this category.';
COMMENT ON COLUMN item_category_detail."names" IS 'The name of this item category listed in different languages.';
COMMENT ON COLUMN item_category_detail.pocket IS 'The pocket items in this category would be put in.';

--
-- Table 'item_category_name' generated from model 'ItemCategoryName'
--
CREATE TABLE IF NOT EXISTS item_category_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_category_name IS 'Original model name - ItemCategoryName.';
COMMENT ON COLUMN item_category_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN item_category_name."language" IS 'The language this name is in.';

--
-- Table 'item_category_summary' generated from model 'ItemCategorySummary'
--
CREATE TABLE IF NOT EXISTS item_category_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE item_category_summary IS 'Original model name - ItemCategorySummary.';
COMMENT ON COLUMN item_category_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN item_category_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'item_detail' generated from model 'ItemDetail'
--
CREATE TABLE IF NOT EXISTS item_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    fling_power INTEGER DEFAULT NULL,
    fling_effect TEXT NOT NULL,
    "attributes" JSON NOT NULL,
    category TEXT NOT NULL,
    effect_entries JSON NOT NULL,
    flavor_text_entries JSON NOT NULL,
    game_indices JSON NOT NULL,
    prices JSON NOT NULL,
    "names" JSON NOT NULL,
    held_by_pokemon JSON NOT NULL,
    sprites TEXT NOT NULL,
    baby_trigger_for TEXT NOT NULL,
    machines JSON NOT NULL
);
COMMENT ON TABLE item_detail IS 'Original model name - ItemDetail.';
COMMENT ON COLUMN item_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN item_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN item_detail.fling_power IS 'The power of the move Fling when used with this item.';
COMMENT ON COLUMN item_detail.fling_effect IS 'The effect of the move Fling when used with this item.';
COMMENT ON COLUMN item_detail."attributes" IS 'A list of attributes this item has.';
COMMENT ON COLUMN item_detail.category IS 'The category of items this item falls into.';
COMMENT ON COLUMN item_detail.effect_entries IS 'The effect of this ability listed in different languages.';
COMMENT ON COLUMN item_detail.flavor_text_entries IS 'The flavor text of this ability listed in different languages.';
COMMENT ON COLUMN item_detail.game_indices IS 'A list of game indices relevent to this item by generation.';
COMMENT ON COLUMN item_detail.prices IS 'Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.';
COMMENT ON COLUMN item_detail."names" IS 'The name of this item listed in different languages.';
COMMENT ON COLUMN item_detail.held_by_pokemon IS 'A list of Pokémon that might be found in the wild holding this item.';
COMMENT ON COLUMN item_detail.sprites IS 'A set of sprites used to depict this item in the game.';
COMMENT ON COLUMN item_detail.baby_trigger_for IS 'An evolution chain this item requires to produce a bay during mating.';
COMMENT ON COLUMN item_detail.machines IS 'A list of the machines related to this item.';

--
-- Table 'item_effect_text' generated from model 'ItemEffectText'
--
CREATE TABLE IF NOT EXISTS item_effect_text (
    effect VARCHAR(6000) NOT NULL,
    short_effect VARCHAR(300) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_effect_text IS 'Original model name - ItemEffectText.';
COMMENT ON COLUMN item_effect_text.effect IS 'The localized effect text for an API resource in a specific language.';
COMMENT ON COLUMN item_effect_text.short_effect IS 'The localized effect text in brief.';
COMMENT ON COLUMN item_effect_text."language" IS 'The language this effect is in.';

--
-- Table 'item_flavor_text' generated from model 'ItemFlavorText'
--
CREATE TABLE IF NOT EXISTS item_flavor_text (
    "text" TEXT NOT NULL,
    version_group TEXT NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_flavor_text IS 'Original model name - ItemFlavorText.';
COMMENT ON COLUMN item_flavor_text."text" IS 'The localized flavor text for an API resource in a specific language.';
COMMENT ON COLUMN item_flavor_text.version_group IS 'The version group which uses this flavor text.';
COMMENT ON COLUMN item_flavor_text."language" IS 'The language this name is in.';

--
-- Table 'item_fling_effect_detail' generated from model 'ItemFlingEffectDetail'
--
CREATE TABLE IF NOT EXISTS item_fling_effect_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    effect_entries JSON NOT NULL,
    items JSON NOT NULL
);
COMMENT ON TABLE item_fling_effect_detail IS 'Original model name - ItemFlingEffectDetail.';
COMMENT ON COLUMN item_fling_effect_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN item_fling_effect_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN item_fling_effect_detail.effect_entries IS 'The result of this fling effect listed in different languages.';
COMMENT ON COLUMN item_fling_effect_detail.items IS 'A list of items that have this fling effect.';

--
-- Table 'item_fling_effect_effect_text' generated from model 'ItemFlingEffectEffectText'
--
CREATE TABLE IF NOT EXISTS item_fling_effect_effect_text (
    effect VARCHAR(6000) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_fling_effect_effect_text IS 'Original model name - ItemFlingEffectEffectText.';
COMMENT ON COLUMN item_fling_effect_effect_text.effect IS 'The localized effect text for an API resource in a specific language.';
COMMENT ON COLUMN item_fling_effect_effect_text."language" IS 'The language this effect is in.';

--
-- Table 'item_fling_effect_summary' generated from model 'ItemFlingEffectSummary'
--
CREATE TABLE IF NOT EXISTS item_fling_effect_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE item_fling_effect_summary IS 'Original model name - ItemFlingEffectSummary.';
COMMENT ON COLUMN item_fling_effect_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN item_fling_effect_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'item_game_index' generated from model 'ItemGameIndex'
--
CREATE TABLE IF NOT EXISTS item_game_index (
    game_index INTEGER NOT NULL,
    generation TEXT NOT NULL
);
COMMENT ON TABLE item_game_index IS 'Original model name - ItemGameIndex.';
COMMENT ON COLUMN item_game_index.game_index IS 'The internal id of an API resource within game data.';
COMMENT ON COLUMN item_game_index.generation IS 'The generation relevent to this game index.';

--
-- Table 'item_machine' generated from model 'ItemMachine'
--
CREATE TABLE IF NOT EXISTS item_machine (
    machine TEXT NOT NULL,
    version_group TEXT NOT NULL
);
COMMENT ON TABLE item_machine IS 'Original model name - ItemMachine.';
COMMENT ON COLUMN item_machine.machine IS 'The machine that teaches a move from an item.';
COMMENT ON COLUMN item_machine.version_group IS 'The version group of this specific machine.';

--
-- Table 'item_name' generated from model 'ItemName'
--
CREATE TABLE IF NOT EXISTS item_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_name IS 'Original model name - ItemName.';
COMMENT ON COLUMN item_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN item_name."language" IS 'The language this name is in.';

--
-- Table 'item_pocket_detail' generated from model 'ItemPocketDetail'
--
CREATE TABLE IF NOT EXISTS item_pocket_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    categories JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE item_pocket_detail IS 'Original model name - ItemPocketDetail.';
COMMENT ON COLUMN item_pocket_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN item_pocket_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN item_pocket_detail.categories IS 'A list of item categories that are relevant to this item pocket.';
COMMENT ON COLUMN item_pocket_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'item_pocket_name' generated from model 'ItemPocketName'
--
CREATE TABLE IF NOT EXISTS item_pocket_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE item_pocket_name IS 'Original model name - ItemPocketName.';
COMMENT ON COLUMN item_pocket_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN item_pocket_name."language" IS 'The language this name is in.';

--
-- Table 'item_pocket_summary' generated from model 'ItemPocketSummary'
--
CREATE TABLE IF NOT EXISTS item_pocket_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE item_pocket_summary IS 'Original model name - ItemPocketSummary.';
COMMENT ON COLUMN item_pocket_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN item_pocket_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'item_price' generated from model 'ItemPrice'
--
CREATE TABLE IF NOT EXISTS item_price (
    purchase_price INTEGER DEFAULT NULL,
    sell_price INTEGER DEFAULT NULL,
    currency TEXT NOT NULL,
    version_group TEXT NOT NULL
);
COMMENT ON TABLE item_price IS 'Original model name - ItemPrice.';
COMMENT ON COLUMN item_price.purchase_price IS 'The purchase price in this currency and version group, or null if unavailable.';
COMMENT ON COLUMN item_price.sell_price IS 'The sell price in this currency and version group, or null if unavailable.';
COMMENT ON COLUMN item_price.currency IS 'The currency used for this price.';
COMMENT ON COLUMN item_price.version_group IS 'The version group to which this price applies.';

--
-- Table 'item_sprites' generated from model 'ItemSprites'
--
CREATE TABLE IF NOT EXISTS item_sprites (
    "default" TEXT NOT NULL
);
COMMENT ON TABLE item_sprites IS 'Original model name - ItemSprites.';
COMMENT ON COLUMN item_sprites."default" IS 'The default depiction of this item.';

--
-- Table 'item_summary' generated from model 'ItemSummary'
--
CREATE TABLE IF NOT EXISTS item_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE item_summary IS 'Original model name - ItemSummary.';
COMMENT ON COLUMN item_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN item_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'language_detail' generated from model 'LanguageDetail'
--
CREATE TABLE IF NOT EXISTS language_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    official BOOLEAN DEFAULT NULL,
    iso639 VARCHAR(10) NOT NULL,
    iso3166 VARCHAR(2) NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE language_detail IS 'Original model name - LanguageDetail.';
COMMENT ON COLUMN language_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN language_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN language_detail.official IS 'Whether or not the games are published in this language.';
COMMENT ON COLUMN language_detail.iso639 IS 'The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.';
COMMENT ON COLUMN language_detail.iso3166 IS 'The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.';
COMMENT ON COLUMN language_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'language_name' generated from model 'LanguageName'
--
CREATE TABLE IF NOT EXISTS language_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE language_name IS 'Original model name - LanguageName.';
COMMENT ON COLUMN language_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN language_name."language" IS 'The language this name is in.';

--
-- Table 'language_summary' generated from model 'LanguageSummary'
--
CREATE TABLE IF NOT EXISTS language_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE language_summary IS 'Original model name - LanguageSummary.';
COMMENT ON COLUMN language_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN language_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'location_area_detail' generated from model 'LocationAreaDetail'
--
CREATE TABLE IF NOT EXISTS location_area_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    game_index INTEGER NOT NULL,
    encounter_method_rates JSON NOT NULL,
    "location" TEXT NOT NULL,
    "names" JSON NOT NULL,
    pokemon_encounters JSON NOT NULL
);
COMMENT ON TABLE location_area_detail IS 'Original model name - LocationAreaDetail.';
COMMENT ON COLUMN location_area_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN location_area_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN location_area_detail.game_index IS 'The internal id of an API resource within game data.';
COMMENT ON COLUMN location_area_detail.encounter_method_rates IS 'A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.';
COMMENT ON COLUMN location_area_detail."location" IS 'The region this location area can be found in.';
COMMENT ON COLUMN location_area_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN location_area_detail.pokemon_encounters IS 'A list of Pokémon that can be encountered in this area along with version specific details about the encounter.';

--
-- Table 'location_area_encounter_detail' generated from model 'LocationAreaEncounterDetail'
--
CREATE TABLE IF NOT EXISTS location_area_encounter_detail (
    min_level INTEGER NOT NULL,
    max_level INTEGER NOT NULL,
    chance INTEGER DEFAULT 0,
    "method" TEXT DEFAULT NULL,
    condition_values JSON NOT NULL,
    pokemon_details TEXT NOT NULL
);
COMMENT ON TABLE location_area_encounter_detail IS 'Original model name - LocationAreaEncounterDetail.';
COMMENT ON COLUMN location_area_encounter_detail.min_level IS 'The lowest level the Pokémon could be encountered at.';
COMMENT ON COLUMN location_area_encounter_detail.max_level IS 'The highest level the Pokémon could be encountered at.';
COMMENT ON COLUMN location_area_encounter_detail.chance IS 'Percent chance that this encounter will occur.';
COMMENT ON COLUMN location_area_encounter_detail."method" IS 'The method by which this encounter happens.';
COMMENT ON COLUMN location_area_encounter_detail.condition_values IS 'A list of condition values that must be in effect for this encounter to occur.';
COMMENT ON COLUMN location_area_encounter_detail.pokemon_details IS 'Additional properties of the encountered Pokémon, or null if unspecified.';

--
-- Table 'location_area_encounter_rate' generated from model 'LocationAreaEncounterRate'
--
CREATE TABLE IF NOT EXISTS location_area_encounter_rate (
    encounter_method TEXT NOT NULL,
    version_details JSON NOT NULL
);
COMMENT ON TABLE location_area_encounter_rate IS 'Original model name - LocationAreaEncounterRate.';
COMMENT ON COLUMN location_area_encounter_rate.encounter_method IS 'The method in which Pokémon may be encountered in an area..';
COMMENT ON COLUMN location_area_encounter_rate.version_details IS 'The chance of the encounter to occur on a version of the game.';

--
-- Table 'location_area_encounter_version_detail' generated from model 'LocationAreaEncounterVersionDetail'
--
CREATE TABLE IF NOT EXISTS location_area_encounter_version_detail (
    rate INTEGER NOT NULL,
    "version" TEXT NOT NULL
);
COMMENT ON TABLE location_area_encounter_version_detail IS 'Original model name - LocationAreaEncounterVersionDetail.';
COMMENT ON COLUMN location_area_encounter_version_detail.rate IS 'The chance of an encounter to occur.';
COMMENT ON COLUMN location_area_encounter_version_detail."version" IS 'The version of the game in which the encounter can occur with the given chance.';

--
-- Table 'location_area_name' generated from model 'LocationAreaName'
--
CREATE TABLE IF NOT EXISTS location_area_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE location_area_name IS 'Original model name - LocationAreaName.';
COMMENT ON COLUMN location_area_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN location_area_name."language" IS 'The language this name is in.';

--
-- Table 'location_area_pokemon_encounter' generated from model 'LocationAreaPokemonEncounter'
--
CREATE TABLE IF NOT EXISTS location_area_pokemon_encounter (
    pokemon TEXT NOT NULL,
    version_details JSON NOT NULL
);
COMMENT ON TABLE location_area_pokemon_encounter IS 'Original model name - LocationAreaPokemonEncounter.';
COMMENT ON COLUMN location_area_pokemon_encounter.pokemon IS 'The Pokémon being encountered.';
COMMENT ON COLUMN location_area_pokemon_encounter.version_details IS 'A list of versions and encounters with Pokémon that might happen in the referenced location area.';

--
-- Table 'location_area_pokemon_encounter_version' generated from model 'LocationAreaPokemonEncounterVersion'
--
CREATE TABLE IF NOT EXISTS location_area_pokemon_encounter_version (
    "version" TEXT NOT NULL,
    max_chance INTEGER NOT NULL,
    encounter_details JSON NOT NULL
);
COMMENT ON TABLE location_area_pokemon_encounter_version IS 'Original model name - LocationAreaPokemonEncounterVersion.';
COMMENT ON COLUMN location_area_pokemon_encounter_version."version" IS 'The game version this encounter happens in.';
COMMENT ON COLUMN location_area_pokemon_encounter_version.max_chance IS 'The total percentage of all encounter potential.';
COMMENT ON COLUMN location_area_pokemon_encounter_version.encounter_details IS 'A list of encounters and their specifics.';

--
-- Table 'location_area_summary' generated from model 'LocationAreaSummary'
--
CREATE TABLE IF NOT EXISTS location_area_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE location_area_summary IS 'Original model name - LocationAreaSummary.';
COMMENT ON COLUMN location_area_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN location_area_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'location_detail' generated from model 'LocationDetail'
--
CREATE TABLE IF NOT EXISTS location_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    region TEXT NOT NULL,
    "names" JSON NOT NULL,
    game_indices JSON NOT NULL,
    areas JSON NOT NULL
);
COMMENT ON TABLE location_detail IS 'Original model name - LocationDetail.';
COMMENT ON COLUMN location_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN location_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN location_detail.region IS 'The region this location can be found in.';
COMMENT ON COLUMN location_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN location_detail.game_indices IS 'A list of game indices relevent to this location by generation.';
COMMENT ON COLUMN location_detail.areas IS 'Areas that can be found within this location.';

--
-- Table 'location_game_index' generated from model 'LocationGameIndex'
--
CREATE TABLE IF NOT EXISTS location_game_index (
    game_index INTEGER NOT NULL,
    generation TEXT NOT NULL
);
COMMENT ON TABLE location_game_index IS 'Original model name - LocationGameIndex.';
COMMENT ON COLUMN location_game_index.game_index IS 'The internal id of an API resource within game data.';
COMMENT ON COLUMN location_game_index.generation IS 'The generation relevent to this game index.';

--
-- Table 'location_name' generated from model 'LocationName'
--
CREATE TABLE IF NOT EXISTS location_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE location_name IS 'Original model name - LocationName.';
COMMENT ON COLUMN location_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN location_name."language" IS 'The language this name is in.';

--
-- Table 'location_summary' generated from model 'LocationSummary'
--
CREATE TABLE IF NOT EXISTS location_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE location_summary IS 'Original model name - LocationSummary.';
COMMENT ON COLUMN location_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN location_summary.url IS 'The URL of the referenced resource.';

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
COMMENT ON COLUMN machine_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN machine_detail.item IS 'The TM or HM item that corresponds to this machine.';
COMMENT ON COLUMN machine_detail.version_group IS 'The version group that this machine applies to.';
COMMENT ON COLUMN machine_detail."move" IS 'The move that is taught by this machine.';

--
-- Table 'machine_summary' generated from model 'MachineSummary'
--
CREATE TABLE IF NOT EXISTS machine_summary (
    url TEXT NOT NULL
);
COMMENT ON TABLE machine_summary IS 'Original model name - MachineSummary.';
COMMENT ON COLUMN machine_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'move_battle_style_detail' generated from model 'MoveBattleStyleDetail'
--
CREATE TABLE IF NOT EXISTS move_battle_style_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE move_battle_style_detail IS 'Original model name - MoveBattleStyleDetail.';
COMMENT ON COLUMN move_battle_style_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN move_battle_style_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN move_battle_style_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'move_battle_style_name' generated from model 'MoveBattleStyleName'
--
CREATE TABLE IF NOT EXISTS move_battle_style_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_battle_style_name IS 'Original model name - MoveBattleStyleName.';
COMMENT ON COLUMN move_battle_style_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN move_battle_style_name."language" IS 'The language this name is in.';

--
-- Table 'move_battle_style_summary' generated from model 'MoveBattleStyleSummary'
--
CREATE TABLE IF NOT EXISTS move_battle_style_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_battle_style_summary IS 'Original model name - MoveBattleStyleSummary.';
COMMENT ON COLUMN move_battle_style_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN move_battle_style_summary.url IS 'The URL of the referenced resource.';

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
COMMENT ON COLUMN move_change.accuracy IS 'The percent value of how likely this move is to be successful.';
COMMENT ON COLUMN move_change."power" IS 'The base power before the listed version group, or null if power did not change.';
COMMENT ON COLUMN move_change.pp IS 'Power points. The number of times this move can be used.';
COMMENT ON COLUMN move_change.effect_chance IS 'The percent value of how likely it is this moves effect will take effect.';
COMMENT ON COLUMN move_change.effect_entries IS 'The effect of this move listed in different languages.';
COMMENT ON COLUMN move_change."type" IS 'The elemental type of this move.';
COMMENT ON COLUMN move_change.version_group IS 'The version group in which these move stat values were in effect.';

--
-- Table 'move_combo_usage' generated from model 'MoveComboUsage'
--
CREATE TABLE IF NOT EXISTS move_combo_usage (
    use_before JSON NOT NULL,
    use_after JSON NOT NULL
);
COMMENT ON TABLE move_combo_usage IS 'Original model name - MoveComboUsage.';
COMMENT ON COLUMN move_combo_usage.use_before IS 'A list of moves to use before this move.';
COMMENT ON COLUMN move_combo_usage.use_after IS 'A list of moves to use after this move.';

--
-- Table 'move_combos' generated from model 'MoveCombos'
--
CREATE TABLE IF NOT EXISTS move_combos (
    normal TEXT NOT NULL,
    super TEXT NOT NULL
);
COMMENT ON TABLE move_combos IS 'Original model name - MoveCombos.';
COMMENT ON COLUMN move_combos.normal IS 'A detail of moves this move can be used before or after, granting additional appeal points in contests.';
COMMENT ON COLUMN move_combos.super IS 'A detail of moves this move can be used before or after, granting additional appeal points in super contests.';

--
-- Table 'move_damage_class_description' generated from model 'MoveDamageClassDescription'
--
CREATE TABLE IF NOT EXISTS move_damage_class_description (
    description VARCHAR(2000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_damage_class_description IS 'Original model name - MoveDamageClassDescription.';
COMMENT ON COLUMN move_damage_class_description.description IS 'The localized description for an API resource in a specific language.';
COMMENT ON COLUMN move_damage_class_description."language" IS 'The language this name is in.';

--
-- Table 'move_damage_class_detail' generated from model 'MoveDamageClassDetail'
--
CREATE TABLE IF NOT EXISTS move_damage_class_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    descriptions JSON NOT NULL,
    moves JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE move_damage_class_detail IS 'Original model name - MoveDamageClassDetail.';
COMMENT ON COLUMN move_damage_class_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN move_damage_class_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN move_damage_class_detail.descriptions IS 'The description of this resource listed in different languages.';
COMMENT ON COLUMN move_damage_class_detail.moves IS 'A list of moves that fall into this damage class.';
COMMENT ON COLUMN move_damage_class_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'move_damage_class_name' generated from model 'MoveDamageClassName'
--
CREATE TABLE IF NOT EXISTS move_damage_class_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_damage_class_name IS 'Original model name - MoveDamageClassName.';
COMMENT ON COLUMN move_damage_class_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN move_damage_class_name."language" IS 'The language this name is in.';

--
-- Table 'move_damage_class_summary' generated from model 'MoveDamageClassSummary'
--
CREATE TABLE IF NOT EXISTS move_damage_class_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_damage_class_summary IS 'Original model name - MoveDamageClassSummary.';
COMMENT ON COLUMN move_damage_class_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN move_damage_class_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'move_detail' generated from model 'MoveDetail'
--
CREATE TABLE IF NOT EXISTS move_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
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
COMMENT ON COLUMN move_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN move_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN move_detail.accuracy IS 'The percent value of how likely this move is to be successful.';
COMMENT ON COLUMN move_detail.effect_chance IS 'The percent value of how likely it is this moves effect will happen.';
COMMENT ON COLUMN move_detail.pp IS 'Power points. The number of times this move can be used.';
COMMENT ON COLUMN move_detail.priority IS 'A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.';
COMMENT ON COLUMN move_detail."power" IS 'The base power of this move, or null if it has no fixed base power.';
COMMENT ON COLUMN move_detail.contest_combos IS 'A detail of normal and super contest combos that require this move.';
COMMENT ON COLUMN move_detail.contest_type IS 'The type of appeal this move gives a Pokémon when used in a contest.';
COMMENT ON COLUMN move_detail.contest_effect IS 'The effect the move has when used in a contest.';
COMMENT ON COLUMN move_detail.damage_class IS 'The type of damage the move inflicts on the target, e.g. physical.';
COMMENT ON COLUMN move_detail.effect_entries IS 'The effect of this move listed in different languages.';
COMMENT ON COLUMN move_detail.effect_changes IS 'The list of previous effects this move has had across version groups of the games.';
COMMENT ON COLUMN move_detail.generation IS 'The generation in which this move was introduced.';
COMMENT ON COLUMN move_detail.meta IS 'Metadata about this move';
COMMENT ON COLUMN move_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN move_detail.past_values IS 'A list of move resource value changes across version groups of the game.';
COMMENT ON COLUMN move_detail.stat_changes IS 'A list of stats this moves effects and how much it effects them.';
COMMENT ON COLUMN move_detail.super_contest_effect IS 'The effect the move has when used in a super contest.';
COMMENT ON COLUMN move_detail."target" IS 'The type of target that will receive the effects of the attack.';
COMMENT ON COLUMN move_detail."type" IS 'The elemental type of this move.';
COMMENT ON COLUMN move_detail.machines IS 'A list of the machines that teach this move.';
COMMENT ON COLUMN move_detail.flavor_text_entries IS 'The flavor text of this move listed in different languages.';
COMMENT ON COLUMN move_detail.learned_by_pokemon IS 'List of Pokemon that can learn the move';

--
-- Table 'move_effect_change' generated from model 'MoveEffectChange'
--
CREATE TABLE IF NOT EXISTS move_effect_change (
    version_group TEXT NOT NULL,
    effect_entries JSON NOT NULL
);
COMMENT ON TABLE move_effect_change IS 'Original model name - MoveEffectChange.';
COMMENT ON COLUMN move_effect_change.version_group IS 'The version group in which the previous effect of this ability originated.';
COMMENT ON COLUMN move_effect_change.effect_entries IS 'The previous effect of this ability listed in different languages.';

--
-- Table 'move_effect_change_effect_text' generated from model 'MoveEffectChangeEffectText'
--
CREATE TABLE IF NOT EXISTS move_effect_change_effect_text (
    effect VARCHAR(6000) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_effect_change_effect_text IS 'Original model name - MoveEffectChangeEffectText.';
COMMENT ON COLUMN move_effect_change_effect_text.effect IS 'The localized effect text for an API resource in a specific language.';
COMMENT ON COLUMN move_effect_change_effect_text."language" IS 'The language this effect is in.';

--
-- Table 'move_effect_effect_text' generated from model 'MoveEffectEffectText'
--
CREATE TABLE IF NOT EXISTS move_effect_effect_text (
    effect VARCHAR(6000) NOT NULL,
    short_effect VARCHAR(300) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_effect_effect_text IS 'Original model name - MoveEffectEffectText.';
COMMENT ON COLUMN move_effect_effect_text.effect IS 'The localized effect text for an API resource in a specific language.';
COMMENT ON COLUMN move_effect_effect_text.short_effect IS 'The localized effect text in brief.';
COMMENT ON COLUMN move_effect_effect_text."language" IS 'The language this effect is in.';

--
-- Table 'move_flavor_text' generated from model 'MoveFlavorText'
--
CREATE TABLE IF NOT EXISTS move_flavor_text (
    flavor_text TEXT NOT NULL,
    "language" TEXT NOT NULL,
    version_group TEXT NOT NULL
);
COMMENT ON TABLE move_flavor_text IS 'Original model name - MoveFlavorText.';
COMMENT ON COLUMN move_flavor_text.flavor_text IS 'The localized flavor text for an api resource in a specific language.';
COMMENT ON COLUMN move_flavor_text."language" IS 'The language this name is in.';
COMMENT ON COLUMN move_flavor_text.version_group IS 'The version group that uses this flavor text.';

--
-- Table 'move_learn_method_description' generated from model 'MoveLearnMethodDescription'
--
CREATE TABLE IF NOT EXISTS move_learn_method_description (
    description VARCHAR(2000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_learn_method_description IS 'Original model name - MoveLearnMethodDescription.';
COMMENT ON COLUMN move_learn_method_description.description IS 'The localized description for an API resource in a specific language.';
COMMENT ON COLUMN move_learn_method_description."language" IS 'The language this name is in.';

--
-- Table 'move_learn_method_detail' generated from model 'MoveLearnMethodDetail'
--
CREATE TABLE IF NOT EXISTS move_learn_method_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    "names" JSON NOT NULL,
    descriptions JSON NOT NULL,
    version_groups JSON NOT NULL
);
COMMENT ON TABLE move_learn_method_detail IS 'Original model name - MoveLearnMethodDetail.';
COMMENT ON COLUMN move_learn_method_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN move_learn_method_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN move_learn_method_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN move_learn_method_detail.descriptions IS 'The description of this resource listed in different languages.';
COMMENT ON COLUMN move_learn_method_detail.version_groups IS 'A list of version groups where moves can be learned through this method.';

--
-- Table 'move_learn_method_name' generated from model 'MoveLearnMethodName'
--
CREATE TABLE IF NOT EXISTS move_learn_method_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_learn_method_name IS 'Original model name - MoveLearnMethodName.';
COMMENT ON COLUMN move_learn_method_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN move_learn_method_name."language" IS 'The language this name is in.';

--
-- Table 'move_learn_method_summary' generated from model 'MoveLearnMethodSummary'
--
CREATE TABLE IF NOT EXISTS move_learn_method_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_learn_method_summary IS 'Original model name - MoveLearnMethodSummary.';
COMMENT ON COLUMN move_learn_method_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN move_learn_method_summary.url IS 'The URL of the referenced resource.';

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
COMMENT ON COLUMN move_meta.ailment IS 'The status ailment this move inflicts on its target.';
COMMENT ON COLUMN move_meta.category IS 'The category of move this move falls under, e.g. damage or ailment.';
COMMENT ON COLUMN move_meta.min_hits IS 'The minimum number of times this move hits. Null if it always only hits once.';
COMMENT ON COLUMN move_meta.max_hits IS 'The maximum number of times this move hits. Null if it always only hits once.';
COMMENT ON COLUMN move_meta.min_turns IS 'The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.';
COMMENT ON COLUMN move_meta.max_turns IS 'The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.';
COMMENT ON COLUMN move_meta.drain IS 'HP drain (if positive) or Recoil damage (if negative), in percent of damage done.';
COMMENT ON COLUMN move_meta.healing IS 'The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP.';
COMMENT ON COLUMN move_meta.crit_rate IS 'Critical hit rate bonus.';
COMMENT ON COLUMN move_meta.ailment_chance IS 'The likelihood this attack will cause an ailment.';
COMMENT ON COLUMN move_meta.flinch_chance IS 'The likelihood this attack will cause the target Pokémon to flinch.';
COMMENT ON COLUMN move_meta.stat_chance IS 'The likelihood this attack will cause a stat change in the target Pokémon.';

--
-- Table 'move_meta_ailment_detail' generated from model 'MoveMetaAilmentDetail'
--
CREATE TABLE IF NOT EXISTS move_meta_ailment_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    moves JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE move_meta_ailment_detail IS 'Original model name - MoveMetaAilmentDetail.';
COMMENT ON COLUMN move_meta_ailment_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN move_meta_ailment_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN move_meta_ailment_detail.moves IS 'A list of moves that cause this ailment.';
COMMENT ON COLUMN move_meta_ailment_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'move_meta_ailment_name' generated from model 'MoveMetaAilmentName'
--
CREATE TABLE IF NOT EXISTS move_meta_ailment_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_meta_ailment_name IS 'Original model name - MoveMetaAilmentName.';
COMMENT ON COLUMN move_meta_ailment_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN move_meta_ailment_name."language" IS 'The language this name is in.';

--
-- Table 'move_meta_ailment_summary' generated from model 'MoveMetaAilmentSummary'
--
CREATE TABLE IF NOT EXISTS move_meta_ailment_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_meta_ailment_summary IS 'Original model name - MoveMetaAilmentSummary.';
COMMENT ON COLUMN move_meta_ailment_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN move_meta_ailment_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'move_meta_category_description' generated from model 'MoveMetaCategoryDescription'
--
CREATE TABLE IF NOT EXISTS move_meta_category_description (
    description VARCHAR(2000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_meta_category_description IS 'Original model name - MoveMetaCategoryDescription.';
COMMENT ON COLUMN move_meta_category_description.description IS 'The localized description for an API resource in a specific language.';
COMMENT ON COLUMN move_meta_category_description."language" IS 'The language this name is in.';

--
-- Table 'move_meta_category_detail' generated from model 'MoveMetaCategoryDetail'
--
CREATE TABLE IF NOT EXISTS move_meta_category_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    descriptions JSON NOT NULL,
    moves JSON NOT NULL
);
COMMENT ON TABLE move_meta_category_detail IS 'Original model name - MoveMetaCategoryDetail.';
COMMENT ON COLUMN move_meta_category_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN move_meta_category_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN move_meta_category_detail.descriptions IS 'The description of this resource listed in different languages.';
COMMENT ON COLUMN move_meta_category_detail.moves IS 'A list of moves that fall into this category.';

--
-- Table 'move_meta_category_summary' generated from model 'MoveMetaCategorySummary'
--
CREATE TABLE IF NOT EXISTS move_meta_category_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_meta_category_summary IS 'Original model name - MoveMetaCategorySummary.';
COMMENT ON COLUMN move_meta_category_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN move_meta_category_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'move_meta_stat_change' generated from model 'MoveMetaStatChange'
--
CREATE TABLE IF NOT EXISTS move_meta_stat_change (
    change INTEGER NOT NULL,
    stat TEXT NOT NULL
);
COMMENT ON TABLE move_meta_stat_change IS 'Original model name - MoveMetaStatChange.';
COMMENT ON COLUMN move_meta_stat_change.change IS 'The amount of change.';
COMMENT ON COLUMN move_meta_stat_change.stat IS 'The stat being affected.';

--
-- Table 'move_name' generated from model 'MoveName'
--
CREATE TABLE IF NOT EXISTS move_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_name IS 'Original model name - MoveName.';
COMMENT ON COLUMN move_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN move_name."language" IS 'The language this name is in.';

--
-- Table 'move_stat_change' generated from model 'MoveStatChange'
--
CREATE TABLE IF NOT EXISTS move_stat_change (
    change INTEGER NOT NULL,
    "move" TEXT NOT NULL
);
COMMENT ON TABLE move_stat_change IS 'Original model name - MoveStatChange.';
COMMENT ON COLUMN move_stat_change.change IS 'The maximum amount of change to the referenced stat.';
COMMENT ON COLUMN move_stat_change."move" IS 'The move causing the change.';

--
-- Table 'move_summary' generated from model 'MoveSummary'
--
CREATE TABLE IF NOT EXISTS move_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_summary IS 'Original model name - MoveSummary.';
COMMENT ON COLUMN move_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN move_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'move_target_description' generated from model 'MoveTargetDescription'
--
CREATE TABLE IF NOT EXISTS move_target_description (
    description VARCHAR(2000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_target_description IS 'Original model name - MoveTargetDescription.';
COMMENT ON COLUMN move_target_description.description IS 'The localized description for an API resource in a specific language.';
COMMENT ON COLUMN move_target_description."language" IS 'The language this name is in.';

--
-- Table 'move_target_detail' generated from model 'MoveTargetDetail'
--
CREATE TABLE IF NOT EXISTS move_target_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    descriptions JSON NOT NULL,
    moves JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE move_target_detail IS 'Original model name - MoveTargetDetail.';
COMMENT ON COLUMN move_target_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN move_target_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN move_target_detail.descriptions IS 'The description of this resource listed in different languages.';
COMMENT ON COLUMN move_target_detail.moves IS 'A list of moves that that are directed at this target.';
COMMENT ON COLUMN move_target_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'move_target_name' generated from model 'MoveTargetName'
--
CREATE TABLE IF NOT EXISTS move_target_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE move_target_name IS 'Original model name - MoveTargetName.';
COMMENT ON COLUMN move_target_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN move_target_name."language" IS 'The language this name is in.';

--
-- Table 'move_target_summary' generated from model 'MoveTargetSummary'
--
CREATE TABLE IF NOT EXISTS move_target_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE move_target_summary IS 'Original model name - MoveTargetSummary.';
COMMENT ON COLUMN move_target_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN move_target_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'nature_battle_style_preference' generated from model 'NatureBattleStylePreference'
--
CREATE TABLE IF NOT EXISTS nature_battle_style_preference (
    low_hp_preference INTEGER NOT NULL,
    high_hp_preference INTEGER NOT NULL,
    move_battle_style TEXT NOT NULL
);
COMMENT ON TABLE nature_battle_style_preference IS 'Original model name - NatureBattleStylePreference.';
COMMENT ON COLUMN nature_battle_style_preference.low_hp_preference IS 'Chance of using the move, in percent, if HP is under one half.';
COMMENT ON COLUMN nature_battle_style_preference.high_hp_preference IS 'Chance of using the move, in percent, if HP is over one half.';
COMMENT ON COLUMN nature_battle_style_preference.move_battle_style IS 'The move battle style.';

--
-- Table 'nature_detail' generated from model 'NatureDetail'
--
CREATE TABLE IF NOT EXISTS nature_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    decreased_stat TEXT NOT NULL,
    increased_stat TEXT NOT NULL,
    likes_flavor TEXT NOT NULL,
    hates_flavor TEXT NOT NULL,
    pokeathlon_stat_changes JSON NOT NULL,
    move_battle_style_preferences JSON NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE nature_detail IS 'Original model name - NatureDetail.';
COMMENT ON COLUMN nature_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN nature_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN nature_detail.decreased_stat IS 'The stat decreased by 10% in Pokémon with this nature.';
COMMENT ON COLUMN nature_detail.increased_stat IS 'The stat increased by 10% in Pokémon with this nature.';
COMMENT ON COLUMN nature_detail.likes_flavor IS 'The flavor liked by Pokémon with this nature.';
COMMENT ON COLUMN nature_detail.hates_flavor IS 'The flavor hated by Pokémon with this nature.';
COMMENT ON COLUMN nature_detail.pokeathlon_stat_changes IS 'A list of Pokéathlon stats this nature effects and how much it effects them.';
COMMENT ON COLUMN nature_detail.move_battle_style_preferences IS 'A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.';
COMMENT ON COLUMN nature_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'nature_name' generated from model 'NatureName'
--
CREATE TABLE IF NOT EXISTS nature_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE nature_name IS 'Original model name - NatureName.';
COMMENT ON COLUMN nature_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN nature_name."language" IS 'The language this name is in.';

--
-- Table 'nature_pokeathlon_stat' generated from model 'NaturePokeathlonStat'
--
CREATE TABLE IF NOT EXISTS nature_pokeathlon_stat (
    max_change INTEGER NOT NULL,
    pokeathlon_stat TEXT NOT NULL
);
COMMENT ON TABLE nature_pokeathlon_stat IS 'Original model name - NaturePokeathlonStat.';
COMMENT ON COLUMN nature_pokeathlon_stat.max_change IS 'The amount of change.';
COMMENT ON COLUMN nature_pokeathlon_stat.pokeathlon_stat IS 'The stat being affected.';

--
-- Table 'nature_summary' generated from model 'NatureSummary'
--
CREATE TABLE IF NOT EXISTS nature_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE nature_summary IS 'Original model name - NatureSummary.';
COMMENT ON COLUMN nature_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN nature_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'paginated_ability_summary_list' generated from model 'PaginatedAbilitySummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_ability_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_ability_summary_list IS 'Original model name - PaginatedAbilitySummaryList.';
COMMENT ON COLUMN paginated_ability_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_ability_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_ability_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_ability_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_berry_firmness_summary_list' generated from model 'PaginatedBerryFirmnessSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_berry_firmness_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_berry_firmness_summary_list IS 'Original model name - PaginatedBerryFirmnessSummaryList.';
COMMENT ON COLUMN paginated_berry_firmness_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_berry_firmness_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_berry_firmness_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_berry_firmness_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_berry_flavor_summary_list' generated from model 'PaginatedBerryFlavorSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_berry_flavor_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_berry_flavor_summary_list IS 'Original model name - PaginatedBerryFlavorSummaryList.';
COMMENT ON COLUMN paginated_berry_flavor_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_berry_flavor_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_berry_flavor_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_berry_flavor_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_berry_summary_list' generated from model 'PaginatedBerrySummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_berry_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_berry_summary_list IS 'Original model name - PaginatedBerrySummaryList.';
COMMENT ON COLUMN paginated_berry_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_berry_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_berry_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_berry_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_characteristic_summary_list' generated from model 'PaginatedCharacteristicSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_characteristic_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_characteristic_summary_list IS 'Original model name - PaginatedCharacteristicSummaryList.';
COMMENT ON COLUMN paginated_characteristic_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_characteristic_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_characteristic_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_characteristic_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_contest_effect_summary_list' generated from model 'PaginatedContestEffectSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_contest_effect_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_contest_effect_summary_list IS 'Original model name - PaginatedContestEffectSummaryList.';
COMMENT ON COLUMN paginated_contest_effect_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_contest_effect_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_contest_effect_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_contest_effect_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_contest_type_summary_list' generated from model 'PaginatedContestTypeSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_contest_type_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_contest_type_summary_list IS 'Original model name - PaginatedContestTypeSummaryList.';
COMMENT ON COLUMN paginated_contest_type_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_contest_type_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_contest_type_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_contest_type_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_currency_summary_list' generated from model 'PaginatedCurrencySummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_currency_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_currency_summary_list IS 'Original model name - PaginatedCurrencySummaryList.';
COMMENT ON COLUMN paginated_currency_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_currency_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_currency_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_currency_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_egg_group_summary_list' generated from model 'PaginatedEggGroupSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_egg_group_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_egg_group_summary_list IS 'Original model name - PaginatedEggGroupSummaryList.';
COMMENT ON COLUMN paginated_egg_group_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_egg_group_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_egg_group_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_egg_group_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_encounter_condition_summary_list' generated from model 'PaginatedEncounterConditionSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_encounter_condition_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_encounter_condition_summary_list IS 'Original model name - PaginatedEncounterConditionSummaryList.';
COMMENT ON COLUMN paginated_encounter_condition_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_encounter_condition_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_encounter_condition_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_encounter_condition_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_encounter_condition_value_summary_list' generated from model 'PaginatedEncounterConditionValueSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_encounter_condition_value_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_encounter_condition_value_summary_list IS 'Original model name - PaginatedEncounterConditionValueSummaryList.';
COMMENT ON COLUMN paginated_encounter_condition_value_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_encounter_condition_value_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_encounter_condition_value_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_encounter_condition_value_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_encounter_method_summary_list' generated from model 'PaginatedEncounterMethodSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_encounter_method_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_encounter_method_summary_list IS 'Original model name - PaginatedEncounterMethodSummaryList.';
COMMENT ON COLUMN paginated_encounter_method_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_encounter_method_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_encounter_method_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_encounter_method_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_evolution_chain_summary_list' generated from model 'PaginatedEvolutionChainSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_evolution_chain_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_evolution_chain_summary_list IS 'Original model name - PaginatedEvolutionChainSummaryList.';
COMMENT ON COLUMN paginated_evolution_chain_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_evolution_chain_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_evolution_chain_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_evolution_chain_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_evolution_trigger_summary_list' generated from model 'PaginatedEvolutionTriggerSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_evolution_trigger_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_evolution_trigger_summary_list IS 'Original model name - PaginatedEvolutionTriggerSummaryList.';
COMMENT ON COLUMN paginated_evolution_trigger_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_evolution_trigger_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_evolution_trigger_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_evolution_trigger_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_evolution_variable_summary_list' generated from model 'PaginatedEvolutionVariableSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_evolution_variable_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_evolution_variable_summary_list IS 'Original model name - PaginatedEvolutionVariableSummaryList.';
COMMENT ON COLUMN paginated_evolution_variable_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_evolution_variable_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_evolution_variable_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_evolution_variable_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_gender_summary_list' generated from model 'PaginatedGenderSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_gender_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_gender_summary_list IS 'Original model name - PaginatedGenderSummaryList.';
COMMENT ON COLUMN paginated_gender_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_gender_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_gender_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_gender_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_generation_summary_list' generated from model 'PaginatedGenerationSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_generation_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_generation_summary_list IS 'Original model name - PaginatedGenerationSummaryList.';
COMMENT ON COLUMN paginated_generation_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_generation_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_generation_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_generation_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_growth_rate_summary_list' generated from model 'PaginatedGrowthRateSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_growth_rate_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_growth_rate_summary_list IS 'Original model name - PaginatedGrowthRateSummaryList.';
COMMENT ON COLUMN paginated_growth_rate_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_growth_rate_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_growth_rate_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_growth_rate_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_item_attribute_summary_list' generated from model 'PaginatedItemAttributeSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_item_attribute_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_item_attribute_summary_list IS 'Original model name - PaginatedItemAttributeSummaryList.';
COMMENT ON COLUMN paginated_item_attribute_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_item_attribute_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_item_attribute_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_item_attribute_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_item_category_summary_list' generated from model 'PaginatedItemCategorySummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_item_category_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_item_category_summary_list IS 'Original model name - PaginatedItemCategorySummaryList.';
COMMENT ON COLUMN paginated_item_category_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_item_category_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_item_category_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_item_category_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_item_fling_effect_summary_list' generated from model 'PaginatedItemFlingEffectSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_item_fling_effect_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_item_fling_effect_summary_list IS 'Original model name - PaginatedItemFlingEffectSummaryList.';
COMMENT ON COLUMN paginated_item_fling_effect_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_item_fling_effect_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_item_fling_effect_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_item_fling_effect_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_item_pocket_summary_list' generated from model 'PaginatedItemPocketSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_item_pocket_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_item_pocket_summary_list IS 'Original model name - PaginatedItemPocketSummaryList.';
COMMENT ON COLUMN paginated_item_pocket_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_item_pocket_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_item_pocket_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_item_pocket_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_item_summary_list' generated from model 'PaginatedItemSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_item_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_item_summary_list IS 'Original model name - PaginatedItemSummaryList.';
COMMENT ON COLUMN paginated_item_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_item_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_item_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_item_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_language_summary_list' generated from model 'PaginatedLanguageSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_language_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_language_summary_list IS 'Original model name - PaginatedLanguageSummaryList.';
COMMENT ON COLUMN paginated_language_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_language_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_language_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_language_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_location_area_summary_list' generated from model 'PaginatedLocationAreaSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_location_area_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_location_area_summary_list IS 'Original model name - PaginatedLocationAreaSummaryList.';
COMMENT ON COLUMN paginated_location_area_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_location_area_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_location_area_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_location_area_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_location_summary_list' generated from model 'PaginatedLocationSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_location_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_location_summary_list IS 'Original model name - PaginatedLocationSummaryList.';
COMMENT ON COLUMN paginated_location_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_location_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_location_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_location_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_machine_summary_list' generated from model 'PaginatedMachineSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_machine_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_machine_summary_list IS 'Original model name - PaginatedMachineSummaryList.';
COMMENT ON COLUMN paginated_machine_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_machine_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_machine_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_machine_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_move_battle_style_summary_list' generated from model 'PaginatedMoveBattleStyleSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_battle_style_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_move_battle_style_summary_list IS 'Original model name - PaginatedMoveBattleStyleSummaryList.';
COMMENT ON COLUMN paginated_move_battle_style_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_move_battle_style_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_move_battle_style_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_move_battle_style_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_move_damage_class_summary_list' generated from model 'PaginatedMoveDamageClassSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_damage_class_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_move_damage_class_summary_list IS 'Original model name - PaginatedMoveDamageClassSummaryList.';
COMMENT ON COLUMN paginated_move_damage_class_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_move_damage_class_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_move_damage_class_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_move_damage_class_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_move_learn_method_summary_list' generated from model 'PaginatedMoveLearnMethodSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_learn_method_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_move_learn_method_summary_list IS 'Original model name - PaginatedMoveLearnMethodSummaryList.';
COMMENT ON COLUMN paginated_move_learn_method_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_move_learn_method_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_move_learn_method_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_move_learn_method_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_move_meta_ailment_summary_list' generated from model 'PaginatedMoveMetaAilmentSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_meta_ailment_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_move_meta_ailment_summary_list IS 'Original model name - PaginatedMoveMetaAilmentSummaryList.';
COMMENT ON COLUMN paginated_move_meta_ailment_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_move_meta_ailment_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_move_meta_ailment_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_move_meta_ailment_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_move_meta_category_summary_list' generated from model 'PaginatedMoveMetaCategorySummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_meta_category_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_move_meta_category_summary_list IS 'Original model name - PaginatedMoveMetaCategorySummaryList.';
COMMENT ON COLUMN paginated_move_meta_category_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_move_meta_category_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_move_meta_category_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_move_meta_category_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_move_summary_list' generated from model 'PaginatedMoveSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_move_summary_list IS 'Original model name - PaginatedMoveSummaryList.';
COMMENT ON COLUMN paginated_move_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_move_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_move_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_move_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_move_target_summary_list' generated from model 'PaginatedMoveTargetSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_move_target_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_move_target_summary_list IS 'Original model name - PaginatedMoveTargetSummaryList.';
COMMENT ON COLUMN paginated_move_target_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_move_target_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_move_target_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_move_target_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_nature_summary_list' generated from model 'PaginatedNatureSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_nature_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_nature_summary_list IS 'Original model name - PaginatedNatureSummaryList.';
COMMENT ON COLUMN paginated_nature_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_nature_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_nature_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_nature_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_pal_park_area_summary_list' generated from model 'PaginatedPalParkAreaSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pal_park_area_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_pal_park_area_summary_list IS 'Original model name - PaginatedPalParkAreaSummaryList.';
COMMENT ON COLUMN paginated_pal_park_area_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_pal_park_area_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_pal_park_area_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_pal_park_area_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_pokeathlon_stat_summary_list' generated from model 'PaginatedPokeathlonStatSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokeathlon_stat_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_pokeathlon_stat_summary_list IS 'Original model name - PaginatedPokeathlonStatSummaryList.';
COMMENT ON COLUMN paginated_pokeathlon_stat_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_pokeathlon_stat_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_pokeathlon_stat_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_pokeathlon_stat_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_pokedex_summary_list' generated from model 'PaginatedPokedexSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokedex_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_pokedex_summary_list IS 'Original model name - PaginatedPokedexSummaryList.';
COMMENT ON COLUMN paginated_pokedex_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_pokedex_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_pokedex_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_pokedex_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_pokemon_color_summary_list' generated from model 'PaginatedPokemonColorSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokemon_color_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_pokemon_color_summary_list IS 'Original model name - PaginatedPokemonColorSummaryList.';
COMMENT ON COLUMN paginated_pokemon_color_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_pokemon_color_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_pokemon_color_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_pokemon_color_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_pokemon_form_summary_list' generated from model 'PaginatedPokemonFormSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokemon_form_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_pokemon_form_summary_list IS 'Original model name - PaginatedPokemonFormSummaryList.';
COMMENT ON COLUMN paginated_pokemon_form_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_pokemon_form_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_pokemon_form_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_pokemon_form_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_pokemon_habitat_summary_list' generated from model 'PaginatedPokemonHabitatSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokemon_habitat_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_pokemon_habitat_summary_list IS 'Original model name - PaginatedPokemonHabitatSummaryList.';
COMMENT ON COLUMN paginated_pokemon_habitat_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_pokemon_habitat_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_pokemon_habitat_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_pokemon_habitat_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_pokemon_shape_summary_list' generated from model 'PaginatedPokemonShapeSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokemon_shape_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_pokemon_shape_summary_list IS 'Original model name - PaginatedPokemonShapeSummaryList.';
COMMENT ON COLUMN paginated_pokemon_shape_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_pokemon_shape_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_pokemon_shape_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_pokemon_shape_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_pokemon_species_summary_list' generated from model 'PaginatedPokemonSpeciesSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokemon_species_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_pokemon_species_summary_list IS 'Original model name - PaginatedPokemonSpeciesSummaryList.';
COMMENT ON COLUMN paginated_pokemon_species_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_pokemon_species_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_pokemon_species_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_pokemon_species_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_pokemon_summary_list' generated from model 'PaginatedPokemonSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_pokemon_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_pokemon_summary_list IS 'Original model name - PaginatedPokemonSummaryList.';
COMMENT ON COLUMN paginated_pokemon_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_pokemon_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_pokemon_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_pokemon_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_region_summary_list' generated from model 'PaginatedRegionSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_region_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_region_summary_list IS 'Original model name - PaginatedRegionSummaryList.';
COMMENT ON COLUMN paginated_region_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_region_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_region_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_region_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_stat_summary_list' generated from model 'PaginatedStatSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_stat_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_stat_summary_list IS 'Original model name - PaginatedStatSummaryList.';
COMMENT ON COLUMN paginated_stat_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_stat_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_stat_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_stat_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_super_contest_effect_summary_list' generated from model 'PaginatedSuperContestEffectSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_super_contest_effect_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_super_contest_effect_summary_list IS 'Original model name - PaginatedSuperContestEffectSummaryList.';
COMMENT ON COLUMN paginated_super_contest_effect_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_super_contest_effect_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_super_contest_effect_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_super_contest_effect_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_type_summary_list' generated from model 'PaginatedTypeSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_type_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_type_summary_list IS 'Original model name - PaginatedTypeSummaryList.';
COMMENT ON COLUMN paginated_type_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_type_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_type_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_type_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_version_group_summary_list' generated from model 'PaginatedVersionGroupSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_version_group_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_version_group_summary_list IS 'Original model name - PaginatedVersionGroupSummaryList.';
COMMENT ON COLUMN paginated_version_group_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_version_group_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_version_group_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_version_group_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'paginated_version_summary_list' generated from model 'PaginatedVersionSummaryList'
--
CREATE TABLE IF NOT EXISTS paginated_version_summary_list (
    "count" INTEGER NOT NULL,
    "next" TEXT DEFAULT NULL,
    previous TEXT DEFAULT NULL,
    results JSON NOT NULL
);
COMMENT ON TABLE paginated_version_summary_list IS 'Original model name - PaginatedVersionSummaryList.';
COMMENT ON COLUMN paginated_version_summary_list."count" IS 'The total number of resources available from this API.';
COMMENT ON COLUMN paginated_version_summary_list."next" IS 'The URL for the next page in the list, or null if there is no next page.';
COMMENT ON COLUMN paginated_version_summary_list.previous IS 'The URL for the previous page in the list, or null if there is no previous page.';
COMMENT ON COLUMN paginated_version_summary_list.results IS 'A list of API resources on this page.';

--
-- Table 'pal_park_area_detail' generated from model 'PalParkAreaDetail'
--
CREATE TABLE IF NOT EXISTS pal_park_area_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    "names" JSON NOT NULL,
    pokemon_encounters JSON NOT NULL
);
COMMENT ON TABLE pal_park_area_detail IS 'Original model name - PalParkAreaDetail.';
COMMENT ON COLUMN pal_park_area_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN pal_park_area_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN pal_park_area_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN pal_park_area_detail.pokemon_encounters IS 'A list of Pokémon encountered in thi pal park area along with details.';

--
-- Table 'pal_park_area_name' generated from model 'PalParkAreaName'
--
CREATE TABLE IF NOT EXISTS pal_park_area_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pal_park_area_name IS 'Original model name - PalParkAreaName.';
COMMENT ON COLUMN pal_park_area_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN pal_park_area_name."language" IS 'The language this name is in.';

--
-- Table 'pal_park_area_summary' generated from model 'PalParkAreaSummary'
--
CREATE TABLE IF NOT EXISTS pal_park_area_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pal_park_area_summary IS 'Original model name - PalParkAreaSummary.';
COMMENT ON COLUMN pal_park_area_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN pal_park_area_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'pal_park_encounter' generated from model 'PalParkEncounter'
--
CREATE TABLE IF NOT EXISTS pal_park_encounter (
    base_score INTEGER DEFAULT NULL,
    rate INTEGER NOT NULL,
    pokemon_species TEXT NOT NULL
);
COMMENT ON TABLE pal_park_encounter IS 'Original model name - PalParkEncounter.';
COMMENT ON COLUMN pal_park_encounter.base_score IS 'The base score given to the player when this Pokémon is caught during a pal park run.';
COMMENT ON COLUMN pal_park_encounter.rate IS 'The base rate for encountering this Pokémon in this pal park area.';
COMMENT ON COLUMN pal_park_encounter.pokemon_species IS 'The Pokémon species being encountered.';

--
-- Table 'pokeapi_meta_response' generated from model 'PokeapiMetaResponse'
--
CREATE TABLE IF NOT EXISTS pokeapi_meta_response (
    deploy_date TEXT NOT NULL,
    hash TEXT NOT NULL,
    tag TEXT NOT NULL
);
COMMENT ON TABLE pokeapi_meta_response IS 'Original model name - PokeapiMetaResponse.';
COMMENT ON COLUMN pokeapi_meta_response.deploy_date IS 'The deployment time as a Unix timestamp string.';
COMMENT ON COLUMN pokeapi_meta_response.hash IS 'The source commit hash used for this deployment.';
COMMENT ON COLUMN pokeapi_meta_response.tag IS 'The deployment tag, or null if the deployment has no tag.';

--
-- Table 'pokeathlon_stat_affecting_nature' generated from model 'PokeathlonStatAffectingNature'
--
CREATE TABLE IF NOT EXISTS pokeathlon_stat_affecting_nature (
    max_change INTEGER NOT NULL,
    nature TEXT NOT NULL
);
COMMENT ON TABLE pokeathlon_stat_affecting_nature IS 'Original model name - PokeathlonStatAffectingNature.';
COMMENT ON COLUMN pokeathlon_stat_affecting_nature.max_change IS 'The maximum amount of change to the referenced Pokéathlon stat.';
COMMENT ON COLUMN pokeathlon_stat_affecting_nature.nature IS 'The nature causing the change.';

--
-- Table 'pokeathlon_stat_affecting_natures' generated from model 'PokeathlonStatAffectingNatures'
--
CREATE TABLE IF NOT EXISTS pokeathlon_stat_affecting_natures (
    increase JSON NOT NULL,
    decrease JSON NOT NULL
);
COMMENT ON TABLE pokeathlon_stat_affecting_natures IS 'Original model name - PokeathlonStatAffectingNatures.';
COMMENT ON COLUMN pokeathlon_stat_affecting_natures.increase IS 'A list of natures and how they change the referenced Pokéathlon stat.';
COMMENT ON COLUMN pokeathlon_stat_affecting_natures.decrease IS 'A list of natures and how they change the referenced Pokéathlon stat.';

--
-- Table 'pokeathlon_stat_detail' generated from model 'PokeathlonStatDetail'
--
CREATE TABLE IF NOT EXISTS pokeathlon_stat_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    affecting_natures TEXT NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE pokeathlon_stat_detail IS 'Original model name - PokeathlonStatDetail.';
COMMENT ON COLUMN pokeathlon_stat_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN pokeathlon_stat_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN pokeathlon_stat_detail.affecting_natures IS 'A detail of natures which affect this Pokéathlon stat positively or negatively.';
COMMENT ON COLUMN pokeathlon_stat_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'pokeathlon_stat_name' generated from model 'PokeathlonStatName'
--
CREATE TABLE IF NOT EXISTS pokeathlon_stat_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokeathlon_stat_name IS 'Original model name - PokeathlonStatName.';
COMMENT ON COLUMN pokeathlon_stat_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN pokeathlon_stat_name."language" IS 'The language this name is in.';

--
-- Table 'pokeathlon_stat_summary' generated from model 'PokeathlonStatSummary'
--
CREATE TABLE IF NOT EXISTS pokeathlon_stat_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokeathlon_stat_summary IS 'Original model name - PokeathlonStatSummary.';
COMMENT ON COLUMN pokeathlon_stat_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN pokeathlon_stat_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'pokedex_description' generated from model 'PokedexDescription'
--
CREATE TABLE IF NOT EXISTS pokedex_description (
    description VARCHAR(2000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokedex_description IS 'Original model name - PokedexDescription.';
COMMENT ON COLUMN pokedex_description.description IS 'The localized description for an API resource in a specific language.';
COMMENT ON COLUMN pokedex_description."language" IS 'The language this name is in.';

--
-- Table 'pokedex_detail' generated from model 'PokedexDetail'
--
CREATE TABLE IF NOT EXISTS pokedex_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    is_main_series BOOLEAN DEFAULT NULL,
    descriptions JSON NOT NULL,
    "names" JSON NOT NULL,
    pokemon_entries JSON NOT NULL,
    region TEXT NOT NULL,
    version_groups JSON NOT NULL
);
COMMENT ON TABLE pokedex_detail IS 'Original model name - PokedexDetail.';
COMMENT ON COLUMN pokedex_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN pokedex_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN pokedex_detail.is_main_series IS 'Whether or not this Pokédex originated in the main series of the video games.';
COMMENT ON COLUMN pokedex_detail.descriptions IS 'The description of this resource listed in different languages.';
COMMENT ON COLUMN pokedex_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN pokedex_detail.pokemon_entries IS 'A list of Pokémon catalogued in this Pokédex and their indexes.';
COMMENT ON COLUMN pokedex_detail.region IS 'The region this Pokédex catalogues Pokémon for.';
COMMENT ON COLUMN pokedex_detail.version_groups IS 'A list of version groups this Pokédex is relevant to.';

--
-- Table 'pokedex_name' generated from model 'PokedexName'
--
CREATE TABLE IF NOT EXISTS pokedex_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokedex_name IS 'Original model name - PokedexName.';
COMMENT ON COLUMN pokedex_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN pokedex_name."language" IS 'The language this name is in.';

--
-- Table 'pokedex_summary' generated from model 'PokedexSummary'
--
CREATE TABLE IF NOT EXISTS pokedex_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokedex_summary IS 'Original model name - PokedexSummary.';
COMMENT ON COLUMN pokedex_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN pokedex_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'pokemon_ability' generated from model 'PokemonAbility'
--
CREATE TABLE IF NOT EXISTS pokemon_ability (
    is_hidden BOOLEAN DEFAULT NULL,
    slot INTEGER NOT NULL,
    ability TEXT NOT NULL
);
COMMENT ON TABLE pokemon_ability IS 'Original model name - PokemonAbility.';
COMMENT ON COLUMN pokemon_ability.is_hidden IS 'Whether or not this is a hidden ability.';
COMMENT ON COLUMN pokemon_ability.slot IS 'The slot this ability occupies in this Pokémon species.';
COMMENT ON COLUMN pokemon_ability.ability IS 'The ability the Pokémon may have.';

--
-- Table 'pokemon_ability_past' generated from model 'PokemonAbilityPast'
--
CREATE TABLE IF NOT EXISTS pokemon_ability_past (
    is_hidden BOOLEAN DEFAULT NULL,
    slot INTEGER NOT NULL,
    ability TEXT NOT NULL
);
COMMENT ON TABLE pokemon_ability_past IS 'Original model name - PokemonAbilityPast.';
COMMENT ON COLUMN pokemon_ability_past.is_hidden IS 'Whether or not this is a hidden ability.';
COMMENT ON COLUMN pokemon_ability_past.slot IS 'The slot this ability occupies in this Pokémon species.';
COMMENT ON COLUMN pokemon_ability_past.ability IS 'The ability the Pokémon may have.';

--
-- Table 'pokemon_color_detail' generated from model 'PokemonColorDetail'
--
CREATE TABLE IF NOT EXISTS pokemon_color_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    "names" JSON NOT NULL,
    pokemon_species JSON NOT NULL
);
COMMENT ON TABLE pokemon_color_detail IS 'Original model name - PokemonColorDetail.';
COMMENT ON COLUMN pokemon_color_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN pokemon_color_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN pokemon_color_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN pokemon_color_detail.pokemon_species IS 'A list of the Pokémon species that have this color.';

--
-- Table 'pokemon_color_name' generated from model 'PokemonColorName'
--
CREATE TABLE IF NOT EXISTS pokemon_color_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_color_name IS 'Original model name - PokemonColorName.';
COMMENT ON COLUMN pokemon_color_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN pokemon_color_name."language" IS 'The language this name is in.';

--
-- Table 'pokemon_color_summary' generated from model 'PokemonColorSummary'
--
CREATE TABLE IF NOT EXISTS pokemon_color_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokemon_color_summary IS 'Original model name - PokemonColorSummary.';
COMMENT ON COLUMN pokemon_color_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN pokemon_color_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'pokemon_cries' generated from model 'PokemonCries'
--
CREATE TABLE IF NOT EXISTS pokemon_cries (
    latest TEXT NOT NULL,
    legacy TEXT NOT NULL
);
COMMENT ON TABLE pokemon_cries IS 'Original model name - PokemonCries.';
COMMENT ON COLUMN pokemon_cries.latest IS 'The latest depiction of this Pokémon&#39;s cry.';
COMMENT ON COLUMN pokemon_cries.legacy IS 'The legacy depiction of this Pokémon&#39;s cry.';

--
-- Table 'pokemon_detail' generated from model 'PokemonDetail'
--
CREATE TABLE IF NOT EXISTS pokemon_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    base_experience INTEGER DEFAULT NULL,
    height INTEGER DEFAULT NULL,
    is_default BOOLEAN DEFAULT NULL,
    "order" INTEGER DEFAULT NULL,
    weight INTEGER DEFAULT NULL,
    abilities JSON NOT NULL,
    past_abilities JSON NOT NULL,
    forms JSON NOT NULL,
    game_indices JSON NOT NULL,
    held_items JSON NOT NULL,
    location_area_encounters TEXT NOT NULL,
    moves JSON NOT NULL,
    species TEXT NOT NULL,
    sprites TEXT NOT NULL,
    cries TEXT NOT NULL,
    stats JSON NOT NULL,
    past_stats JSON NOT NULL,
    "types" JSON NOT NULL,
    past_types JSON NOT NULL
);
COMMENT ON TABLE pokemon_detail IS 'Original model name - PokemonDetail.';
COMMENT ON COLUMN pokemon_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN pokemon_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN pokemon_detail.base_experience IS 'The base experience gained for defeating this Pokémon.';
COMMENT ON COLUMN pokemon_detail.height IS 'The height of this Pokémon in decimetres.';
COMMENT ON COLUMN pokemon_detail.is_default IS 'Set for exactly one Pokémon used as the default for each species.';
COMMENT ON COLUMN pokemon_detail."order" IS 'Order for sorting. Almost national order, except families are grouped together.';
COMMENT ON COLUMN pokemon_detail.weight IS 'The weight of this Pokémon in hectograms.';
COMMENT ON COLUMN pokemon_detail.abilities IS 'A list of abilities this Pokémon could potentially have.';
COMMENT ON COLUMN pokemon_detail.past_abilities IS 'A list of details showing abilities this pokémon had in previous generations';
COMMENT ON COLUMN pokemon_detail.forms IS 'A list of forms this Pokémon can take on.';
COMMENT ON COLUMN pokemon_detail.game_indices IS 'A list of game indices relevent to Pokémon item by generation.';
COMMENT ON COLUMN pokemon_detail.held_items IS 'A list of items this Pokémon may be holding when encountered.';
COMMENT ON COLUMN pokemon_detail.location_area_encounters IS 'A link to a list of location areas, as well as encounter details pertaining to specific versions.';
COMMENT ON COLUMN pokemon_detail.moves IS 'A list of moves along with learn methods and level details pertaining to specific version groups.';
COMMENT ON COLUMN pokemon_detail.species IS 'The species this Pokémon belongs to.';
COMMENT ON COLUMN pokemon_detail.sprites IS 'A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt;';
COMMENT ON COLUMN pokemon_detail.cries IS 'A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt;';
COMMENT ON COLUMN pokemon_detail.stats IS 'A list of base stat values for this Pokémon.';
COMMENT ON COLUMN pokemon_detail.past_stats IS 'A list of details showing stats this pokémon had in previous generations';
COMMENT ON COLUMN pokemon_detail."types" IS 'A list of details showing types this Pokémon has.';
COMMENT ON COLUMN pokemon_detail.past_types IS 'A list of details showing types this pokémon had in previous generations';

--
-- Table 'pokemon_dex_entry' generated from model 'PokemonDexEntry'
--
CREATE TABLE IF NOT EXISTS pokemon_dex_entry (
    entry_number INTEGER NOT NULL,
    pokedex TEXT NOT NULL
);
COMMENT ON TABLE pokemon_dex_entry IS 'Original model name - PokemonDexEntry.';
COMMENT ON COLUMN pokemon_dex_entry.entry_number IS 'The index number within the Pokédex.';
COMMENT ON COLUMN pokemon_dex_entry.pokedex IS 'The Pokédex the referenced Pokémon species can be found in.';

--
-- Table 'pokemon_dex_number' generated from model 'PokemonDexNumber'
--
CREATE TABLE IF NOT EXISTS pokemon_dex_number (
    entry_number INTEGER NOT NULL,
    pokemon_species TEXT NOT NULL
);
COMMENT ON TABLE pokemon_dex_number IS 'Original model name - PokemonDexNumber.';
COMMENT ON COLUMN pokemon_dex_number.entry_number IS 'The index of this Pokémon species entry within the Pokédex.';
COMMENT ON COLUMN pokemon_dex_number.pokemon_species IS 'The Pokémon species being encountered.';

--
-- Table 'pokemon_encounter_detail_response' generated from model 'PokemonEncounterDetailResponse'
--
CREATE TABLE IF NOT EXISTS pokemon_encounter_detail_response (
    chance INTEGER NOT NULL,
    condition_values JSON NOT NULL,
    max_level INTEGER NOT NULL,
    "method" TEXT NOT NULL,
    min_level INTEGER NOT NULL
);
COMMENT ON TABLE pokemon_encounter_detail_response IS 'Original model name - PokemonEncounterDetailResponse.';
COMMENT ON COLUMN pokemon_encounter_detail_response.chance IS 'Percent chance that this encounter will occur.';
COMMENT ON COLUMN pokemon_encounter_detail_response.condition_values IS 'A list of condition values that must be in effect for this encounter to occur.';
COMMENT ON COLUMN pokemon_encounter_detail_response.max_level IS 'The highest level the Pokémon could be encountered at.';
COMMENT ON COLUMN pokemon_encounter_detail_response."method" IS 'The method by which this encounter happens.';
COMMENT ON COLUMN pokemon_encounter_detail_response.min_level IS 'The lowest level the Pokémon could be encountered at.';

--
-- Table 'pokemon_encounter_response' generated from model 'PokemonEncounterResponse'
--
CREATE TABLE IF NOT EXISTS pokemon_encounter_response (
    location_area TEXT NOT NULL,
    version_details JSON NOT NULL
);
COMMENT ON TABLE pokemon_encounter_response IS 'Original model name - PokemonEncounterResponse.';
COMMENT ON COLUMN pokemon_encounter_response.location_area IS 'The location area the referenced Pokémon can be encountered in.';
COMMENT ON COLUMN pokemon_encounter_response.version_details IS 'A list of versions and encounters with the referenced Pokémon that might happen.';

--
-- Table 'pokemon_encounter_version_detail_response' generated from model 'PokemonEncounterVersionDetailResponse'
--
CREATE TABLE IF NOT EXISTS pokemon_encounter_version_detail_response (
    "version" TEXT NOT NULL,
    max_chance INTEGER NOT NULL,
    encounter_details JSON NOT NULL
);
COMMENT ON TABLE pokemon_encounter_version_detail_response IS 'Original model name - PokemonEncounterVersionDetailResponse.';
COMMENT ON COLUMN pokemon_encounter_version_detail_response."version" IS 'The game version this encounter happens in.';
COMMENT ON COLUMN pokemon_encounter_version_detail_response.max_chance IS 'The total percentage of all encounter potential.';
COMMENT ON COLUMN pokemon_encounter_version_detail_response.encounter_details IS 'A list of encounters and their specifics.';

--
-- Table 'pokemon_evolution' generated from model 'PokemonEvolution'
--
CREATE TABLE IF NOT EXISTS pokemon_evolution (
    version_group TEXT NOT NULL,
    is_default BOOLEAN DEFAULT NULL,
    item TEXT NOT NULL,
    "trigger" TEXT NOT NULL,
    gender INTEGER DEFAULT NULL,
    held_item TEXT NOT NULL,
    known_move TEXT NOT NULL,
    known_move_type TEXT NOT NULL,
    "location" TEXT NOT NULL,
    min_level INTEGER DEFAULT NULL,
    min_happiness INTEGER DEFAULT NULL,
    min_beauty INTEGER DEFAULT NULL,
    min_affection INTEGER DEFAULT NULL,
    near_special_rock BOOLEAN DEFAULT NULL,
    needs_multiplayer BOOLEAN DEFAULT NULL,
    needs_overworld_rain BOOLEAN DEFAULT NULL,
    party_species TEXT NOT NULL,
    party_type TEXT NOT NULL,
    relative_physical_stats INTEGER DEFAULT NULL,
    time_of_day VARCHAR(10) DEFAULT NULL,
    trade_species TEXT NOT NULL,
    turn_upside_down BOOLEAN DEFAULT NULL,
    region TEXT NOT NULL,
    required_pokemon_form TEXT NOT NULL,
    evolved_pokemon_form TEXT NOT NULL,
    used_move TEXT NOT NULL,
    min_move_count INTEGER DEFAULT NULL,
    min_steps INTEGER DEFAULT NULL,
    min_damage_taken INTEGER DEFAULT NULL,
    allowed_natures JSON NOT NULL,
    condition_expression TEXT NOT NULL
);
COMMENT ON TABLE pokemon_evolution IS 'Original model name - PokemonEvolution.';
COMMENT ON COLUMN pokemon_evolution.version_group IS 'The version group in which these evolution requirements apply.';
COMMENT ON COLUMN pokemon_evolution.is_default IS 'Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.';
COMMENT ON COLUMN pokemon_evolution.item IS 'The item required to cause evolution this into Pokémon species.';
COMMENT ON COLUMN pokemon_evolution."trigger" IS 'The type of event that triggers evolution into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.gender IS 'The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.held_item IS 'The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution."location" IS 'The location the evolution must be triggered at.';
COMMENT ON COLUMN pokemon_evolution.min_level IS 'The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.min_happiness IS 'The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.min_beauty IS 'The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.min_affection IS 'The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.near_special_rock IS 'Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.needs_multiplayer IS 'Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).';
COMMENT ON COLUMN pokemon_evolution.needs_overworld_rain IS 'Whether or not it must be raining in the overworld to cause evolution this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.party_species IS 'The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.party_type IS 'The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.relative_physical_stats IS 'The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense.';
COMMENT ON COLUMN pokemon_evolution.time_of_day IS 'The required time of day. Day or night.';
COMMENT ON COLUMN pokemon_evolution.trade_species IS 'Pokémon species for which this one must be traded.';
COMMENT ON COLUMN pokemon_evolution.turn_upside_down IS 'Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.';
COMMENT ON COLUMN pokemon_evolution.region IS 'The required region in which this evolution can occur.';
COMMENT ON COLUMN pokemon_evolution.required_pokemon_form IS 'The Pokémon form required before evolving, or null if unrestricted.';
COMMENT ON COLUMN pokemon_evolution.evolved_pokemon_form IS 'The Pokémon form produced by this evolution, or null if unspecified.';
COMMENT ON COLUMN pokemon_evolution.used_move IS 'The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.min_move_count IS 'The minimum number of times a move must be used in order to evolve into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.min_steps IS 'The minimum number of steps that must be taken in order to evolve into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.min_damage_taken IS 'The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.';
COMMENT ON COLUMN pokemon_evolution.allowed_natures IS 'The natures that allow this evolution, or null if unrestricted.';
COMMENT ON COLUMN pokemon_evolution.condition_expression IS 'An additional evolution condition expressed in reverse Polish notation, or null if none.';

--
-- Table 'pokemon_evolution_known_move' generated from model 'PokemonEvolutionUnderscoreknownUnderscoremove'
--
CREATE TABLE IF NOT EXISTS pokemon_evolution_known_move (
    "name" TEXT NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokemon_evolution_known_move IS 'Original model name - PokemonEvolution_known_move.';

--
-- Table 'pokemon_form_detail' generated from model 'PokemonFormDetail'
--
CREATE TABLE IF NOT EXISTS pokemon_form_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
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
    "types" JSON NOT NULL,
    trigger_conditions JSON NOT NULL,
    flavor_text_entries JSON NOT NULL
);
COMMENT ON TABLE pokemon_form_detail IS 'Original model name - PokemonFormDetail.';
COMMENT ON COLUMN pokemon_form_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN pokemon_form_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN pokemon_form_detail."order" IS 'The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.';
COMMENT ON COLUMN pokemon_form_detail.form_order IS 'The order in which forms should be sorted within a species&#39; forms.';
COMMENT ON COLUMN pokemon_form_detail.is_default IS 'True for exactly one form used as the default for each Pokémon.';
COMMENT ON COLUMN pokemon_form_detail.is_battle_only IS 'Whether or not this form can only happen during battle.';
COMMENT ON COLUMN pokemon_form_detail.is_mega IS 'Whether or not this form requires mega evolution.';
COMMENT ON COLUMN pokemon_form_detail.form_name IS 'The name of this form.';
COMMENT ON COLUMN pokemon_form_detail.pokemon IS 'The Pokémon that can take on this form.';
COMMENT ON COLUMN pokemon_form_detail.sprites IS 'A set of sprites used to depict this Pokémon form in the game.';
COMMENT ON COLUMN pokemon_form_detail.version_group IS 'The version group this Pokémon form was introduced in.';
COMMENT ON COLUMN pokemon_form_detail.form_names IS 'The form specific form name of this Pokémon form, or empty if the form does not have a specific name.';
COMMENT ON COLUMN pokemon_form_detail."names" IS 'The form specific full name of this Pokémon form, or empty if the form does not have a specific name.';
COMMENT ON COLUMN pokemon_form_detail."types" IS 'A list of details showing types this Pokémon form has.';
COMMENT ON COLUMN pokemon_form_detail.trigger_conditions IS 'The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.';
COMMENT ON COLUMN pokemon_form_detail.flavor_text_entries IS 'The flavor text of this form listed in different languages and versions.';

--
-- Table 'pokemon_form_flavor_text' generated from model 'PokemonFormFlavorText'
--
CREATE TABLE IF NOT EXISTS pokemon_form_flavor_text (
    flavor_text TEXT NOT NULL,
    "language" TEXT NOT NULL,
    "version" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_form_flavor_text IS 'Original model name - PokemonFormFlavorText.';
COMMENT ON COLUMN pokemon_form_flavor_text.flavor_text IS 'The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this &lt;a href&#x3D;&#39;https://github.com/veekun/pokedex/issues/218#issuecomment-339841781&#39; &gt;issue&lt;/a&gt; to find out more. ';
COMMENT ON COLUMN pokemon_form_flavor_text."language" IS 'The language this name is in.';
COMMENT ON COLUMN pokemon_form_flavor_text."version" IS 'The game version this flavor text is extracted from.';

--
-- Table 'pokemon_form_name' generated from model 'PokemonFormName'
--
CREATE TABLE IF NOT EXISTS pokemon_form_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_form_name IS 'Original model name - PokemonFormName.';
COMMENT ON COLUMN pokemon_form_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN pokemon_form_name."language" IS 'The language this name is in.';

--
-- Table 'pokemon_form_sprites' generated from model 'PokemonFormSprites'
--
CREATE TABLE IF NOT EXISTS pokemon_form_sprites (
    front_default TEXT NOT NULL,
    front_shiny TEXT NOT NULL,
    front_female TEXT NOT NULL,
    front_shiny_female TEXT NOT NULL,
    back_default TEXT NOT NULL,
    back_shiny TEXT NOT NULL,
    back_female TEXT NOT NULL,
    back_shiny_female TEXT NOT NULL,
    other TEXT DEFAULT NULL,
    versions JSON DEFAULT NULL
);
COMMENT ON TABLE pokemon_form_sprites IS 'Original model name - PokemonFormSprites.';
COMMENT ON COLUMN pokemon_form_sprites.front_default IS 'The default depiction of this Pokémon from the front in battle.';
COMMENT ON COLUMN pokemon_form_sprites.front_shiny IS 'The shiny depiction of this Pokémon from the front in battle.';
COMMENT ON COLUMN pokemon_form_sprites.front_female IS 'The female depiction of this Pokémon from the front in battle.';
COMMENT ON COLUMN pokemon_form_sprites.front_shiny_female IS 'The shiny female depiction of this Pokémon from the front in battle.';
COMMENT ON COLUMN pokemon_form_sprites.back_default IS 'The default depiction of this Pokémon from the back in battle.';
COMMENT ON COLUMN pokemon_form_sprites.back_shiny IS 'The shiny depiction of this Pokémon from the back in battle.';
COMMENT ON COLUMN pokemon_form_sprites.back_female IS 'The female depiction of this Pokémon from the back in battle.';
COMMENT ON COLUMN pokemon_form_sprites.back_shiny_female IS 'The shiny female depiction of this Pokémon from the back in battle.';
COMMENT ON COLUMN pokemon_form_sprites.other IS 'Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.';
COMMENT ON COLUMN pokemon_form_sprites.versions IS 'Sprites grouped by generation and game. Available keys vary by resource.';

--
-- Table 'pokemon_form_summary' generated from model 'PokemonFormSummary'
--
CREATE TABLE IF NOT EXISTS pokemon_form_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokemon_form_summary IS 'Original model name - PokemonFormSummary.';
COMMENT ON COLUMN pokemon_form_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN pokemon_form_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'pokemon_form_trigger_condition' generated from model 'PokemonFormTriggerCondition'
--
CREATE TABLE IF NOT EXISTS pokemon_form_trigger_condition (
    "trigger" TEXT NOT NULL,
    "name" TEXT DEFAULT NULL,
    url TEXT DEFAULT NULL,
    base_form TEXT DEFAULT NULL
);
COMMENT ON TABLE pokemon_form_trigger_condition IS 'Original model name - PokemonFormTriggerCondition.';
COMMENT ON COLUMN pokemon_form_trigger_condition."trigger" IS 'The trigger for this form change.';
COMMENT ON COLUMN pokemon_form_trigger_condition."name" IS 'The name of the required item, ability, or move. Only present for a resource-based trigger.';
COMMENT ON COLUMN pokemon_form_trigger_condition.url IS 'The URL of the required item, ability, or move. Only present for a resource-based trigger.';
COMMENT ON COLUMN pokemon_form_trigger_condition.base_form IS 'The required base form. Only present when the trigger specifies one.';

--
-- Table 'pokemon_form_type' generated from model 'PokemonFormType'
--
CREATE TABLE IF NOT EXISTS pokemon_form_type (
    slot INTEGER NOT NULL,
    "type" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_form_type IS 'Original model name - PokemonFormType.';
COMMENT ON COLUMN pokemon_form_type.slot IS 'The order the Pokémon&#39;s types are listed in.';
COMMENT ON COLUMN pokemon_form_type."type" IS 'The type the referenced Form has.';

--
-- Table 'pokemon_game_index' generated from model 'PokemonGameIndex'
--
CREATE TABLE IF NOT EXISTS pokemon_game_index (
    game_index INTEGER NOT NULL,
    "version" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_game_index IS 'Original model name - PokemonGameIndex.';
COMMENT ON COLUMN pokemon_game_index.game_index IS 'The internal id of an API resource within game data.';
COMMENT ON COLUMN pokemon_game_index."version" IS 'The version relevent to this game index.';

--
-- Table 'pokemon_habitat_detail' generated from model 'PokemonHabitatDetail'
--
CREATE TABLE IF NOT EXISTS pokemon_habitat_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    "names" JSON NOT NULL,
    pokemon_species JSON NOT NULL
);
COMMENT ON TABLE pokemon_habitat_detail IS 'Original model name - PokemonHabitatDetail.';
COMMENT ON COLUMN pokemon_habitat_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN pokemon_habitat_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN pokemon_habitat_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN pokemon_habitat_detail.pokemon_species IS 'A list of the Pokémon species that can be found in this habitat.';

--
-- Table 'pokemon_habitat_name' generated from model 'PokemonHabitatName'
--
CREATE TABLE IF NOT EXISTS pokemon_habitat_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_habitat_name IS 'Original model name - PokemonHabitatName.';
COMMENT ON COLUMN pokemon_habitat_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN pokemon_habitat_name."language" IS 'The language this name is in.';

--
-- Table 'pokemon_habitat_summary' generated from model 'PokemonHabitatSummary'
--
CREATE TABLE IF NOT EXISTS pokemon_habitat_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokemon_habitat_summary IS 'Original model name - PokemonHabitatSummary.';
COMMENT ON COLUMN pokemon_habitat_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN pokemon_habitat_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'pokemon_held_item' generated from model 'PokemonHeldItem'
--
CREATE TABLE IF NOT EXISTS pokemon_held_item (
    pokemon TEXT NOT NULL,
    version_details JSON NOT NULL
);
COMMENT ON TABLE pokemon_held_item IS 'Original model name - PokemonHeldItem.';
COMMENT ON COLUMN pokemon_held_item.pokemon IS 'The Pokémon that holds this item.';
COMMENT ON COLUMN pokemon_held_item.version_details IS 'The details for the version that this item is held in by the Pokémon.';

--
-- Table 'pokemon_held_item_summary' generated from model 'PokemonHeldItemSummary'
--
CREATE TABLE IF NOT EXISTS pokemon_held_item_summary (
    item TEXT NOT NULL,
    version_details JSON NOT NULL
);
COMMENT ON TABLE pokemon_held_item_summary IS 'Original model name - PokemonHeldItemSummary.';
COMMENT ON COLUMN pokemon_held_item_summary.item IS 'The item the referenced Pokémon holds.';
COMMENT ON COLUMN pokemon_held_item_summary.version_details IS 'The details of the different versions in which the item is held.';

--
-- Table 'pokemon_held_item_version' generated from model 'PokemonHeldItemVersion'
--
CREATE TABLE IF NOT EXISTS pokemon_held_item_version (
    rarity INTEGER NOT NULL,
    "version" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_held_item_version IS 'Original model name - PokemonHeldItemVersion.';
COMMENT ON COLUMN pokemon_held_item_version.rarity IS 'How often the item is held.';
COMMENT ON COLUMN pokemon_held_item_version."version" IS 'The version in which the item is held.';

--
-- Table 'pokemon_move' generated from model 'PokemonMove'
--
CREATE TABLE IF NOT EXISTS pokemon_move (
    "move" TEXT NOT NULL,
    version_group_details JSON NOT NULL
);
COMMENT ON TABLE pokemon_move IS 'Original model name - PokemonMove.';
COMMENT ON COLUMN pokemon_move."move" IS 'The move the Pokémon can learn.';
COMMENT ON COLUMN pokemon_move.version_group_details IS 'The details of the version in which the Pokémon can learn the move.';

--
-- Table 'pokemon_move_version_group' generated from model 'PokemonMoveVersionGroup'
--
CREATE TABLE IF NOT EXISTS pokemon_move_version_group (
    level_learned_at INTEGER NOT NULL,
    move_learn_method TEXT NOT NULL,
    version_group TEXT NOT NULL,
    "order" INTEGER DEFAULT NULL
);
COMMENT ON TABLE pokemon_move_version_group IS 'Original model name - PokemonMoveVersionGroup.';
COMMENT ON COLUMN pokemon_move_version_group.level_learned_at IS 'The minimum level to learn the move.';
COMMENT ON COLUMN pokemon_move_version_group.move_learn_method IS 'The method by which the move is learned.';
COMMENT ON COLUMN pokemon_move_version_group.version_group IS 'The version group in which the move is learned.';
COMMENT ON COLUMN pokemon_move_version_group."order" IS 'Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.';

--
-- Table 'pokemon_past_ability' generated from model 'PokemonPastAbility'
--
CREATE TABLE IF NOT EXISTS pokemon_past_ability (
    abilities JSON NOT NULL,
    generation TEXT NOT NULL
);
COMMENT ON TABLE pokemon_past_ability IS 'Original model name - PokemonPastAbility.';
COMMENT ON COLUMN pokemon_past_ability.abilities IS 'The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.';
COMMENT ON COLUMN pokemon_past_ability.generation IS 'The last generation in which the referenced pokémon had the listed abilities.';

--
-- Table 'pokemon_past_stat' generated from model 'PokemonPastStat'
--
CREATE TABLE IF NOT EXISTS pokemon_past_stat (
    generation TEXT NOT NULL,
    stats JSON NOT NULL
);
COMMENT ON TABLE pokemon_past_stat IS 'Original model name - PokemonPastStat.';
COMMENT ON COLUMN pokemon_past_stat.generation IS 'The last generation in which the referenced pokémon had the listed stats.';
COMMENT ON COLUMN pokemon_past_stat.stats IS 'The stat the Pokémon had up to and including the listed generation.';

--
-- Table 'pokemon_past_type' generated from model 'PokemonPastType'
--
CREATE TABLE IF NOT EXISTS pokemon_past_type (
    generation TEXT NOT NULL,
    "types" JSON NOT NULL
);
COMMENT ON TABLE pokemon_past_type IS 'Original model name - PokemonPastType.';
COMMENT ON COLUMN pokemon_past_type.generation IS 'The last generation in which the referenced pokémon had the listed types.';
COMMENT ON COLUMN pokemon_past_type."types" IS 'The types the referenced pokémon had up to and including the listed generation.';

--
-- Table 'pokemon_shape_awesome_name' generated from model 'PokemonShapeAwesomeName'
--
CREATE TABLE IF NOT EXISTS pokemon_shape_awesome_name (
    awesome_name VARCHAR(30) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_shape_awesome_name IS 'Original model name - PokemonShapeAwesomeName.';
COMMENT ON COLUMN pokemon_shape_awesome_name.awesome_name IS 'The localized \&quot;scientific\&quot; name for an API resource in a specific language.';
COMMENT ON COLUMN pokemon_shape_awesome_name."language" IS 'The language this \&quot;scientific\&quot; name is in.';

--
-- Table 'pokemon_shape_detail' generated from model 'PokemonShapeDetail'
--
CREATE TABLE IF NOT EXISTS pokemon_shape_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    awesome_names JSON NOT NULL,
    "names" JSON NOT NULL,
    pokemon_species JSON NOT NULL
);
COMMENT ON TABLE pokemon_shape_detail IS 'Original model name - PokemonShapeDetail.';
COMMENT ON COLUMN pokemon_shape_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN pokemon_shape_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN pokemon_shape_detail.awesome_names IS 'The \&quot;scientific\&quot; name of this Pokémon shape listed in different languages.';
COMMENT ON COLUMN pokemon_shape_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN pokemon_shape_detail.pokemon_species IS 'A list of the Pokémon species that have this shape.';

--
-- Table 'pokemon_shape_name' generated from model 'PokemonShapeName'
--
CREATE TABLE IF NOT EXISTS pokemon_shape_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_shape_name IS 'Original model name - PokemonShapeName.';
COMMENT ON COLUMN pokemon_shape_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN pokemon_shape_name."language" IS 'The language this name is in.';

--
-- Table 'pokemon_shape_summary' generated from model 'PokemonShapeSummary'
--
CREATE TABLE IF NOT EXISTS pokemon_shape_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokemon_shape_summary IS 'Original model name - PokemonShapeSummary.';
COMMENT ON COLUMN pokemon_shape_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN pokemon_shape_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'pokemon_species_description' generated from model 'PokemonSpeciesDescription'
--
CREATE TABLE IF NOT EXISTS pokemon_species_description (
    description VARCHAR(2000) DEFAULT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_species_description IS 'Original model name - PokemonSpeciesDescription.';
COMMENT ON COLUMN pokemon_species_description.description IS 'The localized description for an API resource in a specific language.';
COMMENT ON COLUMN pokemon_species_description."language" IS 'The language this name is in.';

--
-- Table 'pokemon_species_detail' generated from model 'PokemonSpeciesDetail'
--
CREATE TABLE IF NOT EXISTS pokemon_species_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
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
COMMENT ON COLUMN pokemon_species_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN pokemon_species_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN pokemon_species_detail."order" IS 'The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.';
COMMENT ON COLUMN pokemon_species_detail.gender_rate IS 'The chance of this Pokémon being female, in eighths; or -1 for genderless.';
COMMENT ON COLUMN pokemon_species_detail.capture_rate IS 'The base capture rate; up to 255. The higher the number, the easier the catch.';
COMMENT ON COLUMN pokemon_species_detail.base_happiness IS 'The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.';
COMMENT ON COLUMN pokemon_species_detail.is_baby IS 'Whether or not this is a baby Pokémon.';
COMMENT ON COLUMN pokemon_species_detail.is_legendary IS 'Whether or not this is a legendary Pokémon.';
COMMENT ON COLUMN pokemon_species_detail.is_mythical IS 'Whether or not this is a mythical Pokémon.';
COMMENT ON COLUMN pokemon_species_detail.hatch_counter IS 'Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.';
COMMENT ON COLUMN pokemon_species_detail.has_gender_differences IS 'Whether or not this Pokémon has visual gender differences.';
COMMENT ON COLUMN pokemon_species_detail.forms_switchable IS 'Whether or not this Pokémon has multiple forms and can switch between them.';
COMMENT ON COLUMN pokemon_species_detail.growth_rate IS 'The rate at which this Pokémon species gains levels.';
COMMENT ON COLUMN pokemon_species_detail.pokedex_numbers IS 'A list of Pokedexes and the indexes reserved within them for this Pokémon species.';
COMMENT ON COLUMN pokemon_species_detail.egg_groups IS 'A list of egg groups this Pokémon species is a member of.';
COMMENT ON COLUMN pokemon_species_detail.color IS 'The color of this Pokémon for Pokédex search.';
COMMENT ON COLUMN pokemon_species_detail.shape IS 'The shape of this Pokémon for Pokédex search.';
COMMENT ON COLUMN pokemon_species_detail.evolves_from_species IS 'The Pokémon species that evolves into this Pokemon_species.';
COMMENT ON COLUMN pokemon_species_detail.evolution_chain IS 'The evolution chain this Pokémon species is a member of.';
COMMENT ON COLUMN pokemon_species_detail.habitat IS 'The habitat this Pokémon species can be encountered in.';
COMMENT ON COLUMN pokemon_species_detail.generation IS 'The generation this Pokémon species was introduced in.';
COMMENT ON COLUMN pokemon_species_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN pokemon_species_detail.pal_park_encounters IS 'A list of encounters that can be had with this Pokémon species in pal park.';
COMMENT ON COLUMN pokemon_species_detail.form_descriptions IS 'Descriptions of different forms Pokémon take on within the Pokémon species.';
COMMENT ON COLUMN pokemon_species_detail.flavor_text_entries IS 'A list of flavor text entries for this Pokémon species.';
COMMENT ON COLUMN pokemon_species_detail.genera IS 'The genus of this Pokémon species listed in multiple languages.';
COMMENT ON COLUMN pokemon_species_detail.varieties IS 'A list of the Pokémon that exist within this Pokémon species.';

--
-- Table 'pokemon_species_flavor_text' generated from model 'PokemonSpeciesFlavorText'
--
CREATE TABLE IF NOT EXISTS pokemon_species_flavor_text (
    flavor_text TEXT NOT NULL,
    "language" TEXT NOT NULL,
    "version" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_species_flavor_text IS 'Original model name - PokemonSpeciesFlavorText.';
COMMENT ON COLUMN pokemon_species_flavor_text.flavor_text IS 'The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this &lt;a href&#x3D;&#39;https://github.com/veekun/pokedex/issues/218#issuecomment-339841781&#39; &gt;issue&lt;/a&gt; to find out more. ';
COMMENT ON COLUMN pokemon_species_flavor_text."language" IS 'The language this name is in.';
COMMENT ON COLUMN pokemon_species_flavor_text."version" IS 'The game version this flavor text is extracted from.';

--
-- Table 'pokemon_species_genus' generated from model 'PokemonSpeciesGenus'
--
CREATE TABLE IF NOT EXISTS pokemon_species_genus (
    genus VARCHAR(30) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_species_genus IS 'Original model name - PokemonSpeciesGenus.';
COMMENT ON COLUMN pokemon_species_genus.genus IS 'The localized genus for the referenced Pokémon species';
COMMENT ON COLUMN pokemon_species_genus."language" IS 'The language this genus is in.';

--
-- Table 'pokemon_species_name' generated from model 'PokemonSpeciesName'
--
CREATE TABLE IF NOT EXISTS pokemon_species_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_species_name IS 'Original model name - PokemonSpeciesName.';
COMMENT ON COLUMN pokemon_species_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN pokemon_species_name."language" IS 'The language this name is in.';

--
-- Table 'pokemon_species_pal_park_encounter' generated from model 'PokemonSpeciesPalParkEncounter'
--
CREATE TABLE IF NOT EXISTS pokemon_species_pal_park_encounter (
    base_score INTEGER DEFAULT NULL,
    rate INTEGER NOT NULL,
    area TEXT NOT NULL
);
COMMENT ON TABLE pokemon_species_pal_park_encounter IS 'Original model name - PokemonSpeciesPalParkEncounter.';
COMMENT ON COLUMN pokemon_species_pal_park_encounter.base_score IS 'The base score given to the player when the referenced Pokémon is caught during a pal park run.';
COMMENT ON COLUMN pokemon_species_pal_park_encounter.rate IS 'The base rate for encountering the referenced Pokémon in this pal park area.';
COMMENT ON COLUMN pokemon_species_pal_park_encounter.area IS 'The pal park area where this encounter happens.';

--
-- Table 'pokemon_species_summary' generated from model 'PokemonSpeciesSummary'
--
CREATE TABLE IF NOT EXISTS pokemon_species_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokemon_species_summary IS 'Original model name - PokemonSpeciesSummary.';
COMMENT ON COLUMN pokemon_species_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN pokemon_species_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'pokemon_species_variety' generated from model 'PokemonSpeciesVariety'
--
CREATE TABLE IF NOT EXISTS pokemon_species_variety (
    is_default BOOLEAN NOT NULL,
    pokemon TEXT NOT NULL
);
COMMENT ON TABLE pokemon_species_variety IS 'Original model name - PokemonSpeciesVariety.';
COMMENT ON COLUMN pokemon_species_variety.is_default IS 'Whether this variety is the default variety.';
COMMENT ON COLUMN pokemon_species_variety.pokemon IS 'The Pokémon variety.';

--
-- Table 'pokemon_sprites' generated from model 'PokemonSprites'
--
CREATE TABLE IF NOT EXISTS pokemon_sprites (
    front_default TEXT NOT NULL,
    front_shiny TEXT NOT NULL,
    front_female TEXT NOT NULL,
    front_shiny_female TEXT NOT NULL,
    back_default TEXT NOT NULL,
    back_shiny TEXT NOT NULL,
    back_female TEXT NOT NULL,
    back_shiny_female TEXT NOT NULL,
    other TEXT DEFAULT NULL,
    versions JSON DEFAULT NULL
);
COMMENT ON TABLE pokemon_sprites IS 'Original model name - PokemonSprites.';
COMMENT ON COLUMN pokemon_sprites.front_default IS 'The default depiction of this Pokémon from the front in battle.';
COMMENT ON COLUMN pokemon_sprites.front_shiny IS 'The shiny depiction of this Pokémon from the front in battle.';
COMMENT ON COLUMN pokemon_sprites.front_female IS 'The female depiction of this Pokémon from the front in battle.';
COMMENT ON COLUMN pokemon_sprites.front_shiny_female IS 'The shiny female depiction of this Pokémon from the front in battle.';
COMMENT ON COLUMN pokemon_sprites.back_default IS 'The default depiction of this Pokémon from the back in battle.';
COMMENT ON COLUMN pokemon_sprites.back_shiny IS 'The shiny depiction of this Pokémon from the back in battle.';
COMMENT ON COLUMN pokemon_sprites.back_female IS 'The female depiction of this Pokémon from the back in battle.';
COMMENT ON COLUMN pokemon_sprites.back_shiny_female IS 'The shiny female depiction of this Pokémon from the back in battle.';
COMMENT ON COLUMN pokemon_sprites.other IS 'Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.';
COMMENT ON COLUMN pokemon_sprites.versions IS 'Sprites grouped by generation and game. Available keys vary by resource.';

--
-- Table 'pokemon_sprites_other' generated from model 'PokemonSpritesOther'
--
CREATE TABLE IF NOT EXISTS pokemon_sprites_other (
    dream_world TEXT DEFAULT NULL,
    home TEXT DEFAULT NULL,
    showdown TEXT DEFAULT NULL,
    official_artwork TEXT DEFAULT NULL
);
COMMENT ON TABLE pokemon_sprites_other IS 'Original model name - PokemonSpritesOther.';
COMMENT ON COLUMN pokemon_sprites_other.dream_world IS 'Pokémon Dream World artwork URLs.';
COMMENT ON COLUMN pokemon_sprites_other.home IS 'Pokémon HOME sprite URLs.';
COMMENT ON COLUMN pokemon_sprites_other.showdown IS 'Pokémon Showdown sprite URLs.';
COMMENT ON COLUMN pokemon_sprites_other.official_artwork IS 'Official Pokémon artwork URLs, including shiny artwork and version-specific variants.. Original param name - official-artwork.';

--
-- Table 'pokemon_sprites_other_dream_world' generated from model 'PokemonSpritesOtherDreamWorld'
--
CREATE TABLE IF NOT EXISTS pokemon_sprites_other_dream_world (
    front_default TEXT NOT NULL,
    front_female TEXT NOT NULL
);
COMMENT ON TABLE pokemon_sprites_other_dream_world IS 'Original model name - PokemonSpritesOtherDreamWorld.';
COMMENT ON COLUMN pokemon_sprites_other_dream_world.front_default IS 'The URL of the default Pokémon Dream World front image, or null if unavailable.';
COMMENT ON COLUMN pokemon_sprites_other_dream_world.front_female IS 'The URL of the female Pokémon Dream World front image, or null if unavailable.';

--
-- Table 'pokemon_sprites_other_home' generated from model 'PokemonSpritesOtherHome'
--
CREATE TABLE IF NOT EXISTS pokemon_sprites_other_home (
    front_default TEXT NOT NULL,
    front_female TEXT NOT NULL,
    front_shiny TEXT NOT NULL,
    front_shiny_female TEXT NOT NULL
);
COMMENT ON TABLE pokemon_sprites_other_home IS 'Original model name - PokemonSpritesOtherHome.';
COMMENT ON COLUMN pokemon_sprites_other_home.front_default IS 'The URL of the default Pokémon HOME front image, or null if unavailable.';
COMMENT ON COLUMN pokemon_sprites_other_home.front_female IS 'The URL of the female Pokémon HOME front image, or null if unavailable.';
COMMENT ON COLUMN pokemon_sprites_other_home.front_shiny IS 'The URL of the shiny Pokémon HOME front image, or null if unavailable.';
COMMENT ON COLUMN pokemon_sprites_other_home.front_shiny_female IS 'The URL of the shiny female Pokémon HOME front image, or null if unavailable.';

--
-- Table 'pokemon_sprites_other_official_artwork' generated from model 'PokemonSpritesOtherOfficialArtwork'
--
CREATE TABLE IF NOT EXISTS pokemon_sprites_other_official_artwork (
    front_default TEXT NOT NULL,
    front_shiny TEXT NOT NULL,
    versions JSON DEFAULT NULL
);
COMMENT ON TABLE pokemon_sprites_other_official_artwork IS 'Original model name - PokemonSpritesOtherOfficialArtwork.';
COMMENT ON COLUMN pokemon_sprites_other_official_artwork.front_default IS 'The URL of the default front official artwork, or null if unavailable.';
COMMENT ON COLUMN pokemon_sprites_other_official_artwork.front_shiny IS 'The URL of the shiny front official artwork, or null if unavailable.';
COMMENT ON COLUMN pokemon_sprites_other_official_artwork.versions IS 'Additional official artwork grouped by version. Available keys vary by resource.';

--
-- Table 'pokemon_sprites_other_showdown' generated from model 'PokemonSpritesOtherShowdown'
--
CREATE TABLE IF NOT EXISTS pokemon_sprites_other_showdown (
    front_default TEXT NOT NULL,
    front_female TEXT NOT NULL,
    front_shiny TEXT NOT NULL,
    front_shiny_female TEXT NOT NULL,
    back_default TEXT NOT NULL,
    back_female TEXT NOT NULL,
    back_shiny TEXT NOT NULL,
    back_shiny_female TEXT NOT NULL
);
COMMENT ON TABLE pokemon_sprites_other_showdown IS 'Original model name - PokemonSpritesOtherShowdown.';
COMMENT ON COLUMN pokemon_sprites_other_showdown.front_default IS 'The URL of the default Pokémon Showdown front image, or null if unavailable.';
COMMENT ON COLUMN pokemon_sprites_other_showdown.front_female IS 'The URL of the female Pokémon Showdown front image, or null if unavailable.';
COMMENT ON COLUMN pokemon_sprites_other_showdown.front_shiny IS 'The URL of the shiny Pokémon Showdown front image, or null if unavailable.';
COMMENT ON COLUMN pokemon_sprites_other_showdown.front_shiny_female IS 'The URL of the shiny female Pokémon Showdown front image, or null if unavailable.';
COMMENT ON COLUMN pokemon_sprites_other_showdown.back_default IS 'The URL of the default Pokémon Showdown back image, or null if unavailable.';
COMMENT ON COLUMN pokemon_sprites_other_showdown.back_female IS 'The URL of the female Pokémon Showdown back image, or null if unavailable.';
COMMENT ON COLUMN pokemon_sprites_other_showdown.back_shiny IS 'The URL of the shiny Pokémon Showdown back image, or null if unavailable.';
COMMENT ON COLUMN pokemon_sprites_other_showdown.back_shiny_female IS 'The URL of the shiny female Pokémon Showdown back image, or null if unavailable.';

--
-- Table 'pokemon_stat' generated from model 'PokemonStat'
--
CREATE TABLE IF NOT EXISTS pokemon_stat (
    base_stat INTEGER NOT NULL,
    effort INTEGER NOT NULL,
    stat TEXT NOT NULL
);
COMMENT ON TABLE pokemon_stat IS 'Original model name - PokemonStat.';
COMMENT ON COLUMN pokemon_stat.base_stat IS 'The base value of the stat.';
COMMENT ON COLUMN pokemon_stat.effort IS 'The effort points (EV) the Pokémon has in the stat.';
COMMENT ON COLUMN pokemon_stat.stat IS 'The stat the Pokémon has.';

--
-- Table 'pokemon_summary' generated from model 'PokemonSummary'
--
CREATE TABLE IF NOT EXISTS pokemon_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE pokemon_summary IS 'Original model name - PokemonSummary.';
COMMENT ON COLUMN pokemon_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN pokemon_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'pokemon_type' generated from model 'PokemonType'
--
CREATE TABLE IF NOT EXISTS pokemon_type (
    slot INTEGER NOT NULL,
    "type" TEXT NOT NULL
);
COMMENT ON TABLE pokemon_type IS 'Original model name - PokemonType.';
COMMENT ON COLUMN pokemon_type.slot IS 'The order the Pokémon&#39;s types are listed in.';
COMMENT ON COLUMN pokemon_type."type" IS 'The type the referenced Pokémon has.';

--
-- Table 'region_detail' generated from model 'RegionDetail'
--
CREATE TABLE IF NOT EXISTS region_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    locations JSON NOT NULL,
    main_generation TEXT NOT NULL,
    "names" JSON NOT NULL,
    pokedexes JSON NOT NULL,
    version_groups JSON NOT NULL
);
COMMENT ON TABLE region_detail IS 'Original model name - RegionDetail.';
COMMENT ON COLUMN region_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN region_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN region_detail.locations IS 'A list of locations that can be found in this region.';
COMMENT ON COLUMN region_detail.main_generation IS 'The generation this region was introduced in.';
COMMENT ON COLUMN region_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN region_detail.pokedexes IS 'A list of pokédexes that catalogue Pokémon in this region.';
COMMENT ON COLUMN region_detail.version_groups IS 'A list of version groups where this region can be visited.';

--
-- Table 'region_name' generated from model 'RegionName'
--
CREATE TABLE IF NOT EXISTS region_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE region_name IS 'Original model name - RegionName.';
COMMENT ON COLUMN region_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN region_name."language" IS 'The language this name is in.';

--
-- Table 'region_summary' generated from model 'RegionSummary'
--
CREATE TABLE IF NOT EXISTS region_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE region_summary IS 'Original model name - RegionSummary.';
COMMENT ON COLUMN region_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN region_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'stat_affecting_moves' generated from model 'StatAffectingMoves'
--
CREATE TABLE IF NOT EXISTS stat_affecting_moves (
    increase JSON NOT NULL,
    decrease JSON NOT NULL
);
COMMENT ON TABLE stat_affecting_moves IS 'Original model name - StatAffectingMoves.';
COMMENT ON COLUMN stat_affecting_moves.increase IS 'A list of moves and how they change the referenced stat.';
COMMENT ON COLUMN stat_affecting_moves.decrease IS 'A list of moves and how they change the referenced stat.';

--
-- Table 'stat_affecting_natures' generated from model 'StatAffectingNatures'
--
CREATE TABLE IF NOT EXISTS stat_affecting_natures (
    increase JSON NOT NULL,
    decrease JSON NOT NULL
);
COMMENT ON TABLE stat_affecting_natures IS 'Original model name - StatAffectingNatures.';
COMMENT ON COLUMN stat_affecting_natures.increase IS 'A list of natures and how they change the referenced stat.';
COMMENT ON COLUMN stat_affecting_natures.decrease IS 'A list of nature sand how they change the referenced stat.';

--
-- Table 'stat_detail' generated from model 'StatDetail'
--
CREATE TABLE IF NOT EXISTS stat_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    game_index INTEGER NOT NULL,
    is_battle_only BOOLEAN DEFAULT NULL,
    affecting_moves TEXT NOT NULL,
    affecting_natures TEXT NOT NULL,
    affecting_items JSON NOT NULL,
    "characteristics" JSON NOT NULL,
    move_damage_class TEXT NOT NULL,
    "names" JSON NOT NULL
);
COMMENT ON TABLE stat_detail IS 'Original model name - StatDetail.';
COMMENT ON COLUMN stat_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN stat_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN stat_detail.game_index IS 'ID the games use for this stat.';
COMMENT ON COLUMN stat_detail.is_battle_only IS 'Whether this stat only exists within a battle.';
COMMENT ON COLUMN stat_detail.affecting_moves IS 'A detail of moves which affect this stat positively or negatively.';
COMMENT ON COLUMN stat_detail.affecting_natures IS 'A detail of natures which affect this stat positively or negatively.';
COMMENT ON COLUMN stat_detail.affecting_items IS 'Items that affect this stat, such as vitamins and battle items.';
COMMENT ON COLUMN stat_detail."characteristics" IS 'A list of characteristics that are set on a Pokémon when its highest base stat is this stat.';
COMMENT ON COLUMN stat_detail.move_damage_class IS 'The class of damage this stat is directly related to.';
COMMENT ON COLUMN stat_detail."names" IS 'The name of this resource listed in different languages.';

--
-- Table 'stat_name' generated from model 'StatName'
--
CREATE TABLE IF NOT EXISTS stat_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE stat_name IS 'Original model name - StatName.';
COMMENT ON COLUMN stat_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN stat_name."language" IS 'The language this name is in.';

--
-- Table 'stat_summary' generated from model 'StatSummary'
--
CREATE TABLE IF NOT EXISTS stat_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE stat_summary IS 'Original model name - StatSummary.';
COMMENT ON COLUMN stat_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN stat_summary.url IS 'The URL of the referenced resource.';

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
COMMENT ON COLUMN super_contest_effect_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN super_contest_effect_detail.appeal IS 'The level of appeal this super contest effect has.';
COMMENT ON COLUMN super_contest_effect_detail.flavor_text_entries IS 'The flavor text of this super contest effect listed in different languages.';
COMMENT ON COLUMN super_contest_effect_detail.moves IS 'A list of moves that have the effect when used in super contests.';

--
-- Table 'super_contest_effect_flavor_text' generated from model 'SuperContestEffectFlavorText'
--
CREATE TABLE IF NOT EXISTS super_contest_effect_flavor_text (
    flavor_text VARCHAR(500) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE super_contest_effect_flavor_text IS 'Original model name - SuperContestEffectFlavorText.';
COMMENT ON COLUMN super_contest_effect_flavor_text.flavor_text IS 'The localized flavor text for an API resource in a specific language.';
COMMENT ON COLUMN super_contest_effect_flavor_text."language" IS 'The language this name is in.';

--
-- Table 'super_contest_effect_summary' generated from model 'SuperContestEffectSummary'
--
CREATE TABLE IF NOT EXISTS super_contest_effect_summary (
    url TEXT NOT NULL
);
COMMENT ON TABLE super_contest_effect_summary IS 'Original model name - SuperContestEffectSummary.';
COMMENT ON COLUMN super_contest_effect_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'type_detail' generated from model 'TypeDetail'
-- Serializer for the Type resource
--
CREATE TABLE IF NOT EXISTS type_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
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
COMMENT ON COLUMN type_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN type_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN type_detail.damage_relations IS 'A detail of how effective this type is toward others and vice versa.';
COMMENT ON COLUMN type_detail.past_damage_relations IS 'A list of details of how effective this type was toward others and vice versa in previous generations';
COMMENT ON COLUMN type_detail.game_indices IS 'A list of game indices relevent to this item by generation.';
COMMENT ON COLUMN type_detail.generation IS 'The generation this type was introduced in.';
COMMENT ON COLUMN type_detail.move_damage_class IS 'The class of damage inflicted by this type.';
COMMENT ON COLUMN type_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN type_detail.pokemon IS 'A list of details of Pokémon that have this type.';
COMMENT ON COLUMN type_detail.moves IS 'A list of moves that have this type.';
COMMENT ON COLUMN type_detail.sprites IS 'Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.';

--
-- Table 'type_game_index' generated from model 'TypeGameIndex'
--
CREATE TABLE IF NOT EXISTS type_game_index (
    game_index INTEGER NOT NULL,
    generation TEXT NOT NULL
);
COMMENT ON TABLE type_game_index IS 'Original model name - TypeGameIndex.';
COMMENT ON COLUMN type_game_index.game_index IS 'The internal id of an API resource within game data.';
COMMENT ON COLUMN type_game_index.generation IS 'The generation relevent to this game index.';

--
-- Table 'type_game_sprite' generated from model 'TypeGameSprite'
--
CREATE TABLE IF NOT EXISTS type_game_sprite (
    name_icon TEXT DEFAULT NULL,
    symbol_icon TEXT DEFAULT NULL
);
COMMENT ON TABLE type_game_sprite IS 'Original model name - TypeGameSprite.';
COMMENT ON COLUMN type_game_sprite.name_icon IS 'The URL of the icon displaying the type name in this game, or null if unavailable.';
COMMENT ON COLUMN type_game_sprite.symbol_icon IS 'The URL of the type symbol icon in this game, or null if unavailable.';

--
-- Table 'type_name' generated from model 'TypeName'
--
CREATE TABLE IF NOT EXISTS type_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE type_name IS 'Original model name - TypeName.';
COMMENT ON COLUMN type_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN type_name."language" IS 'The language this name is in.';

--
-- Table 'type_past_relationships' generated from model 'TypePastRelationships'
--
CREATE TABLE IF NOT EXISTS type_past_relationships (
    generation TEXT NOT NULL,
    damage_relations TEXT NOT NULL
);
COMMENT ON TABLE type_past_relationships IS 'Original model name - TypePastRelationships.';
COMMENT ON COLUMN type_past_relationships.generation IS 'The last generation in which the referenced type had the listed damage relations';
COMMENT ON COLUMN type_past_relationships.damage_relations IS 'The damage relations the referenced type had up to and including the listed generation';

--
-- Table 'type_pokemon' generated from model 'TypePokemon'
--
CREATE TABLE IF NOT EXISTS type_pokemon (
    slot INTEGER NOT NULL,
    pokemon TEXT NOT NULL
);
COMMENT ON TABLE type_pokemon IS 'Original model name - TypePokemon.';
COMMENT ON COLUMN type_pokemon.slot IS 'The order the Pokémon&#39;s types are listed in.';
COMMENT ON COLUMN type_pokemon.pokemon IS 'The Pokémon that has the referenced type.';

--
-- Table 'type_relationships' generated from model 'TypeRelationships'
--
CREATE TABLE IF NOT EXISTS type_relationships (
    no_damage_to JSON NOT NULL,
    half_damage_to JSON NOT NULL,
    double_damage_to JSON NOT NULL,
    no_damage_from JSON NOT NULL,
    half_damage_from JSON NOT NULL,
    double_damage_from JSON NOT NULL
);
COMMENT ON TABLE type_relationships IS 'Original model name - TypeRelationships.';
COMMENT ON COLUMN type_relationships.no_damage_to IS 'A list of types this type has no effect on.';
COMMENT ON COLUMN type_relationships.half_damage_to IS 'A list of types this type is not very effect against.';
COMMENT ON COLUMN type_relationships.double_damage_to IS 'A list of types this type is very effect against.';
COMMENT ON COLUMN type_relationships.no_damage_from IS 'A list of types that have no effect on this type.';
COMMENT ON COLUMN type_relationships.half_damage_from IS 'A list of types that are not very effective against this type.';
COMMENT ON COLUMN type_relationships.double_damage_from IS 'A list of types that are very effective against this type.';

--
-- Table 'type_summary' generated from model 'TypeSummary'
--
CREATE TABLE IF NOT EXISTS type_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE type_summary IS 'Original model name - TypeSummary.';
COMMENT ON COLUMN type_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN type_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'version_detail' generated from model 'VersionDetail'
-- Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink
--
CREATE TABLE IF NOT EXISTS version_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    "names" JSON NOT NULL,
    version_group TEXT NOT NULL
);
COMMENT ON TABLE version_detail IS 'Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink. Original model name - VersionDetail.';
COMMENT ON COLUMN version_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN version_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN version_detail."names" IS 'The name of this resource listed in different languages.';
COMMENT ON COLUMN version_detail.version_group IS 'The version group this version belongs to.';

--
-- Table 'version_group_detail' generated from model 'VersionGroupDetail'
--
CREATE TABLE IF NOT EXISTS version_group_detail (
    "id" INTEGER NOT NULL,
    "name" VARCHAR(200) NOT NULL,
    "order" INTEGER DEFAULT NULL,
    generation TEXT NOT NULL,
    move_learn_methods JSON NOT NULL,
    pokedexes JSON NOT NULL,
    regions JSON NOT NULL,
    versions JSON NOT NULL
);
COMMENT ON TABLE version_group_detail IS 'Original model name - VersionGroupDetail.';
COMMENT ON COLUMN version_group_detail."id" IS 'The identifier for this resource.';
COMMENT ON COLUMN version_group_detail."name" IS 'The name for this resource.';
COMMENT ON COLUMN version_group_detail."order" IS 'Order for sorting. Almost by date of release, except similar versions are grouped together.';
COMMENT ON COLUMN version_group_detail.generation IS 'The generation this version was introduced in.';
COMMENT ON COLUMN version_group_detail.move_learn_methods IS 'A list of methods in which Pokémon can learn moves in this version group.';
COMMENT ON COLUMN version_group_detail.pokedexes IS 'A list of Pokédexes introduces in this version group.';
COMMENT ON COLUMN version_group_detail.regions IS 'A list of regions that can be visited in this version group.';
COMMENT ON COLUMN version_group_detail.versions IS 'The versions this version group owns.';

--
-- Table 'version_group_summary' generated from model 'VersionGroupSummary'
--
CREATE TABLE IF NOT EXISTS version_group_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE version_group_summary IS 'Original model name - VersionGroupSummary.';
COMMENT ON COLUMN version_group_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN version_group_summary.url IS 'The URL of the referenced resource.';

--
-- Table 'version_name' generated from model 'VersionName'
--
CREATE TABLE IF NOT EXISTS version_name (
    "name" VARCHAR(200) NOT NULL,
    "language" TEXT NOT NULL
);
COMMENT ON TABLE version_name IS 'Original model name - VersionName.';
COMMENT ON COLUMN version_name."name" IS 'The localized name for an API resource in a specific language.';
COMMENT ON COLUMN version_name."language" IS 'The language this name is in.';

--
-- Table 'version_summary' generated from model 'VersionSummary'
--
CREATE TABLE IF NOT EXISTS version_summary (
    "name" VARCHAR(200) NOT NULL,
    url TEXT NOT NULL
);
COMMENT ON TABLE version_summary IS 'Original model name - VersionSummary.';
COMMENT ON COLUMN version_summary."name" IS 'The name of the referenced resource.';
COMMENT ON COLUMN version_summary.url IS 'The URL of the referenced resource.';

