-module(openapi_encounter_method_detail).

-export([encode/1]).

-export_type([openapi_encounter_method_detail/0]).

-type openapi_encounter_method_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'order' => integer(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'order' := Order,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'order' => Order,
       'names' => Names
     }.
