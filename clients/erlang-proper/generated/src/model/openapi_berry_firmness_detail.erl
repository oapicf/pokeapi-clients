-module(openapi_berry_firmness_detail).

-include("openapi.hrl").

-export([openapi_berry_firmness_detail/0]).

-export([openapi_berry_firmness_detail/1]).

-export_type([openapi_berry_firmness_detail/0]).

-type openapi_berry_firmness_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'berries', list(openapi_berry_summary:openapi_berry_summary()) }
  | {'names', list(openapi_berry_firmness_name:openapi_berry_firmness_name()) }
  ].


openapi_berry_firmness_detail() ->
    openapi_berry_firmness_detail([]).

openapi_berry_firmness_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'berries', list(openapi_berry_summary:openapi_berry_summary()) }
            , {'names', list(openapi_berry_firmness_name:openapi_berry_firmness_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

