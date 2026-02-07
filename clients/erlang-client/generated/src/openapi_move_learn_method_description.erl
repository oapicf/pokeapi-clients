-module(openapi_move_learn_method_description).

-export([encode/1]).

-export_type([openapi_move_learn_method_description/0]).

-type openapi_move_learn_method_description() ::
    #{ 'description' => binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'description' := Description,
          'language' := Language
        }) ->
    #{ 'description' => Description,
       'language' => Language
     }.
