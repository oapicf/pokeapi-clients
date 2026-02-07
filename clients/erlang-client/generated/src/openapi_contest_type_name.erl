-module(openapi_contest_type_name).

-export([encode/1]).

-export_type([openapi_contest_type_name/0]).

-type openapi_contest_type_name() ::
    #{ 'name' := binary(),
       'color' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'name' := Name,
          'color' := Color,
          'language' := Language
        }) ->
    #{ 'name' => Name,
       'color' => Color,
       'language' => Language
     }.
