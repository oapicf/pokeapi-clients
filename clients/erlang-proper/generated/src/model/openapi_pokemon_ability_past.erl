-module(openapi_pokemon_ability_past).

-include("openapi.hrl").

-export([openapi_pokemon_ability_past/0]).

-export([openapi_pokemon_ability_past/1]).

-export_type([openapi_pokemon_ability_past/0]).

-type openapi_pokemon_ability_past() ::
  [ {'is_hidden', boolean() }
  | {'slot', integer() }
  | {'ability', openapi_ability_summary:openapi_ability_summary() }
  ].


openapi_pokemon_ability_past() ->
    openapi_pokemon_ability_past([]).

openapi_pokemon_ability_past(Fields) ->
  Default = [ {'is_hidden', boolean() }
            , {'slot', integer(-2147483648, 2147483647) }
            , {'ability', openapi_ability_summary:openapi_ability_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

