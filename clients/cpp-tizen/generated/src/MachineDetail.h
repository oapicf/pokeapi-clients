/*
 * MachineDetail.h
 *
 * 
 */

#ifndef _MachineDetail_H_
#define _MachineDetail_H_


#include <string>
#include "ItemSummary.h"
#include "MoveSummary.h"
#include "VersionGroupSummary.h"
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

class MachineDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	MachineDetail();
	MachineDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MachineDetail();

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
	/*! \brief Get The TM or HM item that corresponds to this machine.
	 */
	ItemSummary getItem();

	/*! \brief Set The TM or HM item that corresponds to this machine.
	 */
	void setItem(ItemSummary  item);
	/*! \brief Get The version group that this machine applies to.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group that this machine applies to.
	 */
	void setVersionGroup(VersionGroupSummary  version_group);
	/*! \brief Get The move that is taught by this machine.
	 */
	MoveSummary getMove();

	/*! \brief Set The move that is taught by this machine.
	 */
	void setMove(MoveSummary  move);

private:
	int id;
	ItemSummary item;
	VersionGroupSummary version_group;
	MoveSummary move;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MachineDetail_H_ */
