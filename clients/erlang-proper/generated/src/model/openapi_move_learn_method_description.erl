-module(openapi_move_learn_method_description).

-include("openapi.hrl").

-export([openapi_move_learn_method_description/0]).

-export([openapi_move_learn_method_description/1]).

-export_type([openapi_move_learn_method_description/0]).

-type openapi_move_learn_method_description() ::
  [ {'description', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_move_learn_method_description() ->
    openapi_move_learn_method_description([]).

openapi_move_learn_method_description(Fields) ->
  Default = [ {'description', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

