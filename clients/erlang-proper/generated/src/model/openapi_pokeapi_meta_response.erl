-module(openapi_pokeapi_meta_response).

-include("openapi.hrl").

-export([openapi_pokeapi_meta_response/0]).

-export([openapi_pokeapi_meta_response/1]).

-export_type([openapi_pokeapi_meta_response/0]).

-type openapi_pokeapi_meta_response() ::
  [ {'deploy_date', binary() }
  | {'hash', binary() }
  | {'tag', binary() }
  ].


openapi_pokeapi_meta_response() ->
    openapi_pokeapi_meta_response([]).

openapi_pokeapi_meta_response(Fields) ->
  Default = [ {'deploy_date', binary() }
            , {'hash', binary() }
            , {'tag', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

