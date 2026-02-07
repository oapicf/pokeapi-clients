-module(openapi_berry_detail).

-include("openapi.hrl").

-export([openapi_berry_detail/0]).

-export([openapi_berry_detail/1]).

-export_type([openapi_berry_detail/0]).

-type openapi_berry_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'growth_time', integer() }
  | {'max_harvest', integer() }
  | {'natural_gift_power', integer() }
  | {'size', integer() }
  | {'smoothness', integer() }
  | {'soil_dryness', integer() }
  | {'firmness', openapi_berry_firmness_summary:openapi_berry_firmness_summary() }
  | {'flavors', list(openapi_berry_detail_flavors_inner:openapi_berry_detail_flavors_inner()) }
  | {'item', openapi_item_summary:openapi_item_summary() }
  | {'natural_gift_type', openapi_type_summary:openapi_type_summary() }
  ].


openapi_berry_detail() ->
    openapi_berry_detail([]).

openapi_berry_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'growth_time', integer() }
            , {'max_harvest', integer() }
            , {'natural_gift_power', integer() }
            , {'size', integer() }
            , {'smoothness', integer() }
            , {'soil_dryness', integer() }
            , {'firmness', openapi_berry_firmness_summary:openapi_berry_firmness_summary() }
            , {'flavors', list(openapi_berry_detail_flavors_inner:openapi_berry_detail_flavors_inner()) }
            , {'item', openapi_item_summary:openapi_item_summary() }
            , {'natural_gift_type', openapi_type_summary:openapi_type_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

