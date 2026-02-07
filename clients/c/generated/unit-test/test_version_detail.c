#ifndef version_detail_TEST
#define version_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define version_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/version_detail.h"
version_detail_t* instantiate_version_detail(int include_optional);

#include "test_version_group_summary.c"


version_detail_t* instantiate_version_detail(int include_optional) {
  version_detail_t* version_detail = NULL;
  if (include_optional) {
    version_detail = version_detail_create(
      56,
      "0",
      list_createList(),
       // false, not to have infinite recursion
      instantiate_version_group_summary(0)
    );
  } else {
    version_detail = version_detail_create(
      56,
      "0",
      list_createList(),
      NULL
    );
  }

  return version_detail;
}


#ifdef version_detail_MAIN

void test_version_detail(int include_optional) {
    version_detail_t* version_detail_1 = instantiate_version_detail(include_optional);

	cJSON* jsonversion_detail_1 = version_detail_convertToJSON(version_detail_1);
	printf("version_detail :\n%s\n", cJSON_Print(jsonversion_detail_1));
	version_detail_t* version_detail_2 = version_detail_parseFromJSON(jsonversion_detail_1);
	cJSON* jsonversion_detail_2 = version_detail_convertToJSON(version_detail_2);
	printf("repeating version_detail:\n%s\n", cJSON_Print(jsonversion_detail_2));
}

int main() {
  test_version_detail(1);
  test_version_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // version_detail_MAIN
#endif // version_detail_TEST
