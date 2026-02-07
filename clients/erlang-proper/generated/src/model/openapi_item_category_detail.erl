-module(openapi_item_category_detail).

-include("openapi.hrl").

-export([openapi_item_category_detail/0]).

-export([openapi_item_category_detail/1]).

-export_type([openapi_item_category_detail/0]).

-type openapi_item_category_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'items', list(openapi_item_summary:openapi_item_summary()) }
  | {'names', list(openapi_item_category_name:openapi_item_category_name()) }
  | {'pocket', openapi_item_pocket_summary:openapi_item_pocket_summary() }
  ].


openapi_item_category_detail() ->
    openapi_item_category_detail([]).

openapi_item_category_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'items', list(openapi_item_summary:openapi_item_summary()) }
            , {'names', list(openapi_item_category_name:openapi_item_category_name()) }
            , {'pocket', openapi_item_pocket_summary:openapi_item_pocket_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

