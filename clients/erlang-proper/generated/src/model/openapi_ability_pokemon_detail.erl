-module(openapi_ability_pokemon_detail).

-include("openapi.hrl").

-export([openapi_ability_pokemon_detail/0]).

-export([openapi_ability_pokemon_detail/1]).

-export_type([openapi_ability_pokemon_detail/0]).

-type openapi_ability_pokemon_detail() ::
  [ {'is_hidden', boolean() }
  | {'slot', integer() }
  | {'pokemon', openapi_pokemon_summary:openapi_pokemon_summary() }
  ].


openapi_ability_pokemon_detail() ->
    openapi_ability_pokemon_detail([]).

openapi_ability_pokemon_detail(Fields) ->
  Default = [ {'is_hidden', boolean() }
            , {'slot', integer(-2147483648, 2147483647) }
            , {'pokemon', openapi_pokemon_summary:openapi_pokemon_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

