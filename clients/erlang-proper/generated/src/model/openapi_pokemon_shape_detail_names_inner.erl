-module(openapi_pokemon_shape_detail_names_inner).

-include("openapi.hrl").

-export([openapi_pokemon_shape_detail_names_inner/0]).

-export([openapi_pokemon_shape_detail_names_inner/1]).

-export_type([openapi_pokemon_shape_detail_names_inner/0]).

-type openapi_pokemon_shape_detail_names_inner() ::
  [ {'url', openapi_u_ri:openapi_u_ri() }
  | {'name', binary() }
  ].


openapi_pokemon_shape_detail_names_inner() ->
    openapi_pokemon_shape_detail_names_inner([]).

openapi_pokemon_shape_detail_names_inner(Fields) ->
  Default = [ {'url', binary() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

