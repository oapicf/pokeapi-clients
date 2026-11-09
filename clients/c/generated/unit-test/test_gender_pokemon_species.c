#ifndef gender_pokemon_species_TEST
#define gender_pokemon_species_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define gender_pokemon_species_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/gender_pokemon_species.h"
gender_pokemon_species_t* instantiate_gender_pokemon_species(int include_optional);

#include "test_pokemon_species_summary.c"


gender_pokemon_species_t* instantiate_gender_pokemon_species(int include_optional) {
  gender_pokemon_species_t* gender_pokemon_species = NULL;
  if (include_optional) {
    gender_pokemon_species = gender_pokemon_species_create(
      56,
       // false, not to have infinite recursion
      instantiate_pokemon_species_summary(0)
    );
  } else {
    gender_pokemon_species = gender_pokemon_species_create(
      56,
      NULL
    );
  }

  return gender_pokemon_species;
}


#ifdef gender_pokemon_species_MAIN

void test_gender_pokemon_species(int include_optional) {
    gender_pokemon_species_t* gender_pokemon_species_1 = instantiate_gender_pokemon_species(include_optional);

	cJSON* jsongender_pokemon_species_1 = gender_pokemon_species_convertToJSON(gender_pokemon_species_1);
	printf("gender_pokemon_species :\n%s\n", cJSON_Print(jsongender_pokemon_species_1));
	gender_pokemon_species_t* gender_pokemon_species_2 = gender_pokemon_species_parseFromJSON(jsongender_pokemon_species_1);
	cJSON* jsongender_pokemon_species_2 = gender_pokemon_species_convertToJSON(gender_pokemon_species_2);
	printf("repeating gender_pokemon_species:\n%s\n", cJSON_Print(jsongender_pokemon_species_2));
}

int main() {
  test_gender_pokemon_species(1);
  test_gender_pokemon_species(0);

  printf("Hello world \n");
  return 0;
}

#endif // gender_pokemon_species_MAIN
#endif // gender_pokemon_species_TEST
