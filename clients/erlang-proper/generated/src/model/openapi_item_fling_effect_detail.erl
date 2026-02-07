-module(openapi_item_fling_effect_detail).

-include("openapi.hrl").

-export([openapi_item_fling_effect_detail/0]).

-export([openapi_item_fling_effect_detail/1]).

-export_type([openapi_item_fling_effect_detail/0]).

-type openapi_item_fling_effect_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'effect_entries', list(openapi_item_fling_effect_effect_text:openapi_item_fling_effect_effect_text()) }
  | {'items', list(openapi_item_summary:openapi_item_summary()) }
  ].


openapi_item_fling_effect_detail() ->
    openapi_item_fling_effect_detail([]).

openapi_item_fling_effect_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'effect_entries', list(openapi_item_fling_effect_effect_text:openapi_item_fling_effect_effect_text()) }
            , {'items', list(openapi_item_summary:openapi_item_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

