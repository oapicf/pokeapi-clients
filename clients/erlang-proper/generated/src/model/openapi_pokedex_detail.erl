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
  | {'pokemon_entries', list(openapi_pokemon_dex_number:openapi_pokemon_dex_number()) }
  | {'region', openapi_region_summary:openapi_region_summary() }
  | {'version_groups', list(openapi_version_group_summary:openapi_version_group_summary()) }
  ].


openapi_pokedex_detail() ->
    openapi_pokedex_detail([]).

openapi_pokedex_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'is_main_series', boolean() }
            , {'descriptions', list(openapi_pokedex_description:openapi_pokedex_description()) }
            , {'names', list(openapi_pokedex_name:openapi_pokedex_name()) }
            , {'pokemon_entries', list(openapi_pokemon_dex_number:openapi_pokemon_dex_number()) }
            , {'region', openapi_region_summary:openapi_region_summary() }
            , {'version_groups', list(openapi_version_group_summary:openapi_version_group_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

