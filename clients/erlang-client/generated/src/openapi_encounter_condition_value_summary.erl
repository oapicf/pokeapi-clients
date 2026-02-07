-module(openapi_encounter_condition_value_summary).

-export([encode/1]).

-export_type([openapi_encounter_condition_value_summary/0]).

-type openapi_encounter_condition_value_summary() ::
    #{ 'name' := binary(),
       'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name' := Name,
          'url' := Url
        }) ->
    #{ 'name' => Name,
       'url' => Url
     }.
