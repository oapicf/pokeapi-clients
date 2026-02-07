cmake_minimum_required (VERSION 2.6...3.10.2)
project (CGenerator C)

cmake_policy(SET CMP0063 NEW)

set(CMAKE_C_VISIBILITY_PRESET default)
set(CMAKE_VISIBILITY_INLINES_HIDDEN OFF)
set(CMAKE_WINDOWS_EXPORT_ALL_SYMBOLS ON)
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Werror=implicit-function-declaration")
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Werror=missing-declarations")
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Werror=int-conversion")

option(BUILD_SHARED_LIBS "Build using shared libraries" ON)

find_package(OpenSSL)

if (OPENSSL_FOUND)
    set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -DOPENSSL")
    if(CMAKE_VERSION VERSION_LESS 3.4)
        include_directories(${OPENSSL_INCLUDE_DIR})
        include_directories(${OPENSSL_INCLUDE_DIRS})
        link_directories(${OPENSSL_LIBRARIES})
    endif()
endif()

set(pkgName "pokapi")

# this default version can be overridden in PreTarget.cmake
set(PROJECT_VERSION_MAJOR 0)
set(PROJECT_VERSION_MINOR 0)
set(PROJECT_VERSION_PATCH 1)

if( (DEFINED CURL_INCLUDE_DIR) AND (DEFINED CURL_LIBRARIES))
    include_directories(${CURL_INCLUDE_DIR})
    set(PLATFORM_LIBRARIES ${PLATFORM_LIBRARIES} ${CURL_LIBRARIES} )
else()
    find_package(CURL 7.58.0 REQUIRED)
    if(CURL_FOUND)
        include_directories(${CURL_INCLUDE_DIR})
        set(PLATFORM_LIBRARIES ${PLATFORM_LIBRARIES} ${CURL_LIBRARIES} )
    endif()
endif()

