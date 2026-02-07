-module(openapi_stat_detail_affecting_natures).

-export([encode/1]).

-export_type([openapi_stat_detail_affecting_natures/0]).

-type openapi_stat_detail_affecting_natures() ::
    #{ 'increase' := list(),
       'decrease' := list()
     }.

encode(#{ 'increase' := Increase,
          'decrease' := Decrease
        }) ->
    #{ 'increase' => Increase,
       'decrease' => Decrease
     }.
