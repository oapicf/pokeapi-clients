#ifndef pal_park_area_detail_pokemon_encounters_inner_TEST
#define pal_park_area_detail_pokemon_encounters_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pal_park_area_detail_pokemon_encounters_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pal_park_area_detail_pokemon_encounters_inner.h"
pal_park_area_detail_pokemon_encounters_inner_t* instantiate_pal_park_area_detail_pokemon_encounters_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


pal_park_area_detail_pokemon_encounters_inner_t* instantiate_pal_park_area_detail_pokemon_encounters_inner(int include_optional) {
  pal_park_area_detail_pokemon_encounters_inner_t* pal_park_area_detail_pokemon_encounters_inner = NULL;
  if (include_optional) {
    pal_park_area_detail_pokemon_encounters_inner = pal_park_area_detail_pokemon_encounters_inner_create(
      56,
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0),
      56
    );
  } else {
    pal_park_area_detail_pokemon_encounters_inner = pal_park_area_detail_pokemon_encounters_inner_create(
      56,
      NULL,
      56
    );
  }

  return pal_park_area_detail_pokemon_encounters_inner;
}


#ifdef pal_park_area_detail_pokemon_encounters_inner_MAIN

void test_pal_park_area_detail_pokemon_encounters_inner(int include_optional) {
    pal_park_area_detail_pokemon_encounters_inner_t* pal_park_area_detail_pokemon_encounters_inner_1 = instantiate_pal_park_area_detail_pokemon_encounters_inner(include_optional);

	cJSON* jsonpal_park_area_detail_pokemon_encounters_inner_1 = pal_park_area_detail_pokemon_encounters_inner_convertToJSON(pal_park_area_detail_pokemon_encounters_inner_1);
	printf("pal_park_area_detail_pokemon_encounters_inner :\n%s\n", cJSON_Print(jsonpal_park_area_detail_pokemon_encounters_inner_1));
	pal_park_area_detail_pokemon_encounters_inner_t* pal_park_area_detail_pokemon_encounters_inner_2 = pal_park_area_detail_pokemon_encounters_inner_parseFromJSON(jsonpal_park_area_detail_pokemon_encounters_inner_1);
	cJSON* jsonpal_park_area_detail_pokemon_encounters_inner_2 = pal_park_area_detail_pokemon_encounters_inner_convertToJSON(pal_park_area_detail_pokemon_encounters_inner_2);
	printf("repeating pal_park_area_detail_pokemon_encounters_inner:\n%s\n", cJSON_Print(jsonpal_park_area_detail_pokemon_encounters_inner_2));
}

int main() {
  test_pal_park_area_detail_pokemon_encounters_inner(1);
  test_pal_park_area_detail_pokemon_encounters_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // pal_park_area_detail_pokemon_encounters_inner_MAIN
#endif // pal_park_area_detail_pokemon_encounters_inner_TEST
