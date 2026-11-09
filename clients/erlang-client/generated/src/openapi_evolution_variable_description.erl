-module(openapi_evolution_variable_description).

-export([encode/1]).

-export_type([openapi_evolution_variable_description/0]).

-type openapi_evolution_variable_description() ::
    #{ 'description' => binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'description' := Description,
          'language' := Language
        }) ->
    #{ 'description' => Description,
       'language' => Language
     }.
