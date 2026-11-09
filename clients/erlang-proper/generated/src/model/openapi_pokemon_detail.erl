-module(openapi_pokemon_detail).

-include("openapi.hrl").

-export([openapi_pokemon_detail/0]).

-export([openapi_pokemon_detail/1]).

-export_type([openapi_pokemon_detail/0]).

-type openapi_pokemon_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'base_experience', integer() }
  | {'height', integer() }
  | {'is_default', boolean() }
  | {'order', integer() }
  | {'weight', integer() }
  | {'abilities', list(openapi_pokemon_ability:openapi_pokemon_ability()) }
  | {'past_abilities', list(openapi_pokemon_past_ability:openapi_pokemon_past_ability()) }
  | {'forms', list(openapi_pokemon_form_summary:openapi_pokemon_form_summary()) }
  | {'game_indices', list(openapi_pokemon_game_index:openapi_pokemon_game_index()) }
  | {'held_items', list(openapi_pokemon_held_item_summary:openapi_pokemon_held_item_summary()) }
  | {'location_area_encounters', binary() }
  | {'moves', list(openapi_pokemon_move:openapi_pokemon_move()) }
  | {'species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
  | {'sprites', openapi_pokemon_sprites:openapi_pokemon_sprites() }
  | {'cries', openapi_pokemon_cries:openapi_pokemon_cries() }
  | {'stats', list(openapi_pokemon_stat:openapi_pokemon_stat()) }
  | {'past_stats', list(openapi_pokemon_past_stat:openapi_pokemon_past_stat()) }
  | {'types', list(openapi_pokemon_type:openapi_pokemon_type()) }
  | {'past_types', list(openapi_pokemon_past_type:openapi_pokemon_past_type()) }
  ].


openapi_pokemon_detail() ->
    openapi_pokemon_detail([]).

openapi_pokemon_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'base_experience', integer(-2147483648, 2147483647) }
            , {'height', integer(-2147483648, 2147483647) }
            , {'is_default', boolean() }
            , {'order', integer(-2147483648, 2147483647) }
            , {'weight', integer(-2147483648, 2147483647) }
            , {'abilities', list(openapi_pokemon_ability:openapi_pokemon_ability()) }
            , {'past_abilities', list(openapi_pokemon_past_ability:openapi_pokemon_past_ability()) }
            , {'forms', list(openapi_pokemon_form_summary:openapi_pokemon_form_summary()) }
            , {'game_indices', list(openapi_pokemon_game_index:openapi_pokemon_game_index()) }
            , {'held_items', list(openapi_pokemon_held_item_summary:openapi_pokemon_held_item_summary()) }
            , {'location_area_encounters', binary() }
            , {'moves', list(openapi_pokemon_move:openapi_pokemon_move()) }
            , {'species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
            , {'sprites', openapi_pokemon_sprites:openapi_pokemon_sprites() }
            , {'cries', openapi_pokemon_cries:openapi_pokemon_cries() }
            , {'stats', list(openapi_pokemon_stat:openapi_pokemon_stat()) }
            , {'past_stats', list(openapi_pokemon_past_stat:openapi_pokemon_past_stat()) }
            , {'types', list(openapi_pokemon_type:openapi_pokemon_type()) }
            , {'past_types', list(openapi_pokemon_past_type:openapi_pokemon_past_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

