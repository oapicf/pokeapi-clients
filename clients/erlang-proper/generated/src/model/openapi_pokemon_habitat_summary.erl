-module(openapi_pokemon_habitat_summary).

-include("openapi.hrl").

-export([openapi_pokemon_habitat_summary/0]).

-export([openapi_pokemon_habitat_summary/1]).

-export_type([openapi_pokemon_habitat_summary/0]).

-type openapi_pokemon_habitat_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_pokemon_habitat_summary() ->
    openapi_pokemon_habitat_summary([]).

openapi_pokemon_habitat_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

