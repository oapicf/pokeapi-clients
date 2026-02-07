-module(openapi_encounter_condition_detail).

-export([encode/1]).

-export_type([openapi_encounter_condition_detail/0]).

-type openapi_encounter_condition_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'values' := list(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'values' := Values,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'values' => Values,
       'names' => Names
     }.
