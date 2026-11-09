/*
 * PaginatedCurrencySummaryList.h
 *
 * 
 */

#ifndef _PaginatedCurrencySummaryList_H_
#define _PaginatedCurrencySummaryList_H_


#include <string>
#include "CurrencySummary.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PaginatedCurrencySummaryList : public Object {
public:
	/*! \brief Constructor.
	 */
	PaginatedCurrencySummaryList();
	PaginatedCurrencySummaryList(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PaginatedCurrencySummaryList();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The total number of resources available from this API.
	 */
	int getCount();

	/*! \brief Set The total number of resources available from this API.
	 */
	void setCount(int  count);
	/*! \brief Get The URL for the next page in the list, or null if there is no next page.
	 */
	std::string getNext();

	/*! \brief Set The URL for the next page in the list, or null if there is no next page.
	 */
	void setNext(std::string  next);
	/*! \brief Get The URL for the previous page in the list, or null if there is no previous page.
	 */
	std::string getPrevious();

	/*! \brief Set The URL for the previous page in the list, or null if there is no previous page.
	 */
	void setPrevious(std::string  previous);
	/*! \brief Get A list of API resources on this page.
	 */
	std::list<CurrencySummary> getResults();

	/*! \brief Set A list of API resources on this page.
	 */
	void setResults(std::list <CurrencySummary> results);

private:
	int count;
	std::string next;
	std::string previous;
	std::list <CurrencySummary>results;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PaginatedCurrencySummaryList_H_ */
