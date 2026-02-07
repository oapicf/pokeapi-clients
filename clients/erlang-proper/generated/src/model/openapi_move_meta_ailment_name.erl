-module(openapi_move_meta_ailment_name).

-include("openapi.hrl").

-export([openapi_move_meta_ailment_name/0]).

-export([openapi_move_meta_ailment_name/1]).

-export_type([openapi_move_meta_ailment_name/0]).

-type openapi_move_meta_ailment_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_move_meta_ailment_name() ->
    openapi_move_meta_ailment_name([]).

openapi_move_meta_ailment_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

