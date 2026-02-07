-module(openapi_pokemon_species_flavor_text).

-export([encode/1]).

-export_type([openapi_pokemon_species_flavor_text/0]).

-type openapi_pokemon_species_flavor_text() ::
    #{ 'flavor_text' := binary(),
       'language' := openapi_language_summary:openapi_language_summary(),
       'version' := openapi_version_summary:openapi_version_summary()
     }.

encode(#{ 'flavor_text' := FlavorText,
          'language' := Language,
          'version' := Version
        }) ->
    #{ 'flavor_text' => FlavorText,
       'language' => Language,
       'version' => Version
     }.
