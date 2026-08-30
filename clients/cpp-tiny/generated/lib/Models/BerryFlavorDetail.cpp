

#include "BerryFlavorDetail.h"

using namespace Tiny;

BerryFlavorDetail::BerryFlavorDetail()
{
	id = int(0);
	name = std::string();
	berries = std::list<BerryFlavorDetail_berries_inner>();
	contest_type = ContestTypeSummary();
	names = std::list<BerryFlavorName>();
}

BerryFlavorDetail::BerryFlavorDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

BerryFlavorDetail::~BerryFlavorDetail()
{

}

void
BerryFlavorDetail::fromJson(std::string jsonObj)
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

    const char *berriesKey = "berries";

    if(object.has_key(berriesKey))
    {
        bourne::json value = object[berriesKey];


        std::list<BerryFlavorDetail_berries_inner> berries_list;
        BerryFlavorDetail_berries_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            berries_list.push_back(element);
        }
        berries = berries_list;


    }

    const char *contest_typeKey = "contest_type";

    if(object.has_key(contest_typeKey))
    {
        bourne::json value = object[contest_typeKey];




        ContestTypeSummary* obj = &contest_type;
		obj->fromJson(value.dump());

    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<BerryFlavorName> names_list;
        BerryFlavorName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
BerryFlavorDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<BerryFlavorDetail_berries_inner> berries_list = getBerries();
    bourne::json berries_arr = bourne::json::array();

    for(auto& var : berries_list)
    {
        BerryFlavorDetail_berries_inner obj = var;
        berries_arr.append(obj.toJson());
    }
    object["berries"] = berries_arr;








	object["contest_type"] = getContestType().toJson();




    std::list<BerryFlavorName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        BerryFlavorName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
BerryFlavorDetail::getId()
{
	return id;
}

void
BerryFlavorDetail::setId(int id)
{
	this->id = id;
}

std::string
BerryFlavorDetail::getName()
{
	return name;
}

void
BerryFlavorDetail::setName(std::string name)
{
	this->name = name;
}

std::list<BerryFlavorDetail_berries_inner>
BerryFlavorDetail::getBerries()
{
	return berries;
}

void
BerryFlavorDetail::setBerries(std::list<BerryFlavorDetail_berries_inner> berries)
{
	this->berries = berries;
}

ContestTypeSummary
BerryFlavorDetail::getContestType()
{
	return contest_type;
}

void
BerryFlavorDetail::setContestType(ContestTypeSummary contest_type)
{
	this->contest_type = contest_type;
}

std::list<BerryFlavorName>
BerryFlavorDetail::getNames()
{
	return names;
}

void
BerryFlavorDetail::setNames(std::list<BerryFlavorName> names)
{
	this->names = names;
}



