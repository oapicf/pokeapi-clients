-module(openapi_berry_flavor_detail).

-include("openapi.hrl").

-export([openapi_berry_flavor_detail/0]).

-export([openapi_berry_flavor_detail/1]).

-export_type([openapi_berry_flavor_detail/0]).

-type openapi_berry_flavor_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'berries', list(openapi_berry_flavor_detail_berries_inner:openapi_berry_flavor_detail_berries_inner()) }
  | {'contest_type', openapi_contest_type_summary:openapi_contest_type_summary() }
  | {'names', list(openapi_berry_flavor_name:openapi_berry_flavor_name()) }
  ].


openapi_berry_flavor_detail() ->
    openapi_berry_flavor_detail([]).

openapi_berry_flavor_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'berries', list(openapi_berry_flavor_detail_berries_inner:openapi_berry_flavor_detail_berries_inner()) }
            , {'contest_type', openapi_contest_type_summary:openapi_contest_type_summary() }
            , {'names', list(openapi_berry_flavor_name:openapi_berry_flavor_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

