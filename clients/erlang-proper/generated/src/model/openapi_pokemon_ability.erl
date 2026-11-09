-module(openapi_pokemon_ability).

-include("openapi.hrl").

-export([openapi_pokemon_ability/0]).

-export([openapi_pokemon_ability/1]).

-export_type([openapi_pokemon_ability/0]).

-type openapi_pokemon_ability() ::
  [ {'is_hidden', boolean() }
  | {'slot', integer() }
  | {'ability', openapi_ability_summary:openapi_ability_summary() }
  ].


openapi_pokemon_ability() ->
    openapi_pokemon_ability([]).

openapi_pokemon_ability(Fields) ->
  Default = [ {'is_hidden', boolean() }
            , {'slot', integer(-2147483648, 2147483647) }
            , {'ability', openapi_ability_summary:openapi_ability_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

