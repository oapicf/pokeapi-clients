#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "type_detail.h"



static type_detail_t *type_detail_create_internal(
    int id,
    char *name,
    type_detail_damage_relations_t *damage_relations,
    list_t *past_damage_relations,
    list_t *game_indices,
    generation_summary_t *generation,
    move_damage_class_summary_t *move_damage_class,
    list_t *names,
    list_t *pokemon,
    list_t *moves,
    list_t* sprites
    ) {
    type_detail_t *type_detail_local_var = malloc(sizeof(type_detail_t));
    if (!type_detail_local_var) {
        return NULL;
    }
    type_detail_local_var->id = id;
    type_detail_local_var->name = name;
    type_detail_local_var->damage_relations = damage_relations;
    type_detail_local_var->past_damage_relations = past_damage_relations;
    type_detail_local_var->game_indices = game_indices;
    type_detail_local_var->generation = generation;
    type_detail_local_var->move_damage_class = move_damage_class;
    type_detail_local_var->names = names;
    type_detail_local_var->pokemon = pokemon;
    type_detail_local_var->moves = moves;
    type_detail_local_var->sprites = sprites;

    type_detail_local_var->_library_owned = 1;
    return type_detail_local_var;
}

__attribute__((deprecated)) type_detail_t *type_detail_create(
    int id,
    char *name,
    type_detail_damage_relations_t *damage_relations,
    list_t *past_damage_relations,
    list_t *game_indices,
    generation_summary_t *generation,
    move_damage_class_summary_t *move_damage_class,
    list_t *names,
    list_t *pokemon,
    list_t *moves,
    list_t* sprites
    ) {
    return type_detail_create_internal (
        id,
        name,
        damage_relations,
        past_damage_relations,
        game_indices,
        generation,
        move_damage_class,
        names,
        pokemon,
        moves,
        sprites
        );
}

void type_detail_free(type_detail_t *type_detail) {
    if(NULL == type_detail){
        return ;
    }
    if(type_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "type_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (type_detail->name) {
        free(type_detail->name);
        type_detail->name = NULL;
    }
    if (type_detail->damage_relations) {
        type_detail_damage_relations_free(type_detail->damage_relations);
        type_detail->damage_relations = NULL;
    }
    if (type_detail->past_damage_relations) {
        list_ForEach(listEntry, type_detail->past_damage_relations) {
            type_detail_past_damage_relations_inner_free(listEntry->data);
        }
        list_freeList(type_detail->past_damage_relations);
        type_detail->past_damage_relations = NULL;
    }
    if (type_detail->game_indices) {
        list_ForEach(listEntry, type_detail->game_indices) {
            type_game_index_free(listEntry->data);
        }
        list_freeList(type_detail->game_indices);
        type_detail->game_indices = NULL;
    }
    if (type_detail->generation) {
        generation_summary_free(type_detail->generation);
        type_detail->generation = NULL;
    }
    if (type_detail->move_damage_class) {
        move_damage_class_summary_free(type_detail->move_damage_class);
        type_detail->move_damage_class = NULL;
    }
    if (type_detail->names) {
        list_ForEach(listEntry, type_detail->names) {
            ability_name_free(listEntry->data);
        }
        list_freeList(type_detail->names);
        type_detail->names = NULL;
    }
    if (type_detail->pokemon) {
        list_ForEach(listEntry, type_detail->pokemon) {
            type_detail_pokemon_inner_free(listEntry->data);
        }
        list_freeList(type_detail->pokemon);
        type_detail->pokemon = NULL;
    }
    if (type_detail->moves) {
        list_ForEach(listEntry, type_detail->moves) {
            move_summary_free(listEntry->data);
        }
        list_freeList(type_detail->moves);
        type_detail->moves = NULL;
    }
    if (type_detail->sprites) {
        list_ForEach(listEntry, type_detail->sprites) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(type_detail->sprites);
        type_detail->sprites = NULL;
    }
    free(type_detail);
}

