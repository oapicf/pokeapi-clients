#ifndef gender_detail_TEST
#define gender_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define gender_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/gender_detail.h"
gender_detail_t* instantiate_gender_detail(int include_optional);



gender_detail_t* instantiate_gender_detail(int include_optional) {
  gender_detail_t* gender_detail = NULL;
  if (include_optional) {
    gender_detail = gender_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  } else {
    gender_detail = gender_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  }

  return gender_detail;
}


#ifdef gender_detail_MAIN

void test_gender_detail(int include_optional) {
    gender_detail_t* gender_detail_1 = instantiate_gender_detail(include_optional);

	cJSON* jsongender_detail_1 = gender_detail_convertToJSON(gender_detail_1);
	printf("gender_detail :\n%s\n", cJSON_Print(jsongender_detail_1));
	gender_detail_t* gender_detail_2 = gender_detail_parseFromJSON(jsongender_detail_1);
	cJSON* jsongender_detail_2 = gender_detail_convertToJSON(gender_detail_2);
	printf("repeating gender_detail:\n%s\n", cJSON_Print(jsongender_detail_2));
}

int main() {
  test_gender_detail(1);
  test_gender_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // gender_detail_MAIN
#endif // gender_detail_TEST
