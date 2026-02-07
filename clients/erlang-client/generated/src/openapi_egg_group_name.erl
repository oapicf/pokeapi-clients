-module(openapi_egg_group_name).

-export([encode/1]).

-export_type([openapi_egg_group_name/0]).

-type openapi_egg_group_name() ::
    #{ 'name' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'name' := Name,
          'language' := Language
        }) ->
    #{ 'name' => Name,
       'language' => Language
     }.
