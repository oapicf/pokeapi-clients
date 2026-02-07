-module(openapi_generation_name).

-export([encode/1]).

-export_type([openapi_generation_name/0]).

-type openapi_generation_name() ::
    #{ 'name' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'name' := Name,
          'language' := Language
        }) ->
    #{ 'name' => Name,
       'language' => Language
     }.
