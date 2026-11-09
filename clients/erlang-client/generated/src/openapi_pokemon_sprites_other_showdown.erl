-module(openapi_pokemon_sprites_other_showdown).

-export([encode/1]).

-export_type([openapi_pokemon_sprites_other_showdown/0]).

-type openapi_pokemon_sprites_other_showdown() ::
    #{ 'front_default' := binary(),
       'front_female' := binary(),
       'front_shiny' := binary(),
       'front_shiny_female' := binary(),
       'back_default' := binary(),
       'back_female' := binary(),
       'back_shiny' := binary(),
       'back_shiny_female' := binary()
     }.

encode(#{ 'front_default' := FrontDefault,
          'front_female' := FrontFemale,
          'front_shiny' := FrontShiny,
          'front_shiny_female' := FrontShinyFemale,
          'back_default' := BackDefault,
          'back_female' := BackFemale,
          'back_shiny' := BackShiny,
          'back_shiny_female' := BackShinyFemale
        }) ->
    #{ 'front_default' => FrontDefault,
       'front_female' => FrontFemale,
       'front_shiny' => FrontShiny,
       'front_shiny_female' => FrontShinyFemale,
       'back_default' => BackDefault,
       'back_female' => BackFemale,
       'back_shiny' => BackShiny,
       'back_shiny_female' => BackShinyFemale
     }.
