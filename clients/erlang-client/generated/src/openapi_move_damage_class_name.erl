-module(openapi_move_damage_class_name).

-export([encode/1]).

-export_type([openapi_move_damage_class_name/0]).

-type openapi_move_damage_class_name() ::
    #{ 'name' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'name' := Name,
          'language' := Language
        }) ->
    #{ 'name' => Name,
       'language' => Language
     }.
