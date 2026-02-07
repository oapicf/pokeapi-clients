-module(openapi_encounter_condition_value_detail).

-export([encode/1]).

-export_type([openapi_encounter_condition_value_detail/0]).

-type openapi_encounter_condition_value_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'condition' := openapi_encounter_condition_summary:openapi_encounter_condition_summary(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'condition' := Condition,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'condition' => Condition,
       'names' => Names
     }.
