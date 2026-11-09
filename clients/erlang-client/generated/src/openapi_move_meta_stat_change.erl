-module(openapi_move_meta_stat_change).

-export([encode/1]).

-export_type([openapi_move_meta_stat_change/0]).

-type openapi_move_meta_stat_change() ::
    #{ 'change' := integer(),
       'stat' := openapi_stat_summary:openapi_stat_summary()
     }.

encode(#{ 'change' := Change,
          'stat' := Stat
        }) ->
    #{ 'change' => Change,
       'stat' => Stat
     }.
