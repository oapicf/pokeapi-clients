-module(openapi_pokemon_dex_number).

-export([encode/1]).

-export_type([openapi_pokemon_dex_number/0]).

-type openapi_pokemon_dex_number() ::
    #{ 'entry_number' := integer(),
       'pokemon_species' := openapi_pokemon_species_summary:openapi_pokemon_species_summary()
     }.

encode(#{ 'entry_number' := EntryNumber,
          'pokemon_species' := PokemonSpecies
        }) ->
    #{ 'entry_number' => EntryNumber,
       'pokemon_species' => PokemonSpecies
     }.
