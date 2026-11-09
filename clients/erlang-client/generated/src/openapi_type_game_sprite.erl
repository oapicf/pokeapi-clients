-module(openapi_type_game_sprite).

-export([encode/1]).

-export_type([openapi_type_game_sprite/0]).

-type openapi_type_game_sprite() ::
    #{ 'name_icon' => binary(),
       'symbol_icon' => binary()
     }.

encode(#{ 'name_icon' := NameIcon,
          'symbol_icon' := SymbolIcon
        }) ->
    #{ 'name_icon' => NameIcon,
       'symbol_icon' => SymbolIcon
     }.
