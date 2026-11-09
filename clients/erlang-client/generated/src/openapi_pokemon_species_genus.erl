-module(openapi_pokemon_species_genus).

-export([encode/1]).

-export_type([openapi_pokemon_species_genus/0]).

-type openapi_pokemon_species_genus() ::
    #{ 'genus' := binary(),
       'language' := openapi_language_summary:openapi_language_summary()
     }.

encode(#{ 'genus' := Genus,
          'language' := Language
        }) ->
    #{ 'genus' => Genus,
       'language' => Language
     }.
