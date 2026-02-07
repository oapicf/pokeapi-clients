-module(openapi_pokemon_shape_detail_awesome_names_inner).

-include("openapi.hrl").

-export([openapi_pokemon_shape_detail_awesome_names_inner/0]).

-export([openapi_pokemon_shape_detail_awesome_names_inner/1]).

-export_type([openapi_pokemon_shape_detail_awesome_names_inner/0]).

-type openapi_pokemon_shape_detail_awesome_names_inner() ::
  [ {'awesome_name', binary() }
  | {'language', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_pokemon_shape_detail_awesome_names_inner() ->
    openapi_pokemon_shape_detail_awesome_names_inner([]).

openapi_pokemon_shape_detail_awesome_names_inner(Fields) ->
  Default = [ {'awesome_name', binary() }
            , {'language', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

