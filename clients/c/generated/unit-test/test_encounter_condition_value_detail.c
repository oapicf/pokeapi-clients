#ifndef encounter_condition_value_detail_TEST
#define encounter_condition_value_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define encounter_condition_value_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/encounter_condition_value_detail.h"
encounter_condition_value_detail_t* instantiate_encounter_condition_value_detail(int include_optional);

#include "test_encounter_condition_summary.c"


encounter_condition_value_detail_t* instantiate_encounter_condition_value_detail(int include_optional) {
  encounter_condition_value_detail_t* encounter_condition_value_detail = NULL;
  if (include_optional) {
    encounter_condition_value_detail = encounter_condition_value_detail_create(
      56,
      "0",
       // false, not to have infinite recursion
      instantiate_encounter_condition_summary(0),
      list_createList()
    );
  } else {
    encounter_condition_value_detail = encounter_condition_value_detail_create(
      56,
      "0",
      NULL,
      list_createList()
    );
  }

  return encounter_condition_value_detail;
}


#ifdef encounter_condition_value_detail_MAIN

void test_encounter_condition_value_detail(int include_optional) {
    encounter_condition_value_detail_t* encounter_condition_value_detail_1 = instantiate_encounter_condition_value_detail(include_optional);

	cJSON* jsonencounter_condition_value_detail_1 = encounter_condition_value_detail_convertToJSON(encounter_condition_value_detail_1);
	printf("encounter_condition_value_detail :\n%s\n", cJSON_Print(jsonencounter_condition_value_detail_1));
	encounter_condition_value_detail_t* encounter_condition_value_detail_2 = encounter_condition_value_detail_parseFromJSON(jsonencounter_condition_value_detail_1);
	cJSON* jsonencounter_condition_value_detail_2 = encounter_condition_value_detail_convertToJSON(encounter_condition_value_detail_2);
	printf("repeating encounter_condition_value_detail:\n%s\n", cJSON_Print(jsonencounter_condition_value_detail_2));
}

int main() {
  test_encounter_condition_value_detail(1);
  test_encounter_condition_value_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // encounter_condition_value_detail_MAIN
#endif // encounter_condition_value_detail_TEST
