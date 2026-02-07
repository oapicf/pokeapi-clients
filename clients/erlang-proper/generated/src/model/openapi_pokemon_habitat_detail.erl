-module(openapi_pokemon_habitat_detail).

-include("openapi.hrl").

-export([openapi_pokemon_habitat_detail/0]).

-export([openapi_pokemon_habitat_detail/1]).

-export_type([openapi_pokemon_habitat_detail/0]).

-type openapi_pokemon_habitat_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'names', list(openapi_pokemon_habitat_name:openapi_pokemon_habitat_name()) }
  | {'pokemon_species', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
  ].


openapi_pokemon_habitat_detail() ->
    openapi_pokemon_habitat_detail([]).

openapi_pokemon_habitat_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'names', list(openapi_pokemon_habitat_name:openapi_pokemon_habitat_name()) }
            , {'pokemon_species', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

