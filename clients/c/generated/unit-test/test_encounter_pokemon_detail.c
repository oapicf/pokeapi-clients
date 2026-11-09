#ifndef encounter_pokemon_detail_TEST
#define encounter_pokemon_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define encounter_pokemon_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/encounter_pokemon_detail.h"
encounter_pokemon_detail_t* instantiate_encounter_pokemon_detail(int include_optional);



encounter_pokemon_detail_t* instantiate_encounter_pokemon_detail(int include_optional) {
  encounter_pokemon_detail_t* encounter_pokemon_detail = NULL;
  if (include_optional) {
    encounter_pokemon_detail = encounter_pokemon_detail_create(
      -2147483648,
      1,
      1,
      1
    );
  } else {
    encounter_pokemon_detail = encounter_pokemon_detail_create(
      -2147483648,
      1,
      1,
      1
    );
  }

  return encounter_pokemon_detail;
}


#ifdef encounter_pokemon_detail_MAIN

void test_encounter_pokemon_detail(int include_optional) {
    encounter_pokemon_detail_t* encounter_pokemon_detail_1 = instantiate_encounter_pokemon_detail(include_optional);

	cJSON* jsonencounter_pokemon_detail_1 = encounter_pokemon_detail_convertToJSON(encounter_pokemon_detail_1);
	printf("encounter_pokemon_detail :\n%s\n", cJSON_Print(jsonencounter_pokemon_detail_1));
	encounter_pokemon_detail_t* encounter_pokemon_detail_2 = encounter_pokemon_detail_parseFromJSON(jsonencounter_pokemon_detail_1);
	cJSON* jsonencounter_pokemon_detail_2 = encounter_pokemon_detail_convertToJSON(encounter_pokemon_detail_2);
	printf("repeating encounter_pokemon_detail:\n%s\n", cJSON_Print(jsonencounter_pokemon_detail_2));
}

int main() {
  test_encounter_pokemon_detail(1);
  test_encounter_pokemon_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // encounter_pokemon_detail_MAIN
#endif // encounter_pokemon_detail_TEST
