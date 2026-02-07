#ifndef pokemon_species_detail_varieties_inner_TEST
#define pokemon_species_detail_varieties_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_species_detail_varieties_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_species_detail_varieties_inner.h"
pokemon_species_detail_varieties_inner_t* instantiate_pokemon_species_detail_varieties_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


pokemon_species_detail_varieties_inner_t* instantiate_pokemon_species_detail_varieties_inner(int include_optional) {
  pokemon_species_detail_varieties_inner_t* pokemon_species_detail_varieties_inner = NULL;
  if (include_optional) {
    pokemon_species_detail_varieties_inner = pokemon_species_detail_varieties_inner_create(
      1,
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0)
    );
  } else {
    pokemon_species_detail_varieties_inner = pokemon_species_detail_varieties_inner_create(
      1,
      NULL
    );
  }

  return pokemon_species_detail_varieties_inner;
}


#ifdef pokemon_species_detail_varieties_inner_MAIN

void test_pokemon_species_detail_varieties_inner(int include_optional) {
    pokemon_species_detail_varieties_inner_t* pokemon_species_detail_varieties_inner_1 = instantiate_pokemon_species_detail_varieties_inner(include_optional);

	cJSON* jsonpokemon_species_detail_varieties_inner_1 = pokemon_species_detail_varieties_inner_convertToJSON(pokemon_species_detail_varieties_inner_1);
	printf("pokemon_species_detail_varieties_inner :\n%s\n", cJSON_Print(jsonpokemon_species_detail_varieties_inner_1));
	pokemon_species_detail_varieties_inner_t* pokemon_species_detail_varieties_inner_2 = pokemon_species_detail_varieties_inner_parseFromJSON(jsonpokemon_species_detail_varieties_inner_1);
	cJSON* jsonpokemon_species_detail_varieties_inner_2 = pokemon_species_detail_varieties_inner_convertToJSON(pokemon_species_detail_varieties_inner_2);
	printf("repeating pokemon_species_detail_varieties_inner:\n%s\n", cJSON_Print(jsonpokemon_species_detail_varieties_inner_2));
}

int main() {
  test_pokemon_species_detail_varieties_inner(1);
  test_pokemon_species_detail_varieties_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_species_detail_varieties_inner_MAIN
#endif // pokemon_species_detail_varieties_inner_TEST
