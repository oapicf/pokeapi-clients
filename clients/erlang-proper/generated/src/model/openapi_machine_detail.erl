-module(openapi_machine_detail).

-include("openapi.hrl").

-export([openapi_machine_detail/0]).

-export([openapi_machine_detail/1]).

-export_type([openapi_machine_detail/0]).

-type openapi_machine_detail() ::
  [ {'id', integer() }
  | {'item', openapi_item_summary:openapi_item_summary() }
  | {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  | {'move', openapi_move_summary:openapi_move_summary() }
  ].


openapi_machine_detail() ->
    openapi_machine_detail([]).

openapi_machine_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'item', openapi_item_summary:openapi_item_summary() }
            , {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            , {'move', openapi_move_summary:openapi_move_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

