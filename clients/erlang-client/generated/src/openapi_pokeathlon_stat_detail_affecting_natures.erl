-module(openapi_pokeathlon_stat_detail_affecting_natures).

-export([encode/1]).

-export_type([openapi_pokeathlon_stat_detail_affecting_natures/0]).

-type openapi_pokeathlon_stat_detail_affecting_natures() ::
    #{ 'decrease' := list(),
       'increase' := list()
     }.

encode(#{ 'decrease' := Decrease,
          'increase' := Increase
        }) ->
    #{ 'decrease' => Decrease,
       'increase' => Increase
     }.
