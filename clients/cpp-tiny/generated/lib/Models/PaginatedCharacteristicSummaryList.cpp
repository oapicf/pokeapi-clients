

#include "PaginatedCharacteristicSummaryList.h"

using namespace Tiny;

PaginatedCharacteristicSummaryList::PaginatedCharacteristicSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<CharacteristicSummary>();
}

PaginatedCharacteristicSummaryList::PaginatedCharacteristicSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedCharacteristicSummaryList::~PaginatedCharacteristicSummaryList()
{

}

void
PaginatedCharacteristicSummaryList::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *nextKey = "next";

    if(object.has_key(nextKey))
    {
        bourne::json value = object[nextKey];



        jsonToValue(&next, value, "std::string");


    }

    const char *previousKey = "previous";

    if(object.has_key(previousKey))
    {
        bourne::json value = object[previousKey];



        jsonToValue(&previous, value, "std::string");


    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<CharacteristicSummary> results_list;
        CharacteristicSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedCharacteristicSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<CharacteristicSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        CharacteristicSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedCharacteristicSummaryList::getCount()
{
	return count;
}

void
PaginatedCharacteristicSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedCharacteristicSummaryList::getNext()
{
	return next;
}

void
PaginatedCharacteristicSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedCharacteristicSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedCharacteristicSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<CharacteristicSummary>
PaginatedCharacteristicSummaryList::getResults()
{
	return results;
}

void
PaginatedCharacteristicSummaryList::setResults(std::list <CharacteristicSummary> results)
{
	this->results = results;
}



