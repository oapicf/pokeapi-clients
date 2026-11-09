#ifndef pokemon_past_type_TEST
#define pokemon_past_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_past_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_past_type.h"
pokemon_past_type_t* instantiate_pokemon_past_type(int include_optional);

#include "test_generation_summary.c"


pokemon_past_type_t* instantiate_pokemon_past_type(int include_optional) {
  pokemon_past_type_t* pokemon_past_type = NULL;
  if (include_optional) {
    pokemon_past_type = pokemon_past_type_create(
       // false, not to have infinite recursion
      instantiate_generation_summary(0),
      list_createList()
    );
  } else {
    pokemon_past_type = pokemon_past_type_create(
      NULL,
      list_createList()
    );
  }

  return pokemon_past_type;
}


#ifdef pokemon_past_type_MAIN

void test_pokemon_past_type(int include_optional) {
    pokemon_past_type_t* pokemon_past_type_1 = instantiate_pokemon_past_type(include_optional);

	cJSON* jsonpokemon_past_type_1 = pokemon_past_type_convertToJSON(pokemon_past_type_1);
	printf("pokemon_past_type :\n%s\n", cJSON_Print(jsonpokemon_past_type_1));
	pokemon_past_type_t* pokemon_past_type_2 = pokemon_past_type_parseFromJSON(jsonpokemon_past_type_1);
	cJSON* jsonpokemon_past_type_2 = pokemon_past_type_convertToJSON(pokemon_past_type_2);
	printf("repeating pokemon_past_type:\n%s\n", cJSON_Print(jsonpokemon_past_type_2));
}

int main() {
  test_pokemon_past_type(1);
  test_pokemon_past_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_past_type_MAIN
#endif // pokemon_past_type_TEST
