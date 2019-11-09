package eu.sollers.odata.snapgram.dao;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author qj876
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TableMapping {

    private Integer id;

    /**
     * url name
     */
    private String uriName;

    /**
     * table name
     */
    private String tbName;


}
