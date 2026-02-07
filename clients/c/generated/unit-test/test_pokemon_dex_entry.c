#ifndef pokemon_dex_entry_TEST
#define pokemon_dex_entry_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_dex_entry_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_dex_entry.h"
pokemon_dex_entry_t* instantiate_pokemon_dex_entry(int include_optional);

#include "test_pokedex_summary.c"


pokemon_dex_entry_t* instantiate_pokemon_dex_entry(int include_optional) {
  pokemon_dex_entry_t* pokemon_dex_entry = NULL;
  if (include_optional) {
    pokemon_dex_entry = pokemon_dex_entry_create(
      56,
       // false, not to have infinite recursion
      instantiate_pokedex_summary(0)
    );
  } else {
    pokemon_dex_entry = pokemon_dex_entry_create(
      56,
      NULL
    );
  }

  return pokemon_dex_entry;
}


#ifdef pokemon_dex_entry_MAIN

void test_pokemon_dex_entry(int include_optional) {
    pokemon_dex_entry_t* pokemon_dex_entry_1 = instantiate_pokemon_dex_entry(include_optional);

	cJSON* jsonpokemon_dex_entry_1 = pokemon_dex_entry_convertToJSON(pokemon_dex_entry_1);
	printf("pokemon_dex_entry :\n%s\n", cJSON_Print(jsonpokemon_dex_entry_1));
	pokemon_dex_entry_t* pokemon_dex_entry_2 = pokemon_dex_entry_parseFromJSON(jsonpokemon_dex_entry_1);
	cJSON* jsonpokemon_dex_entry_2 = pokemon_dex_entry_convertToJSON(pokemon_dex_entry_2);
	printf("repeating pokemon_dex_entry:\n%s\n", cJSON_Print(jsonpokemon_dex_entry_2));
}

int main() {
  test_pokemon_dex_entry(1);
  test_pokemon_dex_entry(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_dex_entry_MAIN
#endif // pokemon_dex_entry_TEST
