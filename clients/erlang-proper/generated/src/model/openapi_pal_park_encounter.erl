-module(openapi_pal_park_encounter).

-include("openapi.hrl").

-export([openapi_pal_park_encounter/0]).

-export([openapi_pal_park_encounter/1]).

-export_type([openapi_pal_park_encounter/0]).

-type openapi_pal_park_encounter() ::
  [ {'base_score', integer() }
  | {'rate', integer() }
  | {'pokemon_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
  ].


openapi_pal_park_encounter() ->
    openapi_pal_park_encounter([]).

openapi_pal_park_encounter(Fields) ->
  Default = [ {'base_score', integer(-2147483648, 2147483647) }
            , {'rate', integer(-2147483648, 2147483647) }
            , {'pokemon_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

