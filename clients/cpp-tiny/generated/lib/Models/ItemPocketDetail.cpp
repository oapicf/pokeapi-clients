

#include "ItemPocketDetail.h"

using namespace Tiny;

ItemPocketDetail::ItemPocketDetail()
{
	id = int(0);
	name = std::string();
	categories = std::list<ItemCategorySummary>();
	names = std::list<ItemPocketName>();
}

ItemPocketDetail::ItemPocketDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemPocketDetail::~ItemPocketDetail()
{

}

void
ItemPocketDetail::fromJson(std::string jsonObj)
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

    const char *categoriesKey = "categories";

    if(object.has_key(categoriesKey))
    {
        bourne::json value = object[categoriesKey];


        std::list<ItemCategorySummary> categories_list;
        ItemCategorySummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            categories_list.push_back(element);
        }
        categories = categories_list;


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<ItemPocketName> names_list;
        ItemPocketName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
ItemPocketDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<ItemCategorySummary> categories_list = getCategories();
    bourne::json categories_arr = bourne::json::array();

    for(auto& var : categories_list)
    {
        ItemCategorySummary obj = var;
        categories_arr.append(obj.toJson());
    }
    object["categories"] = categories_arr;






    std::list<ItemPocketName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        ItemPocketName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
ItemPocketDetail::getId()
{
	return id;
}

void
ItemPocketDetail::setId(int id)
{
	this->id = id;
}

std::string
ItemPocketDetail::getName()
{
	return name;
}

void
ItemPocketDetail::setName(std::string name)
{
	this->name = name;
}

std::list<ItemCategorySummary>
ItemPocketDetail::getCategories()
{
	return categories;
}

void
ItemPocketDetail::setCategories(std::list<ItemCategorySummary> categories)
{
	this->categories = categories;
}

std::list<ItemPocketName>
ItemPocketDetail::getNames()
{
	return names;
}

void
ItemPocketDetail::setNames(std::list<ItemPocketName> names)
{
	this->names = names;
}



