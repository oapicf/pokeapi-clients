-module(openapi_contest_type_detail).

-include("openapi.hrl").

-export([openapi_contest_type_detail/0]).

-export([openapi_contest_type_detail/1]).

-export_type([openapi_contest_type_detail/0]).

-type openapi_contest_type_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'berry_flavor', openapi_berry_flavor_summary:openapi_berry_flavor_summary() }
  | {'names', list(openapi_contest_type_name:openapi_contest_type_name()) }
  ].


openapi_contest_type_detail() ->
    openapi_contest_type_detail([]).

openapi_contest_type_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'berry_flavor', openapi_berry_flavor_summary:openapi_berry_flavor_summary() }
            , {'names', list(openapi_contest_type_name:openapi_contest_type_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

