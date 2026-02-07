-module(openapi_type_game_index).

-export([encode/1]).

-export_type([openapi_type_game_index/0]).

-type openapi_type_game_index() ::
    #{ 'game_index' := integer(),
       'generation' := openapi_generation_summary:openapi_generation_summary()
     }.

encode(#{ 'game_index' := GameIndex,
          'generation' := Generation
        }) ->
    #{ 'game_index' => GameIndex,
       'generation' => Generation
     }.
