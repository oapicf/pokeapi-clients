#ifndef contest_effect_detail_TEST
#define contest_effect_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define contest_effect_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/contest_effect_detail.h"
contest_effect_detail_t* instantiate_contest_effect_detail(int include_optional);



contest_effect_detail_t* instantiate_contest_effect_detail(int include_optional) {
  contest_effect_detail_t* contest_effect_detail = NULL;
  if (include_optional) {
    contest_effect_detail = contest_effect_detail_create(
      56,
      56,
      56,
      list_createList(),
      list_createList()
    );
  } else {
    contest_effect_detail = contest_effect_detail_create(
      56,
      56,
      56,
      list_createList(),
      list_createList()
    );
  }

  return contest_effect_detail;
}


#ifdef contest_effect_detail_MAIN

void test_contest_effect_detail(int include_optional) {
    contest_effect_detail_t* contest_effect_detail_1 = instantiate_contest_effect_detail(include_optional);

	cJSON* jsoncontest_effect_detail_1 = contest_effect_detail_convertToJSON(contest_effect_detail_1);
	printf("contest_effect_detail :\n%s\n", cJSON_Print(jsoncontest_effect_detail_1));
	contest_effect_detail_t* contest_effect_detail_2 = contest_effect_detail_parseFromJSON(jsoncontest_effect_detail_1);
	cJSON* jsoncontest_effect_detail_2 = contest_effect_detail_convertToJSON(contest_effect_detail_2);
	printf("repeating contest_effect_detail:\n%s\n", cJSON_Print(jsoncontest_effect_detail_2));
}

int main() {
  test_contest_effect_detail(1);
  test_contest_effect_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // contest_effect_detail_MAIN
#endif // contest_effect_detail_TEST
