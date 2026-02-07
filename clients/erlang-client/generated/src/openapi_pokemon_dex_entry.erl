-module(openapi_pokemon_dex_entry).

-export([encode/1]).

-export_type([openapi_pokemon_dex_entry/0]).

-type openapi_pokemon_dex_entry() ::
    #{ 'entry_number' := integer(),
       'pokedex' := openapi_pokedex_summary:openapi_pokedex_summary()
     }.

encode(#{ 'entry_number' := EntryNumber,
          'pokedex' := Pokedex
        }) ->
    #{ 'entry_number' => EntryNumber,
       'pokedex' => Pokedex
     }.
