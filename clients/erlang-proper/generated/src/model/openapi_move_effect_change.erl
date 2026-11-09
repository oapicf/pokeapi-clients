-module(openapi_move_effect_change).

-include("openapi.hrl").

-export([openapi_move_effect_change/0]).

-export([openapi_move_effect_change/1]).

-export_type([openapi_move_effect_change/0]).

-type openapi_move_effect_change() ::
  [ {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  | {'effect_entries', list(openapi_move_effect_change_effect_text:openapi_move_effect_change_effect_text()) }
  ].


openapi_move_effect_change() ->
    openapi_move_effect_change([]).

openapi_move_effect_change(Fields) ->
  Default = [ {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            , {'effect_entries', list(openapi_move_effect_change_effect_text:openapi_move_effect_change_effect_text()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

