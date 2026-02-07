#ifndef encounter_condition_name_TEST
#define encounter_condition_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define encounter_condition_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/encounter_condition_name.h"
encounter_condition_name_t* instantiate_encounter_condition_name(int include_optional);

#include "test_language_summary.c"


encounter_condition_name_t* instantiate_encounter_condition_name(int include_optional) {
  encounter_condition_name_t* encounter_condition_name = NULL;
  if (include_optional) {
    encounter_condition_name = encounter_condition_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    encounter_condition_name = encounter_condition_name_create(
      "0",
      NULL
    );
  }

  return encounter_condition_name;
}


#ifdef encounter_condition_name_MAIN

void test_encounter_condition_name(int include_optional) {
    encounter_condition_name_t* encounter_condition_name_1 = instantiate_encounter_condition_name(include_optional);

	cJSON* jsonencounter_condition_name_1 = encounter_condition_name_convertToJSON(encounter_condition_name_1);
	printf("encounter_condition_name :\n%s\n", cJSON_Print(jsonencounter_condition_name_1));
	encounter_condition_name_t* encounter_condition_name_2 = encounter_condition_name_parseFromJSON(jsonencounter_condition_name_1);
	cJSON* jsonencounter_condition_name_2 = encounter_condition_name_convertToJSON(encounter_condition_name_2);
	printf("repeating encounter_condition_name:\n%s\n", cJSON_Print(jsonencounter_condition_name_2));
}

int main() {
  test_encounter_condition_name(1);
  test_encounter_condition_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // encounter_condition_name_MAIN
#endif // encounter_condition_name_TEST
