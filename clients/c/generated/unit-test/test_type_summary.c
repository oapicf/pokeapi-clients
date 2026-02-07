#ifndef type_summary_TEST
#define type_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define type_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/type_summary.h"
type_summary_t* instantiate_type_summary(int include_optional);



type_summary_t* instantiate_type_summary(int include_optional) {
  type_summary_t* type_summary = NULL;
  if (include_optional) {
    type_summary = type_summary_create(
      "0",
      "0"
    );
  } else {
    type_summary = type_summary_create(
      "0",
      "0"
    );
  }

  return type_summary;
}


#ifdef type_summary_MAIN

void test_type_summary(int include_optional) {
    type_summary_t* type_summary_1 = instantiate_type_summary(include_optional);

	cJSON* jsontype_summary_1 = type_summary_convertToJSON(type_summary_1);
	printf("type_summary :\n%s\n", cJSON_Print(jsontype_summary_1));
	type_summary_t* type_summary_2 = type_summary_parseFromJSON(jsontype_summary_1);
	cJSON* jsontype_summary_2 = type_summary_convertToJSON(type_summary_2);
	printf("repeating type_summary:\n%s\n", cJSON_Print(jsontype_summary_2));
}

int main() {
  test_type_summary(1);
  test_type_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // type_summary_MAIN
#endif // type_summary_TEST
