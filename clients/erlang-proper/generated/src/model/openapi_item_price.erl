-module(openapi_item_price).

-include("openapi.hrl").

-export([openapi_item_price/0]).

-export([openapi_item_price/1]).

-export_type([openapi_item_price/0]).

-type openapi_item_price() ::
  [ {'purchase_price', integer() }
  | {'sell_price', integer() }
  | {'currency', openapi_currency_summary:openapi_currency_summary() }
  | {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  ].


openapi_item_price() ->
    openapi_item_price([]).

openapi_item_price(Fields) ->
  Default = [ {'purchase_price', integer(-2147483648, 2147483647) }
            , {'sell_price', integer(-2147483648, 2147483647) }
            , {'currency', openapi_currency_summary:openapi_currency_summary() }
            , {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

