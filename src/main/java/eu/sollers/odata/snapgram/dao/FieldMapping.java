package eu.sollers.odata.snapgram.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qj876
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FieldMapping {

    private Integer id;

    private Integer tableId;

    private String fieldType;

    private String uriFieldName;

    private String fieldName;


}
