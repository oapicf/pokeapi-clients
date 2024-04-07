package = "openapiclient"
version = "1.0.0-1"
source = {
	url = "https://github.com/oapicf/pokeapi-clients.git"
}

description = {
	summary = "API client generated by OpenAPI Generator",
	detailed = [[
No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)]],
	homepage = "https://openapi-generator.tech",
	license = "Unlicense",
	maintainer = "OpenAPI Generator contributors",
}

dependencies = {
	"lua >= 5.2",
	"http",
	"dkjson",
	"basexx"
}

build = {
	type = "builtin",
	modules = {
		["openapiclient.api.ability_api"] = "openapiclient/api/ability_api.lua";
		["openapiclient.api.berry_api"] = "openapiclient/api/berry_api.lua";
		["openapiclient.api.berry_firmness_api"] = "openapiclient/api/berry_firmness_api.lua";
		["openapiclient.api.berry_flavor_api"] = "openapiclient/api/berry_flavor_api.lua";
		["openapiclient.api.characteristic_api"] = "openapiclient/api/characteristic_api.lua";
		["openapiclient.api.contest_effect_api"] = "openapiclient/api/contest_effect_api.lua";
		["openapiclient.api.contest_type_api"] = "openapiclient/api/contest_type_api.lua";
		["openapiclient.api.egg_group_api"] = "openapiclient/api/egg_group_api.lua";
		["openapiclient.api.encounter_condition_api"] = "openapiclient/api/encounter_condition_api.lua";
		["openapiclient.api.encounter_condition_value_api"] = "openapiclient/api/encounter_condition_value_api.lua";
		["openapiclient.api.encounter_method_api"] = "openapiclient/api/encounter_method_api.lua";
		["openapiclient.api.evolution_chain_api"] = "openapiclient/api/evolution_chain_api.lua";
		["openapiclient.api.evolution_trigger_api"] = "openapiclient/api/evolution_trigger_api.lua";
		["openapiclient.api.gender_api"] = "openapiclient/api/gender_api.lua";
		["openapiclient.api.generation_api"] = "openapiclient/api/generation_api.lua";
		["openapiclient.api.growth_rate_api"] = "openapiclient/api/growth_rate_api.lua";
		["openapiclient.api.item_api"] = "openapiclient/api/item_api.lua";
		["openapiclient.api.item_attribute_api"] = "openapiclient/api/item_attribute_api.lua";
		["openapiclient.api.item_category_api"] = "openapiclient/api/item_category_api.lua";
		["openapiclient.api.item_fling_effect_api"] = "openapiclient/api/item_fling_effect_api.lua";
		["openapiclient.api.item_pocket_api"] = "openapiclient/api/item_pocket_api.lua";
		["openapiclient.api.language_api"] = "openapiclient/api/language_api.lua";
		["openapiclient.api.location_api"] = "openapiclient/api/location_api.lua";
		["openapiclient.api.location_area_api"] = "openapiclient/api/location_area_api.lua";
		["openapiclient.api.machine_api"] = "openapiclient/api/machine_api.lua";
		["openapiclient.api.move_api"] = "openapiclient/api/move_api.lua";
		["openapiclient.api.move_ailment_api"] = "openapiclient/api/move_ailment_api.lua";
		["openapiclient.api.move_battle_style_api"] = "openapiclient/api/move_battle_style_api.lua";
		["openapiclient.api.move_category_api"] = "openapiclient/api/move_category_api.lua";
		["openapiclient.api.move_damage_class_api"] = "openapiclient/api/move_damage_class_api.lua";
		["openapiclient.api.move_learn_method_api"] = "openapiclient/api/move_learn_method_api.lua";
		["openapiclient.api.move_target_api"] = "openapiclient/api/move_target_api.lua";
		["openapiclient.api.nature_api"] = "openapiclient/api/nature_api.lua";
		["openapiclient.api.pal_park_area_api"] = "openapiclient/api/pal_park_area_api.lua";
		["openapiclient.api.pokeathlon_stat_api"] = "openapiclient/api/pokeathlon_stat_api.lua";
		["openapiclient.api.pokedex_api"] = "openapiclient/api/pokedex_api.lua";
		["openapiclient.api.pokemon_api"] = "openapiclient/api/pokemon_api.lua";
		["openapiclient.api.pokemon_color_api"] = "openapiclient/api/pokemon_color_api.lua";
		["openapiclient.api.pokemon_form_api"] = "openapiclient/api/pokemon_form_api.lua";
		["openapiclient.api.pokemon_habitat_api"] = "openapiclient/api/pokemon_habitat_api.lua";
		["openapiclient.api.pokemon_shape_api"] = "openapiclient/api/pokemon_shape_api.lua";
		["openapiclient.api.pokemon_species_api"] = "openapiclient/api/pokemon_species_api.lua";
		["openapiclient.api.region_api"] = "openapiclient/api/region_api.lua";
		["openapiclient.api.stat_api"] = "openapiclient/api/stat_api.lua";
		["openapiclient.api.super_contest_effect_api"] = "openapiclient/api/super_contest_effect_api.lua";
		["openapiclient.api.type_api"] = "openapiclient/api/type_api.lua";
		["openapiclient.api.version_api"] = "openapiclient/api/version_api.lua";
		["openapiclient.api.version_group_api"] = "openapiclient/api/version_group_api.lua";
	}
}