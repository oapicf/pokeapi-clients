-module(openapi_move_target_name).

-export([encode/1]).

-export_type([openapi_move_target_name/0]).

-type openapi_move_target_name() ::
    #{ 'name' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'name' := Name,
          'language' := Language
        }) ->
    #{ 'name' => Name,
       'language' => Language
     }.