set(SRCS
    src/list.c
    src/apiKey.c
    src/apiClient.c
    src/binary.c
    external/cJSON.c
    model/object.c
    model/ability_change.c
    model/ability_change_effect_text.c
    model/ability_detail.c
    model/ability_detail_pokemon_inner.c
    model/ability_detail_pokemon_inner_pokemon.c
    model/ability_effect_text.c
    model/ability_flavor_text.c
    model/ability_name.c
    model/ability_summary.c
    model/berry_detail.c
    model/berry_detail_flavors_inner.c
    model/berry_detail_flavors_inner_flavor.c
    model/berry_firmness_detail.c
    model/berry_firmness_name.c
    model/berry_firmness_summary.c
    model/berry_flavor_detail.c
    model/berry_flavor_detail_berries_inner.c
    model/berry_flavor_detail_berries_inner_berry.c
    model/berry_flavor_name.c
    model/berry_flavor_summary.c
    model/berry_summary.c
    model/characteristic_description.c
    model/characteristic_detail.c
    model/characteristic_summary.c
    model/contest_effect_detail.c
    model/contest_effect_effect_text.c
    model/contest_effect_flavor_text.c
    model/contest_effect_summary.c
    model/contest_type_detail.c
    model/contest_type_name.c
    model/contest_type_summary.c
    model/egg_group_detail.c
    model/egg_group_detail_pokemon_species_inner.c
    model/egg_group_name.c
    model/egg_group_summary.c
    model/encounter_condition_detail.c
    model/encounter_condition_name.c
    model/encounter_condition_summary.c
    model/encounter_condition_value_detail.c
    model/encounter_condition_value_name.c
    model/encounter_condition_value_summary.c
    model/encounter_method_detail.c
    model/encounter_method_name.c
    model/encounter_method_summary.c
    model/evolution_chain_detail.c
    model/evolution_chain_detail_chain.c
    model/evolution_chain_detail_chain_evolves_to_inner.c
    model/evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner.c
    model/evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender.c
    model/evolution_chain_summary.c
    model/evolution_trigger_detail.c
    model/evolution_trigger_name.c
    model/evolution_trigger_summary.c
    model/experience.c
    model/gender_detail.c
    model/gender_detail_pokemon_species_details_inner.c
    model/gender_summary.c
    model/generation_detail.c
    model/generation_name.c
    model/generation_summary.c
    model/growth_rate_description.c
    model/growth_rate_detail.c
    model/growth_rate_summary.c
    model/item_attribute_description.c
    model/item_attribute_detail.c
    model/item_attribute_name.c
    model/item_attribute_summary.c
    model/item_category_detail.c
    model/item_category_name.c
    model/item_category_summary.c
    model/item_detail.c
    model/item_detail_baby_trigger_for.c
    model/item_detail_held_by_pokemon_inner.c
    model/item_detail_held_by_pokemon_inner_version_details_inner.c
    model/item_detail_machines_inner.c
    model/item_detail_sprites.c
    model/item_effect_text.c
    model/item_flavor_text.c
    model/item_fling_effect_detail.c
    model/item_fling_effect_effect_text.c
    model/item_fling_effect_summary.c
    model/item_game_index.c
    model/item_name.c
    model/item_pocket_detail.c
    model/item_pocket_name.c
    model/item_pocket_summary.c
    model/item_summary.c
    model/language_detail.c
    model/language_name.c
    model/language_summary.c
    model/location_area_detail.c
    model/location_area_detail_encounter_method_rates_inner.c
    model/location_area_detail_encounter_method_rates_inner_version_details_inner.c
    model/location_area_detail_pokemon_encounters_inner.c
    model/location_area_detail_pokemon_encounters_inner_version_details_inner.c
    model/location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details.c
    model/location_area_name.c
    model/location_area_summary.c
    model/location_detail.c
    model/location_game_index.c
    model/location_name.c
    model/location_summary.c
    model/machine_detail.c
    model/machine_summary.c
    model/move_battle_style_detail.c
    model/move_battle_style_name.c
    model/move_battle_style_summary.c
    model/move_change.c
    model/move_change_effect_entries_inner.c
    model/move_damage_class_description.c
    model/move_damage_class_detail.c
    model/move_damage_class_name.c
    model/move_damage_class_summary.c
    model/move_detail.c
    model/move_detail_contest_combos.c
    model/move_detail_contest_combos_normal.c
    model/move_detail_effect_changes_inner.c
    model/move_detail_effect_changes_inner_effect_entries_inner.c
    model/move_detail_machines_inner.c
    model/move_detail_machines_inner_machine.c
    model/move_detail_stat_changes_inner.c
    model/move_flavor_text.c
    model/move_learn_method_description.c
    model/move_learn_method_detail.c
    model/move_learn_method_name.c
    model/move_learn_method_summary.c
    model/move_meta.c
    model/move_meta_ailment_detail.c
    model/move_meta_ailment_name.c
    model/move_meta_ailment_summary.c
    model/move_meta_category_description.c
    model/move_meta_category_detail.c
    model/move_meta_category_summary.c
    model/move_name.c
    model/move_summary.c
    model/move_target_description.c
    model/move_target_detail.c
    model/move_target_name.c
    model/move_target_summary.c
    model/nature_battle_style_preference.c
    model/nature_detail.c
    model/nature_detail_pokeathlon_stat_changes_inner.c
    model/nature_name.c
    model/nature_summary.c
    model/paginated_ability_summary_list.c
    model/paginated_berry_firmness_summary_list.c
    model/paginated_berry_flavor_summary_list.c
    model/paginated_berry_summary_list.c
    model/paginated_characteristic_summary_list.c
    model/paginated_contest_effect_summary_list.c
    model/paginated_contest_type_summary_list.c
    model/paginated_egg_group_summary_list.c
    model/paginated_encounter_condition_summary_list.c
    model/paginated_encounter_condition_value_summary_list.c
    model/paginated_encounter_method_summary_list.c
    model/paginated_evolution_chain_summary_list.c
    model/paginated_evolution_trigger_summary_list.c
    model/paginated_gender_summary_list.c
    model/paginated_generation_summary_list.c
    model/paginated_growth_rate_summary_list.c
    model/paginated_item_attribute_summary_list.c
    model/paginated_item_category_summary_list.c
    model/paginated_item_fling_effect_summary_list.c
    model/paginated_item_pocket_summary_list.c
    model/paginated_item_summary_list.c
    model/paginated_language_summary_list.c
    model/paginated_location_area_summary_list.c
    model/paginated_location_summary_list.c
    model/paginated_machine_summary_list.c
    model/paginated_move_battle_style_summary_list.c
    model/paginated_move_damage_class_summary_list.c
    model/paginated_move_learn_method_summary_list.c
    model/paginated_move_meta_ailment_summary_list.c
    model/paginated_move_meta_category_summary_list.c
    model/paginated_move_summary_list.c
    model/paginated_move_target_summary_list.c
    model/paginated_nature_summary_list.c
    model/paginated_pal_park_area_summary_list.c
    model/paginated_pokeathlon_stat_summary_list.c
    model/paginated_pokedex_summary_list.c
    model/paginated_pokemon_color_summary_list.c
    model/paginated_pokemon_form_summary_list.c
    model/paginated_pokemon_habitat_summary_list.c
    model/paginated_pokemon_shape_summary_list.c
    model/paginated_pokemon_species_summary_list.c
    model/paginated_pokemon_summary_list.c
    model/paginated_region_summary_list.c
    model/paginated_stat_summary_list.c
    model/paginated_super_contest_effect_summary_list.c
    model/paginated_type_summary_list.c
    model/paginated_version_group_summary_list.c
    model/paginated_version_summary_list.c
    model/pal_park_area_detail.c
    model/pal_park_area_detail_pokemon_encounters_inner.c
    model/pal_park_area_name.c
    model/pal_park_area_summary.c
    model/pokeathlon_stat_detail.c
    model/pokeathlon_stat_detail_affecting_natures.c
    model/pokeathlon_stat_detail_affecting_natures_decrease_inner.c
    model/pokeathlon_stat_detail_affecting_natures_increase_inner.c
    model/pokeathlon_stat_name.c
    model/pokeathlon_stat_summary.c
    model/pokedex_description.c
    model/pokedex_detail.c
    model/pokedex_detail_pokemon_entries_inner.c
    model/pokedex_name.c
    model/pokedex_summary.c
    model/pokemon_color_detail.c
    model/pokemon_color_name.c
    model/pokemon_color_summary.c
    model/pokemon_detail.c
    model/pokemon_detail_abilities_inner.c
    model/pokemon_detail_cries.c
    model/pokemon_detail_held_items.c
    model/pokemon_detail_moves_inner.c
    model/pokemon_detail_moves_inner_version_group_details_inner.c
    model/pokemon_detail_past_abilities_inner.c
    model/pokemon_detail_past_types_inner.c
    model/pokemon_detail_sprites.c
    model/pokemon_detail_types_inner.c
    model/pokemon_dex_entry.c
    model/pokemon_encounters_retrieve_200_response_inner.c
    model/pokemon_encounters_retrieve_200_response_inner_location_area.c
    model/pokemon_encounters_retrieve_200_response_inner_version_details_inner.c
    model/pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner.c
    model/pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner.c
    model/pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method.c
    model/pokemon_encounters_retrieve_200_response_inner_version_details_inner_version.c
    model/pokemon_form_detail.c
    model/pokemon_form_detail_form_names_inner.c
    model/pokemon_form_detail_sprites.c
    model/pokemon_form_summary.c
    model/pokemon_game_index.c
    model/pokemon_habitat_detail.c
    model/pokemon_habitat_name.c
    model/pokemon_habitat_summary.c
    model/pokemon_shape_detail.c
    model/pokemon_shape_detail_awesome_names_inner.c
    model/pokemon_shape_detail_names_inner.c
    model/pokemon_shape_summary.c
    model/pokemon_species_description.c
    model/pokemon_species_detail.c
    model/pokemon_species_detail_genera_inner.c
    model/pokemon_species_detail_pal_park_encounters_inner.c
    model/pokemon_species_detail_varieties_inner.c
    model/pokemon_species_flavor_text.c
    model/pokemon_species_summary.c
    model/pokemon_stat.c
    model/pokemon_summary.c
    model/region_detail.c
    model/region_name.c
    model/region_summary.c
    model/stat_detail.c
    model/stat_detail_affecting_moves.c
    model/stat_detail_affecting_moves_increase_inner.c
    model/stat_detail_affecting_natures.c
    model/stat_name.c
    model/stat_summary.c
    model/super_contest_effect_detail.c
    model/super_contest_effect_flavor_text.c
    model/super_contest_effect_summary.c
    model/type_detail.c
    model/type_detail_damage_relations.c
    model/type_detail_past_damage_relations_inner.c
    model/type_detail_past_damage_relations_inner_damage_relations.c
    model/type_detail_pokemon_inner.c
    model/type_detail_pokemon_inner_pokemon.c
    model/type_detail_sprites_value_value.c
    model/type_game_index.c
    model/type_summary.c
    model/version_detail.c
    model/version_group_detail.c
    model/version_group_summary.c
    model/version_name.c
    model/version_summary.c
    api/BerriesAPI.c
    api/ContestsAPI.c
    api/EncountersAPI.c
    api/EvolutionAPI.c
    api/GamesAPI.c
    api/ItemsAPI.c
    api/LocationAPI.c
    api/MachinesAPI.c
    api/MovesAPI.c
    api/PokemonAPI.c
    api/UtilityAPI.c

)

