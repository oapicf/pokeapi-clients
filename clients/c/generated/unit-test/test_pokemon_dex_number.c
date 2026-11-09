#ifndef pokemon_dex_number_TEST
#define pokemon_dex_number_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_dex_number_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_dex_number.h"
pokemon_dex_number_t* instantiate_pokemon_dex_number(int include_optional);

#include "test_pokemon_species_summary.c"


pokemon_dex_number_t* instantiate_pokemon_dex_number(int include_optional) {
  pokemon_dex_number_t* pokemon_dex_number = NULL;
  if (include_optional) {
    pokemon_dex_number = pokemon_dex_number_create(
      56,
       // false, not to have infinite recursion
      instantiate_pokemon_species_summary(0)
    );
  } else {
    pokemon_dex_number = pokemon_dex_number_create(
      56,
      NULL
    );
  }

  return pokemon_dex_number;
}


#ifdef pokemon_dex_number_MAIN

void test_pokemon_dex_number(int include_optional) {
    pokemon_dex_number_t* pokemon_dex_number_1 = instantiate_pokemon_dex_number(include_optional);

	cJSON* jsonpokemon_dex_number_1 = pokemon_dex_number_convertToJSON(pokemon_dex_number_1);
	printf("pokemon_dex_number :\n%s\n", cJSON_Print(jsonpokemon_dex_number_1));
	pokemon_dex_number_t* pokemon_dex_number_2 = pokemon_dex_number_parseFromJSON(jsonpokemon_dex_number_1);
	cJSON* jsonpokemon_dex_number_2 = pokemon_dex_number_convertToJSON(pokemon_dex_number_2);
	printf("repeating pokemon_dex_number:\n%s\n", cJSON_Print(jsonpokemon_dex_number_2));
}

int main() {
  test_pokemon_dex_number(1);
  test_pokemon_dex_number(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_dex_number_MAIN
#endif // pokemon_dex_number_TEST
