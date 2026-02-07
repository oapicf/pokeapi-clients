-module(openapi_stat_detail_affecting_moves).

-export([encode/1]).

-export_type([openapi_stat_detail_affecting_moves/0]).

-type openapi_stat_detail_affecting_moves() ::
    #{ 'increase' := list(),
       'decrease' := list()
     }.

encode(#{ 'increase' := Increase,
          'decrease' := Decrease
        }) ->
    #{ 'increase' => Increase,
       'decrease' => Decrease
     }.
