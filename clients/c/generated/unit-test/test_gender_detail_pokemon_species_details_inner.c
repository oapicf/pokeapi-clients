#ifndef gender_detail_pokemon_species_details_inner_TEST
#define gender_detail_pokemon_species_details_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define gender_detail_pokemon_species_details_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/gender_detail_pokemon_species_details_inner.h"
gender_detail_pokemon_species_details_inner_t* instantiate_gender_detail_pokemon_species_details_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


gender_detail_pokemon_species_details_inner_t* instantiate_gender_detail_pokemon_species_details_inner(int include_optional) {
  gender_detail_pokemon_species_details_inner_t* gender_detail_pokemon_species_details_inner = NULL;
  if (include_optional) {
    gender_detail_pokemon_species_details_inner = gender_detail_pokemon_species_details_inner_create(
      56,
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0)
    );
  } else {
    gender_detail_pokemon_species_details_inner = gender_detail_pokemon_species_details_inner_create(
      56,
      NULL
    );
  }

  return gender_detail_pokemon_species_details_inner;
}


#ifdef gender_detail_pokemon_species_details_inner_MAIN

void test_gender_detail_pokemon_species_details_inner(int include_optional) {
    gender_detail_pokemon_species_details_inner_t* gender_detail_pokemon_species_details_inner_1 = instantiate_gender_detail_pokemon_species_details_inner(include_optional);

	cJSON* jsongender_detail_pokemon_species_details_inner_1 = gender_detail_pokemon_species_details_inner_convertToJSON(gender_detail_pokemon_species_details_inner_1);
	printf("gender_detail_pokemon_species_details_inner :\n%s\n", cJSON_Print(jsongender_detail_pokemon_species_details_inner_1));
	gender_detail_pokemon_species_details_inner_t* gender_detail_pokemon_species_details_inner_2 = gender_detail_pokemon_species_details_inner_parseFromJSON(jsongender_detail_pokemon_species_details_inner_1);
	cJSON* jsongender_detail_pokemon_species_details_inner_2 = gender_detail_pokemon_species_details_inner_convertToJSON(gender_detail_pokemon_species_details_inner_2);
	printf("repeating gender_detail_pokemon_species_details_inner:\n%s\n", cJSON_Print(jsongender_detail_pokemon_species_details_inner_2));
}

int main() {
  test_gender_detail_pokemon_species_details_inner(1);
  test_gender_detail_pokemon_species_details_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // gender_detail_pokemon_species_details_inner_MAIN
#endif // gender_detail_pokemon_species_details_inner_TEST
