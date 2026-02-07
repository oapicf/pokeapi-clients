-module(openapi_pokedex_name).

-export([encode/1]).

-export_type([openapi_pokedex_name/0]).

-type openapi_pokedex_name() ::
    #{ 'name' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'name' := Name,
          'language' := Language
        }) ->
    #{ 'name' => Name,
       'language' => Language
     }.
