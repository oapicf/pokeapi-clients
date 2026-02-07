#ifndef super_contest_effect_detail_TEST
#define super_contest_effect_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define super_contest_effect_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/super_contest_effect_detail.h"
super_contest_effect_detail_t* instantiate_super_contest_effect_detail(int include_optional);



super_contest_effect_detail_t* instantiate_super_contest_effect_detail(int include_optional) {
  super_contest_effect_detail_t* super_contest_effect_detail = NULL;
  if (include_optional) {
    super_contest_effect_detail = super_contest_effect_detail_create(
      56,
      56,
      list_createList(),
      list_createList()
    );
  } else {
    super_contest_effect_detail = super_contest_effect_detail_create(
      56,
      56,
      list_createList(),
      list_createList()
    );
  }

  return super_contest_effect_detail;
}


#ifdef super_contest_effect_detail_MAIN

void test_super_contest_effect_detail(int include_optional) {
    super_contest_effect_detail_t* super_contest_effect_detail_1 = instantiate_super_contest_effect_detail(include_optional);

	cJSON* jsonsuper_contest_effect_detail_1 = super_contest_effect_detail_convertToJSON(super_contest_effect_detail_1);
	printf("super_contest_effect_detail :\n%s\n", cJSON_Print(jsonsuper_contest_effect_detail_1));
	super_contest_effect_detail_t* super_contest_effect_detail_2 = super_contest_effect_detail_parseFromJSON(jsonsuper_contest_effect_detail_1);
	cJSON* jsonsuper_contest_effect_detail_2 = super_contest_effect_detail_convertToJSON(super_contest_effect_detail_2);
	printf("repeating super_contest_effect_detail:\n%s\n", cJSON_Print(jsonsuper_contest_effect_detail_2));
}

int main() {
  test_super_contest_effect_detail(1);
  test_super_contest_effect_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // super_contest_effect_detail_MAIN
#endif // super_contest_effect_detail_TEST
