#ifndef version_name_TEST
#define version_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define version_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/version_name.h"
version_name_t* instantiate_version_name(int include_optional);

#include "test_language_summary.c"


version_name_t* instantiate_version_name(int include_optional) {
  version_name_t* version_name = NULL;
  if (include_optional) {
    version_name = version_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    version_name = version_name_create(
      "0",
      NULL
    );
  }

  return version_name;
}


#ifdef version_name_MAIN

void test_version_name(int include_optional) {
    version_name_t* version_name_1 = instantiate_version_name(include_optional);

	cJSON* jsonversion_name_1 = version_name_convertToJSON(version_name_1);
	printf("version_name :\n%s\n", cJSON_Print(jsonversion_name_1));
	version_name_t* version_name_2 = version_name_parseFromJSON(jsonversion_name_1);
	cJSON* jsonversion_name_2 = version_name_convertToJSON(version_name_2);
	printf("repeating version_name:\n%s\n", cJSON_Print(jsonversion_name_2));
}

int main() {
  test_version_name(1);
  test_version_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // version_name_MAIN
#endif // version_name_TEST
