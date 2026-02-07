#ifndef pokemon_species_detail_TEST
#define pokemon_species_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_species_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_species_detail.h"
pokemon_species_detail_t* instantiate_pokemon_species_detail(int include_optional);

#include "test_growth_rate_summary.c"
#include "test_pokemon_color_summary.c"
#include "test_pokemon_shape_summary.c"
#include "test_pokemon_species_summary.c"
#include "test_evolution_chain_summary.c"
#include "test_pokemon_habitat_summary.c"
#include "test_generation_summary.c"


pokemon_species_detail_t* instantiate_pokemon_species_detail(int include_optional) {
  pokemon_species_detail_t* pokemon_species_detail = NULL;
  if (include_optional) {
    pokemon_species_detail = pokemon_species_detail_create(
      56,
      "0",
      56,
      56,
      56,
      56,
      1,
      1,
      1,
      56,
      1,
      1,
       // false, not to have infinite recursion
      instantiate_growth_rate_summary(0),
      list_createList(),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_pokemon_color_summary(0),
       // false, not to have infinite recursion
      instantiate_pokemon_shape_summary(0),
       // false, not to have infinite recursion
      instantiate_pokemon_species_summary(0),
       // false, not to have infinite recursion
      instantiate_evolution_chain_summary(0),
       // false, not to have infinite recursion
      instantiate_pokemon_habitat_summary(0),
       // false, not to have infinite recursion
      instantiate_generation_summary(0),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    pokemon_species_detail = pokemon_species_detail_create(
      56,
      "0",
      56,
      56,
      56,
      56,
      1,
      1,
      1,
      56,
      1,
      1,
      NULL,
      list_createList(),
      list_createList(),
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return pokemon_species_detail;
}


#ifdef pokemon_species_detail_MAIN

void test_pokemon_species_detail(int include_optional) {
    pokemon_species_detail_t* pokemon_species_detail_1 = instantiate_pokemon_species_detail(include_optional);

	cJSON* jsonpokemon_species_detail_1 = pokemon_species_detail_convertToJSON(pokemon_species_detail_1);
	printf("pokemon_species_detail :\n%s\n", cJSON_Print(jsonpokemon_species_detail_1));
	pokemon_species_detail_t* pokemon_species_detail_2 = pokemon_species_detail_parseFromJSON(jsonpokemon_species_detail_1);
	cJSON* jsonpokemon_species_detail_2 = pokemon_species_detail_convertToJSON(pokemon_species_detail_2);
	printf("repeating pokemon_species_detail:\n%s\n", cJSON_Print(jsonpokemon_species_detail_2));
}

int main() {
  test_pokemon_species_detail(1);
  test_pokemon_species_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_species_detail_MAIN
#endif // pokemon_species_detail_TEST
