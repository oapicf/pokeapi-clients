-module(openapi_contest_type_summary).

-include("openapi.hrl").

-export([openapi_contest_type_summary/0]).

-export([openapi_contest_type_summary/1]).

-export_type([openapi_contest_type_summary/0]).

-type openapi_contest_type_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_contest_type_summary() ->
    openapi_contest_type_summary([]).

openapi_contest_type_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

