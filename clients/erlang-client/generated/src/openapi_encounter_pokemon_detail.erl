-module(openapi_encounter_pokemon_detail).

-export([encode/1]).

-export_type([openapi_encounter_pokemon_detail/0]).

-type openapi_encounter_pokemon_detail() ::
    #{ 'min_perfect_ivs' => integer(),
       'always_shiny' => boolean(),
       'never_shiny' => boolean(),
       'is_alpha' => boolean()
     }.

encode(#{ 'min_perfect_ivs' := MinPerfectIvs,
          'always_shiny' := AlwaysShiny,
          'never_shiny' := NeverShiny,
          'is_alpha' := IsAlpha
        }) ->
    #{ 'min_perfect_ivs' => MinPerfectIvs,
       'always_shiny' => AlwaysShiny,
       'never_shiny' => NeverShiny,
       'is_alpha' => IsAlpha
     }.
