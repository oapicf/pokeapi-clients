-module(openapi_move_target_detail).

-export([encode/1]).

-export_type([openapi_move_target_detail/0]).

-type openapi_move_target_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'descriptions' := list(),
       'moves' := list(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'descriptions' := Descriptions,
          'moves' := Moves,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'descriptions' => Descriptions,
       'moves' => Moves,
       'names' => Names
     }.
