-module(openapi_ability_detail_pokemon_inner_pokemon).

-include("openapi.hrl").

-export([openapi_ability_detail_pokemon_inner_pokemon/0]).

-export([openapi_ability_detail_pokemon_inner_pokemon/1]).

-export_type([openapi_ability_detail_pokemon_inner_pokemon/0]).

-type openapi_ability_detail_pokemon_inner_pokemon() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_ability_detail_pokemon_inner_pokemon() ->
    openapi_ability_detail_pokemon_inner_pokemon([]).

openapi_ability_detail_pokemon_inner_pokemon(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

