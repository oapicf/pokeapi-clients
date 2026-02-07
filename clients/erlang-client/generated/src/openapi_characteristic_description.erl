-module(openapi_characteristic_description).

-export([encode/1]).

-export_type([openapi_characteristic_description/0]).

-type openapi_characteristic_description() ::
    #{ 'description' => binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'description' := Description,
          'language' := Language
        }) ->
    #{ 'description' => Description,
       'language' => Language
     }.
