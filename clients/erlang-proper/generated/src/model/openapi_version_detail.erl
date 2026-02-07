-module(openapi_version_detail).

-include("openapi.hrl").

-export([openapi_version_detail/0]).

-export([openapi_version_detail/1]).

-export_type([openapi_version_detail/0]).

-type openapi_version_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'names', list(openapi_version_name:openapi_version_name()) }
  | {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  ].


openapi_version_detail() ->
    openapi_version_detail([]).

openapi_version_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'names', list(openapi_version_name:openapi_version_name()) }
            , {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

