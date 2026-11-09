#ifndef item_sprites_TEST
#define item_sprites_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_sprites_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_sprites.h"
item_sprites_t* instantiate_item_sprites(int include_optional);



item_sprites_t* instantiate_item_sprites(int include_optional) {
  item_sprites_t* item_sprites = NULL;
  if (include_optional) {
    item_sprites = item_sprites_create(
      "0"
    );
  } else {
    item_sprites = item_sprites_create(
      "0"
    );
  }

  return item_sprites;
}


#ifdef item_sprites_MAIN

void test_item_sprites(int include_optional) {
    item_sprites_t* item_sprites_1 = instantiate_item_sprites(include_optional);

	cJSON* jsonitem_sprites_1 = item_sprites_convertToJSON(item_sprites_1);
	printf("item_sprites :\n%s\n", cJSON_Print(jsonitem_sprites_1));
	item_sprites_t* item_sprites_2 = item_sprites_parseFromJSON(jsonitem_sprites_1);
	cJSON* jsonitem_sprites_2 = item_sprites_convertToJSON(item_sprites_2);
	printf("repeating item_sprites:\n%s\n", cJSON_Print(jsonitem_sprites_2));
}

int main() {
  test_item_sprites(1);
  test_item_sprites(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_sprites_MAIN
#endif // item_sprites_TEST
