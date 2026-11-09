#ifndef evolution_variable_detail_TEST
#define evolution_variable_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define evolution_variable_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/evolution_variable_detail.h"
evolution_variable_detail_t* instantiate_evolution_variable_detail(int include_optional);

#include "test_version_group_summary.c"


evolution_variable_detail_t* instantiate_evolution_variable_detail(int include_optional) {
  evolution_variable_detail_t* evolution_variable_detail = NULL;
  if (include_optional) {
    evolution_variable_detail = evolution_variable_detail_create(
      56,
      "0",
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_version_group_summary(0),
      list_createList(),
      list_createList()
    );
  } else {
    evolution_variable_detail = evolution_variable_detail_create(
      56,
      "0",
      "0",
      "0",
      "0",
      NULL,
      list_createList(),
      list_createList()
    );
  }

  return evolution_variable_detail;
}


#ifdef evolution_variable_detail_MAIN

void test_evolution_variable_detail(int include_optional) {
    evolution_variable_detail_t* evolution_variable_detail_1 = instantiate_evolution_variable_detail(include_optional);

	cJSON* jsonevolution_variable_detail_1 = evolution_variable_detail_convertToJSON(evolution_variable_detail_1);
	printf("evolution_variable_detail :\n%s\n", cJSON_Print(jsonevolution_variable_detail_1));
	evolution_variable_detail_t* evolution_variable_detail_2 = evolution_variable_detail_parseFromJSON(jsonevolution_variable_detail_1);
	cJSON* jsonevolution_variable_detail_2 = evolution_variable_detail_convertToJSON(evolution_variable_detail_2);
	printf("repeating evolution_variable_detail:\n%s\n", cJSON_Print(jsonevolution_variable_detail_2));
}

int main() {
  test_evolution_variable_detail(1);
  test_evolution_variable_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // evolution_variable_detail_MAIN
#endif // evolution_variable_detail_TEST
