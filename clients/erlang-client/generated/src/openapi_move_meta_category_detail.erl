-module(openapi_move_meta_category_detail).

-export([encode/1]).

-export_type([openapi_move_meta_category_detail/0]).

-type openapi_move_meta_category_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'descriptions' := list(),
       'moves' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'descriptions' := Descriptions,
          'moves' := Moves
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'descriptions' => Descriptions,
       'moves' => Moves
     }.
