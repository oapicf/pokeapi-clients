#ifndef ability_pokemon_detail_TEST
#define ability_pokemon_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ability_pokemon_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ability_pokemon_detail.h"
ability_pokemon_detail_t* instantiate_ability_pokemon_detail(int include_optional);

#include "test_pokemon_summary.c"


ability_pokemon_detail_t* instantiate_ability_pokemon_detail(int include_optional) {
  ability_pokemon_detail_t* ability_pokemon_detail = NULL;
  if (include_optional) {
    ability_pokemon_detail = ability_pokemon_detail_create(
      1,
      -2147483648,
       // false, not to have infinite recursion
      instantiate_pokemon_summary(0)
    );
  } else {
    ability_pokemon_detail = ability_pokemon_detail_create(
      1,
      -2147483648,
      NULL
    );
  }

  return ability_pokemon_detail;
}


#ifdef ability_pokemon_detail_MAIN

void test_ability_pokemon_detail(int include_optional) {
    ability_pokemon_detail_t* ability_pokemon_detail_1 = instantiate_ability_pokemon_detail(include_optional);

	cJSON* jsonability_pokemon_detail_1 = ability_pokemon_detail_convertToJSON(ability_pokemon_detail_1);
	printf("ability_pokemon_detail :\n%s\n", cJSON_Print(jsonability_pokemon_detail_1));
	ability_pokemon_detail_t* ability_pokemon_detail_2 = ability_pokemon_detail_parseFromJSON(jsonability_pokemon_detail_1);
	cJSON* jsonability_pokemon_detail_2 = ability_pokemon_detail_convertToJSON(ability_pokemon_detail_2);
	printf("repeating ability_pokemon_detail:\n%s\n", cJSON_Print(jsonability_pokemon_detail_2));
}

int main() {
  test_ability_pokemon_detail(1);
  test_ability_pokemon_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // ability_pokemon_detail_MAIN
#endif // ability_pokemon_detail_TEST
