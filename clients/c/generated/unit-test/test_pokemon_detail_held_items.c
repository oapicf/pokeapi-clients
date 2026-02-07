#ifndef pokemon_detail_held_items_TEST
#define pokemon_detail_held_items_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_detail_held_items_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_detail_held_items.h"
pokemon_detail_held_items_t* instantiate_pokemon_detail_held_items(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


pokemon_detail_held_items_t* instantiate_pokemon_detail_held_items(int include_optional) {
  pokemon_detail_held_items_t* pokemon_detail_held_items = NULL;
  if (include_optional) {
    pokemon_detail_held_items = pokemon_detail_held_items_create(
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0),
      list_createList()
    );
  } else {
    pokemon_detail_held_items = pokemon_detail_held_items_create(
      NULL,
      list_createList()
    );
  }

  return pokemon_detail_held_items;
}


#ifdef pokemon_detail_held_items_MAIN

void test_pokemon_detail_held_items(int include_optional) {
    pokemon_detail_held_items_t* pokemon_detail_held_items_1 = instantiate_pokemon_detail_held_items(include_optional);

	cJSON* jsonpokemon_detail_held_items_1 = pokemon_detail_held_items_convertToJSON(pokemon_detail_held_items_1);
	printf("pokemon_detail_held_items :\n%s\n", cJSON_Print(jsonpokemon_detail_held_items_1));
	pokemon_detail_held_items_t* pokemon_detail_held_items_2 = pokemon_detail_held_items_parseFromJSON(jsonpokemon_detail_held_items_1);
	cJSON* jsonpokemon_detail_held_items_2 = pokemon_detail_held_items_convertToJSON(pokemon_detail_held_items_2);
	printf("repeating pokemon_detail_held_items:\n%s\n", cJSON_Print(jsonpokemon_detail_held_items_2));
}

int main() {
  test_pokemon_detail_held_items(1);
  test_pokemon_detail_held_items(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_detail_held_items_MAIN
#endif // pokemon_detail_held_items_TEST
