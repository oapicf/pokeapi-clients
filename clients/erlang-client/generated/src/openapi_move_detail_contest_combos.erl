-module(openapi_move_detail_contest_combos).

-export([encode/1]).

-export_type([openapi_move_detail_contest_combos/0]).

-type openapi_move_detail_contest_combos() ::
    #{ 'normal' := openapi_move_detail_contest_combos_normal:openapi_move_detail_contest_combos_normal(),
       'super' := openapi_move_detail_contest_combos_normal:openapi_move_detail_contest_combos_normal()
     }.

encode(#{ 'normal' := Normal,
          'super' := Super
        }) ->
    #{ 'normal' => Normal,
       'super' => Super
     }.
