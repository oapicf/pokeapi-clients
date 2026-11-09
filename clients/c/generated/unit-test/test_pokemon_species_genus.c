#ifndef pokemon_species_genus_TEST
#define pokemon_species_genus_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_species_genus_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_species_genus.h"
pokemon_species_genus_t* instantiate_pokemon_species_genus(int include_optional);

#include "test_language_summary.c"


pokemon_species_genus_t* instantiate_pokemon_species_genus(int include_optional) {
  pokemon_species_genus_t* pokemon_species_genus = NULL;
  if (include_optional) {
    pokemon_species_genus = pokemon_species_genus_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    pokemon_species_genus = pokemon_species_genus_create(
      "0",
      NULL
    );
  }

  return pokemon_species_genus;
}


#ifdef pokemon_species_genus_MAIN

void test_pokemon_species_genus(int include_optional) {
    pokemon_species_genus_t* pokemon_species_genus_1 = instantiate_pokemon_species_genus(include_optional);

	cJSON* jsonpokemon_species_genus_1 = pokemon_species_genus_convertToJSON(pokemon_species_genus_1);
	printf("pokemon_species_genus :\n%s\n", cJSON_Print(jsonpokemon_species_genus_1));
	pokemon_species_genus_t* pokemon_species_genus_2 = pokemon_species_genus_parseFromJSON(jsonpokemon_species_genus_1);
	cJSON* jsonpokemon_species_genus_2 = pokemon_species_genus_convertToJSON(pokemon_species_genus_2);
	printf("repeating pokemon_species_genus:\n%s\n", cJSON_Print(jsonpokemon_species_genus_2));
}

int main() {
  test_pokemon_species_genus(1);
  test_pokemon_species_genus(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_species_genus_MAIN
#endif // pokemon_species_genus_TEST
