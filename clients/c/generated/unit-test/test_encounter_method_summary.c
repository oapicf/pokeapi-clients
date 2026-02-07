#ifndef encounter_method_summary_TEST
#define encounter_method_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define encounter_method_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/encounter_method_summary.h"
encounter_method_summary_t* instantiate_encounter_method_summary(int include_optional);



encounter_method_summary_t* instantiate_encounter_method_summary(int include_optional) {
  encounter_method_summary_t* encounter_method_summary = NULL;
  if (include_optional) {
    encounter_method_summary = encounter_method_summary_create(
      "0",
      "0"
    );
  } else {
    encounter_method_summary = encounter_method_summary_create(
      "0",
      "0"
    );
  }

  return encounter_method_summary;
}


#ifdef encounter_method_summary_MAIN

void test_encounter_method_summary(int include_optional) {
    encounter_method_summary_t* encounter_method_summary_1 = instantiate_encounter_method_summary(include_optional);

	cJSON* jsonencounter_method_summary_1 = encounter_method_summary_convertToJSON(encounter_method_summary_1);
	printf("encounter_method_summary :\n%s\n", cJSON_Print(jsonencounter_method_summary_1));
	encounter_method_summary_t* encounter_method_summary_2 = encounter_method_summary_parseFromJSON(jsonencounter_method_summary_1);
	cJSON* jsonencounter_method_summary_2 = encounter_method_summary_convertToJSON(encounter_method_summary_2);
	printf("repeating encounter_method_summary:\n%s\n", cJSON_Print(jsonencounter_method_summary_2));
}

int main() {
  test_encounter_method_summary(1);
  test_encounter_method_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // encounter_method_summary_MAIN
#endif // encounter_method_summary_TEST
