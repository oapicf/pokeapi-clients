-module(openapi_move_target_description).

-include("openapi.hrl").

-export([openapi_move_target_description/0]).

-export([openapi_move_target_description/1]).

-export_type([openapi_move_target_description/0]).

-type openapi_move_target_description() ::
  [ {'description', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_move_target_description() ->
    openapi_move_target_description([]).

openapi_move_target_description(Fields) ->
  Default = [ {'description', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

