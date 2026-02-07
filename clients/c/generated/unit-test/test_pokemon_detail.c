#ifndef pokemon_detail_TEST
#define pokemon_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_detail.h"
pokemon_detail_t* instantiate_pokemon_detail(int include_optional);

#include "test_pokemon_detail_held_items.c"
#include "test_pokemon_species_summary.c"
#include "test_pokemon_detail_cries.c"


pokemon_detail_t* instantiate_pokemon_detail(int include_optional) {
  pokemon_detail_t* pokemon_detail = NULL;
  if (include_optional) {
    pokemon_detail = pokemon_detail_create(
      56,
      "0",
      56,
      56,
      1,
      56,
      56,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_pokemon_detail_held_items(0),
      "0",
      list_createList(),
       // false, not to have infinite recursion
      instantiate_pokemon_species_summary(0),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_pokemon_detail_cries(0),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    pokemon_detail = pokemon_detail_create(
      56,
      "0",
      56,
      56,
      1,
      56,
      56,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      NULL,
      "0",
      list_createList(),
      NULL,
      list_createList(),
      NULL,
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return pokemon_detail;
}


#ifdef pokemon_detail_MAIN

void test_pokemon_detail(int include_optional) {
    pokemon_detail_t* pokemon_detail_1 = instantiate_pokemon_detail(include_optional);

	cJSON* jsonpokemon_detail_1 = pokemon_detail_convertToJSON(pokemon_detail_1);
	printf("pokemon_detail :\n%s\n", cJSON_Print(jsonpokemon_detail_1));
	pokemon_detail_t* pokemon_detail_2 = pokemon_detail_parseFromJSON(jsonpokemon_detail_1);
	cJSON* jsonpokemon_detail_2 = pokemon_detail_convertToJSON(pokemon_detail_2);
	printf("repeating pokemon_detail:\n%s\n", cJSON_Print(jsonpokemon_detail_2));
}

int main() {
  test_pokemon_detail(1);
  test_pokemon_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_detail_MAIN
#endif // pokemon_detail_TEST
