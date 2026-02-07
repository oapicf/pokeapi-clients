#ifndef gender_summary_TEST
#define gender_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define gender_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/gender_summary.h"
gender_summary_t* instantiate_gender_summary(int include_optional);



gender_summary_t* instantiate_gender_summary(int include_optional) {
  gender_summary_t* gender_summary = NULL;
  if (include_optional) {
    gender_summary = gender_summary_create(
      "0",
      "0"
    );
  } else {
    gender_summary = gender_summary_create(
      "0",
      "0"
    );
  }

  return gender_summary;
}


#ifdef gender_summary_MAIN

void test_gender_summary(int include_optional) {
    gender_summary_t* gender_summary_1 = instantiate_gender_summary(include_optional);

	cJSON* jsongender_summary_1 = gender_summary_convertToJSON(gender_summary_1);
	printf("gender_summary :\n%s\n", cJSON_Print(jsongender_summary_1));
	gender_summary_t* gender_summary_2 = gender_summary_parseFromJSON(jsongender_summary_1);
	cJSON* jsongender_summary_2 = gender_summary_convertToJSON(gender_summary_2);
	printf("repeating gender_summary:\n%s\n", cJSON_Print(jsongender_summary_2));
}

int main() {
  test_gender_summary(1);
  test_gender_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // gender_summary_MAIN
#endif // gender_summary_TEST
