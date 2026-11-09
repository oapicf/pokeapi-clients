-module(openapi_currency_detail).

-include("openapi.hrl").

-export([openapi_currency_detail/0]).

-export([openapi_currency_detail/1]).

-export_type([openapi_currency_detail/0]).

-type openapi_currency_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'names', list(openapi_currency_name:openapi_currency_name()) }
  ].


openapi_currency_detail() ->
    openapi_currency_detail([]).

openapi_currency_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'names', list(openapi_currency_name:openapi_currency_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

