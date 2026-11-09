
/*
 * MachineDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MachineDetail_H_
#define TINY_CPP_CLIENT_MachineDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemSummary.h"
#include "MoveSummary.h"
#include "VersionGroupSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MachineDetail{
public:

    /*! \brief Constructor.
	 */
    MachineDetail();
    MachineDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MachineDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The TM or HM item that corresponds to this machine.
	 */
	ItemSummary getItem();

	/*! \brief Set The TM or HM item that corresponds to this machine.
	 */
	void setItem(ItemSummary item);
	/*! \brief Get The version group that this machine applies to.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group that this machine applies to.
	 */
	void setVersionGroup(VersionGroupSummary version_group);
	/*! \brief Get The move that is taught by this machine.
	 */
	MoveSummary getMove();

	/*! \brief Set The move that is taught by this machine.
	 */
	void setMove(MoveSummary move);


    private:
    int id{};
    ItemSummary item;
    VersionGroupSummary version_group;
    MoveSummary move;
};
}

#endif /* TINY_CPP_CLIENT_MachineDetail_H_ */
