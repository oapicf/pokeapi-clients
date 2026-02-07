#ifndef pokedex_detail_pokemon_entries_inner_TEST
#define pokedex_detail_pokemon_entries_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokedex_detail_pokemon_entries_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokedex_detail_pokemon_entries_inner.h"
pokedex_detail_pokemon_entries_inner_t* instantiate_pokedex_detail_pokemon_entries_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


pokedex_detail_pokemon_entries_inner_t* instantiate_pokedex_detail_pokemon_entries_inner(int include_optional) {
  pokedex_detail_pokemon_entries_inner_t* pokedex_detail_pokemon_entries_inner = NULL;
  if (include_optional) {
    pokedex_detail_pokemon_entries_inner = pokedex_detail_pokemon_entries_inner_create(
      56,
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0)
    );
  } else {
    pokedex_detail_pokemon_entries_inner = pokedex_detail_pokemon_entries_inner_create(
      56,
      NULL
    );
  }

  return pokedex_detail_pokemon_entries_inner;
}


#ifdef pokedex_detail_pokemon_entries_inner_MAIN

void test_pokedex_detail_pokemon_entries_inner(int include_optional) {
    pokedex_detail_pokemon_entries_inner_t* pokedex_detail_pokemon_entries_inner_1 = instantiate_pokedex_detail_pokemon_entries_inner(include_optional);

	cJSON* jsonpokedex_detail_pokemon_entries_inner_1 = pokedex_detail_pokemon_entries_inner_convertToJSON(pokedex_detail_pokemon_entries_inner_1);
	printf("pokedex_detail_pokemon_entries_inner :\n%s\n", cJSON_Print(jsonpokedex_detail_pokemon_entries_inner_1));
	pokedex_detail_pokemon_entries_inner_t* pokedex_detail_pokemon_entries_inner_2 = pokedex_detail_pokemon_entries_inner_parseFromJSON(jsonpokedex_detail_pokemon_entries_inner_1);
	cJSON* jsonpokedex_detail_pokemon_entries_inner_2 = pokedex_detail_pokemon_entries_inner_convertToJSON(pokedex_detail_pokemon_entries_inner_2);
	printf("repeating pokedex_detail_pokemon_entries_inner:\n%s\n", cJSON_Print(jsonpokedex_detail_pokemon_entries_inner_2));
}

int main() {
  test_pokedex_detail_pokemon_entries_inner(1);
  test_pokedex_detail_pokemon_entries_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokedex_detail_pokemon_entries_inner_MAIN
#endif // pokedex_detail_pokemon_entries_inner_TEST
