-module(openapi_move_combo_usage).

-export([encode/1]).

-export_type([openapi_move_combo_usage/0]).

-type openapi_move_combo_usage() ::
    #{ 'use_before' := list(),
       'use_after' := list()
     }.

encode(#{ 'use_before' := UseBefore,
          'use_after' := UseAfter
        }) ->
    #{ 'use_before' => UseBefore,
       'use_after' => UseAfter
     }.
