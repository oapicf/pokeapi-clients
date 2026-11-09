#ifndef pokemon_type_TEST
#define pokemon_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_type.h"
pokemon_type_t* instantiate_pokemon_type(int include_optional);

#include "test_type_summary.c"


pokemon_type_t* instantiate_pokemon_type(int include_optional) {
  pokemon_type_t* pokemon_type = NULL;
  if (include_optional) {
    pokemon_type = pokemon_type_create(
      -2147483648,
       // false, not to have infinite recursion
      instantiate_type_summary(0)
    );
  } else {
    pokemon_type = pokemon_type_create(
      -2147483648,
      NULL
    );
  }

  return pokemon_type;
}


#ifdef pokemon_type_MAIN

void test_pokemon_type(int include_optional) {
    pokemon_type_t* pokemon_type_1 = instantiate_pokemon_type(include_optional);

	cJSON* jsonpokemon_type_1 = pokemon_type_convertToJSON(pokemon_type_1);
	printf("pokemon_type :\n%s\n", cJSON_Print(jsonpokemon_type_1));
	pokemon_type_t* pokemon_type_2 = pokemon_type_parseFromJSON(jsonpokemon_type_1);
	cJSON* jsonpokemon_type_2 = pokemon_type_convertToJSON(pokemon_type_2);
	printf("repeating pokemon_type:\n%s\n", cJSON_Print(jsonpokemon_type_2));
}

int main() {
  test_pokemon_type(1);
  test_pokemon_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_type_MAIN
#endif // pokemon_type_TEST