set(HDRS
    include/apiClient.h
    include/list.h
    include/binary.h
    include/keyValuePair.h
    external/cJSON.h
    model/object.h
    model/any_type.h
    model/ability_change.h
    model/ability_change_effect_text.h
    model/ability_detail.h
    model/ability_detail_pokemon_inner.h
    model/ability_detail_pokemon_inner_pokemon.h
    model/ability_effect_text.h
    model/ability_flavor_text.h
    model/ability_name.h
    model/ability_summary.h
    model/berry_detail.h
    model/berry_detail_flavors_inner.h
    model/berry_detail_flavors_inner_flavor.h
    model/berry_firmness_detail.h
    model/berry_firmness_name.h
    model/berry_firmness_summary.h
    model/berry_flavor_detail.h
    model/berry_flavor_detail_berries_inner.h
    model/berry_flavor_detail_berries_inner_berry.h
    model/berry_flavor_name.h
    model/berry_flavor_summary.h
    model/berry_summary.h
    model/characteristic_description.h
    model/characteristic_detail.h
    model/characteristic_summary.h
    model/contest_effect_detail.h
    model/contest_effect_effect_text.h
    model/contest_effect_flavor_text.h
    model/contest_effect_summary.h
    model/contest_type_detail.h
    model/contest_type_name.h
    model/contest_type_summary.h
    model/egg_group_detail.h
    model/egg_group_detail_pokemon_species_inner.h
    model/egg_group_name.h
    model/egg_group_summary.h
    model/encounter_condition_detail.h
    model/encounter_condition_name.h
    model/encounter_condition_summary.h
    model/encounter_condition_value_detail.h
    model/encounter_condition_value_name.h
    model/encounter_condition_value_summary.h
    model/encounter_method_detail.h
    model/encounter_method_name.h
    model/encounter_method_summary.h
    model/evolution_chain_detail.h
    model/evolution_chain_detail_chain.h
    model/evolution_chain_detail_chain_evolves_to_inner.h
    model/evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner.h
    model/evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender.h
    model/evolution_chain_summary.h
    model/evolution_trigger_detail.h
    model/evolution_trigger_name.h
    model/evolution_trigger_summary.h
    model/experience.h
    model/gender_detail.h
    model/gender_detail_pokemon_species_details_inner.h
    model/gender_summary.h
    model/generation_detail.h
    model/generation_name.h
    model/generation_summary.h
    model/growth_rate_description.h
    model/growth_rate_detail.h
    model/growth_rate_summary.h
    model/item_attribute_description.h
    model/item_attribute_detail.h
    model/item_attribute_name.h
    model/item_attribute_summary.h
    model/item_category_detail.h
    model/item_category_name.h
    model/item_category_summary.h
    model/item_detail.h
    model/item_detail_baby_trigger_for.h
    model/item_detail_held_by_pokemon_inner.h
    model/item_detail_held_by_pokemon_inner_version_details_inner.h
    model/item_detail_machines_inner.h
    model/item_detail_sprites.h
    model/item_effect_text.h
    model/item_flavor_text.h
    model/item_fling_effect_detail.h
    model/item_fling_effect_effect_text.h
    model/item_fling_effect_summary.h
    model/item_game_index.h
    model/item_name.h
    model/item_pocket_detail.h
    model/item_pocket_name.h
    model/item_pocket_summary.h
    model/item_summary.h
    model/language_detail.h
    model/language_name.h
    model/language_summary.h
    model/location_area_detail.h
    model/location_area_detail_encounter_method_rates_inner.h
    model/location_area_detail_encounter_method_rates_inner_version_details_inner.h
    model/location_area_detail_pokemon_encounters_inner.h
    model/location_area_detail_pokemon_encounters_inner_version_details_inner.h
    model/location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details.h
    model/location_area_name.h
    model/location_area_summary.h
    model/location_detail.h
    model/location_game_index.h
    model/location_name.h
    model/location_summary.h
    model/machine_detail.h
    model/machine_summary.h
    model/move_battle_style_detail.h
    model/move_battle_style_name.h
    model/move_battle_style_summary.h
    model/move_change.h
    model/move_change_effect_entries_inner.h
    model/move_damage_class_description.h
    model/move_damage_class_detail.h
    model/move_damage_class_name.h
    model/move_damage_class_summary.h
    model/move_detail.h
    model/move_detail_contest_combos.h
    model/move_detail_contest_combos_normal.h
    model/move_detail_effect_changes_inner.h
    model/move_detail_effect_changes_inner_effect_entries_inner.h
    model/move_detail_machines_inner.h
    model/move_detail_machines_inner_machine.h
    model/move_detail_stat_changes_inner.h
    model/move_flavor_text.h
    model/move_learn_method_description.h
    model/move_learn_method_detail.h
    model/move_learn_method_name.h
    model/move_learn_method_summary.h
    model/move_meta.h
    model/move_meta_ailment_detail.h
    model/move_meta_ailment_name.h
    model/move_meta_ailment_summary.h
    model/move_meta_category_description.h
    model/move_meta_category_detail.h
    model/move_meta_category_summary.h
    model/move_name.h
    model/move_summary.h
    model/move_target_description.h
    model/move_target_detail.h
    model/move_target_name.h
    model/move_target_summary.h
    model/nature_battle_style_preference.h
    model/nature_detail.h
    model/nature_detail_pokeathlon_stat_changes_inner.h
    model/nature_name.h
    model/nature_summary.h
    model/paginated_ability_summary_list.h
    model/paginated_berry_firmness_summary_list.h
    model/paginated_berry_flavor_summary_list.h
    model/paginated_berry_summary_list.h
    model/paginated_characteristic_summary_list.h
    model/paginated_contest_effect_summary_list.h
    model/paginated_contest_type_summary_list.h
    model/paginated_egg_group_summary_list.h
    model/paginated_encounter_condition_summary_list.h
    model/paginated_encounter_condition_value_summary_list.h
    model/paginated_encounter_method_summary_list.h
    model/paginated_evolution_chain_summary_list.h
    model/paginated_evolution_trigger_summary_list.h
    model/paginated_gender_summary_list.h
    model/paginated_generation_summary_list.h
    model/paginated_growth_rate_summary_list.h
    model/paginated_item_attribute_summary_list.h
    model/paginated_item_category_summary_list.h
    model/paginated_item_fling_effect_summary_list.h
    model/paginated_item_pocket_summary_list.h
    model/paginated_item_summary_list.h
    model/paginated_language_summary_list.h
    model/paginated_location_area_summary_list.h
    model/paginated_location_summary_list.h
    model/paginated_machine_summary_list.h
    model/paginated_move_battle_style_summary_list.h
    model/paginated_move_damage_class_summary_list.h
    model/paginated_move_learn_method_summary_list.h
    model/paginated_move_meta_ailment_summary_list.h
    model/paginated_move_meta_category_summary_list.h
    model/paginated_move_summary_list.h
    model/paginated_move_target_summary_list.h
    model/paginated_nature_summary_list.h
    model/paginated_pal_park_area_summary_list.h
    model/paginated_pokeathlon_stat_summary_list.h
    model/paginated_pokedex_summary_list.h
    model/paginated_pokemon_color_summary_list.h
    model/paginated_pokemon_form_summary_list.h
    model/paginated_pokemon_habitat_summary_list.h
    model/paginated_pokemon_shape_summary_list.h
    model/paginated_pokemon_species_summary_list.h
    model/paginated_pokemon_summary_list.h
    model/paginated_region_summary_list.h
    model/paginated_stat_summary_list.h
    model/paginated_super_contest_effect_summary_list.h
    model/paginated_type_summary_list.h
    model/paginated_version_group_summary_list.h
    model/paginated_version_summary_list.h
    model/pal_park_area_detail.h
    model/pal_park_area_detail_pokemon_encounters_inner.h
    model/pal_park_area_name.h
    model/pal_park_area_summary.h
    model/pokeathlon_stat_detail.h
    model/pokeathlon_stat_detail_affecting_natures.h
    model/pokeathlon_stat_detail_affecting_natures_decrease_inner.h
    model/pokeathlon_stat_detail_affecting_natures_increase_inner.h
    model/pokeathlon_stat_name.h
    model/pokeathlon_stat_summary.h
    model/pokedex_description.h
    model/pokedex_detail.h
    model/pokedex_detail_pokemon_entries_inner.h
    model/pokedex_name.h
    model/pokedex_summary.h
    model/pokemon_color_detail.h
    model/pokemon_color_name.h
    model/pokemon_color_summary.h
    model/pokemon_detail.h
    model/pokemon_detail_abilities_inner.h
    model/pokemon_detail_cries.h
    model/pokemon_detail_held_items.h
    model/pokemon_detail_moves_inner.h
    model/pokemon_detail_moves_inner_version_group_details_inner.h
    model/pokemon_detail_past_abilities_inner.h
    model/pokemon_detail_past_types_inner.h
    model/pokemon_detail_sprites.h
    model/pokemon_detail_types_inner.h
    model/pokemon_dex_entry.h
    model/pokemon_encounters_retrieve_200_response_inner.h
    model/pokemon_encounters_retrieve_200_response_inner_location_area.h
    model/pokemon_encounters_retrieve_200_response_inner_version_details_inner.h
    model/pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner.h
    model/pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner.h
    model/pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method.h
    model/pokemon_encounters_retrieve_200_response_inner_version_details_inner_version.h
    model/pokemon_form_detail.h
    model/pokemon_form_detail_form_names_inner.h
    model/pokemon_form_detail_sprites.h
    model/pokemon_form_summary.h
    model/pokemon_game_index.h
    model/pokemon_habitat_detail.h
    model/pokemon_habitat_name.h
    model/pokemon_habitat_summary.h
    model/pokemon_shape_detail.h
    model/pokemon_shape_detail_awesome_names_inner.h
    model/pokemon_shape_detail_names_inner.h
    model/pokemon_shape_summary.h
    model/pokemon_species_description.h
    model/pokemon_species_detail.h
    model/pokemon_species_detail_genera_inner.h
    model/pokemon_species_detail_pal_park_encounters_inner.h
    model/pokemon_species_detail_varieties_inner.h
    model/pokemon_species_flavor_text.h
    model/pokemon_species_summary.h
    model/pokemon_stat.h
    model/pokemon_summary.h
    model/region_detail.h
    model/region_name.h
    model/region_summary.h
    model/stat_detail.h
    model/stat_detail_affecting_moves.h
    model/stat_detail_affecting_moves_increase_inner.h
    model/stat_detail_affecting_natures.h
    model/stat_name.h
    model/stat_summary.h
    model/super_contest_effect_detail.h
    model/super_contest_effect_flavor_text.h
    model/super_contest_effect_summary.h
    model/type_detail.h
    model/type_detail_damage_relations.h
    model/type_detail_past_damage_relations_inner.h
    model/type_detail_past_damage_relations_inner_damage_relations.h
    model/type_detail_pokemon_inner.h
    model/type_detail_pokemon_inner_pokemon.h
    model/type_detail_sprites_value_value.h
    model/type_game_index.h
    model/type_summary.h
    model/version_detail.h
    model/version_group_detail.h
    model/version_group_summary.h
    model/version_name.h
    model/version_summary.h
    api/BerriesAPI.h
    api/ContestsAPI.h
    api/EncountersAPI.h
    api/EvolutionAPI.h
    api/GamesAPI.h
    api/ItemsAPI.h
    api/LocationAPI.h
    api/MachinesAPI.h
    api/MovesAPI.h
    api/PokemonAPI.h
    api/UtilityAPI.h

)

