-module(openapi_pokemon_evolution).

-include("openapi.hrl").

-export([openapi_pokemon_evolution/0]).

-export([openapi_pokemon_evolution/1]).

-export_type([openapi_pokemon_evolution/0]).

-type openapi_pokemon_evolution() ::
  [ {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  | {'is_default', boolean() }
  | {'item', openapi_item_summary:openapi_item_summary() }
  | {'trigger', openapi_evolution_trigger_summary:openapi_evolution_trigger_summary() }
  | {'gender', integer() }
  | {'held_item', openapi_item_summary:openapi_item_summary() }
  | {'known_move', openapi_pokemon_evolution_known_move:openapi_pokemon_evolution_known_move() }
  | {'known_move_type', openapi_pokemon_evolution_known_move:openapi_pokemon_evolution_known_move() }
  | {'location', openapi_location_summary:openapi_location_summary() }
  | {'min_level', integer() }
  | {'min_happiness', integer() }
  | {'min_beauty', integer() }
  | {'min_affection', integer() }
  | {'near_special_rock', boolean() }
  | {'needs_multiplayer', boolean() }
  | {'needs_overworld_rain', boolean() }
  | {'party_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
  | {'party_type', openapi_type_summary:openapi_type_summary() }
  | {'relative_physical_stats', integer() }
  | {'time_of_day', binary() }
  | {'trade_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
  | {'turn_upside_down', boolean() }
  | {'region', openapi_region_summary:openapi_region_summary() }
  | {'required_pokemon_form', openapi_pokemon_form_summary:openapi_pokemon_form_summary() }
  | {'evolved_pokemon_form', openapi_pokemon_form_summary:openapi_pokemon_form_summary() }
  | {'used_move', openapi_move_summary:openapi_move_summary() }
  | {'min_move_count', integer() }
  | {'min_steps', integer() }
  | {'min_damage_taken', integer() }
  | {'allowed_natures', list(openapi_nature_summary:openapi_nature_summary()) }
  | {'condition_expression', openapi_evolution_condition_expression:openapi_evolution_condition_expression() }
  ].


openapi_pokemon_evolution() ->
    openapi_pokemon_evolution([]).

openapi_pokemon_evolution(Fields) ->
  Default = [ {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            , {'is_default', boolean() }
            , {'item', openapi_item_summary:openapi_item_summary() }
            , {'trigger', openapi_evolution_trigger_summary:openapi_evolution_trigger_summary() }
            , {'gender', integer() }
            , {'held_item', openapi_item_summary:openapi_item_summary() }
            , {'known_move', openapi_pokemon_evolution_known_move:openapi_pokemon_evolution_known_move() }
            , {'known_move_type', openapi_pokemon_evolution_known_move:openapi_pokemon_evolution_known_move() }
            , {'location', openapi_location_summary:openapi_location_summary() }
            , {'min_level', integer(-2147483648, 2147483647) }
            , {'min_happiness', integer(-2147483648, 2147483647) }
            , {'min_beauty', integer(-2147483648, 2147483647) }
            , {'min_affection', integer(-2147483648, 2147483647) }
            , {'near_special_rock', boolean() }
            , {'needs_multiplayer', boolean() }
            , {'needs_overworld_rain', boolean() }
            , {'party_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
            , {'party_type', openapi_type_summary:openapi_type_summary() }
            , {'relative_physical_stats', integer(-2147483648, 2147483647) }
            , {'time_of_day', binary() }
            , {'trade_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
            , {'turn_upside_down', boolean() }
            , {'region', openapi_region_summary:openapi_region_summary() }
            , {'required_pokemon_form', openapi_pokemon_form_summary:openapi_pokemon_form_summary() }
            , {'evolved_pokemon_form', openapi_pokemon_form_summary:openapi_pokemon_form_summary() }
            , {'used_move', openapi_move_summary:openapi_move_summary() }
            , {'min_move_count', integer(-2147483648, 2147483647) }
            , {'min_steps', integer(-2147483648, 2147483647) }
            , {'min_damage_taken', integer(-2147483648, 2147483647) }
            , {'allowed_natures', list(openapi_nature_summary:openapi_nature_summary()) }
            , {'condition_expression', openapi_evolution_condition_expression:openapi_evolution_condition_expression() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

