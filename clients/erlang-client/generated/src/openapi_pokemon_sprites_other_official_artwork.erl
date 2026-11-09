-module(openapi_pokemon_sprites_other_official_artwork).

-export([encode/1]).

-export_type([openapi_pokemon_sprites_other_official_artwork/0]).

-type openapi_pokemon_sprites_other_official_artwork() ::
    #{ 'front_default' := binary(),
       'front_shiny' := binary(),
       'versions' => maps:map()
     }.

encode(#{ 'front_default' := FrontDefault,
          'front_shiny' := FrontShiny,
          'versions' := Versions
        }) ->
    #{ 'front_default' => FrontDefault,
       'front_shiny' => FrontShiny,
       'versions' => Versions
     }.
