/*
 * pokemon_form_detail.h
 *
 * 
 */

#ifndef _pokemon_form_detail_H_
#define _pokemon_form_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_form_detail_t pokemon_form_detail_t;

#include "pokemon_detail_types_inner.h"
#include "pokemon_form_detail_form_names_inner.h"
#include "pokemon_form_detail_sprites.h"
#include "pokemon_summary.h"
#include "version_group_summary.h"



typedef struct pokemon_form_detail_t {
    int id; //numeric
    char *name; // string
    int order; //numeric
    int form_order; //numeric
    int is_default; //boolean
    int is_battle_only; //boolean
    int is_mega; //boolean
    char *form_name; // string
    struct pokemon_summary_t *pokemon; //model
    pokemon_form_detail_sprites_t *sprites; // custom
    struct version_group_summary_t *version_group; //model
    list_t *form_names; //nonprimitive container
    list_t *names; //nonprimitive container
    list_t *types; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_form_detail_t;

__attribute__((deprecated)) pokemon_form_detail_t *pokemon_form_detail_create(
    int id,
    char *name,
    int order,
    int form_order,
    int is_default,
    int is_battle_only,
    int is_mega,
    char *form_name,
    pokemon_summary_t *pokemon,
    pokemon_form_detail_sprites_t *sprites,
    version_group_summary_t *version_group,
    list_t *form_names,
    list_t *names,
    list_t *types
);

void pokemon_form_detail_free(pokemon_form_detail_t *pokemon_form_detail);

pokemon_form_detail_t *pokemon_form_detail_parseFromJSON(cJSON *pokemon_form_detailJSON);

cJSON *pokemon_form_detail_convertToJSON(pokemon_form_detail_t *pokemon_form_detail);

#endif /* _pokemon_form_detail_H_ */

