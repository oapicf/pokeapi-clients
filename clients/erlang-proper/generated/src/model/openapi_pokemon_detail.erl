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
  | {'abilities', list(openapi_pokemon_detail_abilities_inner:openapi_pokemon_detail_abilities_inner()) }
  | {'past_abilities', list(openapi_pokemon_detail_past_abilities_inner:openapi_pokemon_detail_past_abilities_inner()) }
  | {'forms', list(openapi_pokemon_form_summary:openapi_pokemon_form_summary()) }
  | {'game_indices', list(openapi_pokemon_game_index:openapi_pokemon_game_index()) }
  | {'held_items', openapi_pokemon_detail_held_items:openapi_pokemon_detail_held_items() }
  | {'location_area_encounters', binary() }
  | {'moves', list(openapi_pokemon_detail_moves_inner:openapi_pokemon_detail_moves_inner()) }
  | {'species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
  | {'sprites', openapi_pokemon_detail_sprites:openapi_pokemon_detail_sprites() }
  | {'cries', openapi_pokemon_detail_cries:openapi_pokemon_detail_cries() }
  | {'stats', list(openapi_pokemon_stat:openapi_pokemon_stat()) }
  | {'types', list(openapi_pokemon_detail_types_inner:openapi_pokemon_detail_types_inner()) }
  | {'past_types', list(openapi_pokemon_detail_past_types_inner:openapi_pokemon_detail_past_types_inner()) }
  ].


openapi_pokemon_detail() ->
    openapi_pokemon_detail([]).

openapi_pokemon_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'base_experience', integer() }
            , {'height', integer() }
            , {'is_default', boolean() }
            , {'order', integer() }
            , {'weight', integer() }
            , {'abilities', list(openapi_pokemon_detail_abilities_inner:openapi_pokemon_detail_abilities_inner()) }
            , {'past_abilities', list(openapi_pokemon_detail_past_abilities_inner:openapi_pokemon_detail_past_abilities_inner()) }
            , {'forms', list(openapi_pokemon_form_summary:openapi_pokemon_form_summary()) }
            , {'game_indices', list(openapi_pokemon_game_index:openapi_pokemon_game_index()) }
            , {'held_items', openapi_pokemon_detail_held_items:openapi_pokemon_detail_held_items() }
            , {'location_area_encounters', binary() }
            , {'moves', list(openapi_pokemon_detail_moves_inner:openapi_pokemon_detail_moves_inner()) }
            , {'species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
            , {'sprites', openapi_pokemon_detail_sprites:openapi_pokemon_detail_sprites() }
            , {'cries', openapi_pokemon_detail_cries:openapi_pokemon_detail_cries() }
            , {'stats', list(openapi_pokemon_stat:openapi_pokemon_stat()) }
            , {'types', list(openapi_pokemon_detail_types_inner:openapi_pokemon_detail_types_inner()) }
            , {'past_types', list(openapi_pokemon_detail_past_types_inner:openapi_pokemon_detail_past_types_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

