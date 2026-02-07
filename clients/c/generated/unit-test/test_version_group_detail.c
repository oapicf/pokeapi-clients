#ifndef version_group_detail_TEST
#define version_group_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define version_group_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/version_group_detail.h"
version_group_detail_t* instantiate_version_group_detail(int include_optional);

#include "test_generation_summary.c"


version_group_detail_t* instantiate_version_group_detail(int include_optional) {
  version_group_detail_t* version_group_detail = NULL;
  if (include_optional) {
    version_group_detail = version_group_detail_create(
      56,
      "0",
      56,
       // false, not to have infinite recursion
      instantiate_generation_summary(0),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    version_group_detail = version_group_detail_create(
      56,
      "0",
      56,
      NULL,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return version_group_detail;
}


#ifdef version_group_detail_MAIN

void test_version_group_detail(int include_optional) {
    version_group_detail_t* version_group_detail_1 = instantiate_version_group_detail(include_optional);

	cJSON* jsonversion_group_detail_1 = version_group_detail_convertToJSON(version_group_detail_1);
	printf("version_group_detail :\n%s\n", cJSON_Print(jsonversion_group_detail_1));
	version_group_detail_t* version_group_detail_2 = version_group_detail_parseFromJSON(jsonversion_group_detail_1);
	cJSON* jsonversion_group_detail_2 = version_group_detail_convertToJSON(version_group_detail_2);
	printf("repeating version_group_detail:\n%s\n", cJSON_Print(jsonversion_group_detail_2));
}

int main() {
  test_version_group_detail(1);
  test_version_group_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // version_group_detail_MAIN
#endif // version_group_detail_TEST
