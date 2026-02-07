/*
 * pokemon_species_detail.h
 *
 * 
 */

#ifndef _pokemon_species_detail_H_
#define _pokemon_species_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_species_detail_t pokemon_species_detail_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "evolution_chain_summary.h"
#include "generation_summary.h"
#include "growth_rate_summary.h"
#include "pokemon_color_summary.h"
#include "pokemon_dex_entry.h"
#include "pokemon_form_detail_form_names_inner.h"
#include "pokemon_habitat_summary.h"
#include "pokemon_shape_summary.h"
#include "pokemon_species_description.h"
#include "pokemon_species_detail_genera_inner.h"
#include "pokemon_species_detail_pal_park_encounters_inner.h"
#include "pokemon_species_detail_varieties_inner.h"
#include "pokemon_species_flavor_text.h"
#include "pokemon_species_summary.h"



typedef struct pokemon_species_detail_t {
    int id; //numeric
    char *name; // string
    int order; //numeric
    int gender_rate; //numeric
    int capture_rate; //numeric
    int base_happiness; //numeric
    int is_baby; //boolean
    int is_legendary; //boolean
    int is_mythical; //boolean
    int hatch_counter; //numeric
    int has_gender_differences; //boolean
    int forms_switchable; //boolean
    struct growth_rate_summary_t *growth_rate; //model
    list_t *pokedex_numbers; //nonprimitive container
    list_t *egg_groups; //nonprimitive container
    struct pokemon_color_summary_t *color; //model
    struct pokemon_shape_summary_t *shape; //model
    struct pokemon_species_summary_t *evolves_from_species; //model
    struct evolution_chain_summary_t *evolution_chain; //model
    struct pokemon_habitat_summary_t *habitat; //model
    struct generation_summary_t *generation; //model
    list_t *names; //nonprimitive container
    list_t *pal_park_encounters; //nonprimitive container
    list_t *form_descriptions; //nonprimitive container
    list_t *flavor_text_entries; //nonprimitive container
    list_t *genera; //nonprimitive container
    list_t *varieties; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_species_detail_t;

__attribute__((deprecated)) pokemon_species_detail_t *pokemon_species_detail_create(
    int id,
    char *name,
    int order,
    int gender_rate,
    int capture_rate,
    int base_happiness,
    int is_baby,
    int is_legendary,
    int is_mythical,
    int hatch_counter,
    int has_gender_differences,
    int forms_switchable,
    growth_rate_summary_t *growth_rate,
    list_t *pokedex_numbers,
    list_t *egg_groups,
    pokemon_color_summary_t *color,
    pokemon_shape_summary_t *shape,
    pokemon_species_summary_t *evolves_from_species,
    evolution_chain_summary_t *evolution_chain,
    pokemon_habitat_summary_t *habitat,
    generation_summary_t *generation,
    list_t *names,
    list_t *pal_park_encounters,
    list_t *form_descriptions,
    list_t *flavor_text_entries,
    list_t *genera,
    list_t *varieties
);

void pokemon_species_detail_free(pokemon_species_detail_t *pokemon_species_detail);

pokemon_species_detail_t *pokemon_species_detail_parseFromJSON(cJSON *pokemon_species_detailJSON);

cJSON *pokemon_species_detail_convertToJSON(pokemon_species_detail_t *pokemon_species_detail);

#endif /* _pokemon_species_detail_H_ */

