/*
 * BerryFirmnessDetail.h
 *
 * 
 */

#ifndef _BerryFirmnessDetail_H_
#define _BerryFirmnessDetail_H_


#include <string>
#include "BerryFirmnessName.h"
#include "BerrySummary.h"
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

class BerryFirmnessDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	BerryFirmnessDetail();
	BerryFirmnessDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BerryFirmnessDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<BerrySummary> getBerries();

	/*! \brief Set 
	 */
	void setBerries(std::list <BerrySummary> berries);
	/*! \brief Get 
	 */
	std::list<BerryFirmnessName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <BerryFirmnessName> names);

private:
	int id;
	std::string name;
	std::list <BerrySummary>berries;
	std::list <BerryFirmnessName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BerryFirmnessDetail_H_ */
