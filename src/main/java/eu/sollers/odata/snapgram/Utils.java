package eu.sollers.odata.snapgram;

import com.google.common.collect.Lists;
import eu.sollers.odata.snapgram.dao.FieldMapping;
import eu.sollers.odata.snapgram.dao.TableMapping;
import org.apache.olingo.commons.api.edm.EdmPrimitiveTypeKind;
import org.apache.olingo.commons.api.edm.FullQualifiedName;

import java.util.List;

public class Utils {

    public static List<TableMapping> getTableMapping() {
        return Lists.newArrayList();
    }

    public static TableMapping getTable(String uriName) {
        return TableMapping.builder()
                .id(1)
                .tbName("product")
                .uriName("Product")
                .build();
    }

    public static List<FieldMapping> getFieldMapping(Integer tableId) {
        return Lists.newArrayList(
                FieldMapping.builder()
                .fieldName("id")
                .fieldType("int")
                .tableId(1)
                .uriFieldName("ID")
                .build()
                ,
                FieldMapping.builder()
                        .fieldName("name")
                        .fieldType("string")
                        .tableId(1)
                        .uriFieldName("Name")
                        .build()
        );
    }

    public static FullQualifiedName getType(String fieldType){
        if ("string".equalsIgnoreCase(fieldType)){
            return EdmPrimitiveTypeKind.String.getFullQualifiedName();
        }else if ("int".equalsIgnoreCase(fieldType)){
            return EdmPrimitiveTypeKind.Int32.getFullQualifiedName();
        }
        return EdmPrimitiveTypeKind.String.getFullQualifiedName();
    }

}
