-module(openapi_pokemon_species_flavor_text).

-include("openapi.hrl").

-export([openapi_pokemon_species_flavor_text/0]).

-export([openapi_pokemon_species_flavor_text/1]).

-export_type([openapi_pokemon_species_flavor_text/0]).

-type openapi_pokemon_species_flavor_text() ::
  [ {'flavor_text', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  | {'version', openapi_version_summary:openapi_version_summary() }
  ].


openapi_pokemon_species_flavor_text() ->
    openapi_pokemon_species_flavor_text([]).

openapi_pokemon_species_flavor_text(Fields) ->
  Default = [ {'flavor_text', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            , {'version', openapi_version_summary:openapi_version_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

