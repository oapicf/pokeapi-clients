#ifndef growth_rate_detail_TEST
#define growth_rate_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define growth_rate_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/growth_rate_detail.h"
growth_rate_detail_t* instantiate_growth_rate_detail(int include_optional);



growth_rate_detail_t* instantiate_growth_rate_detail(int include_optional) {
  growth_rate_detail_t* growth_rate_detail = NULL;
  if (include_optional) {
    growth_rate_detail = growth_rate_detail_create(
      56,
      "0",
      "0",
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    growth_rate_detail = growth_rate_detail_create(
      56,
      "0",
      "0",
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return growth_rate_detail;
}


#ifdef growth_rate_detail_MAIN

void test_growth_rate_detail(int include_optional) {
    growth_rate_detail_t* growth_rate_detail_1 = instantiate_growth_rate_detail(include_optional);

	cJSON* jsongrowth_rate_detail_1 = growth_rate_detail_convertToJSON(growth_rate_detail_1);
	printf("growth_rate_detail :\n%s\n", cJSON_Print(jsongrowth_rate_detail_1));
	growth_rate_detail_t* growth_rate_detail_2 = growth_rate_detail_parseFromJSON(jsongrowth_rate_detail_1);
	cJSON* jsongrowth_rate_detail_2 = growth_rate_detail_convertToJSON(growth_rate_detail_2);
	printf("repeating growth_rate_detail:\n%s\n", cJSON_Print(jsongrowth_rate_detail_2));
}

int main() {
  test_growth_rate_detail(1);
  test_growth_rate_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // growth_rate_detail_MAIN
#endif // growth_rate_detail_TEST
