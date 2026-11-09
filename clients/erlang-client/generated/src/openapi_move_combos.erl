-module(openapi_move_combos).

-export([encode/1]).

-export_type([openapi_move_combos/0]).

-type openapi_move_combos() ::
    #{ 'normal' := openapi_move_combo_usage:openapi_move_combo_usage(),
       'super' := openapi_move_combo_usage:openapi_move_combo_usage()
     }.

encode(#{ 'normal' := Normal,
          'super' := Super
        }) ->
    #{ 'normal' => Normal,
       'super' => Super
     }.