include(PreTarget.cmake OPTIONAL)

set(PROJECT_VERSION_STRING "${PROJECT_VERSION_MAJOR}.${PROJECT_VERSION_MINOR}.${PROJECT_VERSION_PATCH}")

# Add library with project file with project name as library name
if(NOT BUILD_STATIC_LIBS)
  add_library(${pkgName} ${SRCS} ${HDRS})
else()
  add_library(${pkgName} STATIC ${SRCS} ${HDRS})
endif()
# Link dependent libraries
if(NOT CMAKE_VERSION VERSION_LESS 3.4)
    target_link_libraries(${pkgName} PRIVATE OpenSSL::SSL OpenSSL::Crypto)
endif()
target_link_libraries(${pkgName} PUBLIC ${CURL_LIBRARIES} )
target_include_directories(
    ${pkgName} PUBLIC $<BUILD_INTERFACE:${PROJECT_SOURCE_DIR}>
    $<INSTALL_INTERFACE:include>
)

include(PostTarget.cmake OPTIONAL)

# installation of libraries, headers, and config files
if (NOT EXISTS ${CMAKE_CURRENT_SOURCE_DIR}/Config.cmake.in)
    install(TARGETS ${pkgName} DESTINATION lib)
else()
    include(GNUInstallDirs)
    install(TARGETS ${pkgName} DESTINATION lib EXPORT ${pkgName}Targets)

    foreach(HDR_FILE ${HDRS})
        get_filename_component(HDR_DIRECTORY ${HDR_FILE} DIRECTORY)
        get_filename_component(ABSOLUTE_HDR_DIRECTORY ${HDR_DIRECTORY} ABSOLUTE)
        file(RELATIVE_PATH RELATIVE_HDR_PATH ${CMAKE_CURRENT_SOURCE_DIR} ${ABSOLUTE_HDR_DIRECTORY})
        install(FILES ${HDR_FILE} DESTINATION include/${pkgName}/${RELATIVE_HDR_PATH})
    endforeach()

    include(CMakePackageConfigHelpers)
    write_basic_package_version_file(
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}ConfigVersion.cmake"
            VERSION "${PROJECT_VERSION_STRING}"
            COMPATIBILITY AnyNewerVersion
    )

    export(EXPORT ${pkgName}Targets
            FILE "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}Targets.cmake"
            NAMESPACE ${pkgName}::
            )

    configure_file(${CMAKE_CURRENT_SOURCE_DIR}/Config.cmake.in
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}Config.cmake"
            @ONLY
            )

    set(ConfigPackageLocation lib/cmake/${pkgName})
    install(EXPORT ${pkgName}Targets
            FILE
            ${pkgName}Targets.cmake
            NAMESPACE
            ${pkgName}::
            DESTINATION
            ${ConfigPackageLocation}
            )
    install(
            FILES
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}Config.cmake"
            "${CMAKE_CURRENT_BINARY_DIR}/${pkgName}/${pkgName}ConfigVersion.cmake"
            DESTINATION
            ${ConfigPackageLocation}
    )
