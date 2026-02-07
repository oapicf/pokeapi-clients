#ifndef evolution_trigger_name_TEST
#define evolution_trigger_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define evolution_trigger_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/evolution_trigger_name.h"
evolution_trigger_name_t* instantiate_evolution_trigger_name(int include_optional);

#include "test_language_summary.c"


evolution_trigger_name_t* instantiate_evolution_trigger_name(int include_optional) {
  evolution_trigger_name_t* evolution_trigger_name = NULL;
  if (include_optional) {
    evolution_trigger_name = evolution_trigger_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    evolution_trigger_name = evolution_trigger_name_create(
      "0",
      NULL
    );
  }

  return evolution_trigger_name;
}


#ifdef evolution_trigger_name_MAIN

void test_evolution_trigger_name(int include_optional) {
    evolution_trigger_name_t* evolution_trigger_name_1 = instantiate_evolution_trigger_name(include_optional);

	cJSON* jsonevolution_trigger_name_1 = evolution_trigger_name_convertToJSON(evolution_trigger_name_1);
	printf("evolution_trigger_name :\n%s\n", cJSON_Print(jsonevolution_trigger_name_1));
	evolution_trigger_name_t* evolution_trigger_name_2 = evolution_trigger_name_parseFromJSON(jsonevolution_trigger_name_1);
	cJSON* jsonevolution_trigger_name_2 = evolution_trigger_name_convertToJSON(evolution_trigger_name_2);
	printf("repeating evolution_trigger_name:\n%s\n", cJSON_Print(jsonevolution_trigger_name_2));
}

int main() {
  test_evolution_trigger_name(1);
  test_evolution_trigger_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // evolution_trigger_name_MAIN
#endif // evolution_trigger_name_TEST
