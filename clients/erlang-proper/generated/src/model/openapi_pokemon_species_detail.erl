-module(openapi_pokemon_species_detail).

-include("openapi.hrl").

-export([openapi_pokemon_species_detail/0]).

-export([openapi_pokemon_species_detail/1]).

-export_type([openapi_pokemon_species_detail/0]).

-type openapi_pokemon_species_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'order', integer() }
  | {'gender_rate', integer() }
  | {'capture_rate', integer() }
  | {'base_happiness', integer() }
  | {'is_baby', boolean() }
  | {'is_legendary', boolean() }
  | {'is_mythical', boolean() }
  | {'hatch_counter', integer() }
  | {'has_gender_differences', boolean() }
  | {'forms_switchable', boolean() }
  | {'growth_rate', openapi_growth_rate_summary:openapi_growth_rate_summary() }
  | {'pokedex_numbers', list(openapi_pokemon_dex_entry:openapi_pokemon_dex_entry()) }
  | {'egg_groups', list(openapi_egg_group_summary:openapi_egg_group_summary()) }
  | {'color', openapi_pokemon_color_summary:openapi_pokemon_color_summary() }
  | {'shape', openapi_pokemon_shape_summary:openapi_pokemon_shape_summary() }
  | {'evolves_from_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
  | {'evolution_chain', openapi_evolution_chain_summary:openapi_evolution_chain_summary() }
  | {'habitat', openapi_pokemon_habitat_summary:openapi_pokemon_habitat_summary() }
  | {'generation', openapi_generation_summary:openapi_generation_summary() }
  | {'names', list(openapi_pokemon_species_name:openapi_pokemon_species_name()) }
  | {'pal_park_encounters', list(openapi_pokemon_species_pal_park_encounter:openapi_pokemon_species_pal_park_encounter()) }
  | {'form_descriptions', list(openapi_pokemon_species_description:openapi_pokemon_species_description()) }
  | {'flavor_text_entries', list(openapi_pokemon_species_flavor_text:openapi_pokemon_species_flavor_text()) }
  | {'genera', list(openapi_pokemon_species_genus:openapi_pokemon_species_genus()) }
  | {'varieties', list(openapi_pokemon_species_variety:openapi_pokemon_species_variety()) }
  ].


openapi_pokemon_species_detail() ->
    openapi_pokemon_species_detail([]).

openapi_pokemon_species_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'order', integer(-2147483648, 2147483647) }
            , {'gender_rate', integer(-2147483648, 2147483647) }
            , {'capture_rate', integer(-2147483648, 2147483647) }
            , {'base_happiness', integer(-2147483648, 2147483647) }
            , {'is_baby', boolean() }
            , {'is_legendary', boolean() }
            , {'is_mythical', boolean() }
            , {'hatch_counter', integer(-2147483648, 2147483647) }
            , {'has_gender_differences', boolean() }
            , {'forms_switchable', boolean() }
            , {'growth_rate', openapi_growth_rate_summary:openapi_growth_rate_summary() }
            , {'pokedex_numbers', list(openapi_pokemon_dex_entry:openapi_pokemon_dex_entry()) }
            , {'egg_groups', list(openapi_egg_group_summary:openapi_egg_group_summary()) }
            , {'color', openapi_pokemon_color_summary:openapi_pokemon_color_summary() }
            , {'shape', openapi_pokemon_shape_summary:openapi_pokemon_shape_summary() }
            , {'evolves_from_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
            , {'evolution_chain', openapi_evolution_chain_summary:openapi_evolution_chain_summary() }
            , {'habitat', openapi_pokemon_habitat_summary:openapi_pokemon_habitat_summary() }
            , {'generation', openapi_generation_summary:openapi_generation_summary() }
            , {'names', list(openapi_pokemon_species_name:openapi_pokemon_species_name()) }
            , {'pal_park_encounters', list(openapi_pokemon_species_pal_park_encounter:openapi_pokemon_species_pal_park_encounter()) }
            , {'form_descriptions', list(openapi_pokemon_species_description:openapi_pokemon_species_description()) }
            , {'flavor_text_entries', list(openapi_pokemon_species_flavor_text:openapi_pokemon_species_flavor_text()) }
            , {'genera', list(openapi_pokemon_species_genus:openapi_pokemon_species_genus()) }
            , {'varieties', list(openapi_pokemon_species_variety:openapi_pokemon_species_variety()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

