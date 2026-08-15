

#include "PaginatedMoveDamageClassSummaryList.h"

using namespace Tiny;

PaginatedMoveDamageClassSummaryList::PaginatedMoveDamageClassSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<MoveDamageClassSummary>();
}

PaginatedMoveDamageClassSummaryList::PaginatedMoveDamageClassSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedMoveDamageClassSummaryList::~PaginatedMoveDamageClassSummaryList()
{

}

void
PaginatedMoveDamageClassSummaryList::fromJson(std::string jsonObj)
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


        std::list<MoveDamageClassSummary> results_list;
        MoveDamageClassSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedMoveDamageClassSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<MoveDamageClassSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        MoveDamageClassSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedMoveDamageClassSummaryList::getCount()
{
	return count;
}

void
PaginatedMoveDamageClassSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedMoveDamageClassSummaryList::getNext()
{
	return next;
}

void
PaginatedMoveDamageClassSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedMoveDamageClassSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedMoveDamageClassSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<MoveDamageClassSummary>
PaginatedMoveDamageClassSummaryList::getResults()
{
	return results;
}

void
PaginatedMoveDamageClassSummaryList::setResults(std::list <MoveDamageClassSummary> results)
{
	this->results = results;
}



