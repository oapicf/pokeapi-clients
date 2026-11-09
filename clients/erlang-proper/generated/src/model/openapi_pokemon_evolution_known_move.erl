-module(openapi_pokemon_evolution_known_move).

-include("openapi.hrl").

-export([openapi_pokemon_evolution_known_move/0]).

-export([openapi_pokemon_evolution_known_move/1]).

-export_type([openapi_pokemon_evolution_known_move/0]).

-type openapi_pokemon_evolution_known_move() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_pokemon_evolution_known_move() ->
    openapi_pokemon_evolution_known_move([]).

openapi_pokemon_evolution_known_move(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

