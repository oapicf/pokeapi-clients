-module(openapi_move_detail_contest_combos_normal).

-export([encode/1]).

-export_type([openapi_move_detail_contest_combos_normal/0]).

-type openapi_move_detail_contest_combos_normal() ::
    #{ 'use_before' := list(),
       'use_after' := list()
     }.

encode(#{ 'use_before' := UseBefore,
          'use_after' := UseAfter
        }) ->
    #{ 'use_before' => UseBefore,
       'use_after' => UseAfter
     }.
