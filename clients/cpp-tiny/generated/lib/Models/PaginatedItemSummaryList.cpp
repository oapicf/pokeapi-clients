

#include "PaginatedItemSummaryList.h"

using namespace Tiny;

PaginatedItemSummaryList::PaginatedItemSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<ItemSummary>();
}

PaginatedItemSummaryList::PaginatedItemSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedItemSummaryList::~PaginatedItemSummaryList()
{

}

void
PaginatedItemSummaryList::fromJson(std::string jsonObj)
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


        std::list<ItemSummary> results_list;
        ItemSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedItemSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<ItemSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        ItemSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedItemSummaryList::getCount()
{
	return count;
}

void
PaginatedItemSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedItemSummaryList::getNext()
{
	return next;
}

void
PaginatedItemSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedItemSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedItemSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<ItemSummary>
PaginatedItemSummaryList::getResults()
{
	return results;
}

void
PaginatedItemSummaryList::setResults(std::list<ItemSummary> results)
{
	this->results = results;
}



