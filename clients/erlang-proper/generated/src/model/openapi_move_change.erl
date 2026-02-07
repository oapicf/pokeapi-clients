-module(openapi_move_change).

-include("openapi.hrl").

-export([openapi_move_change/0]).

-export([openapi_move_change/1]).

-export_type([openapi_move_change/0]).

-type openapi_move_change() ::
  [ {'accuracy', integer() }
  | {'power', integer() }
  | {'pp', integer() }
  | {'effect_chance', integer() }
  | {'effect_entries', list(openapi_move_change_effect_entries_inner:openapi_move_change_effect_entries_inner()) }
  | {'type', openapi_type_summary:openapi_type_summary() }
  | {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  ].


openapi_move_change() ->
    openapi_move_change([]).

openapi_move_change(Fields) ->
  Default = [ {'accuracy', integer() }
            , {'power', integer() }
            , {'pp', integer() }
            , {'effect_chance', integer() }
            , {'effect_entries', list(openapi_move_change_effect_entries_inner:openapi_move_change_effect_entries_inner()) }
            , {'type', openapi_type_summary:openapi_type_summary() }
            , {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

