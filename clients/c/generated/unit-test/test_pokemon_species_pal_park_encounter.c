#ifndef pokemon_species_pal_park_encounter_TEST
#define pokemon_species_pal_park_encounter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_species_pal_park_encounter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_species_pal_park_encounter.h"
pokemon_species_pal_park_encounter_t* instantiate_pokemon_species_pal_park_encounter(int include_optional);

#include "test_pal_park_area_summary.c"


pokemon_species_pal_park_encounter_t* instantiate_pokemon_species_pal_park_encounter(int include_optional) {
  pokemon_species_pal_park_encounter_t* pokemon_species_pal_park_encounter = NULL;
  if (include_optional) {
    pokemon_species_pal_park_encounter = pokemon_species_pal_park_encounter_create(
      -2147483648,
      -2147483648,
       // false, not to have infinite recursion
      instantiate_pal_park_area_summary(0)
    );
  } else {
    pokemon_species_pal_park_encounter = pokemon_species_pal_park_encounter_create(
      -2147483648,
      -2147483648,
      NULL
    );
  }

  return pokemon_species_pal_park_encounter;
}


#ifdef pokemon_species_pal_park_encounter_MAIN

void test_pokemon_species_pal_park_encounter(int include_optional) {
    pokemon_species_pal_park_encounter_t* pokemon_species_pal_park_encounter_1 = instantiate_pokemon_species_pal_park_encounter(include_optional);

	cJSON* jsonpokemon_species_pal_park_encounter_1 = pokemon_species_pal_park_encounter_convertToJSON(pokemon_species_pal_park_encounter_1);
	printf("pokemon_species_pal_park_encounter :\n%s\n", cJSON_Print(jsonpokemon_species_pal_park_encounter_1));
	pokemon_species_pal_park_encounter_t* pokemon_species_pal_park_encounter_2 = pokemon_species_pal_park_encounter_parseFromJSON(jsonpokemon_species_pal_park_encounter_1);
	cJSON* jsonpokemon_species_pal_park_encounter_2 = pokemon_species_pal_park_encounter_convertToJSON(pokemon_species_pal_park_encounter_2);
	printf("repeating pokemon_species_pal_park_encounter:\n%s\n", cJSON_Print(jsonpokemon_species_pal_park_encounter_2));
}

int main() {
  test_pokemon_species_pal_park_encounter(1);
  test_pokemon_species_pal_park_encounter(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_species_pal_park_encounter_MAIN
#endif // pokemon_species_pal_park_encounter_TEST
