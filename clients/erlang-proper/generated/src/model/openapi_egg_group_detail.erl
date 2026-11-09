-module(openapi_egg_group_detail).

-include("openapi.hrl").

-export([openapi_egg_group_detail/0]).

-export([openapi_egg_group_detail/1]).

-export_type([openapi_egg_group_detail/0]).

-type openapi_egg_group_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'names', list(openapi_egg_group_name:openapi_egg_group_name()) }
  | {'pokemon_species', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
  ].


openapi_egg_group_detail() ->
    openapi_egg_group_detail([]).

openapi_egg_group_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'names', list(openapi_egg_group_name:openapi_egg_group_name()) }
            , {'pokemon_species', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

