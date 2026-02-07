#ifndef paginated_growth_rate_summary_list_TEST
#define paginated_growth_rate_summary_list_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define paginated_growth_rate_summary_list_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/paginated_growth_rate_summary_list.h"
paginated_growth_rate_summary_list_t* instantiate_paginated_growth_rate_summary_list(int include_optional);



paginated_growth_rate_summary_list_t* instantiate_paginated_growth_rate_summary_list(int include_optional) {
  paginated_growth_rate_summary_list_t* paginated_growth_rate_summary_list = NULL;
  if (include_optional) {
    paginated_growth_rate_summary_list = paginated_growth_rate_summary_list_create(
      123,
      "http://api.example.org/accounts/?offset=400&limit=100",
      "http://api.example.org/accounts/?offset=200&limit=100",
      list_createList()
    );
  } else {
    paginated_growth_rate_summary_list = paginated_growth_rate_summary_list_create(
      123,
      "http://api.example.org/accounts/?offset=400&limit=100",
      "http://api.example.org/accounts/?offset=200&limit=100",
      list_createList()
    );
  }

  return paginated_growth_rate_summary_list;
}


#ifdef paginated_growth_rate_summary_list_MAIN

void test_paginated_growth_rate_summary_list(int include_optional) {
    paginated_growth_rate_summary_list_t* paginated_growth_rate_summary_list_1 = instantiate_paginated_growth_rate_summary_list(include_optional);

	cJSON* jsonpaginated_growth_rate_summary_list_1 = paginated_growth_rate_summary_list_convertToJSON(paginated_growth_rate_summary_list_1);
	printf("paginated_growth_rate_summary_list :\n%s\n", cJSON_Print(jsonpaginated_growth_rate_summary_list_1));
	paginated_growth_rate_summary_list_t* paginated_growth_rate_summary_list_2 = paginated_growth_rate_summary_list_parseFromJSON(jsonpaginated_growth_rate_summary_list_1);
	cJSON* jsonpaginated_growth_rate_summary_list_2 = paginated_growth_rate_summary_list_convertToJSON(paginated_growth_rate_summary_list_2);
	printf("repeating paginated_growth_rate_summary_list:\n%s\n", cJSON_Print(jsonpaginated_growth_rate_summary_list_2));
}

int main() {
  test_paginated_growth_rate_summary_list(1);
  test_paginated_growth_rate_summary_list(0);

  printf("Hello world \n");
  return 0;
}

#endif // paginated_growth_rate_summary_list_MAIN
#endif // paginated_growth_rate_summary_list_TEST
