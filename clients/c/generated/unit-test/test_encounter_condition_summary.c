#ifndef encounter_condition_summary_TEST
#define encounter_condition_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define encounter_condition_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/encounter_condition_summary.h"
encounter_condition_summary_t* instantiate_encounter_condition_summary(int include_optional);



encounter_condition_summary_t* instantiate_encounter_condition_summary(int include_optional) {
  encounter_condition_summary_t* encounter_condition_summary = NULL;
  if (include_optional) {
    encounter_condition_summary = encounter_condition_summary_create(
      "0",
      "0"
    );
  } else {
    encounter_condition_summary = encounter_condition_summary_create(
      "0",
      "0"
    );
  }

  return encounter_condition_summary;
}


#ifdef encounter_condition_summary_MAIN

void test_encounter_condition_summary(int include_optional) {
    encounter_condition_summary_t* encounter_condition_summary_1 = instantiate_encounter_condition_summary(include_optional);

	cJSON* jsonencounter_condition_summary_1 = encounter_condition_summary_convertToJSON(encounter_condition_summary_1);
	printf("encounter_condition_summary :\n%s\n", cJSON_Print(jsonencounter_condition_summary_1));
	encounter_condition_summary_t* encounter_condition_summary_2 = encounter_condition_summary_parseFromJSON(jsonencounter_condition_summary_1);
	cJSON* jsonencounter_condition_summary_2 = encounter_condition_summary_convertToJSON(encounter_condition_summary_2);
	printf("repeating encounter_condition_summary:\n%s\n", cJSON_Print(jsonencounter_condition_summary_2));
}

int main() {
  test_encounter_condition_summary(1);
  test_encounter_condition_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // encounter_condition_summary_MAIN
#endif // encounter_condition_summary_TEST
