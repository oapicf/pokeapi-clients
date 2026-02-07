#ifndef type_detail_pokemon_inner_pokemon_TEST
#define type_detail_pokemon_inner_pokemon_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define type_detail_pokemon_inner_pokemon_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/type_detail_pokemon_inner_pokemon.h"
type_detail_pokemon_inner_pokemon_t* instantiate_type_detail_pokemon_inner_pokemon(int include_optional);



type_detail_pokemon_inner_pokemon_t* instantiate_type_detail_pokemon_inner_pokemon(int include_optional) {
  type_detail_pokemon_inner_pokemon_t* type_detail_pokemon_inner_pokemon = NULL;
  if (include_optional) {
    type_detail_pokemon_inner_pokemon = type_detail_pokemon_inner_pokemon_create(
      "0",
      "0"
    );
  } else {
    type_detail_pokemon_inner_pokemon = type_detail_pokemon_inner_pokemon_create(
      "0",
      "0"
    );
  }

  return type_detail_pokemon_inner_pokemon;
}


#ifdef type_detail_pokemon_inner_pokemon_MAIN

void test_type_detail_pokemon_inner_pokemon(int include_optional) {
    type_detail_pokemon_inner_pokemon_t* type_detail_pokemon_inner_pokemon_1 = instantiate_type_detail_pokemon_inner_pokemon(include_optional);

	cJSON* jsontype_detail_pokemon_inner_pokemon_1 = type_detail_pokemon_inner_pokemon_convertToJSON(type_detail_pokemon_inner_pokemon_1);
	printf("type_detail_pokemon_inner_pokemon :\n%s\n", cJSON_Print(jsontype_detail_pokemon_inner_pokemon_1));
	type_detail_pokemon_inner_pokemon_t* type_detail_pokemon_inner_pokemon_2 = type_detail_pokemon_inner_pokemon_parseFromJSON(jsontype_detail_pokemon_inner_pokemon_1);
	cJSON* jsontype_detail_pokemon_inner_pokemon_2 = type_detail_pokemon_inner_pokemon_convertToJSON(type_detail_pokemon_inner_pokemon_2);
	printf("repeating type_detail_pokemon_inner_pokemon:\n%s\n", cJSON_Print(jsontype_detail_pokemon_inner_pokemon_2));
}

int main() {
  test_type_detail_pokemon_inner_pokemon(1);
  test_type_detail_pokemon_inner_pokemon(0);

  printf("Hello world \n");
  return 0;
}

#endif // type_detail_pokemon_inner_pokemon_MAIN
#endif // type_detail_pokemon_inner_pokemon_TEST
