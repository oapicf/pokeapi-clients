#ifndef evolution_variable_name_TEST
#define evolution_variable_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define evolution_variable_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/evolution_variable_name.h"
evolution_variable_name_t* instantiate_evolution_variable_name(int include_optional);

#include "test_language_summary.c"


evolution_variable_name_t* instantiate_evolution_variable_name(int include_optional) {
  evolution_variable_name_t* evolution_variable_name = NULL;
  if (include_optional) {
    evolution_variable_name = evolution_variable_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    evolution_variable_name = evolution_variable_name_create(
      "0",
      NULL
    );
  }

  return evolution_variable_name;
}


#ifdef evolution_variable_name_MAIN

void test_evolution_variable_name(int include_optional) {
    evolution_variable_name_t* evolution_variable_name_1 = instantiate_evolution_variable_name(include_optional);

	cJSON* jsonevolution_variable_name_1 = evolution_variable_name_convertToJSON(evolution_variable_name_1);
	printf("evolution_variable_name :\n%s\n", cJSON_Print(jsonevolution_variable_name_1));
	evolution_variable_name_t* evolution_variable_name_2 = evolution_variable_name_parseFromJSON(jsonevolution_variable_name_1);
	cJSON* jsonevolution_variable_name_2 = evolution_variable_name_convertToJSON(evolution_variable_name_2);
	printf("repeating evolution_variable_name:\n%s\n", cJSON_Print(jsonevolution_variable_name_2));
}

int main() {
  test_evolution_variable_name(1);
  test_evolution_variable_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // evolution_variable_name_MAIN
#endif // evolution_variable_name_TEST
