

#include "ItemCategoryDetail.h"

using namespace Tiny;

ItemCategoryDetail::ItemCategoryDetail()
{
	id = int(0);
	name = std::string();
	items = std::list<ItemSummary>();
	names = std::list<ItemCategoryName>();
	pocket = ItemPocketSummary();
}

ItemCategoryDetail::ItemCategoryDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemCategoryDetail::~ItemCategoryDetail()
{

}

void
ItemCategoryDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<ItemSummary> items_list;
        ItemSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<ItemCategoryName> names_list;
        ItemCategoryName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *pocketKey = "pocket";

    if(object.has_key(pocketKey))
    {
        bourne::json value = object[pocketKey];




        ItemPocketSummary* obj = &pocket;
		obj->fromJson(value.dump());

    }


}

bourne::json
ItemCategoryDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<ItemSummary> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ItemSummary obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;






    std::list<ItemCategoryName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        ItemCategoryName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;








	object["pocket"] = getPocket().toJson();


    return object;

}

int
ItemCategoryDetail::getId()
{
	return id;
}

void
ItemCategoryDetail::setId(int id)
{
	this->id = id;
}

std::string
ItemCategoryDetail::getName()
{
	return name;
}

void
ItemCategoryDetail::setName(std::string name)
{
	this->name = name;
}

std::list<ItemSummary>
ItemCategoryDetail::getItems()
{
	return items;
}

void
ItemCategoryDetail::setItems(std::list<ItemSummary> items)
{
	this->items = items;
}

std::list<ItemCategoryName>
ItemCategoryDetail::getNames()
{
	return names;
}

void
ItemCategoryDetail::setNames(std::list<ItemCategoryName> names)
{
	this->names = names;
}

ItemPocketSummary
ItemCategoryDetail::getPocket()
{
	return pocket;
}

void
ItemCategoryDetail::setPocket(ItemPocketSummary pocket)
{
	this->pocket = pocket;
}



