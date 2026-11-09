-module(openapi_pokemon_sprites_other_home).

-export([encode/1]).

-export_type([openapi_pokemon_sprites_other_home/0]).

-type openapi_pokemon_sprites_other_home() ::
    #{ 'front_default' := binary(),
       'front_female' := binary(),
       'front_shiny' := binary(),
       'front_shiny_female' := binary()
     }.

encode(#{ 'front_default' := FrontDefault,
          'front_female' := FrontFemale,
          'front_shiny' := FrontShiny,
          'front_shiny_female' := FrontShinyFemale
        }) ->
    #{ 'front_default' => FrontDefault,
       'front_female' => FrontFemale,
       'front_shiny' => FrontShiny,
       'front_shiny_female' => FrontShinyFemale
     }.
