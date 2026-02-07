-module(openapi_version_name).

-export([encode/1]).

-export_type([openapi_version_name/0]).

-type openapi_version_name() ::
    #{ 'name' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'name' := Name,
          'language' := Language
        }) ->
    #{ 'name' => Name,
       'language' => Language
     }.
