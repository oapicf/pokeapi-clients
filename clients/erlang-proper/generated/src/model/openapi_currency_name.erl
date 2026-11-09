-module(openapi_currency_name).

-include("openapi.hrl").

-export([openapi_currency_name/0]).

-export([openapi_currency_name/1]).

-export_type([openapi_currency_name/0]).

-type openapi_currency_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_currency_name() ->
    openapi_currency_name([]).

openapi_currency_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

