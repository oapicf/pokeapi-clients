-module(openapi_generation_detail).

-include("openapi.hrl").

-export([openapi_generation_detail/0]).

-export([openapi_generation_detail/1]).

-export_type([openapi_generation_detail/0]).

-type openapi_generation_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'abilities', list(openapi_ability_summary:openapi_ability_summary()) }
  | {'main_region', openapi_region_summary:openapi_region_summary() }
  | {'moves', list(openapi_move_summary:openapi_move_summary()) }
  | {'names', list(openapi_generation_name:openapi_generation_name()) }
  | {'pokemon_species', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
  | {'types', list(openapi_type_summary:openapi_type_summary()) }
  | {'version_groups', list(openapi_version_group_summary:openapi_version_group_summary()) }
  ].


openapi_generation_detail() ->
    openapi_generation_detail([]).

openapi_generation_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'abilities', list(openapi_ability_summary:openapi_ability_summary()) }
            , {'main_region', openapi_region_summary:openapi_region_summary() }
            , {'moves', list(openapi_move_summary:openapi_move_summary()) }
            , {'names', list(openapi_generation_name:openapi_generation_name()) }
            , {'pokemon_species', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
            , {'types', list(openapi_type_summary:openapi_type_summary()) }
            , {'version_groups', list(openapi_version_group_summary:openapi_version_group_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

