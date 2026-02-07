#ifndef growth_rate_summary_TEST
#define growth_rate_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define growth_rate_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/growth_rate_summary.h"
growth_rate_summary_t* instantiate_growth_rate_summary(int include_optional);



growth_rate_summary_t* instantiate_growth_rate_summary(int include_optional) {
  growth_rate_summary_t* growth_rate_summary = NULL;
  if (include_optional) {
    growth_rate_summary = growth_rate_summary_create(
      "0",
      "0"
    );
  } else {
    growth_rate_summary = growth_rate_summary_create(
      "0",
      "0"
    );
  }

  return growth_rate_summary;
}


#ifdef growth_rate_summary_MAIN

void test_growth_rate_summary(int include_optional) {
    growth_rate_summary_t* growth_rate_summary_1 = instantiate_growth_rate_summary(include_optional);

	cJSON* jsongrowth_rate_summary_1 = growth_rate_summary_convertToJSON(growth_rate_summary_1);
	printf("growth_rate_summary :\n%s\n", cJSON_Print(jsongrowth_rate_summary_1));
	growth_rate_summary_t* growth_rate_summary_2 = growth_rate_summary_parseFromJSON(jsongrowth_rate_summary_1);
	cJSON* jsongrowth_rate_summary_2 = growth_rate_summary_convertToJSON(growth_rate_summary_2);
	printf("repeating growth_rate_summary:\n%s\n", cJSON_Print(jsongrowth_rate_summary_2));
}

int main() {
  test_growth_rate_summary(1);
  test_growth_rate_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // growth_rate_summary_MAIN
#endif // growth_rate_summary_TEST
