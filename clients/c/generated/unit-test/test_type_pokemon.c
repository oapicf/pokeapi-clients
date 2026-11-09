#ifndef type_pokemon_TEST
#define type_pokemon_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define type_pokemon_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/type_pokemon.h"
type_pokemon_t* instantiate_type_pokemon(int include_optional);

#include "test_pokemon_summary.c"


type_pokemon_t* instantiate_type_pokemon(int include_optional) {
  type_pokemon_t* type_pokemon = NULL;
  if (include_optional) {
    type_pokemon = type_pokemon_create(
      -2147483648,
       // false, not to have infinite recursion
      instantiate_pokemon_summary(0)
    );
  } else {
    type_pokemon = type_pokemon_create(
      -2147483648,
      NULL
    );
  }

  return type_pokemon;
}


#ifdef type_pokemon_MAIN

void test_type_pokemon(int include_optional) {
    type_pokemon_t* type_pokemon_1 = instantiate_type_pokemon(include_optional);

	cJSON* jsontype_pokemon_1 = type_pokemon_convertToJSON(type_pokemon_1);
	printf("type_pokemon :\n%s\n", cJSON_Print(jsontype_pokemon_1));
	type_pokemon_t* type_pokemon_2 = type_pokemon_parseFromJSON(jsontype_pokemon_1);
	cJSON* jsontype_pokemon_2 = type_pokemon_convertToJSON(type_pokemon_2);
	printf("repeating type_pokemon:\n%s\n", cJSON_Print(jsontype_pokemon_2));
}

int main() {
  test_type_pokemon(1);
  test_type_pokemon(0);

  printf("Hello world \n");
  return 0;
}

#endif // type_pokemon_MAIN
#endif // type_pokemon_TEST
