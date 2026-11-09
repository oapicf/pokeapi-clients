-module(openapi_encounter_pokemon_detail).

-include("openapi.hrl").

-export([openapi_encounter_pokemon_detail/0]).

-export([openapi_encounter_pokemon_detail/1]).

-export_type([openapi_encounter_pokemon_detail/0]).

-type openapi_encounter_pokemon_detail() ::
  [ {'min_perfect_ivs', integer() }
  | {'always_shiny', boolean() }
  | {'never_shiny', boolean() }
  | {'is_alpha', boolean() }
  ].


openapi_encounter_pokemon_detail() ->
    openapi_encounter_pokemon_detail([]).

openapi_encounter_pokemon_detail(Fields) ->
  Default = [ {'min_perfect_ivs', integer(-2147483648, 2147483647) }
            , {'always_shiny', boolean() }
            , {'never_shiny', boolean() }
            , {'is_alpha', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

