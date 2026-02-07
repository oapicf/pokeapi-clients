-module(openapi_move_battle_style_detail).

-export([encode/1]).

-export_type([openapi_move_battle_style_detail/0]).

-type openapi_move_battle_style_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'names' => Names
     }.
