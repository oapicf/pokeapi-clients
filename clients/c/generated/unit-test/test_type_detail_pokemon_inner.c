#ifndef type_detail_pokemon_inner_TEST
#define type_detail_pokemon_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define type_detail_pokemon_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/type_detail_pokemon_inner.h"
type_detail_pokemon_inner_t* instantiate_type_detail_pokemon_inner(int include_optional);

#include "test_type_detail_pokemon_inner_pokemon.c"


type_detail_pokemon_inner_t* instantiate_type_detail_pokemon_inner(int include_optional) {
  type_detail_pokemon_inner_t* type_detail_pokemon_inner = NULL;
  if (include_optional) {
    type_detail_pokemon_inner = type_detail_pokemon_inner_create(
      56,
       // false, not to have infinite recursion
      instantiate_type_detail_pokemon_inner_pokemon(0)
    );
  } else {
    type_detail_pokemon_inner = type_detail_pokemon_inner_create(
      56,
      NULL
    );
  }

  return type_detail_pokemon_inner;
}


#ifdef type_detail_pokemon_inner_MAIN

void test_type_detail_pokemon_inner(int include_optional) {
    type_detail_pokemon_inner_t* type_detail_pokemon_inner_1 = instantiate_type_detail_pokemon_inner(include_optional);

	cJSON* jsontype_detail_pokemon_inner_1 = type_detail_pokemon_inner_convertToJSON(type_detail_pokemon_inner_1);
	printf("type_detail_pokemon_inner :\n%s\n", cJSON_Print(jsontype_detail_pokemon_inner_1));
	type_detail_pokemon_inner_t* type_detail_pokemon_inner_2 = type_detail_pokemon_inner_parseFromJSON(jsontype_detail_pokemon_inner_1);
	cJSON* jsontype_detail_pokemon_inner_2 = type_detail_pokemon_inner_convertToJSON(type_detail_pokemon_inner_2);
	printf("repeating type_detail_pokemon_inner:\n%s\n", cJSON_Print(jsontype_detail_pokemon_inner_2));
}

int main() {
  test_type_detail_pokemon_inner(1);
  test_type_detail_pokemon_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // type_detail_pokemon_inner_MAIN
#endif // type_detail_pokemon_inner_TEST
