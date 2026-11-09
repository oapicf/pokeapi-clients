#ifndef pokemon_held_item_TEST
#define pokemon_held_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_held_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_held_item.h"
pokemon_held_item_t* instantiate_pokemon_held_item(int include_optional);

#include "test_pokemon_summary.c"


pokemon_held_item_t* instantiate_pokemon_held_item(int include_optional) {
  pokemon_held_item_t* pokemon_held_item = NULL;
  if (include_optional) {
    pokemon_held_item = pokemon_held_item_create(
       // false, not to have infinite recursion
      instantiate_pokemon_summary(0),
      list_createList()
    );
  } else {
    pokemon_held_item = pokemon_held_item_create(
      NULL,
      list_createList()
    );
  }

  return pokemon_held_item;
}


#ifdef pokemon_held_item_MAIN

void test_pokemon_held_item(int include_optional) {
    pokemon_held_item_t* pokemon_held_item_1 = instantiate_pokemon_held_item(include_optional);

	cJSON* jsonpokemon_held_item_1 = pokemon_held_item_convertToJSON(pokemon_held_item_1);
	printf("pokemon_held_item :\n%s\n", cJSON_Print(jsonpokemon_held_item_1));
	pokemon_held_item_t* pokemon_held_item_2 = pokemon_held_item_parseFromJSON(jsonpokemon_held_item_1);
	cJSON* jsonpokemon_held_item_2 = pokemon_held_item_convertToJSON(pokemon_held_item_2);
	printf("repeating pokemon_held_item:\n%s\n", cJSON_Print(jsonpokemon_held_item_2));
}

int main() {
  test_pokemon_held_item(1);
  test_pokemon_held_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_held_item_MAIN
#endif // pokemon_held_item_TEST
