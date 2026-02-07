-module(openapi_version_summary).

-include("openapi.hrl").

-export([openapi_version_summary/0]).

-export([openapi_version_summary/1]).

-export_type([openapi_version_summary/0]).

-type openapi_version_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_version_summary() ->
    openapi_version_summary([]).

openapi_version_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