cJSON *type_detail_convertToJSON(type_detail_t *type_detail) {
    cJSON *item = cJSON_CreateObject();

    // type_detail->id
    if (!type_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", type_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // type_detail->name
    if (!type_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", type_detail->name) == NULL) {
    goto fail; //String
    }


    // type_detail->damage_relations
    if (!type_detail->damage_relations) {
        goto fail;
    }
    cJSON *damage_relations_local_JSON = type_detail_damage_relations_convertToJSON(type_detail->damage_relations);
    if(damage_relations_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "damage_relations", damage_relations_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // type_detail->past_damage_relations
    if (!type_detail->past_damage_relations) {
        goto fail;
    }
    cJSON *past_damage_relations = cJSON_AddArrayToObject(item, "past_damage_relations");
    if(past_damage_relations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *past_damage_relationsListEntry;
    if (type_detail->past_damage_relations) {
    list_ForEach(past_damage_relationsListEntry, type_detail->past_damage_relations) {
    cJSON *itemLocal = type_detail_past_damage_relations_inner_convertToJSON(past_damage_relationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(past_damage_relations, itemLocal);
    }
    }


    // type_detail->game_indices
    if (!type_detail->game_indices) {
        goto fail;
    }
    cJSON *game_indices = cJSON_AddArrayToObject(item, "game_indices");
    if(game_indices == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *game_indicesListEntry;
    if (type_detail->game_indices) {
    list_ForEach(game_indicesListEntry, type_detail->game_indices) {
    cJSON *itemLocal = type_game_index_convertToJSON(game_indicesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(game_indices, itemLocal);
    }
    }


    // type_detail->generation
    if (!type_detail->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = generation_summary_convertToJSON(type_detail->generation);
    if(generation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "generation", generation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // type_detail->move_damage_class
    if (!type_detail->move_damage_class) {
        goto fail;
    }
    cJSON *move_damage_class_local_JSON = move_damage_class_summary_convertToJSON(type_detail->move_damage_class);
    if(move_damage_class_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "move_damage_class", move_damage_class_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // type_detail->names
    if (!type_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (type_detail->names) {
    list_ForEach(namesListEntry, type_detail->names) {
    cJSON *itemLocal = ability_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // type_detail->pokemon
    if (!type_detail->pokemon) {
        goto fail;
    }
    cJSON *pokemon = cJSON_AddArrayToObject(item, "pokemon");
    if(pokemon == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokemonListEntry;
    if (type_detail->pokemon) {
    list_ForEach(pokemonListEntry, type_detail->pokemon) {
    cJSON *itemLocal = type_detail_pokemon_inner_convertToJSON(pokemonListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pokemon, itemLocal);
    }
    }


    // type_detail->moves
    if (!type_detail->moves) {
        goto fail;
    }
    cJSON *moves = cJSON_AddArrayToObject(item, "moves");
    if(moves == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *movesListEntry;
    if (type_detail->moves) {
    list_ForEach(movesListEntry, type_detail->moves) {
    cJSON *itemLocal = move_summary_convertToJSON(movesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(moves, itemLocal);
    }
    }


    // type_detail->sprites
    if (!type_detail->sprites) {
        goto fail;
    }
    cJSON *sprites = cJSON_AddObjectToObject(item, "sprites");
    if(sprites == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = sprites;
    listEntry_t *spritesListEntry;
    if (type_detail->sprites) {
    list_ForEach(spritesListEntry, type_detail->sprites) {
        keyValuePair_t *localKeyValue = spritesListEntry->data;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

type_detail_t *type_detail_parseFromJSON(cJSON *type_detailJSON){

    type_detail_t *type_detail_local_var = NULL;

    // define the local variable for type_detail->damage_relations
    type_detail_damage_relations_t *damage_relations_local_nonprim = NULL;

    // define the local list for type_detail->past_damage_relations
    list_t *past_damage_relationsList = NULL;

    // define the local list for type_detail->game_indices
    list_t *game_indicesList = NULL;

    // define the local variable for type_detail->generation
    generation_summary_t *generation_local_nonprim = NULL;

    // define the local variable for type_detail->move_damage_class
    move_damage_class_summary_t *move_damage_class_local_nonprim = NULL;

    // define the local list for type_detail->names
    list_t *namesList = NULL;

    // define the local list for type_detail->pokemon
    list_t *pokemonList = NULL;

    // define the local list for type_detail->moves
    list_t *movesList = NULL;

    // define the local map for type_detail->sprites
    list_t *spritesList = NULL;

    // type_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(type_detailJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // type_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(type_detailJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // type_detail->damage_relations
    cJSON *damage_relations = cJSON_GetObjectItemCaseSensitive(type_detailJSON, "damage_relations");
    if (cJSON_IsNull(damage_relations)) {
        damage_relations = NULL;
    }
    if (!damage_relations) {
        goto end;
    }

    
    damage_relations_local_nonprim = type_detail_damage_relations_parseFromJSON(damage_relations); //nonprimitive

    // type_detail->past_damage_relations
    cJSON *past_damage_relations = cJSON_GetObjectItemCaseSensitive(type_detailJSON, "past_damage_relations");
    if (cJSON_IsNull(past_damage_relations)) {
        past_damage_relations = NULL;
    }
    if (!past_damage_relations) {
        goto end;
    }

    
    cJSON *past_damage_relations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(past_damage_relations)){
        goto end; //nonprimitive container
    }

    past_damage_relationsList = list_createList();

    cJSON_ArrayForEach(past_damage_relations_local_nonprimitive,past_damage_relations )
    {
        if(!cJSON_IsObject(past_damage_relations_local_nonprimitive)){
            goto end;
        }
        type_detail_past_damage_relations_inner_t *past_damage_relationsItem = type_detail_past_damage_relations_inner_parseFromJSON(past_damage_relations_local_nonprimitive);

        list_addElement(past_damage_relationsList, past_damage_relationsItem);
    }

    // type_detail->game_indices
    cJSON *game_indices = cJSON_GetObjectItemCaseSensitive(type_detailJSON, "game_indices");
    if (cJSON_IsNull(game_indices)) {
        game_indices = NULL;
    }
    if (!game_indices) {
        goto end;
    }

    
    cJSON *game_indices_local_nonprimitive = NULL;
    if(!cJSON_IsArray(game_indices)){
        goto end; //nonprimitive container
    }

    game_indicesList = list_createList();

    cJSON_ArrayForEach(game_indices_local_nonprimitive,game_indices )
    {
        if(!cJSON_IsObject(game_indices_local_nonprimitive)){
            goto end;
        }
        type_game_index_t *game_indicesItem = type_game_index_parseFromJSON(game_indices_local_nonprimitive);

        list_addElement(game_indicesList, game_indicesItem);
    }

    // type_detail->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(type_detailJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = generation_summary_parseFromJSON(generation); //nonprimitive

    // type_detail->move_damage_class
    cJSON *move_damage_class = cJSON_GetObjectItemCaseSensitive(type_detailJSON, "move_damage_class");
    if (cJSON_IsNull(move_damage_class)) {
        move_damage_class = NULL;
    }
    if (!move_damage_class) {
        goto end;
    }

    
    move_damage_class_local_nonprim = move_damage_class_summary_parseFromJSON(move_damage_class); //nonprimitive

    // type_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(type_detailJSON, "names");
    if (cJSON_IsNull(names)) {
        names = NULL;
    }
    if (!names) {
        goto end;
    }

    
    cJSON *names_local_nonprimitive = NULL;
    if(!cJSON_IsArray(names)){
        goto end; //nonprimitive container
    }

    namesList = list_createList();

    cJSON_ArrayForEach(names_local_nonprimitive,names )
    {
        if(!cJSON_IsObject(names_local_nonprimitive)){
            goto end;
        }
        ability_name_t *namesItem = ability_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // type_detail->pokemon
    cJSON *pokemon = cJSON_GetObjectItemCaseSensitive(type_detailJSON, "pokemon");
    if (cJSON_IsNull(pokemon)) {
        pokemon = NULL;
    }
    if (!pokemon) {
        goto end;
    }

    
    cJSON *pokemon_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pokemon)){
        goto end; //nonprimitive container
    }

    pokemonList = list_createList();

    cJSON_ArrayForEach(pokemon_local_nonprimitive,pokemon )
    {
        if(!cJSON_IsObject(pokemon_local_nonprimitive)){
            goto end;
        }
        type_detail_pokemon_inner_t *pokemonItem = type_detail_pokemon_inner_parseFromJSON(pokemon_local_nonprimitive);

        list_addElement(pokemonList, pokemonItem);
    }

    // type_detail->moves
    cJSON *moves = cJSON_GetObjectItemCaseSensitive(type_detailJSON, "moves");
    if (cJSON_IsNull(moves)) {
        moves = NULL;
    }
    if (!moves) {
        goto end;
    }

    
    cJSON *moves_local_nonprimitive = NULL;
    if(!cJSON_IsArray(moves)){
        goto end; //nonprimitive container
    }

    movesList = list_createList();

    cJSON_ArrayForEach(moves_local_nonprimitive,moves )
    {
        if(!cJSON_IsObject(moves_local_nonprimitive)){
            goto end;
        }
        move_summary_t *movesItem = move_summary_parseFromJSON(moves_local_nonprimitive);

        list_addElement(movesList, movesItem);
    }

    // type_detail->sprites
    cJSON *sprites = cJSON_GetObjectItemCaseSensitive(type_detailJSON, "sprites");
    if (cJSON_IsNull(sprites)) {
        sprites = NULL;
    }
    if (!sprites) {
        goto end;
    }

    
    cJSON *sprites_local_map = NULL;
    if(!cJSON_IsObject(sprites) && !cJSON_IsNull(sprites))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(sprites))
    {
        spritesList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(sprites_local_map, sprites)
        {
            cJSON *localMapObject = sprites_local_map;
            list_addElement(spritesList , localMapKeyPair);
        }
    }


    type_detail_local_var = type_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        damage_relations_local_nonprim,
        past_damage_relationsList,
        game_indicesList,
        generation_local_nonprim,
        move_damage_class_local_nonprim,
        namesList,
        pokemonList,
        movesList,
        spritesList
        );

    return type_detail_local_var;
end:
    if (damage_relations_local_nonprim) {
        type_detail_damage_relations_free(damage_relations_local_nonprim);
        damage_relations_local_nonprim = NULL;
    }
    if (past_damage_relationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, past_damage_relationsList) {
            type_detail_past_damage_relations_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(past_damage_relationsList);
        past_damage_relationsList = NULL;
    }
    if (game_indicesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, game_indicesList) {
            type_game_index_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(game_indicesList);
        game_indicesList = NULL;
    }
    if (generation_local_nonprim) {
        generation_summary_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    if (move_damage_class_local_nonprim) {
        move_damage_class_summary_free(move_damage_class_local_nonprim);
        move_damage_class_local_nonprim = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            ability_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (pokemonList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokemonList) {
            type_detail_pokemon_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokemonList);
        pokemonList = NULL;
    }
    if (movesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, movesList) {
            move_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(movesList);
        movesList = NULL;
    }
    if (spritesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, spritesList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(spritesList);
        spritesList = NULL;
    }
    return NULL;

}
