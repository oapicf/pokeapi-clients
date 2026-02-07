-module(openapi_item_pocket_detail).

-include("openapi.hrl").

-export([openapi_item_pocket_detail/0]).

-export([openapi_item_pocket_detail/1]).

-export_type([openapi_item_pocket_detail/0]).

-type openapi_item_pocket_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'categories', list(openapi_item_category_summary:openapi_item_category_summary()) }
  | {'names', list(openapi_item_pocket_name:openapi_item_pocket_name()) }
  ].


openapi_item_pocket_detail() ->
    openapi_item_pocket_detail([]).

openapi_item_pocket_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'categories', list(openapi_item_category_summary:openapi_item_category_summary()) }
            , {'names', list(openapi_item_pocket_name:openapi_item_pocket_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

