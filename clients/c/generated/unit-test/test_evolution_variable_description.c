#ifndef evolution_variable_description_TEST
#define evolution_variable_description_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define evolution_variable_description_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/evolution_variable_description.h"
evolution_variable_description_t* instantiate_evolution_variable_description(int include_optional);

#include "test_language_summary.c"


evolution_variable_description_t* instantiate_evolution_variable_description(int include_optional) {
  evolution_variable_description_t* evolution_variable_description = NULL;
  if (include_optional) {
    evolution_variable_description = evolution_variable_description_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    evolution_variable_description = evolution_variable_description_create(
      "0",
      NULL
    );
  }

  return evolution_variable_description;
}


#ifdef evolution_variable_description_MAIN

void test_evolution_variable_description(int include_optional) {
    evolution_variable_description_t* evolution_variable_description_1 = instantiate_evolution_variable_description(include_optional);

	cJSON* jsonevolution_variable_description_1 = evolution_variable_description_convertToJSON(evolution_variable_description_1);
	printf("evolution_variable_description :\n%s\n", cJSON_Print(jsonevolution_variable_description_1));
	evolution_variable_description_t* evolution_variable_description_2 = evolution_variable_description_parseFromJSON(jsonevolution_variable_description_1);
	cJSON* jsonevolution_variable_description_2 = evolution_variable_description_convertToJSON(evolution_variable_description_2);
	printf("repeating evolution_variable_description:\n%s\n", cJSON_Print(jsonevolution_variable_description_2));
}

int main() {
  test_evolution_variable_description(1);
  test_evolution_variable_description(0);

  printf("Hello world \n");
  return 0;
}

#endif // evolution_variable_description_MAIN
#endif // evolution_variable_description_TEST
