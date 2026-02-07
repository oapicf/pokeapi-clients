-module(openapi_region_detail).

-include("openapi.hrl").

-export([openapi_region_detail/0]).

-export([openapi_region_detail/1]).

-export_type([openapi_region_detail/0]).

-type openapi_region_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'locations', list(openapi_location_summary:openapi_location_summary()) }
  | {'main_generation', openapi_generation_summary:openapi_generation_summary() }
  | {'names', list(openapi_region_name:openapi_region_name()) }
  | {'pokedexes', list(openapi_pokedex_summary:openapi_pokedex_summary()) }
  | {'version_groups', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  ].


openapi_region_detail() ->
    openapi_region_detail([]).

openapi_region_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'locations', list(openapi_location_summary:openapi_location_summary()) }
            , {'main_generation', openapi_generation_summary:openapi_generation_summary() }
            , {'names', list(openapi_region_name:openapi_region_name()) }
            , {'pokedexes', list(openapi_pokedex_summary:openapi_pokedex_summary()) }
            , {'version_groups', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

