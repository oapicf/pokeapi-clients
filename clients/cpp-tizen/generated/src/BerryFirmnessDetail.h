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

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get A list of the berries with this firmness.
	 */
	std::list<BerrySummary> getBerries();

	/*! \brief Set A list of the berries with this firmness.
	 */
	void setBerries(std::list <BerrySummary> berries);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<BerryFirmnessName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
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
