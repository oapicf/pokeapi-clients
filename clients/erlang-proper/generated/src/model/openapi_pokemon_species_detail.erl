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
  | {'egg_groups', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  | {'color', openapi_pokemon_color_summary:openapi_pokemon_color_summary() }
  | {'shape', openapi_pokemon_shape_summary:openapi_pokemon_shape_summary() }
  | {'evolves_from_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
  | {'evolution_chain', openapi_evolution_chain_summary:openapi_evolution_chain_summary() }
  | {'habitat', openapi_pokemon_habitat_summary:openapi_pokemon_habitat_summary() }
  | {'generation', openapi_generation_summary:openapi_generation_summary() }
  | {'names', list(openapi_pokemon_form_detail_form_names_inner:openapi_pokemon_form_detail_form_names_inner()) }
  | {'pal_park_encounters', list(openapi_pokemon_species_detail_pal_park_encounters_inner:openapi_pokemon_species_detail_pal_park_encounters_inner()) }
  | {'form_descriptions', list(openapi_pokemon_species_description:openapi_pokemon_species_description()) }
  | {'flavor_text_entries', list(openapi_pokemon_species_flavor_text:openapi_pokemon_species_flavor_text()) }
  | {'genera', list(openapi_pokemon_species_detail_genera_inner:openapi_pokemon_species_detail_genera_inner()) }
  | {'varieties', list(openapi_pokemon_species_detail_varieties_inner:openapi_pokemon_species_detail_varieties_inner()) }
  ].


openapi_pokemon_species_detail() ->
    openapi_pokemon_species_detail([]).

openapi_pokemon_species_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'order', integer() }
            , {'gender_rate', integer() }
            , {'capture_rate', integer() }
            , {'base_happiness', integer() }
            , {'is_baby', boolean() }
            , {'is_legendary', boolean() }
            , {'is_mythical', boolean() }
            , {'hatch_counter', integer() }
            , {'has_gender_differences', boolean() }
            , {'forms_switchable', boolean() }
            , {'growth_rate', openapi_growth_rate_summary:openapi_growth_rate_summary() }
            , {'pokedex_numbers', list(openapi_pokemon_dex_entry:openapi_pokemon_dex_entry()) }
            , {'egg_groups', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            , {'color', openapi_pokemon_color_summary:openapi_pokemon_color_summary() }
            , {'shape', openapi_pokemon_shape_summary:openapi_pokemon_shape_summary() }
            , {'evolves_from_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
            , {'evolution_chain', openapi_evolution_chain_summary:openapi_evolution_chain_summary() }
            , {'habitat', openapi_pokemon_habitat_summary:openapi_pokemon_habitat_summary() }
            , {'generation', openapi_generation_summary:openapi_generation_summary() }
            , {'names', list(openapi_pokemon_form_detail_form_names_inner:openapi_pokemon_form_detail_form_names_inner()) }
            , {'pal_park_encounters', list(openapi_pokemon_species_detail_pal_park_encounters_inner:openapi_pokemon_species_detail_pal_park_encounters_inner()) }
            , {'form_descriptions', list(openapi_pokemon_species_description:openapi_pokemon_species_description()) }
            , {'flavor_text_entries', list(openapi_pokemon_species_flavor_text:openapi_pokemon_species_flavor_text()) }
            , {'genera', list(openapi_pokemon_species_detail_genera_inner:openapi_pokemon_species_detail_genera_inner()) }
            , {'varieties', list(openapi_pokemon_species_detail_varieties_inner:openapi_pokemon_species_detail_varieties_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

