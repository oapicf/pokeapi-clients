-module(openapi_pokemon_sprites_other_dream_world).

-export([encode/1]).

-export_type([openapi_pokemon_sprites_other_dream_world/0]).

-type openapi_pokemon_sprites_other_dream_world() ::
    #{ 'front_default' := binary(),
       'front_female' := binary()
     }.

encode(#{ 'front_default' := FrontDefault,
          'front_female' := FrontFemale
        }) ->
    #{ 'front_default' => FrontDefault,
       'front_female' => FrontFemale
     }.
