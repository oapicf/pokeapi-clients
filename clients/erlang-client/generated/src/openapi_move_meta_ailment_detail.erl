-module(openapi_move_meta_ailment_detail).

-export([encode/1]).

-export_type([openapi_move_meta_ailment_detail/0]).

-type openapi_move_meta_ailment_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'moves' := list(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'moves' := Moves,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'moves' => Moves,
       'names' => Names
     }.
