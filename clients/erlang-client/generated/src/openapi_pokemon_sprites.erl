-module(openapi_pokemon_sprites).

-export([encode/1]).

-export_type([openapi_pokemon_sprites/0]).

-type openapi_pokemon_sprites() ::
    #{ 'front_default' := binary(),
       'front_shiny' := binary(),
       'front_female' := binary(),
       'front_shiny_female' := binary(),
       'back_default' := binary(),
       'back_shiny' := binary(),
       'back_female' := binary(),
       'back_shiny_female' := binary(),
       'other' => openapi_pokemon_sprites_other:openapi_pokemon_sprites_other(),
       'versions' => maps:map()
     }.

encode(#{ 'front_default' := FrontDefault,
          'front_shiny' := FrontShiny,
          'front_female' := FrontFemale,
          'front_shiny_female' := FrontShinyFemale,
          'back_default' := BackDefault,
          'back_shiny' := BackShiny,
          'back_female' := BackFemale,
          'back_shiny_female' := BackShinyFemale,
          'other' := Other,
          'versions' := Versions
        }) ->
    #{ 'front_default' => FrontDefault,
       'front_shiny' => FrontShiny,
       'front_female' => FrontFemale,
       'front_shiny_female' => FrontShinyFemale,
       'back_default' => BackDefault,
       'back_shiny' => BackShiny,
       'back_female' => BackFemale,
       'back_shiny_female' => BackShinyFemale,
       'other' => Other,
       'versions' => Versions
     }.
