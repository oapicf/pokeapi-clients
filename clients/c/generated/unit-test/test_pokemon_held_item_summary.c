#ifndef pokemon_held_item_summary_TEST
#define pokemon_held_item_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_held_item_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_held_item_summary.h"
pokemon_held_item_summary_t* instantiate_pokemon_held_item_summary(int include_optional);

#include "test_item_summary.c"


pokemon_held_item_summary_t* instantiate_pokemon_held_item_summary(int include_optional) {
  pokemon_held_item_summary_t* pokemon_held_item_summary = NULL;
  if (include_optional) {
    pokemon_held_item_summary = pokemon_held_item_summary_create(
       // false, not to have infinite recursion
      instantiate_item_summary(0),
      list_createList()
    );
  } else {
    pokemon_held_item_summary = pokemon_held_item_summary_create(
      NULL,
      list_createList()
    );
  }

  return pokemon_held_item_summary;
}


#ifdef pokemon_held_item_summary_MAIN

void test_pokemon_held_item_summary(int include_optional) {
    pokemon_held_item_summary_t* pokemon_held_item_summary_1 = instantiate_pokemon_held_item_summary(include_optional);

	cJSON* jsonpokemon_held_item_summary_1 = pokemon_held_item_summary_convertToJSON(pokemon_held_item_summary_1);
	printf("pokemon_held_item_summary :\n%s\n", cJSON_Print(jsonpokemon_held_item_summary_1));
	pokemon_held_item_summary_t* pokemon_held_item_summary_2 = pokemon_held_item_summary_parseFromJSON(jsonpokemon_held_item_summary_1);
	cJSON* jsonpokemon_held_item_summary_2 = pokemon_held_item_summary_convertToJSON(pokemon_held_item_summary_2);
	printf("repeating pokemon_held_item_summary:\n%s\n", cJSON_Print(jsonpokemon_held_item_summary_2));
}

int main() {
  test_pokemon_held_item_summary(1);
  test_pokemon_held_item_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_held_item_summary_MAIN
#endif // pokemon_held_item_summary_TEST
