package pl.mjedynak.idea.plugins.builder.psi;

import static com.intellij.openapi.util.text.StringUtil.capitalize;
import static com.intellij.openapi.util.text.StringUtil.isEmpty;

public class MethodNameCreator {

    public String createMethodName(String methodPrefix, String fieldName) {
        if (isEmpty(methodPrefix)) {
            return fieldName;
        } else {
            String fieldNameUppercase = capitalize(fieldName);
            return methodPrefix + fieldNameUppercase;
        }
    }
}
