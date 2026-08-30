

#include "PaginatedItemCategorySummaryList.h"

using namespace Tiny;

PaginatedItemCategorySummaryList::PaginatedItemCategorySummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<ItemCategorySummary>();
}

PaginatedItemCategorySummaryList::PaginatedItemCategorySummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedItemCategorySummaryList::~PaginatedItemCategorySummaryList()
{

}

void
PaginatedItemCategorySummaryList::fromJson(std::string jsonObj)
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


        std::list<ItemCategorySummary> results_list;
        ItemCategorySummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedItemCategorySummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<ItemCategorySummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        ItemCategorySummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedItemCategorySummaryList::getCount()
{
	return count;
}

void
PaginatedItemCategorySummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedItemCategorySummaryList::getNext()
{
	return next;
}

void
PaginatedItemCategorySummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedItemCategorySummaryList::getPrevious()
{
	return previous;
}

void
PaginatedItemCategorySummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<ItemCategorySummary>
PaginatedItemCategorySummaryList::getResults()
{
	return results;
}

void
PaginatedItemCategorySummaryList::setResults(std::list<ItemCategorySummary> results)
{
	this->results = results;
}



