#ifndef ability_detail_pokemon_inner_TEST
#define ability_detail_pokemon_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ability_detail_pokemon_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ability_detail_pokemon_inner.h"
ability_detail_pokemon_inner_t* instantiate_ability_detail_pokemon_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


ability_detail_pokemon_inner_t* instantiate_ability_detail_pokemon_inner(int include_optional) {
  ability_detail_pokemon_inner_t* ability_detail_pokemon_inner = NULL;
  if (include_optional) {
    ability_detail_pokemon_inner = ability_detail_pokemon_inner_create(
      1,
      56,
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0)
    );
  } else {
    ability_detail_pokemon_inner = ability_detail_pokemon_inner_create(
      1,
      56,
      NULL
    );
  }

  return ability_detail_pokemon_inner;
}


#ifdef ability_detail_pokemon_inner_MAIN

void test_ability_detail_pokemon_inner(int include_optional) {
    ability_detail_pokemon_inner_t* ability_detail_pokemon_inner_1 = instantiate_ability_detail_pokemon_inner(include_optional);

	cJSON* jsonability_detail_pokemon_inner_1 = ability_detail_pokemon_inner_convertToJSON(ability_detail_pokemon_inner_1);
	printf("ability_detail_pokemon_inner :\n%s\n", cJSON_Print(jsonability_detail_pokemon_inner_1));
	ability_detail_pokemon_inner_t* ability_detail_pokemon_inner_2 = ability_detail_pokemon_inner_parseFromJSON(jsonability_detail_pokemon_inner_1);
	cJSON* jsonability_detail_pokemon_inner_2 = ability_detail_pokemon_inner_convertToJSON(ability_detail_pokemon_inner_2);
	printf("repeating ability_detail_pokemon_inner:\n%s\n", cJSON_Print(jsonability_detail_pokemon_inner_2));
}

int main() {
  test_ability_detail_pokemon_inner(1);
  test_ability_detail_pokemon_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // ability_detail_pokemon_inner_MAIN
#endif // ability_detail_pokemon_inner_TEST
