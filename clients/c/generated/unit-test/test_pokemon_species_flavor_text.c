#ifndef pokemon_species_flavor_text_TEST
#define pokemon_species_flavor_text_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_species_flavor_text_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_species_flavor_text.h"
pokemon_species_flavor_text_t* instantiate_pokemon_species_flavor_text(int include_optional);

#include "test_language_summary.c"
#include "test_version_summary.c"


pokemon_species_flavor_text_t* instantiate_pokemon_species_flavor_text(int include_optional) {
  pokemon_species_flavor_text_t* pokemon_species_flavor_text = NULL;
  if (include_optional) {
    pokemon_species_flavor_text = pokemon_species_flavor_text_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0),
       // false, not to have infinite recursion
      instantiate_version_summary(0)
    );
  } else {
    pokemon_species_flavor_text = pokemon_species_flavor_text_create(
      "0",
      NULL,
      NULL
    );
  }

  return pokemon_species_flavor_text;
}


#ifdef pokemon_species_flavor_text_MAIN

void test_pokemon_species_flavor_text(int include_optional) {
    pokemon_species_flavor_text_t* pokemon_species_flavor_text_1 = instantiate_pokemon_species_flavor_text(include_optional);

	cJSON* jsonpokemon_species_flavor_text_1 = pokemon_species_flavor_text_convertToJSON(pokemon_species_flavor_text_1);
	printf("pokemon_species_flavor_text :\n%s\n", cJSON_Print(jsonpokemon_species_flavor_text_1));
	pokemon_species_flavor_text_t* pokemon_species_flavor_text_2 = pokemon_species_flavor_text_parseFromJSON(jsonpokemon_species_flavor_text_1);
	cJSON* jsonpokemon_species_flavor_text_2 = pokemon_species_flavor_text_convertToJSON(pokemon_species_flavor_text_2);
	printf("repeating pokemon_species_flavor_text:\n%s\n", cJSON_Print(jsonpokemon_species_flavor_text_2));
}

int main() {
  test_pokemon_species_flavor_text(1);
  test_pokemon_species_flavor_text(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_species_flavor_text_MAIN
#endif // pokemon_species_flavor_text_TEST
