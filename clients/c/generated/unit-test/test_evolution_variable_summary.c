#ifndef evolution_variable_summary_TEST
#define evolution_variable_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define evolution_variable_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/evolution_variable_summary.h"
evolution_variable_summary_t* instantiate_evolution_variable_summary(int include_optional);



evolution_variable_summary_t* instantiate_evolution_variable_summary(int include_optional) {
  evolution_variable_summary_t* evolution_variable_summary = NULL;
  if (include_optional) {
    evolution_variable_summary = evolution_variable_summary_create(
      "0",
      "0"
    );
  } else {
    evolution_variable_summary = evolution_variable_summary_create(
      "0",
      "0"
    );
  }

  return evolution_variable_summary;
}


#ifdef evolution_variable_summary_MAIN

void test_evolution_variable_summary(int include_optional) {
    evolution_variable_summary_t* evolution_variable_summary_1 = instantiate_evolution_variable_summary(include_optional);

	cJSON* jsonevolution_variable_summary_1 = evolution_variable_summary_convertToJSON(evolution_variable_summary_1);
	printf("evolution_variable_summary :\n%s\n", cJSON_Print(jsonevolution_variable_summary_1));
	evolution_variable_summary_t* evolution_variable_summary_2 = evolution_variable_summary_parseFromJSON(jsonevolution_variable_summary_1);
	cJSON* jsonevolution_variable_summary_2 = evolution_variable_summary_convertToJSON(evolution_variable_summary_2);
	printf("repeating evolution_variable_summary:\n%s\n", cJSON_Print(jsonevolution_variable_summary_2));
}

int main() {
  test_evolution_variable_summary(1);
  test_evolution_variable_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // evolution_variable_summary_MAIN
#endif // evolution_variable_summary_TEST
