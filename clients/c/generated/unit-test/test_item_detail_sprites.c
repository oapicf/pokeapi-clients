#ifndef item_detail_sprites_TEST
#define item_detail_sprites_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_detail_sprites_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_detail_sprites.h"
item_detail_sprites_t* instantiate_item_detail_sprites(int include_optional);



item_detail_sprites_t* instantiate_item_detail_sprites(int include_optional) {
  item_detail_sprites_t* item_detail_sprites = NULL;
  if (include_optional) {
    item_detail_sprites = item_detail_sprites_create(
      "0"
    );
  } else {
    item_detail_sprites = item_detail_sprites_create(
      "0"
    );
  }

  return item_detail_sprites;
}


#ifdef item_detail_sprites_MAIN

void test_item_detail_sprites(int include_optional) {
    item_detail_sprites_t* item_detail_sprites_1 = instantiate_item_detail_sprites(include_optional);

	cJSON* jsonitem_detail_sprites_1 = item_detail_sprites_convertToJSON(item_detail_sprites_1);
	printf("item_detail_sprites :\n%s\n", cJSON_Print(jsonitem_detail_sprites_1));
	item_detail_sprites_t* item_detail_sprites_2 = item_detail_sprites_parseFromJSON(jsonitem_detail_sprites_1);
	cJSON* jsonitem_detail_sprites_2 = item_detail_sprites_convertToJSON(item_detail_sprites_2);
	printf("repeating item_detail_sprites:\n%s\n", cJSON_Print(jsonitem_detail_sprites_2));
}

int main() {
  test_item_detail_sprites(1);
  test_item_detail_sprites(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_detail_sprites_MAIN
#endif // item_detail_sprites_TEST
