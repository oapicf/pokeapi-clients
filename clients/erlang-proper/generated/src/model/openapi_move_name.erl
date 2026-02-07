-module(openapi_move_name).

-include("openapi.hrl").

-export([openapi_move_name/0]).

-export([openapi_move_name/1]).

-export_type([openapi_move_name/0]).

-type openapi_move_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_move_name() ->
    openapi_move_name([]).

openapi_move_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

