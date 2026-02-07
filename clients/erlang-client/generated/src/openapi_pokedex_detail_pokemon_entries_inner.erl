-module(openapi_pokedex_detail_pokemon_entries_inner).

-export([encode/1]).

-export_type([openapi_pokedex_detail_pokemon_entries_inner/0]).

-type openapi_pokedex_detail_pokemon_entries_inner() ::
    #{ 'entry_number' := integer(),
       'pokemon_species' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'entry_number' := EntryNumber,
          'pokemon_species' := PokemonSpecies
        }) ->
    #{ 'entry_number' => EntryNumber,
       'pokemon_species' => PokemonSpecies
     }.