endif()

# make installation packages
include(Packing.cmake OPTIONAL)

# Setting file variables to null
set(SRCS "")
set(HDRS "")


## This section shows how to use the above compiled library to compile the source files
## set source files
#set(SRCS
#    unit-tests/manual-BerriesAPI.c
#    unit-tests/manual-ContestsAPI.c
#    unit-tests/manual-EncountersAPI.c
#    unit-tests/manual-EvolutionAPI.c
#    unit-tests/manual-GamesAPI.c
#    unit-tests/manual-ItemsAPI.c
#    unit-tests/manual-LocationAPI.c
#    unit-tests/manual-MachinesAPI.c
#    unit-tests/manual-MovesAPI.c
#    unit-tests/manual-PokemonAPI.c
#    unit-tests/manual-UtilityAPI.c
#)

##set header files
#set(HDRS
#)

## loop over all files in SRCS variable
#foreach(SOURCE_FILE ${SRCS})
#    # Get only the file name from the file as add_executable does not support executable with slash("/")
#    get_filename_component(FILE_NAME_ONLY ${SOURCE_FILE} NAME_WE)
#    # Remove .c from the file name and set it as executable name
#    string( REPLACE ".c" "" EXECUTABLE_FILE ${FILE_NAME_ONLY})
#    # Add executable for every source file in  SRCS
#    add_executable(unit-${EXECUTABLE_FILE} ${SOURCE_FILE})
#    # Link above created library to executable and dependent library curl
#    target_link_libraries(unit-${EXECUTABLE_FILE} ${CURL_LIBRARIES} ${pkgName} )
#endforeach(SOURCE_FILE ${SRCS})
