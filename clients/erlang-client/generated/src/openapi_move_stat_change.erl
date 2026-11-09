-module(openapi_move_stat_change).

-export([encode/1]).

-export_type([openapi_move_stat_change/0]).

-type openapi_move_stat_change() ::
    #{ 'change' := integer(),
       'move' := openapi_move_summary:openapi_move_summary()
     }.

encode(#{ 'change' := Change,
          'move' := Move
        }) ->
    #{ 'change' => Change,
       'move' => Move
     }.
