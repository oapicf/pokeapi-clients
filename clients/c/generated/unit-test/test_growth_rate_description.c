#ifndef growth_rate_description_TEST
#define growth_rate_description_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define growth_rate_description_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/growth_rate_description.h"
growth_rate_description_t* instantiate_growth_rate_description(int include_optional);

#include "test_language_summary.c"


growth_rate_description_t* instantiate_growth_rate_description(int include_optional) {
  growth_rate_description_t* growth_rate_description = NULL;
  if (include_optional) {
    growth_rate_description = growth_rate_description_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    growth_rate_description = growth_rate_description_create(
      "0",
      NULL
    );
  }

  return growth_rate_description;
}


#ifdef growth_rate_description_MAIN

void test_growth_rate_description(int include_optional) {
    growth_rate_description_t* growth_rate_description_1 = instantiate_growth_rate_description(include_optional);

	cJSON* jsongrowth_rate_description_1 = growth_rate_description_convertToJSON(growth_rate_description_1);
	printf("growth_rate_description :\n%s\n", cJSON_Print(jsongrowth_rate_description_1));
	growth_rate_description_t* growth_rate_description_2 = growth_rate_description_parseFromJSON(jsongrowth_rate_description_1);
	cJSON* jsongrowth_rate_description_2 = growth_rate_description_convertToJSON(growth_rate_description_2);
	printf("repeating growth_rate_description:\n%s\n", cJSON_Print(jsongrowth_rate_description_2));
}

int main() {
  test_growth_rate_description(1);
  test_growth_rate_description(0);

  printf("Hello world \n");
  return 0;
}

#endif // growth_rate_description_MAIN
#endif // growth_rate_description_TEST
