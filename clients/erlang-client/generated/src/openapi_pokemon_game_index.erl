-module(openapi_pokemon_game_index).

-export([encode/1]).

-export_type([openapi_pokemon_game_index/0]).

-type openapi_pokemon_game_index() ::
    #{ 'game_index' := integer(),
       'version' := openapi_version_summary:openapi_version_summary()
     }.

encode(#{ 'game_index' := GameIndex,
          'version' := Version
        }) ->
    #{ 'game_index' => GameIndex,
       'version' => Version
     }.
