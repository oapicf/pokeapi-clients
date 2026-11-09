#ifndef pokemon_form_type_TEST
#define pokemon_form_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_form_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_form_type.h"
pokemon_form_type_t* instantiate_pokemon_form_type(int include_optional);

#include "test_type_summary.c"


pokemon_form_type_t* instantiate_pokemon_form_type(int include_optional) {
  pokemon_form_type_t* pokemon_form_type = NULL;
  if (include_optional) {
    pokemon_form_type = pokemon_form_type_create(
      -2147483648,
       // false, not to have infinite recursion
      instantiate_type_summary(0)
    );
  } else {
    pokemon_form_type = pokemon_form_type_create(
      -2147483648,
      NULL
    );
  }

  return pokemon_form_type;
}


#ifdef pokemon_form_type_MAIN

void test_pokemon_form_type(int include_optional) {
    pokemon_form_type_t* pokemon_form_type_1 = instantiate_pokemon_form_type(include_optional);

	cJSON* jsonpokemon_form_type_1 = pokemon_form_type_convertToJSON(pokemon_form_type_1);
	printf("pokemon_form_type :\n%s\n", cJSON_Print(jsonpokemon_form_type_1));
	pokemon_form_type_t* pokemon_form_type_2 = pokemon_form_type_parseFromJSON(jsonpokemon_form_type_1);
	cJSON* jsonpokemon_form_type_2 = pokemon_form_type_convertToJSON(pokemon_form_type_2);
	printf("repeating pokemon_form_type:\n%s\n", cJSON_Print(jsonpokemon_form_type_2));
}

int main() {
  test_pokemon_form_type(1);
  test_pokemon_form_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_form_type_MAIN
#endif // pokemon_form_type_TEST
