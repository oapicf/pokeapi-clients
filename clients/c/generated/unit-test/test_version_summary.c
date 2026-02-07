#ifndef version_summary_TEST
#define version_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define version_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/version_summary.h"
version_summary_t* instantiate_version_summary(int include_optional);



version_summary_t* instantiate_version_summary(int include_optional) {
  version_summary_t* version_summary = NULL;
  if (include_optional) {
    version_summary = version_summary_create(
      "0",
      "0"
    );
  } else {
    version_summary = version_summary_create(
      "0",
      "0"
    );
  }

  return version_summary;
}


#ifdef version_summary_MAIN

void test_version_summary(int include_optional) {
    version_summary_t* version_summary_1 = instantiate_version_summary(include_optional);

	cJSON* jsonversion_summary_1 = version_summary_convertToJSON(version_summary_1);
	printf("version_summary :\n%s\n", cJSON_Print(jsonversion_summary_1));
	version_summary_t* version_summary_2 = version_summary_parseFromJSON(jsonversion_summary_1);
	cJSON* jsonversion_summary_2 = version_summary_convertToJSON(version_summary_2);
	printf("repeating version_summary:\n%s\n", cJSON_Print(jsonversion_summary_2));
}

int main() {
  test_version_summary(1);
  test_version_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // version_summary_MAIN
#endif // version_summary_TEST
