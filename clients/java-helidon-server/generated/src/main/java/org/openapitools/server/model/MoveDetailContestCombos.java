package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.MoveDetailContestCombosNormal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveDetailContestCombos   {

    private MoveDetailContestCombosNormal normal;
    private MoveDetailContestCombosNormal _super;

    /**
     * Default constructor.
     */
    public MoveDetailContestCombos() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveDetailContestCombos.
     *
     * @param normal normal
     * @param _super _super
     */
    public MoveDetailContestCombos(
        MoveDetailContestCombosNormal normal, 
        MoveDetailContestCombosNormal _super
    ) {
        this.normal = normal;
        this._super = _super;
    }



    /**
     * Get normal
     * @return normal
     */
    public MoveDetailContestCombosNormal getNormal() {
        return normal;
    }

    public void setNormal(MoveDetailContestCombosNormal normal) {
        this.normal = normal;
    }

    /**
     * Get _super
     * @return _super
     */
    public MoveDetailContestCombosNormal getSuper() {
        return _super;
    }

    public void setSuper(MoveDetailContestCombosNormal _super) {
        this._super = _super;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveDetailContestCombos {\n");
        
        sb.append("    normal: ").append(toIndentedString(normal)).append("\n");
        sb.append("    _super: ").append(toIndentedString(_super)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

