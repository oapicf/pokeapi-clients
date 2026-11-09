-module(openapi_item_machine).

-include("openapi.hrl").

-export([openapi_item_machine/0]).

-export([openapi_item_machine/1]).

-export_type([openapi_item_machine/0]).

-type openapi_item_machine() ::
  [ {'machine', openapi_machine_summary:openapi_machine_summary() }
  | {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  ].


openapi_item_machine() ->
    openapi_item_machine([]).

openapi_item_machine(Fields) ->
  Default = [ {'machine', openapi_machine_summary:openapi_machine_summary() }
            , {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

