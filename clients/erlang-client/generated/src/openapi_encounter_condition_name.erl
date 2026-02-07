-module(openapi_encounter_condition_name).

-export([encode/1]).

-export_type([openapi_encounter_condition_name/0]).

-type openapi_encounter_condition_name() ::
    #{ 'name' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'name' := Name,
          'language' := Language
        }) ->
    #{ 'name' => Name,
       'language' => Language
     }.
