-module(openapi_pokemon_shape_awesome_name).

-include("openapi.hrl").

-export([openapi_pokemon_shape_awesome_name/0]).

-export([openapi_pokemon_shape_awesome_name/1]).

-export_type([openapi_pokemon_shape_awesome_name/0]).

-type openapi_pokemon_shape_awesome_name() ::
  [ {'awesome_name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_pokemon_shape_awesome_name() ->
    openapi_pokemon_shape_awesome_name([]).

openapi_pokemon_shape_awesome_name(Fields) ->
  Default = [ {'awesome_name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

