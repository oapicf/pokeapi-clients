#ifndef pokemon_species_variety_TEST
#define pokemon_species_variety_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_species_variety_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_species_variety.h"
pokemon_species_variety_t* instantiate_pokemon_species_variety(int include_optional);

#include "test_pokemon_summary.c"


pokemon_species_variety_t* instantiate_pokemon_species_variety(int include_optional) {
  pokemon_species_variety_t* pokemon_species_variety = NULL;
  if (include_optional) {
    pokemon_species_variety = pokemon_species_variety_create(
      1,
       // false, not to have infinite recursion
      instantiate_pokemon_summary(0)
    );
  } else {
    pokemon_species_variety = pokemon_species_variety_create(
      1,
      NULL
    );
  }

  return pokemon_species_variety;
}


#ifdef pokemon_species_variety_MAIN

void test_pokemon_species_variety(int include_optional) {
    pokemon_species_variety_t* pokemon_species_variety_1 = instantiate_pokemon_species_variety(include_optional);

	cJSON* jsonpokemon_species_variety_1 = pokemon_species_variety_convertToJSON(pokemon_species_variety_1);
	printf("pokemon_species_variety :\n%s\n", cJSON_Print(jsonpokemon_species_variety_1));
	pokemon_species_variety_t* pokemon_species_variety_2 = pokemon_species_variety_parseFromJSON(jsonpokemon_species_variety_1);
	cJSON* jsonpokemon_species_variety_2 = pokemon_species_variety_convertToJSON(pokemon_species_variety_2);
	printf("repeating pokemon_species_variety:\n%s\n", cJSON_Print(jsonpokemon_species_variety_2));
}

int main() {
  test_pokemon_species_variety(1);
  test_pokemon_species_variety(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_species_variety_MAIN
#endif // pokemon_species_variety_TEST
