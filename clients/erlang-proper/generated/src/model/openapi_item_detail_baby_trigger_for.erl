-module(openapi_item_detail_baby_trigger_for).

-include("openapi.hrl").

-export([openapi_item_detail_baby_trigger_for/0]).

-export([openapi_item_detail_baby_trigger_for/1]).

-export_type([openapi_item_detail_baby_trigger_for/0]).

-type openapi_item_detail_baby_trigger_for() ::
  [ {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_item_detail_baby_trigger_for() ->
    openapi_item_detail_baby_trigger_for([]).

openapi_item_detail_baby_trigger_for(Fields) ->
  Default = [ {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

