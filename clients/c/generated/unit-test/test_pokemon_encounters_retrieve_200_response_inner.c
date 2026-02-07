#ifndef pokemon_encounters_retrieve_200_response_inner_TEST
#define pokemon_encounters_retrieve_200_response_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_encounters_retrieve_200_response_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_encounters_retrieve_200_response_inner.h"
pokemon_encounters_retrieve_200_response_inner_t* instantiate_pokemon_encounters_retrieve_200_response_inner(int include_optional);

#include "test_pokemon_encounters_retrieve_200_response_inner_location_area.c"


pokemon_encounters_retrieve_200_response_inner_t* instantiate_pokemon_encounters_retrieve_200_response_inner(int include_optional) {
  pokemon_encounters_retrieve_200_response_inner_t* pokemon_encounters_retrieve_200_response_inner = NULL;
  if (include_optional) {
    pokemon_encounters_retrieve_200_response_inner = pokemon_encounters_retrieve_200_response_inner_create(
       // false, not to have infinite recursion
      instantiate_pokemon_encounters_retrieve_200_response_inner_location_area(0),
      list_createList()
    );
  } else {
    pokemon_encounters_retrieve_200_response_inner = pokemon_encounters_retrieve_200_response_inner_create(
      NULL,
      list_createList()
    );
  }

  return pokemon_encounters_retrieve_200_response_inner;
}


#ifdef pokemon_encounters_retrieve_200_response_inner_MAIN

void test_pokemon_encounters_retrieve_200_response_inner(int include_optional) {
    pokemon_encounters_retrieve_200_response_inner_t* pokemon_encounters_retrieve_200_response_inner_1 = instantiate_pokemon_encounters_retrieve_200_response_inner(include_optional);

	cJSON* jsonpokemon_encounters_retrieve_200_response_inner_1 = pokemon_encounters_retrieve_200_response_inner_convertToJSON(pokemon_encounters_retrieve_200_response_inner_1);
	printf("pokemon_encounters_retrieve_200_response_inner :\n%s\n", cJSON_Print(jsonpokemon_encounters_retrieve_200_response_inner_1));
	pokemon_encounters_retrieve_200_response_inner_t* pokemon_encounters_retrieve_200_response_inner_2 = pokemon_encounters_retrieve_200_response_inner_parseFromJSON(jsonpokemon_encounters_retrieve_200_response_inner_1);
	cJSON* jsonpokemon_encounters_retrieve_200_response_inner_2 = pokemon_encounters_retrieve_200_response_inner_convertToJSON(pokemon_encounters_retrieve_200_response_inner_2);
	printf("repeating pokemon_encounters_retrieve_200_response_inner:\n%s\n", cJSON_Print(jsonpokemon_encounters_retrieve_200_response_inner_2));
}

int main() {
  test_pokemon_encounters_retrieve_200_response_inner(1);
  test_pokemon_encounters_retrieve_200_response_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_encounters_retrieve_200_response_inner_MAIN
#endif // pokemon_encounters_retrieve_200_response_inner_TEST
