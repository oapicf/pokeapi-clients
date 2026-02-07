#ifndef ability_detail_pokemon_inner_pokemon_TEST
#define ability_detail_pokemon_inner_pokemon_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ability_detail_pokemon_inner_pokemon_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ability_detail_pokemon_inner_pokemon.h"
ability_detail_pokemon_inner_pokemon_t* instantiate_ability_detail_pokemon_inner_pokemon(int include_optional);



ability_detail_pokemon_inner_pokemon_t* instantiate_ability_detail_pokemon_inner_pokemon(int include_optional) {
  ability_detail_pokemon_inner_pokemon_t* ability_detail_pokemon_inner_pokemon = NULL;
  if (include_optional) {
    ability_detail_pokemon_inner_pokemon = ability_detail_pokemon_inner_pokemon_create(
      "0",
      "0"
    );
  } else {
    ability_detail_pokemon_inner_pokemon = ability_detail_pokemon_inner_pokemon_create(
      "0",
      "0"
    );
  }

  return ability_detail_pokemon_inner_pokemon;
}


#ifdef ability_detail_pokemon_inner_pokemon_MAIN

void test_ability_detail_pokemon_inner_pokemon(int include_optional) {
    ability_detail_pokemon_inner_pokemon_t* ability_detail_pokemon_inner_pokemon_1 = instantiate_ability_detail_pokemon_inner_pokemon(include_optional);

	cJSON* jsonability_detail_pokemon_inner_pokemon_1 = ability_detail_pokemon_inner_pokemon_convertToJSON(ability_detail_pokemon_inner_pokemon_1);
	printf("ability_detail_pokemon_inner_pokemon :\n%s\n", cJSON_Print(jsonability_detail_pokemon_inner_pokemon_1));
	ability_detail_pokemon_inner_pokemon_t* ability_detail_pokemon_inner_pokemon_2 = ability_detail_pokemon_inner_pokemon_parseFromJSON(jsonability_detail_pokemon_inner_pokemon_1);
	cJSON* jsonability_detail_pokemon_inner_pokemon_2 = ability_detail_pokemon_inner_pokemon_convertToJSON(ability_detail_pokemon_inner_pokemon_2);
	printf("repeating ability_detail_pokemon_inner_pokemon:\n%s\n", cJSON_Print(jsonability_detail_pokemon_inner_pokemon_2));
}

int main() {
  test_ability_detail_pokemon_inner_pokemon(1);
  test_ability_detail_pokemon_inner_pokemon(0);

  printf("Hello world \n");
  return 0;
}

#endif // ability_detail_pokemon_inner_pokemon_MAIN
#endif // ability_detail_pokemon_inner_pokemon_TEST
