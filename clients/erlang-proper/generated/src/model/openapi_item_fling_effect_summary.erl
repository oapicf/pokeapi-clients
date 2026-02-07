-module(openapi_item_fling_effect_summary).

-include("openapi.hrl").

-export([openapi_item_fling_effect_summary/0]).

-export([openapi_item_fling_effect_summary/1]).

-export_type([openapi_item_fling_effect_summary/0]).

-type openapi_item_fling_effect_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_item_fling_effect_summary() ->
    openapi_item_fling_effect_summary([]).

openapi_item_fling_effect_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

