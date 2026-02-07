-module(openapi_language_name).

-export([encode/1]).

-export_type([openapi_language_name/0]).

-type openapi_language_name() ::
    #{ 'name' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'name' := Name,
          'language' := Language
        }) ->
    #{ 'name' => Name,
       'language' => Language
     }.
