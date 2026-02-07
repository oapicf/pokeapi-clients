-module(openapi_item_attribute_detail).

-export([encode/1]).

-export_type([openapi_item_attribute_detail/0]).

-type openapi_item_attribute_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'descriptions' := list(),
       'items' := list(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'descriptions' := Descriptions,
          'items' := Items,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'descriptions' => Descriptions,
       'items' => Items,
       'names' => Names
     }.
