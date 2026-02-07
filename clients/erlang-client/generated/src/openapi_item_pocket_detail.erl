-module(openapi_item_pocket_detail).

-export([encode/1]).

-export_type([openapi_item_pocket_detail/0]).

-type openapi_item_pocket_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'categories' := list(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'categories' := Categories,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'categories' => Categories,
       'names' => Names
     }.
