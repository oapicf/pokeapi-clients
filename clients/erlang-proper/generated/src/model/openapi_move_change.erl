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
  | {'effect_entries', list(openapi_move_effect_effect_text:openapi_move_effect_effect_text()) }
  | {'type', openapi_type_summary:openapi_type_summary() }
  | {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  ].


openapi_move_change() ->
    openapi_move_change([]).

openapi_move_change(Fields) ->
  Default = [ {'accuracy', integer(-2147483648, 2147483647) }
            , {'power', integer(-2147483648, 2147483647) }
            , {'pp', integer(-2147483648, 2147483647) }
            , {'effect_chance', integer() }
            , {'effect_entries', list(openapi_move_effect_effect_text:openapi_move_effect_effect_text()) }
            , {'type', openapi_type_summary:openapi_type_summary() }
            , {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

