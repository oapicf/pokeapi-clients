#ifndef pokemon_shape_name_TEST
#define pokemon_shape_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_shape_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_shape_name.h"
pokemon_shape_name_t* instantiate_pokemon_shape_name(int include_optional);

#include "test_language_summary.c"


pokemon_shape_name_t* instantiate_pokemon_shape_name(int include_optional) {
  pokemon_shape_name_t* pokemon_shape_name = NULL;
  if (include_optional) {
    pokemon_shape_name = pokemon_shape_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    pokemon_shape_name = pokemon_shape_name_create(
      "0",
      NULL
    );
  }

  return pokemon_shape_name;
}


#ifdef pokemon_shape_name_MAIN

void test_pokemon_shape_name(int include_optional) {
    pokemon_shape_name_t* pokemon_shape_name_1 = instantiate_pokemon_shape_name(include_optional);

	cJSON* jsonpokemon_shape_name_1 = pokemon_shape_name_convertToJSON(pokemon_shape_name_1);
	printf("pokemon_shape_name :\n%s\n", cJSON_Print(jsonpokemon_shape_name_1));
	pokemon_shape_name_t* pokemon_shape_name_2 = pokemon_shape_name_parseFromJSON(jsonpokemon_shape_name_1);
	cJSON* jsonpokemon_shape_name_2 = pokemon_shape_name_convertToJSON(pokemon_shape_name_2);
	printf("repeating pokemon_shape_name:\n%s\n", cJSON_Print(jsonpokemon_shape_name_2));
}

int main() {
  test_pokemon_shape_name(1);
  test_pokemon_shape_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_shape_name_MAIN
#endif // pokemon_shape_name_TEST
