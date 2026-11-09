-module(openapi_currency_summary).

-include("openapi.hrl").

-export([openapi_currency_summary/0]).

-export([openapi_currency_summary/1]).

-export_type([openapi_currency_summary/0]).

-type openapi_currency_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_currency_summary() ->
    openapi_currency_summary([]).

openapi_currency_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

