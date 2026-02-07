#ifndef encounter_method_detail_TEST
#define encounter_method_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define encounter_method_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/encounter_method_detail.h"
encounter_method_detail_t* instantiate_encounter_method_detail(int include_optional);



encounter_method_detail_t* instantiate_encounter_method_detail(int include_optional) {
  encounter_method_detail_t* encounter_method_detail = NULL;
  if (include_optional) {
    encounter_method_detail = encounter_method_detail_create(
      56,
      "0",
      56,
      list_createList()
    );
  } else {
    encounter_method_detail = encounter_method_detail_create(
      56,
      "0",
      56,
      list_createList()
    );
  }

  return encounter_method_detail;
}


#ifdef encounter_method_detail_MAIN

void test_encounter_method_detail(int include_optional) {
    encounter_method_detail_t* encounter_method_detail_1 = instantiate_encounter_method_detail(include_optional);

	cJSON* jsonencounter_method_detail_1 = encounter_method_detail_convertToJSON(encounter_method_detail_1);
	printf("encounter_method_detail :\n%s\n", cJSON_Print(jsonencounter_method_detail_1));
	encounter_method_detail_t* encounter_method_detail_2 = encounter_method_detail_parseFromJSON(jsonencounter_method_detail_1);
	cJSON* jsonencounter_method_detail_2 = encounter_method_detail_convertToJSON(encounter_method_detail_2);
	printf("repeating encounter_method_detail:\n%s\n", cJSON_Print(jsonencounter_method_detail_2));
}

int main() {
  test_encounter_method_detail(1);
  test_encounter_method_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // encounter_method_detail_MAIN
#endif // encounter_method_detail_TEST
