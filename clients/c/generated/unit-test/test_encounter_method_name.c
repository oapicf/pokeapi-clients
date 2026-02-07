#ifndef encounter_method_name_TEST
#define encounter_method_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define encounter_method_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/encounter_method_name.h"
encounter_method_name_t* instantiate_encounter_method_name(int include_optional);

#include "test_language_summary.c"


encounter_method_name_t* instantiate_encounter_method_name(int include_optional) {
  encounter_method_name_t* encounter_method_name = NULL;
  if (include_optional) {
    encounter_method_name = encounter_method_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    encounter_method_name = encounter_method_name_create(
      "0",
      NULL
    );
  }

  return encounter_method_name;
}


#ifdef encounter_method_name_MAIN

void test_encounter_method_name(int include_optional) {
    encounter_method_name_t* encounter_method_name_1 = instantiate_encounter_method_name(include_optional);

	cJSON* jsonencounter_method_name_1 = encounter_method_name_convertToJSON(encounter_method_name_1);
	printf("encounter_method_name :\n%s\n", cJSON_Print(jsonencounter_method_name_1));
	encounter_method_name_t* encounter_method_name_2 = encounter_method_name_parseFromJSON(jsonencounter_method_name_1);
	cJSON* jsonencounter_method_name_2 = encounter_method_name_convertToJSON(encounter_method_name_2);
	printf("repeating encounter_method_name:\n%s\n", cJSON_Print(jsonencounter_method_name_2));
}

int main() {
  test_encounter_method_name(1);
  test_encounter_method_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // encounter_method_name_MAIN
#endif // encounter_method_name_TEST
