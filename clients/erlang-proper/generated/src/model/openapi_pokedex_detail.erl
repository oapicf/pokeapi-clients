-module(openapi_pokedex_detail).

-include("openapi.hrl").

-export([openapi_pokedex_detail/0]).

-export([openapi_pokedex_detail/1]).

-export_type([openapi_pokedex_detail/0]).

-type openapi_pokedex_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'is_main_series', boolean() }
  | {'descriptions', list(openapi_pokedex_description:openapi_pokedex_description()) }
  | {'names', list(openapi_pokedex_name:openapi_pokedex_name()) }
  | {'pokemon_entries', list(openapi_pokedex_detail_pokemon_entries_inner:openapi_pokedex_detail_pokemon_entries_inner()) }
  | {'region', openapi_region_summary:openapi_region_summary() }
  | {'version_groups', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  ].


openapi_pokedex_detail() ->
    openapi_pokedex_detail([]).

openapi_pokedex_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'is_main_series', boolean() }
            , {'descriptions', list(openapi_pokedex_description:openapi_pokedex_description()) }
            , {'names', list(openapi_pokedex_name:openapi_pokedex_name()) }
            , {'pokemon_entries', list(openapi_pokedex_detail_pokemon_entries_inner:openapi_pokedex_detail_pokemon_entries_inner()) }
            , {'region', openapi_region_summary:openapi_region_summary() }
            , {'version_groups', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

