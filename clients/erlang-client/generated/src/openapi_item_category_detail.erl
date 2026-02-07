-module(openapi_item_category_detail).

-export([encode/1]).

-export_type([openapi_item_category_detail/0]).

-type openapi_item_category_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'items' := list(),
       'names' := list(),
       'pocket' := openapi_item_pocket_summary:openapi_item_pocket_summary()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'items' := Items,
          'names' := Names,
          'pocket' := Pocket
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'items' => Items,
       'names' => Names,
       'pocket' => Pocket
     }.
