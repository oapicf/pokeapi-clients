#ifndef pokemon_held_item_version_TEST
#define pokemon_held_item_version_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_held_item_version_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_held_item_version.h"
pokemon_held_item_version_t* instantiate_pokemon_held_item_version(int include_optional);

#include "test_version_summary.c"


pokemon_held_item_version_t* instantiate_pokemon_held_item_version(int include_optional) {
  pokemon_held_item_version_t* pokemon_held_item_version = NULL;
  if (include_optional) {
    pokemon_held_item_version = pokemon_held_item_version_create(
      56,
       // false, not to have infinite recursion
      instantiate_version_summary(0)
    );
  } else {
    pokemon_held_item_version = pokemon_held_item_version_create(
      56,
      NULL
    );
  }

  return pokemon_held_item_version;
}


#ifdef pokemon_held_item_version_MAIN

void test_pokemon_held_item_version(int include_optional) {
    pokemon_held_item_version_t* pokemon_held_item_version_1 = instantiate_pokemon_held_item_version(include_optional);

	cJSON* jsonpokemon_held_item_version_1 = pokemon_held_item_version_convertToJSON(pokemon_held_item_version_1);
	printf("pokemon_held_item_version :\n%s\n", cJSON_Print(jsonpokemon_held_item_version_1));
	pokemon_held_item_version_t* pokemon_held_item_version_2 = pokemon_held_item_version_parseFromJSON(jsonpokemon_held_item_version_1);
	cJSON* jsonpokemon_held_item_version_2 = pokemon_held_item_version_convertToJSON(pokemon_held_item_version_2);
	printf("repeating pokemon_held_item_version:\n%s\n", cJSON_Print(jsonpokemon_held_item_version_2));
}

int main() {
  test_pokemon_held_item_version(1);
  test_pokemon_held_item_version(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_held_item_version_MAIN
#endif // pokemon_held_item_version_TEST
